package patterns.decorator;

public class App {

  public static void main(String[] args) {
    Report r = new Report();

    ReportLogDecorator rld = new ReportLogDecorator(r);
    rld.print("Report");
  }

}
