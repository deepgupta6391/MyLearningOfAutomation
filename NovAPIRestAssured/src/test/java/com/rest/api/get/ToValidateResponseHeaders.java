package com.rest.api.get;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ToValidateResponseHeaders {

	@Test
	public void getGorestHeaders() {
		RestAssured.baseURI="https://gorest.co.in";		
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.get("/public-api/users");
		
		String contentType=response.getHeader("Content-Type");
		System.out.println("Content-Type value is "+contentType);
		Assert.assertEquals(contentType, "application/json; charset=utf-8");
		
		String server=response.header("Server");
		System.out.println("Server value is : "+server);
		Assert.assertEquals(server, "nginx");
		
		String acceptLanguage = response.header("Content-Encoding");
		System.out.println("Content-Encoding: " + acceptLanguage);
		Assert.assertEquals(acceptLanguage, "gzip");
	}
	
	
	@Test
	public void IterateOverHeaders() {
		RestAssured.baseURI="https://gorest.co.in";		
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.get("/public-api/users");
		
		Headers allHeaders=response.getHeaders();
		for(Header header:allHeaders) {
			System.out.println("key : "+header.getName()+"   Value: "+header.getValue());
		}
	}
}
