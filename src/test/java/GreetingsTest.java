import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;
//import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class GreetingsTest {
    @Test
    public void testGreeting(){
        given().
                when().
                get("/greeting").
                then().
                assertThat().
                body("content",equalTo("Hello, World!"));
    }

}
