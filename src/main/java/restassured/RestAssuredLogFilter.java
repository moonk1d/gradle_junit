package restassured;

import ch.qos.logback.classic.Logger;
import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;
import org.slf4j.LoggerFactory;

/**
 * Logs RestAssured request/response in framework desired format.
 * <p>
 * To attach this log filter to all requests/responses simply add following line to RestAssured
 * configuration.
 * <code>RestAssured.filters(new RestAssuredLogFilter());<code/>
 */
public final class RestAssuredLogFilter implements Filter {

  private static final Logger logger = (Logger) LoggerFactory.getLogger(RestAssuredLogFilter.class);

  @Override
  public Response filter(FilterableRequestSpecification requestSpec,
      FilterableResponseSpecification responseSpec, FilterContext ctx) {
    Response response = ctx.next(requestSpec, responseSpec);

    logger.info(buildRequestLogString(requestSpec));
    logger.info(buildResponseLogString(response));

    return response;
  }

  private String buildRequestLogString(FilterableRequestSpecification request) {
    return "\nREQUEST =>\n"
        + request.getMethod() + " " + request.getURI() + "\n"
        + "HEADERS =>\n"
        + request.getHeaders().toString() + "\n"
        + "BODY =>\n"
        + request.getBody();
  }

  private String buildResponseLogString(Response response) {
    return "\nRESPONSE =>\n"
        + response.getStatusCode() + " " + response.getStatusLine() + "\n"
        + "HEADERS =>\n"
        + response.getHeaders().toString() + "\n"
        + "BODY =>\n"
        + response.getBody().prettyPrint();
  }
}
