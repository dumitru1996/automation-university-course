import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import testUtils.RestSetup;
import testUtils.ReadPropertiesFile;

import java.io.File;
import java.util.Properties;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_NOT_FOUND;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestPetStoreAPI {

    static final Properties prop = ReadPropertiesFile.readPropertiesFile();
    static final String path = prop.getProperty("pet.api");
    static final String endpointForFile = "pet/0/uploadImage";
    static final String endpointWithId = "pet/1";


    @BeforeAll
    public static void configureRestAssured() {
        RestSetup.setupRestLogs();
    }

    @Test
    public void postFileToItem() {
        File file = new File("src/test/resources/bengal_cat.png");
        Response response = given()
                .param("additionalMetadata","file")
                .multiPart("file", file, "multipart/form-data")
                .post(path + endpointForFile)
                .thenReturn();
        assertTrue(response.asPrettyString().contains("bengal_cat.png"));
    }

    @Test
    public void checkThatPetIsNotFound() {
        given().when()
                .get(path+endpointWithId)
                .then()
                .assertThat()
                .statusCode(SC_NOT_FOUND)
                .body("message",is(equalTo("Pet not found")))
                .log();
    }
}
