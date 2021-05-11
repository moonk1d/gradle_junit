package patterns.factory.ver1;

import patterns.factory.ver2.HomePage;
import patterns.factory.ver2.LoginPage;
import patterns.factory.ver2.Page;
import patterns.factory.ver2.PageFactory;

public class App {

  public static void main(String[] args) {
    Page homePage = PageFactory.getPage(HomePage.class);
    System.out.println(homePage.getTitle());

    Page loginPage = PageFactory.getPage(LoginPage.class);
    System.out.println(loginPage.getTitle());
  }

}
