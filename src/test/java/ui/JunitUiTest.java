package ui;

import static com.codeborne.selenide.Selenide.open;

import context.RunContext;
import hooks.UiConfigurationSetupHook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import selenide.pages.HomePage;
import selenide.pages.SignInPage;

@ExtendWith({UiConfigurationSetupHook.class})
public class JunitUiTest {

  @Test
  public void jUnitUiTest1() {
    HomePage homePage = open("", HomePage.class);
    homePage.clickLinkByText("Log In");
    SignInPage signInPage = new SignInPage();
    signInPage.isLoaded();
  }

  @Test
  public void jUnitUiFailingTest2() {
    // expected to fail
    SignInPage signInPage = open("/sign-in", SignInPage.class);
    signInPage.clickLinkByText("Log In");
  }

  @Test
  public void jUnitUiSaveToContextTest3() {
    RunContext.put("test_context", "test");
  }

  @Test
  public void jUnitUiReadContextFromTest4() {
    String savedContext = RunContext.get("test_context", String.class);
    Assertions.assertEquals("test", savedContext);
  }

}
