package factory.ver3;

public class HtmlDialog extends Dialog {

  @Override
  public Button createButton() {
    return new HtmlButton();
  }
}
