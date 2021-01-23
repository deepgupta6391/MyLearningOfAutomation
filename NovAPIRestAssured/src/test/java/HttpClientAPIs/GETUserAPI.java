package HttpClientAPIs;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;

public class GETUserAPI {

	@Test
	public void getUserTest() {
		CloseableHttpResponse response=null;
		CloseableHttpClient httpClient=HttpClientBuilder.create().build();
		
		
		//1.create a get request with url:
		HttpGet getRequest=new HttpGet("https://gorest.co.in/public-api/users");
		
		//2.add headers:
		getRequest.addHeader("Authorization","Bearer 5c0be83a212c355886eda936d41fe0e1108cd47940062c895b93515377040420");
		
		//3.execute the api:
		try {
			response=httpClient.execute(getRequest);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//4. get the status code:
		int statusCode=response.getStatusLine().getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200);
		
		
		//5.get the response body:
		HttpEntity httpEntity=response.getEntity();
		String responseBody=null;
		try {
			responseBody=EntityUtils.toString(httpEntity);
			System.out.println(responseBody);
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//get json value using rest assured JsonPath
//		JsonPath js=new JsonPath(responseBody);
//		System.out.println(js.getString("meta.pagination.total"));
		
		//get json value from jayway rest assured API:
		Object document=Configuration.defaultConfiguration().jsonProvider().parse(responseBody);
		List<Integer> result=JsonPath.read(document, "$..total");
		int total=result.get(0);
		System.out.println(result.get(0));
		Assert.assertEquals(total, 1563);
	}
}
