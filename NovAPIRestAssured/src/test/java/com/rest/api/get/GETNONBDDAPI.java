package com.rest.api.get;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETNONBDDAPI {

	//prepare the request
	//hit the API
	//get the response
	//fetch the values from response
	
	
	@Test
	public void getUser_Non_Bdd_Test() {
		
		RestAssured.baseURI="https://gorest.co.in";
		RequestSpecification request=RestAssured.given();
		request.header("Authorization","Bearer 5c0be83a212c355886eda936d41fe0e1108cd47940062c895b93515377040420");
		
		Response response=request.get("/public-api/users");
		System.out.println(response.getStatusCode());
		System.out.println(response.prettyPrint());
		System.out.println("Response time is "+response.getTime());

	}
	
	@Test
	public void getUser_Non_Bdd_WithQueryParams_Test() {
		
		RestAssured.baseURI="https://gorest.co.in";
		RequestSpecification request=RestAssured.given();
		request.header("Authorization","Bearer 5c0be83a212c355886eda936d41fe0e1108cd47940062c895b93515377040420");
		
		request.queryParam("name", "John");
		request.queryParam("gender", "Male");
		
		Response response=request.get("/public-api/users");
		System.out.println(response.getStatusCode());
		System.out.println(response.prettyPrint());
		System.out.println(response.getHeader("Server"));
		System.out.println(response.getCookie("ezCMPCCS"));
		System.out.println(response.getStatusLine());
		System.out.println(response.getContentType());
		
		JsonPath js=response.jsonPath();
		System.out.println(js.getString("meta.pagination.limit"));
		Assert.assertEquals(js.getString("meta.pagination.limit"), "20");
		
		Assert.assertEquals(response.getStatusCode(), 200);
		Assert.assertEquals(response.getHeader("Server"), "nginx");
	}
	
	@Test
	public void getUser_Non_Bdd_HashMap_QueryParams_Test() {
		
		RestAssured.baseURI="https://gorest.co.in";
		RequestSpecification request=RestAssured.given();
		request.header("Authorization","Bearer 5c0be83a212c355886eda936d41fe0e1108cd47940062c895b93515377040420");
		
		Map<String,String> params=new HashMap<String, String>();
		params.put("name", "John");
		params.put("gender", "Male");
	
		request.queryParams(params);
		
		Response response=request.get("/public-api/users");
		System.out.println(response.getStatusCode());
		System.out.println(response.prettyPrint());
		System.out.println(response.getHeader("Server"));
		
		Assert.assertEquals(response.getStatusCode(), 200);
		Assert.assertEquals(response.getHeader("Server"), "nginx");
	}
}
