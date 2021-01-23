package com.rest.api.schema;

import static io.restassured.RestAssured.*;
import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CheckSchemaTest {
	
	@Test
	public void booking_Schema_Test() {
		RestAssured.baseURI="https://restful-booker.herokuapp.com";
		given().log().all()
			.contentType(ContentType.JSON)
			.body(new File("F:\\Selenium Learning from Naveen\\NovAPIRestAssured\\src\\test\\java\\com\\rest\\api\\schema\\booking.json"))
			.when().log().all()
				.post("/booking")
		.then().log().all()
			.assertThat()
				.statusCode(200)
			.and()
				.body(matchesJsonSchemaInClasspath("BookingSchema.json"));
	}
	
	@Test
	public void get_user_API_schema_Test() {
		RestAssured.baseURI="https://gorest.co.in";
		given().log().all()
			.contentType(ContentType.JSON)
			.header("Authorization","Bearer 5c0be83a212c355886eda936d41fe0e1108cd47940062c895b93515377040420")
			.queryParam("name", "Abhi")
			.param("gender", "Male")
		.when().log().all()
			.get("/public-api/users")
		.then().log().all()
			.assertThat()
				.statusCode(200)
			.and()
				.body(matchesJsonSchemaInClasspath("getuserschema.json"));
			
	}

}
