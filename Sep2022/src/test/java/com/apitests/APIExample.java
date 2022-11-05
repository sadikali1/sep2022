package com.apitests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers; 


public class APIExample {

	private long id;
	
	@Test
	public void createpets() {
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		String body = "{"
				+ "  \"id\": 0,"
				+ "  \"category\": {"
				+ "    \"id\": 12,"
				+ "    \"name\": \"Dog\""
				+ "  },"
				+ "  \"name\": \"doggie\","
				+ "  \"photoUrls\": ["
				+ "    \"string1\","
				+ "    \"string2\""
				+ "  ],"
				+ "  \"tags\": ["
				+ "    {"
				+ "      \"id\": 1,"
				+ "      \"name\": \"Dogs1\""
				+ "    },"
				+ "    {"
				+ "      \"id\": 2,"
				+ "      \"name\": \"Dogs1\""
				+ "    }"
				+ "  ],"
				+ "  \"status\": \"available\""
				+ "}";
		
		Response reponse = RestAssured.given().header("accept", "application/json").header("Content-Type" , "application/json")
			.body(body).when().post("/pet");
		System.out.println(reponse.asPrettyString());
		Assert.assertEquals(200, reponse.getStatusCode());
		Assert.assertEquals("application/json", reponse.getContentType());
		this.id = reponse.path("id");
		System.out.println(id);
		
		reponse.then().body("category.id", Matchers.equalTo(12))
			.body("category.name", Matchers.equalTo("Dog"))
			.body("tags[0].id", Matchers.equalTo(1))
			.body("tags[0].name", Matchers.equalTo("Dogs1"))
			.body("name", Matchers.equalTo("doggie"))
			.body("status", Matchers.equalTo("available"))
			.body("photoUrls[0]", Matchers.equalTo("string1"))
			.body("photoUrls[1]", Matchers.equalTo("string2"));
	}
	
	
	// Given, When, Then 
	
	@Test
	public void updatePets() {
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		String body = "{"
				+ "  \"id\": 0,"
				+ "  \"category\": {"
				+ "    \"id\": 0,"
				+ "    \"name\": \"string\""
				+ "  },"
				+ "  \"name\": \"doggie\","
				+ "  \"photoUrls\": ["
				+ "    \"string\""
				+ "  ],"
				+ "  \"tags\": ["
				+ "    {"
				+ "      \"id\": 0,"
				+ "      \"name\": \"string\""
				+ "    }"
				+ "  ],"
				+ "  \"status\": \"available\""
				+ "}";
		
		Response reponse = RestAssured.given().header("accept", "application/json").header("Content-Type" , "application/json")
			.body(body).put("/pet");
		System.out.println(reponse.asPrettyString());
		Assert.assertEquals(200, reponse.getStatusCode());
		Assert.assertEquals("application/json", reponse.getContentType());	
		long id = reponse.path("id");
		System.out.println(id);
	}
	
	@Test
	public void getPets() {
		RestAssured.baseURI = "https://petstore.swagger.io/v2";		
		
		Response reponse = RestAssured.given().header("accept", "application/json").header("Content-Type" , "application/json")
			.get("/pet/findByStatus?status=pending");
		System.out.println(reponse.asPrettyString());
		Assert.assertEquals(200, reponse.getStatusCode());
		Assert.assertEquals("application/json", reponse.getContentType());		
	}
	
	@Test(dependsOnMethods = {"createpets"})
	public void getPetsById() {
		RestAssured.baseURI = "https://petstore.swagger.io/v2";		
		
		Response reponse = RestAssured.given().header("accept", "application/json")
			.get("/pet/"+this.id);
		System.out.println(reponse.asPrettyString());
		Assert.assertEquals(200, reponse.getStatusCode());
		Assert.assertEquals("application/json", reponse.getContentType());		
	}
	
	@Test(dependsOnMethods = {"getPetsById"})
	public void deletePets() {
		RestAssured.baseURI = "https://petstore.swagger.io/v2";		
		
		Response reponse = RestAssured.given().header("accept", "application/json")
			.delete("/pet/"+this.id);
		System.out.println(reponse.asPrettyString());
		Assert.assertEquals(200, reponse.getStatusCode());
		Assert.assertEquals("application/json", reponse.getContentType());		
	}
}
