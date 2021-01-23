package com.rest.api.get;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

public class ResponseSpecBuilderTest {

	//t1 t2 t3 t4 ...t100
	//status code 200-->201
	//content type
	//header
	
	//ResponseSepicification resSpec;
	
	ResponseSpecBuilder res=new ResponseSpecBuilder();	
	ResponseSpecification resSpec_200_OK=res.expectContentType(ContentType.JSON)
			.expectStatusCode(200)
			.expectHeader("Server", "nginx")
			.build();
	

	ResponseSpecification resSpec_400_BAD_REQUEST=res.expectContentType(ContentType.JSON)
			.expectStatusCode(400)
			.expectHeader("Server", "nginx")
			.build();

	ResponseSpecification resSpec_401_AUTH_FAIL=res.expectContentType(ContentType.JSON)
			.expectStatusCode(401)
			.expectHeader("Server", "nginx")
			.build();
	
	@Test
	public void ResponseSpecTest() {
		RestAssured.baseURI="https://gorest.co.in";
		
		given().log().all()
			.header("Authorization","Bearer 5c0be83a212c355886eda936d41fe0e1108cd47940062c895b93515377040420")
			.when().log().all()
				.get("/public-api/users")
			.then().log().all()
				.assertThat()
					.spec(resSpec_200_OK);
	}
	
	@Test
	public void ResponseSpec_Auth_Fail_Test() {
		RestAssured.baseURI="https://gorest.co.in";
		
		given().log().all()
			.header("Authorization","Bearer 5c0be83a212c355886eda936d41fe0e1108cd47940062c895b93515377040420aaaa")
			.when().log().all()
				.get("/public-api/users")
			.then().log().all()
				.assertThat()
					.spec(resSpec_401_AUTH_FAIL);
	}
}
