package selenide.pages;

public final class SignInPage extends Page {

  public void isLoaded() {
    textIsVisible("Welcome Back");
  }

}
