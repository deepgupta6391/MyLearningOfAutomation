package com.rest.api.post;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class POSTAPIBDD {
	
	@Test
	public void tokenPostBDDAPI_JSONSTRING_Test() {
		RestAssured.baseURI="https://restful-booker.herokuapp.com";
		given().log().all()
			.contentType(ContentType.JSON)
			.body("{\"username\" : \"admin\",\"password\" : \"password123\"}")
		.when().log().all()
			.post("/auth")
		.then().log().all()
			.assertThat()
				.statusCode(200);
		
	}
	
	@Test
	public void tokenPostBDDAPI_FILE_Test() {
		RestAssured.baseURI="https://restful-booker.herokuapp.com";
		
		String tokenID=given().log().all()
							.contentType(ContentType.JSON)
							.body(new File("./src/test/java/DataFiles/credentials.json"))
						.when().log().all()
							.post("/auth")
						.then().log().all()
							//.assertThat()
								//.statusCode(200);
							.extract().path("token");
		
		System.out.println(tokenID);
		Assert.assertNotNull(tokenID);
	}

	@Test
	public void createUser_Post_API_JSONStringTest() {
		RestAssured.baseURI="https://gorest.co.in/";
		given().log().all()
			.contentType(ContentType.JSON)
			.header("Authorization","Bearer 5c0be83a212c355886eda936d41fe0e1108cd47940062c895b93515377040420")
			.body("{\"name\": \"Dhinchak123\",\"email\": \"dhin1234@gmail.com\",\"gender\": \"Female\",\"status\": \"Inactive\"}")
		.when().log().all()
			.post("/public-api/users")
		.then().log().all()
			.assertThat()
				.body("code", equalTo(201));
	}
	
	@Test
	public void createUser_Post_API_FileTest() {
		RestAssured.baseURI="https://gorest.co.in/";
		
		given().log().all()
			.contentType(ContentType.JSON)
			.header("Authorization","Bearer 5c0be83a212c355886eda936d41fe0e1108cd47940062c895b93515377040420")
			.body(new File("./src/test/java/DataFiles/user.json"))
		.when().log().all()
			.post("/public-api/users")
		.then().log().all()
			.assertThat()
				.body("code", equalTo(201));				
	}
	
	
}
