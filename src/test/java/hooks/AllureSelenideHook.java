package hooks;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class AllureSelenideHook implements BeforeAllCallback {

  @Override
  public void beforeAll(ExtensionContext context) throws Exception {
    SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
  }
}
