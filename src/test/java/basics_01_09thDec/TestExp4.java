package basics_01_09thDec;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
//import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matcher;

public class TestExp4 {

	@Test
	public void test_1() {
		
		Response response = get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		
		int statusCode = response.getStatusCode();
		
		Assert.assertEquals(statusCode, 200);
		
		
	}
	
	@Test
	public void test_2() {
		
		baseURI = "https://reqres.in/api";
		Response res= given().get("/users?page=2").then().statusCode(200).log().all().extract().response();
	   
		JsonPath js= new JsonPath(res.asString());
	    String js1= js.getString("total").toString();
	    System.out.println("Total : "+js1);
	    
	    Assert.assertEquals("12", js1);
	    
	  @SuppressWarnings("unused")
	String email=  js.getString("data[0].email").toString();
	 // System.out.println(email);
	  
	  int count =js.getInt("data.size()");
	  System.out.println(count);
	  for(int i=0;i<count;i++) {
		  String emailList=  js.getString("data["+i+"].email").toString();
		  System.out.println(emailList);
		  
	  }
	
		body("data[1].id", equalTo(8));
		
	}

	private void body(String string, Matcher<Integer> equalTo) {
		// TODO Auto-generated method stub
		
	}
	
}
