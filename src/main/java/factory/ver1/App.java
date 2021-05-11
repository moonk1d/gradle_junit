package factory.ver1;

import factory.ver2.HomePage;
import factory.ver2.LoginPage;
import factory.ver2.Page;
import factory.ver2.PageFactory;

public class App {

  public static void main(String[] args) {
    Page homePage = PageFactory.getPage(HomePage.class);
    System.out.println(homePage.getTitle());

    Page loginPage = PageFactory.getPage(LoginPage.class);
    System.out.println(loginPage.getTitle());
  }

}
