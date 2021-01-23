package HttpClientAPIs;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rest.api.post.User;

public class POSTUserAPI {

	@Test
	public void createUserAPITest() {
		
		CloseableHttpResponse response=null;
		CloseableHttpClient httpClient=HttpClientBuilder.create().build();
		
		//1. create a post request woth URL:
		HttpPost postRequest=new HttpPost("https://gorest.co.in/public-api/users");
		
		//2.add headers
		postRequest.addHeader("Authorization","Bearer 5c0be83a212c355886eda936d41fe0e1108cd47940062c895b93515377040420");
		postRequest.setHeader("Content-Type","application/json");
		
		//3.convert pojo to json using jackson api
		User user=new User("Umag", "umang123@gmail.com", "Male", "Active");
		
		//convert java pojo to json--Serialization -- JACKSON API
		ObjectMapper mapper=new ObjectMapper();
		String userJson=null;
		try {
			userJson=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		System.out.println(userJson);
		
		StringEntity userEntity=null;
		
		try {
			userEntity=new StringEntity(userJson);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		//4. add the json body to the request:
		postRequest.setEntity(userEntity);
		
		//5. hit the API/execute the API
		try {
			response=httpClient.execute(postRequest);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//6. get the status code:
		System.out.println(response.getStatusLine().getStatusCode());
		Assert.assertEquals(response.getStatusLine().getStatusCode(), 200);
		
		//7. get the response body:
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
	}
}
