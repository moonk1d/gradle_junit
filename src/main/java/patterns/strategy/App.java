package patterns.strategy;

public class App {

  public static void main(String[] args) {
    Report report = new Report();

    // HTML Strategy
    HtmlReportGenerationStrategy html = new HtmlReportGenerationStrategy();
    report.printReport(html);

    // XML
    XmlReportGenerationStrategy xml = new XmlReportGenerationStrategy();
    report.printReport(xml);
  }

}
