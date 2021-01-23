package com.rest.api.authentications;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.FormAuthConfig;
import io.restassured.http.ContentType;

public class AuthApis {

	//basic auth:
	//username/password
	
	@Test
	public void basic_auth_Preemptive_API_Test() {
		
		given().log().all()
			.auth()
			.preemptive()
			.basic("admin", "admin")
		.when().log().all()
			.get("https://the-internet.herokuapp.com/basic_auth")
		.then().log().all()
			.assertThat()
				.statusCode(200);
	}
	
	@Test
	public void basic_auth_API_Test() {
		
		given().log().all()
			.auth()
			.basic("admin", "admin")
		.when().log().all()
			.get("https://the-internet.herokuapp.com/basic_auth")
		.then().log().all()
			.assertThat()
				.statusCode(200);
	}
	
	//digest authentication: along with username and password hashcode will be sent so that at network layer username
	//and password are always secured 
	
	@Test
	public void basic_digest_API_Test() {
		
		given().log().all()
			.auth()
			.digest("admin", "admin")
		.when().log().all()
			.get("https://the-internet.herokuapp.com/basic_auth")
		.then().log().all()
			.assertThat()
				.statusCode(200);
	}
	
	@Test
	public void form_auth_API_Test() {
		given().log().all()
			.auth()
			.form("batchautomation", "Test@1234",new FormAuthConfig("https://classic.freecrm.com/system/authenticate.cfm","username","password"))
		.when().log().all()
			.get("https://classic.freecrm.com/system/authenticate.cfm")
		.then().log().all()
			.assertThat()
				.statusCode(200);
	}
	
	
	//Oauth2.0:	
	//if you are using:
	//1.with header: append your token with Bearer keyword
	//2.with oauth2() method:No need to add bearer, just pass the token value 
	@Test
	public void Oauth2_API_Test() {
		
		given().log().all()
			.auth()
				.oauth2("5c0be83a212c355886eda936d41fe0e1108cd47940062c895b93515377040420")
		.when().log().all()
			.get("https://gorest.co.in/public-api/users?name=varma")
		.then().log().all()
			.assertThat()
				.statusCode(200);
				
	}
	
	
	@Test
	public void Oauth_API_Test_With_AuthHeader() {
		
		RestAssured.baseURI="https://gorest.co.in";
		
		given().log().all()
			.contentType(ContentType.JSON)
			.header("Authorization","Bearer 5c0be83a212c355886eda936d41fe0e1108cd47940062c895b93515377040420")
		.when().log().all()
			.get("public-api/users?name=varma")
		.then().log().all()
			.assertThat()
				.statusCode(200)
			.and()
				.header("Server", "nginx");
	}
	
	
	@Test
	public void Oauth_API_WithTwoQueryParams_API_Test() {
		
		RestAssured.baseURI="https://gorest.co.in";
		
		given().log().all()
			.contentType("application/json")
			.header("Authorization","Bearer 5c0be83a212c355886eda936d41fe0e1108cd47940062c895b93515377040420")
			.queryParam("name", "varma")
			.param("gender", "Female")
		.when().log().all()
			.get("public-api/users")
		.then().log().all()
			.assertThat()
				.statusCode(200)
			.and()
				.header("Server", "nginx");
	}
	
	
}
