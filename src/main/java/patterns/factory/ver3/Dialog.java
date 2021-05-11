package patterns.factory.ver3;

public abstract class Dialog {

  public void clickButton() {
    Button button = createButton();
    button.onClick();
  }

  public abstract Button createButton();

}
