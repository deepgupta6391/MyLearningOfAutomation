package com.rest.api.authentications;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Oauth2APITest {
	
	@Test
	public void checkOAuth2_APITest() {
		
		RequestSpecification request= RestAssured
										.given()
											.auth()
												.oauth2("351ec3b8e91054fecc2d944f400b9e42143c4bc6");
		
		Response response=request.post("http://coop.apps.symfonycasts.com/api/1509/chickens-feed");
		System.out.println(response.getStatusCode());
		System.out.println(response.prettyPrint());
		
	}
	
	//1.Generate a token at the run time by using token api
	//2.String tokenID from the response
	//3.hit the next api with this tokenID
	
	@Test
	public void getAuth2TokenAPITest() {
		RequestSpecification request=	
			RestAssured.given()
				.formParam("client_id", "NovAPIApp001")
				.formParam("client_secret", "106fe73195b70a939be47286905ee0fa")
				.formParam("grant_type", "client_credentials");
		
		Response response=request.post("http://coop.apps.symfonycasts.com/token");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.prettyPrint());
		
		
		//*****************to get data from json body************************
		String tokenId=response.jsonPath().getString("access_token");
		System.out.println("API token Id is : "+tokenId);
		
		//feed chicken api:
		RequestSpecification request1=
							RestAssured.given()
							.auth().oauth2(tokenId);
		Response response1=request1.post("http://coop.apps.symfonycasts.com/api/1509/eggs-collect");
		System.out.println(response1.getStatusCode());
		System.out.println(response1.prettyPrint());
	
	}

	
}
