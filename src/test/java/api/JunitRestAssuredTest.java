package api;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

import hooks.ApiConfigurationSetupHook;
import hooks.LogWatcher;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({LogWatcher.class, ApiConfigurationSetupHook.class})
public class JunitRestAssuredTest {

  public static final String PRICE_ENDPOINT = "/ticker/price";

  @Test
  public void restAssuredTc1() {
    RequestSpecification request = given()
        .param("symbol", "CHZUSDT");
    Response response = request.get(PRICE_ENDPOINT);
    assertEquals(response.getStatusCode(), 200);
  }

  @Test
  public void restAssuredTc2_fails() {
    // expected to fail
    given().param("symbols", "CHZUSDT")
        .when().get(PRICE_ENDPOINT)
        .then().statusCode(201);
  }

}
