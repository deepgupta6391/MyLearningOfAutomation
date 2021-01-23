package com.rest.api.authentications;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class OAuth1APITest {

	@Test
	public void TwitterStatusAPI_OAuth1_Test() {
		RequestSpecification request=
		RestAssured.given()
				.auth()
					.oauth("UzOf4xVsotlCBI50m5ch0gUJj",
							"WoRE086RKD9RGU2yvsjfDGM0ZctNZzd7mFdNUxGA8gKAyysv2x",
							"732629984-3pDaF9ZAIY4NOBx3uOxiY4NvdbjXrHF8O61YnBfe",
							"25Lu9tPYttID6UNbs75WQPJRXI0Ib3uifsqhbYGHHSDAn");
		
		Response response=request.post("https://api.twitter.com/1.1/statuses/update.json?status=Hey this is my tweet!!!");
		System.out.println(response.getStatusCode());
		System.out.println(response.prettyPrint());
	}
}
