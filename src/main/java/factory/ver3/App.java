package factory.ver3;

public class App {

  public static void main(String[] args) {
    Dialog desktopDialog = new DesktopDialog();
    desktopDialog.clickButton();

    Dialog htmlDialog = new HtmlDialog();
    htmlDialog.clickButton();
  }

}
