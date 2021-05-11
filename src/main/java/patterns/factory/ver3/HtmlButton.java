package patterns.factory.ver3;

public class HtmlButton implements Button {

  @Override
  public void onClick() {
    System.out.println("HTML Button");
  }
}
