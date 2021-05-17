package cucumber.steps;

import static com.codeborne.selenide.Selenide.open;

import cucumber.common.Page;
import cucumber.configuration.AppConfiguration;
import io.cucumber.java8.En;
import java.util.concurrent.TimeUnit;
import pages.BasicPage;

public class GenericSteps implements En {

  BasicPage basicPage = new BasicPage();

  public GenericSteps() {
    Before(AppConfiguration::init);
    Given("I open {string} page", (String page) -> open(Page.valueOf(page).getUrl()));

    When("I click {string} link",
        (String linkText) -> basicPage.clickLinkByText(linkText));

    When("I click {string} button",
        (String linkText) -> basicPage.clickButtonByText(linkText));

    When("I wait for {int} seconds",
        (Integer secondsToWait) -> {
          try {
            TimeUnit.SECONDS.sleep(secondsToWait);
          } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
          }
        });

    Then("I see {string} page",
        (String page) -> Page.valueOf(page).getClazz().getDeclaredConstructor().newInstance()
            .isLoaded());
  }
}
