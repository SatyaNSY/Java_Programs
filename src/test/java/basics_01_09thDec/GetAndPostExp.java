/*package basics_01_09thDec;

import org.testng.annotations.Test;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.regex.Matcher;


public class GetAndPostExp {
	
	@Test
	public void testGet() {
		//Testing the PUSH FROM LOCAL
		baseURI = "https://reqres.in/api";
		
		given().get("/users?page=2").then().statusCode(200).
		body("data[4].first_name",equalTo("George")).
		body("data.first_name",hasltems("George","Rachel"));
		
	}

	private ResponseAwareMatcher<Response> hasltems(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}*/
