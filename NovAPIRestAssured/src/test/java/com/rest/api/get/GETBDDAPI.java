package com.rest.api.get;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.xml.XMLParser;

import XMLUtil.XmlParser;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;	

public class GETBDDAPI {

	//Rest Assured BDD:
	/*given()
	 * when()
	 * then()
	 * and()
	 */
	
	@Test
	public void getAPICircuitTest_1() {
		given().log().all()
		.when().log().all()
		.get("http://ergast.com/api/f1/2017/circuits.json")
		.then().log().all()
			.assertThat()
			.body("MRData.CircuitTable.Circuits.circuitId", hasSize(20));
	}
	
	@Test
	public void getAPICircuitTest_2() {
		Response response=given().log().all()
						.when().log().all()
						.get("http://ergast.com/api/f1/2017/circuits.json");
		
		int statusCode=response.getStatusCode();
		System.out.println("api response status code : "+statusCode);
		Assert.assertEquals(statusCode, 200);
		
		System.out.println(response.prettyPrint());
	}
	
	

	@Test
	public void getAPICircuitTest_contentLength() {
		RestAssured.baseURI="http://ergast.com";
		given().log().all()
		.when().log().all()
			.get("/api/f1/2017/circuits.json")
		.then().log().all()
			.assertThat()
				.statusCode(200)
		.and()
			.contentType(ContentType.JSON)
		.and()
			.header("Content-Length", "4551");
		
		
	}
	
	@Test
	public void getJsonAPI_VerifyMD5Value() {
		String paramValue="test";
		String expectedMd5Value="098f6bcd4621d373cade4e832627b4f6";
		
		given().log().all()
			.queryParam("text", paramValue)
		.when().log().all()
			.get("http://md5.jsontest.com")
		.then()
			.assertThat()
				.body("md5", equalTo(expectedMd5Value));
	}
	
	@DataProvider(name="getCircuitYearData")
	public Object[][] getCircuitYearInfo(){
		return new Object[][] {
			{"2017",20},
			{"2016",21},
			{"1966",9}
		};		
	}
	
	@Test(dataProvider ="getCircuitYearData")
	public void numberOfCircuitsYearTest(String seasonYear,int circuitNumber) {
		given().log().all()
			.pathParam("raceSeason", seasonYear)
		.when().log().all()
			.get("http://ergast.com/api/f1/{raceSeason}/circuits.json")
		.then().log().all()
			.assertThat()
				.body("MRData.CircuitTable.Circuits.circuitId", hasSize(circuitNumber));
	}
	
	
	@Test
	public void getUserResponseXml_Test() {
		RestAssured.baseURI="https://gorest.co.in";
		Response response=given().log().all()
			.contentType(ContentType.JSON)
			.header("Authorization","Bearer 5c0be83a212c355886eda936d41fe0e1108cd47940062c895b93515377040420")
			.header("Accept","application/xml")
		.when().log().all()
			.get("/public-api/users.xml?name=varma&gender=Female");

		System.out.println(response.getStatusCode());
//		System.out.println(response.prettyPrint());
//		
//		XmlPath xmlPath=response.xmlPath();
//		String limit=xmlPath.get("hash.meta.pagination.limit");
//		System.out.println("Limit is : "+limit);
//		Assert.assertEquals(limit, "20");
		
		String responseXmlString=response.prettyPrint();
		XmlParser xp=new XmlParser(responseXmlString);
		
		String limit=xp.getTextContent("//hash/meta/pagination/limit");
		System.out.println("Limit value is : "+limit);
		Assert.assertEquals(limit, "20");
	}
	
}
