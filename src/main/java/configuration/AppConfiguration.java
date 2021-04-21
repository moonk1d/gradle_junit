package configuration;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;

public final class AppConfiguration {

  private static Environment environment;

  public static Environment getEnvironment() {
    return environment;
  }

  public static void init() {
    setupEnvironment();
    setupSelenideConfiguration();
  }

  private static void setupSelenideConfiguration() {
    Configuration.startMaximized = true;
    Configuration.baseUrl = environment.getUrl();
    SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
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
        environment = Environment.TEST;
        break;
      default:
        environment = Environment.PROD;
        break;
    }
  }
}
