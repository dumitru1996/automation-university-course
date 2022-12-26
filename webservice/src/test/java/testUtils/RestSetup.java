package testUtils;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import java.util.Properties;

public class RestSetup {
    static final Properties propertiesFile = ReadPropertiesFile.readPropertiesFile();
    static final String mainRoot = propertiesFile.getProperty("main.api");

    public static void setupRest() {
        RequestSpecBuilder specificationsBuilder = new RequestSpecBuilder()
                .setBaseUri(mainRoot)
                .setBasePath("api/users")
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.JSON)//accepts content of type json
                .addFilter(new RequestLoggingFilter(LogDetail.ALL, true, System.out))//display request logs on console
                .addFilter(new ResponseLoggingFilter(LogDetail.ALL, true, System.out));//display response on console

        RestAssured.requestSpecification = specificationsBuilder.build();
    }

    public static RequestSpecification setupRequestSpecs() {
        return new RequestSpecBuilder()
                .setBaseUri(mainRoot)
                .setBasePath("api/users")
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.JSON)
                .build();//configure headers

    }

    public static ResponseSpecification setupResponseSpecs(){
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType(ContentType.JSON)
                .build();
    }

    public static void setupRestLogs() {
        RequestSpecBuilder specificationsBuilder = new RequestSpecBuilder()
                .addFilter(new RequestLoggingFilter(LogDetail.ALL, true, System.out))//configure logs
                .addFilter(new ResponseLoggingFilter(LogDetail.ALL, true, System.out));
        RestAssured.requestSpecification = specificationsBuilder.build();
    }
}
