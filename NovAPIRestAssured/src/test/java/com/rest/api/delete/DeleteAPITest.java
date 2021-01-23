package com.rest.api.delete;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rest.api.post.User;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DeleteAPITest {

	
	@Test
	public void delete_user_API_Test() {
		
		//1. create a post request with payload
		User user=new User("Sheela", "sheela.01@yahoo.co.in", "Male", "Inactive");
		
		//Convert this POJO to JSON -- using jACKSON API - ObjectMapper
		ObjectMapper mapper=new ObjectMapper();
		String userJson=null;
		
		try {
			userJson=mapper.writeValueAsString(user);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("POST CALL JSON is: "+userJson);
		
		
		//post --> delete --> get
		//*******************write POST CALL:
		RestAssured.baseURI="https://gorest.co.in";
		
		int userId=given().log().all()
			.contentType(ContentType.JSON)
			.header("Authorization","Bearer 5c0be83a212c355886eda936d41fe0e1108cd47940062c895b93515377040420")
			.body(userJson)
		.when().log().all()
			.post("/public-api/users")
		.then().log().all()
			.assertThat()
				.contentType(ContentType.JSON)
				.extract().path("data.id");
			
		System.out.println("user id is ::=>"+userId);
		
		//********************Delete call:********************************
		given().log().all()
			.header("Authorization","Bearer 5c0be83a212c355886eda936d41fe0e1108cd47940062c895b93515377040420")
		.when().log().all()
			.delete("/public-api/users/"+userId)
		.then().log().all()
			.assertThat()
				.contentType(ContentType.JSON)
			.and()
				.body("code", equalTo(204))
			.and()
				.body("data", equalTo(null));
		
		//*********************Get CALL:***************************************
		given().log().all()
			.header("Authorization","Bearer 5c0be83a212c355886eda936d41fe0e1108cd47940062c895b93515377040420")
		.when().log().all()
			.get("/public-api/users/"+userId)
		.then().log().all()
			.assertThat()
				.contentType(ContentType.JSON)
			.and()
				.body("code", equalTo(404))
			.and()
				.body("data.message", equalTo("Resource not found"));
			
	}
	 
}
