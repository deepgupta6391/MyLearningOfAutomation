package com.rest.api.post;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class POSTAPIWithPOJO {

	//create a user
	//POST-URL
	// REQUEST JSON BODY
	//USER JAVA Class(POJO)-->JSON Object
	//Encapsulation --> private variables -->public(getter and setter methods)
	//POJO -- Plain Old Java Object -- Java Class -->private variables-->public(getter and setter methods)
	
	@Test
	public void createUser_With_Pojo_Test() {
		
		User user=new User("Lipa","lipa1234@gmail.com", "Female", "Active");
		
		
		//**************convert pojo to json -- Serialization -- JACKSON API*******************
		
		ObjectMapper mapper=new ObjectMapper();
		String userJson=null;
		try {
			userJson=mapper.writeValueAsString(user);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(userJson);
		
		RestAssured.baseURI="https://gorest.co.in";
		
		given().log().all()
			.contentType(ContentType.JSON)
			.header("Authorization","Bearer 5c0be83a212c355886eda936d41fe0e1108cd47940062c895b93515377040420")
			.body(userJson)
		.when().log().all()
			.post("/public-api/users")
		.then().log().all()
			.assertThat()
				.statusCode(200)
			.and()
				.body("data.name", equalTo(user.getName())) 
				.body("data.email", equalTo(user.getEmail()))
				.body("data.gender", equalTo(user.getGender()));
				
		
	}
}
