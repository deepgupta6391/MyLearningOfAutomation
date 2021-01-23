package com.rest.api.get;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ToValidateResponseBody {

	
	@Test
	public void getGorestMessageBody() {
		RestAssured.baseURI="https://gorest.co.in";		
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.get("/public-api/users");
		
		ResponseBody body=response.getBody();
		
		System.out.println("Response Body is ===>"+body.asString());
		
		String bodyAsString=body.asString();		
		Assert.assertEquals(bodyAsString.contains("total"), true);
		
		Assert.assertEquals(bodyAsString.toLowerCase().contains("female"), true);
		
		JsonPath path=response.jsonPath();
		String total=path.getString("meta.pagination.total");
		System.out.println("Total from the response is : "+total);
	}
}
