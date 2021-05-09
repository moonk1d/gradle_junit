package restassured.configuration;

import ch.qos.logback.classic.Logger;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.slf4j.LoggerFactory;

public final class AppConfiguration {

  private static final Logger logger = (Logger) LoggerFactory.getLogger(AppConfiguration.class);
  private static Environment environment;

  public static Environment getEnvironment() {
    return environment;
  }

  public static void init() {
    setupEnvironment();
    setupRestAssuredConfiguration();
  }

  private static void setupRestAssuredConfiguration() {
    logger.info("Configuring RestAssured");
    RestAssured.baseURI = environment.getUrl();
    RestAssured.basePath = environment.getVersion();
    RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
  }

  private static void setupEnvironment() {
    String envProperty = System.getProperty("env");

    if (envProperty == null) {
      envProperty = "default";
    }

    switch (envProperty) {
      case "prod":
        environment = Environment.PROD;
        break;
      case "test":
        environment = Environment.QA;
        break;
      default:
        // TODO: Add default environment
        environment = Environment.QA;
        break;
    }

    logger.info("Setting up environment URL as [{}]", environment.getUrl());
  }
}
