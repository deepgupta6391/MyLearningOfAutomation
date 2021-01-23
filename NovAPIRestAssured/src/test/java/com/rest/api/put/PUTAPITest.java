package com.rest.api.put;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rest.api.post.User;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PUTAPITest {

	//Create a user with post call
	//user info
	//update info with put call
	//1. other attributes should remain
	//2. the attribute which has been changed, need to check
	
	@Test
	public void update_User_PUT_API_Test() {
	//1. create a post request with payload
	User user=new User("Sheela", "sheela6136@yahoo.co.in", "Male", "Inactive");
	
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
	
	//write POST CALL:
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
	
	//call the put API:
	user.setEmail("sheela.fun1233@gmail.com");
	user.setGender("Female");
	
	//convert this POJO to JSON -- using JACKSON API - ObjectMapper
	String updatedUser=null;
	
		try {
			updatedUser=mapper.writeValueAsString(user);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		given().log().all()
			.contentType(ContentType.JSON)
			.header("Authorization","Bearer 5c0be83a212c355886eda936d41fe0e1108cd47940062c895b93515377040420")
			.body(updatedUser)
		.when().log().all()
			.put("/public-api/users/"+userId)
		.then().log().all()
			.assertThat()
				.contentType(ContentType.JSON)
			.and()
				.body("data.email", equalTo(user.getEmail()))
			.and()
				.body("data.id", equalTo(userId))
			.and()
				.body("data.status", equalTo(user.getStatus()));
		
		//post --> get
		//post -->put -->get
		
		//GET Call to validate:
		
		given().log().all()
			.contentType(ContentType.JSON)
			.header("Authorization","Bearer 5c0be83a212c355886eda936d41fe0e1108cd47940062c895b93515377040420")
		.when().log().all()
			.get("/public-api/users/"+userId)
		.then().log().all()
			.assertThat()
				.contentType(ContentType.JSON)
			.and()
				.body("data.email", equalTo(user.getEmail()))
			.and()
				.body("data.id", equalTo(userId))
			.and()
				.body("data.status", equalTo(user.getStatus()));
	}
}
