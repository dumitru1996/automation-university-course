import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.json.JSONObject;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import testUtils.RestSetup;


import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_CREATED;
import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestUsersAPI {

    static final String listOfUsers = "?page=2";
    static ResponseSpecification responseSpecification = RestSetup.setupResponseSpecs();

    @BeforeAll
    static void configureRestAssured() {
        RestSetup.setupRest();//when specs are common for all tests rather put specs in before step
        //testUtils.RestSetup.setupRestLogs();//when they aren't common just put in before step general configuration like logs..
    }

    @Test
    public void getListOfUsersFromPage2() {//without configuring rest assured
        given().when()
                .get(listOfUsers)//simple get command
                .then()
                .assertThat()//validate result on status code
                .statusCode(SC_OK)
                .log();
    }

    @Test
    public void getListOfUsersFromPage2WithSpecs() {//without configuring rest assured
        RequestSpecification reqSpecs = RestSetup.setupRequestSpecs();

        given().when()
                .spec(reqSpecs)//when specs are repeated for a group of test use a common configuration: put setupRestLogs() in beforeAll
                .get(listOfUsers)
                .then()
                .assertThat()
                .spec(responseSpecification)//if it's a common response for a group of tests, make response reusable
                .log();
    }

    @Test
    public void postAnewUser() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("id", 100);
        requestBody.put("name", "Ana");
        requestBody.put("job", "analytic");

        given().when()
                .body(requestBody.toString())
                .post()
                .then()
                .assertThat()
                .statusCode(SC_CREATED)
                .body("name", is(equalTo("Ana")))//make assertion on something
                .log();
    }


    @Test
    public void demoExampleOfPostNewUser() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("id", 100);
        requestBody.put("name", "Ana");
        requestBody.put("job", "analytic");
        Response response = given().when()
                .body(requestBody.toString())
                .post();//response can be saved and used in another test
        assertThat(response.getStatusCode(), is(201));

    }

    @Test
    public void getCertainUser() {
        given().when()
                .get("/7")//search user by id
                .then()
                .assertThat()
                .statusCode(SC_OK)
                .body("data.first_name", is("Michael"))//assert on expected first_name under data hierarchy
                .log();
    }

    @ParameterizedTest
    @ValueSource(strings = {"a", "ana-maria", "123456"})
    public void updateExistingUser(String testName) {//test acceptable names
        String body = "{" +
                "    \"name\": \"" + testName + "\",\n" +
                "    \"job\": \"zion resident\"\n" +
                "}";
        given().when()
                .body(body)
                .put("/2")
                .then()
                .assertThat()
                .statusCode(SC_OK)
                .body("name", is(testName))
                .log();
    }

    @Test
    public void deleteExistingUser() {
        given().when()
                .delete("/2")
                .then()
                .assertThat()
                .statusCode(204)
                .log();
    }

    @AfterAll
    public static void reset(){
        System.out.println("\nReset RA configurations to default");
        RestAssured.reset();
    }
}
