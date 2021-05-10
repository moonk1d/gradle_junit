package patterns.strategy;

public class HtmlReportGenerationStrategy implements ReportGenerationStrategy {

  @Override
  public String generate() {
    return "HTML report";
  }
}
