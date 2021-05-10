package patterns.singleton;

public class App {

  public static void main(String[] args) {
    Configuration conf1 = Configuration.getInstance("http");
    Configuration conf2 = Configuration.getInstance("https");

    System.out.println(conf1.getValue());
    System.out.println(conf2.getValue());
  }

}
