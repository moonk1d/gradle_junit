package ui;

import static com.codeborne.selenide.Selenide.open;

import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.SignInPage;

public class JunitUiTest {

  @Test
  public void jUnitUiTest1() {
    HomePage homePage = open("https://grinfer.com", HomePage.class);
    homePage.clickLinkByText("Log In");
    SignInPage signInPage = new SignInPage();
    signInPage.isLoaded();
  }
}
