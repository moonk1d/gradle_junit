package patterns.strategy;

public class XmlReportGenerationStrategy implements ReportGenerationStrategy {

  @Override
  public String generate() {
    return "XML report";
  }
}
