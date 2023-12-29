package test_cases;

import org.testng.annotations.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;
import config.Base;
import config.FilePathUrls;
public class Test2 {
    Base  b = new Base();
    FilePathUrls filesPath = new FilePathUrls();
    @Test
    public void normalBodyMethodPassJson(){
        given().
                header("X-API-KEY",b.apiKey).
                header("Content-Type", b.contentTypeJSON).
                when().
                body(b.body2).
                post(b.baseURI2+b.basePath2).
                then().log().body();
    }
    @Test
    public void jsonFileMethod() throws IOException {
        byte[] fileData = Files.readAllBytes(Paths.get(filesPath.testData));
        String jsonBodyInString = new String(fileData);
        given().
                header("X-API-KEY",b.apiKey).
                header("Content-Type", b.contentTypeJSON).
                when().
                body(jsonBodyInString).
                post(b.baseURI2+b.basePath2).
                then().
                log().
                body();
    }
    @Test
    public void getWorkSpaceWithPathParam(){
        given().
                header("X-API-KEY",b.apiKey).
                header("Content-Type", b.contentTypeJSON).
                pathParam("id",b.workSpaceId).
                when().
                get(b.baseURI2+b.basePath2+"/{id}").
                then().log().body();
    }
    @Test
    public void updateWorkSpaceWithPathParam(){
        given().
                header("X-API-KEY",b.apiKey).
                header("Content-Type", b.contentTypeJSON).
                pathParam("id",b.workSpaceId).
                when().
                body(b.updateBody2).
                put(b.baseURI2+b.basePath2+"/{id}").
                then().log().body();
    }
//    @Test
//    public void deleteWorkSpaceWithPathParam(){
//        given().
//                header("X-API-KEY",b.apiKey).
//                header("Content-Type", b.contentTypeJSON).
//                pathParam("id",b.workSpaceId).
//                when().
//                delete(b.baseURI2+b.basePath2+"/{id}").
//                then().log().body();
//    }
}
