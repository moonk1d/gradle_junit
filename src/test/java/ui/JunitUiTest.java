package ui;

import static com.codeborne.selenide.Selenide.open;

import hooks.AllureSelenideHook;
import hooks.LogWatcher;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.HomePage;
import pages.SignInPage;

@ExtendWith({AllureSelenideHook.class, LogWatcher.class})
public class JunitUiTest {

  @Test
  public void jUnitUiTest1() {
    HomePage homePage = open("https://grinfer.com", HomePage.class);
    homePage.clickLinkByText("Log In");
    SignInPage signInPage = new SignInPage();
    signInPage.isLoaded();
  }

  @Test
  public void jUnitUiFailingTest2() {
    HomePage homePage = open("https://grinfer.com", HomePage.class);
    homePage.clickLinkByText("Log In");
    SignInPage signInPage = new SignInPage();
    signInPage.clickLinkByText("fail");
  }
}
