import com.jayway.restassured.RestAssured;
//import io.restassured.RestAssured;
//import io.restassured.http.ContentType;
import static com.jayway.restassured.RestAssured.given;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;

public class MyApiTest {

    @Test
    public void testGet() {
        RestAssured
                .get("http://my-api.com/resource/123")
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .body("id", equalTo(123));
    }
}