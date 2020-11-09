package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostTest {
    @Test
   public void post(){
       given()
               .baseUri("https://postman-echo.com")
               .body("some data")
               .when()
               .post("/post")
               .then()
               .statusCode(200)
               .body("some data", equalTo("some data"))
       ;

   }

    }
