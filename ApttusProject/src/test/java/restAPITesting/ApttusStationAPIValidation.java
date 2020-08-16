package restAPITesting;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import resources.Utils;
import resources.payload;

import static io.restassured.RestAssured.*;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ApttusStationAPIValidation extends Utils{
	
	String APP_URI = "http://api.openweathermap.org/data/3.0/stations";
	
	String validID1;
	String validID2;

	//1. Validate that attempt to register a weather station without an API key
	@Test(priority=1)
	public void registerWeatherWithoutAPIKey() throws IOException
	{
		
		String response = given().log().all().contentType(ContentType.JSON)
		.body(payload.getPayload1()).when().post(APP_URI)
		.then().assertThat().statusCode(401).extract().response().asString();
		
		System.out.println(response);
		
		JsonPath js1 = getJsonPath(response);
		String messageValidation = js1.getString("message");
		Assert.assertEquals(messageValidation, "Invalid API key. Please see http://openweathermap.org/faq#error401 for more info.");
	}
	
	//2. Successfully register two stations
	@Test(priority=2)
	public void registerTwoStationsWithValidKey() throws IOException
	{
		
		String response1 = given().log().all().queryParam("appid", "da76ae01115dfd97f7bb5d3c8483b5b4").contentType(ContentType.JSON)
				.body(payload.getPayload1()).when().post(APP_URI)
				.then().assertThat().statusCode(201).extract().response().asString();
		
		System.out.println(response1);
		
		JsonPath js1 = getJsonPath(response1);
		 validID1 = js1.getString("ID");
		
		String response2 = given().log().all().queryParam("appid", "da76ae01115dfd97f7bb5d3c8483b5b4").contentType(ContentType.JSON)
				.body(payload.getPayload2()).when().post(APP_URI)
				.then().assertThat().statusCode(201).extract().response().asString();
		
		System.out.println(response2);
		
		JsonPath js2 = getJsonPath(response2);
		 validID2 = js2.getString("ID");
		
	}
	
	//3. Get the stations
	@Test(priority=3)
	public void getStations()
	{
		String response1 = given().log().all().queryParam("appid", "da76ae01115dfd97f7bb5d3c8483b5b4").contentType(ContentType.JSON)
				.when().get(APP_URI)
				.then().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(response1);
	}
	
	//4. Delete the stations 
	@Test(priority=4)
	public void DeleteStations()
	{
		given().log().all().queryParam("appid", "da76ae01115dfd97f7bb5d3c8483b5b4").contentType(ContentType.JSON)
				.when().delete(APP_URI+"/"+validID1)
				.then().assertThat().statusCode(204).extract().response();

		
		given().log().all().queryParam("appid", "da76ae01115dfd97f7bb5d3c8483b5b4").contentType(ContentType.JSON)
				.when().delete(APP_URI+"/"+validID2)
				.then().assertThat().statusCode(204).extract().response();

	}
	
	//5. Verify Station not found
	@Test(priority=5)
	public void verifyStationNotFound()
	{
		String response1 = given().log().all().queryParam("appid", "da76ae01115dfd97f7bb5d3c8483b5b4").contentType(ContentType.JSON)
				.when().delete(APP_URI+"/"+validID2)
				.then().assertThat().statusCode(404).extract().response().asString();
		
		JsonPath js2 = getJsonPath(response1);
		String message = js2.getString("message");
		
		Assert.assertEquals(message, "Station not found");
		
	}

	
}