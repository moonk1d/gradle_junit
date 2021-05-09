package selenide.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

public class Page {

    public void clickButtonByText(String text) {
        $(By.xpath(String.format("//span[text()='%s']/ancestor::button", text))).click();
    }

    public void clickLinkByText(String text) {
        $(By.xpath(String.format("//a[text()='%s']", text))).click();
    }

    public void textIsVisible(String text) {
        $(By.xpath(String.format("//h1[text()='%s']", text))).shouldBe(visible);
    }
}
