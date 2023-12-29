package test_cases;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import config.Base;

public class Test1 {
    Base  b = new Base();

    @Test
    public void getRequestStatusCodeAndBody(){
        RestAssured.baseURI= b.baseURI1;
        String bodyResponse = RestAssured.given().basePath(b.basePath1+"/"+b.userID1).
                when().contentType(ContentType.JSON).
                get().
                then().extract().body().asString();
        int statusCode= RestAssured.given().basePath(b.basePath1+"/"+b.userID1).
                when().contentType(ContentType.JSON).
                get().
                then().extract().statusCode();
        System.out.println("===========================");
        System.out.println("Request: GET\nStatus Code: "+statusCode+"\nResponse Body: "+bodyResponse);
        System.out.println("===========================");
    }
    @Test
    public void postRequestStatusCodeAndBody(){
        RestAssured.baseURI=b.baseURI1;
        String bodyResponse = RestAssured.given().basePath(b.basePath1).
                when().contentType(ContentType.JSON).
                body(b.bodyForPost1).
                post().
                then().extract().body().asString();
        int statusCode= RestAssured.given().basePath(b.basePath1).
                when().contentType(ContentType.JSON).
                body(b.bodyForPost1).
                post().
                then().extract().statusCode();
        System.out.println("===========================");
        System.out.println("Request: POST\nStatus Code: "+statusCode+"\nResponse Body: "+bodyResponse);
        System.out.println("===========================");
    }
    @Test
    public void putRequestStatusCodeAndBody(){
        RestAssured.baseURI=b.baseURI1;
        String bodyResponse = RestAssured.given().basePath(b.basePath1+"/"+b.userID1).
                when().contentType(ContentType.JSON).
                body(b.bodyForPut1).
                put().
                then().extract().body().asString();
        int statusCode= RestAssured.given().basePath(b.basePath1+"/"+b.userID1).
                when().contentType(ContentType.JSON).
                body(b.bodyForPut1).
                put().
                then().extract().statusCode();
        System.out.println("===========================");
        System.out.println("Request: PUT\nStatus Code: "+statusCode+"\nResponse Body: "+bodyResponse);
        System.out.println("===========================");
    }
    @Test
    public void deleteRequestStatusCodeAndBody(){
        RestAssured.baseURI=b.baseURI1;
        String bodyResponse = RestAssured.given().basePath(b.basePath1+"/"+b.userID1).
                when().contentType(ContentType.JSON).
                delete().
                then().extract().body().asString();
        int statusCode= RestAssured.given().basePath(b.basePath1+"/"+b.userID1).
                when().contentType(ContentType.JSON).
                delete().
                then().extract().statusCode();
        System.out.println("===========================");
        System.out.println("Request: DELETE\nStatus Code: "+statusCode+"\nResponse Body: "+bodyResponse);
        System.out.println("===========================");
    }
}
