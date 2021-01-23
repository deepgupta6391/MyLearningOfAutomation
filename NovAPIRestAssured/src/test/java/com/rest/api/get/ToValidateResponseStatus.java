package com.rest.api.get;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ToValidateResponseStatus {

	@Test
	public void getGorestUsera() {
		RestAssured.baseURI="https://gorest.co.in";		
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.get("/public-api/users");
		
		System.out.println("Response Body===>"+response.asString());
		
		System.out.println("========================================");
		
		int statusCode=response.getStatusCode();
		System.out.println("Status code is ==> "+statusCode);
		Assert.assertEquals(statusCode, 200);
		
		String statusLine=response.getStatusLine();
		System.out.println("Status line is : "+statusLine);
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
	}
	
	@Test
	public void getInvalidStatsCode() {
		RestAssured.baseURI="https://gorest.co.in";		
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.get("/public-api/users1");
		
		int statusCode=response.getStatusCode();
		System.out.println("Status code is ==> "+statusCode);
		Assert.assertEquals(statusCode, 404);
	}
}
