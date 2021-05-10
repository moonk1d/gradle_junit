package patterns.strategy;

public final class Report {

  public void printReport(ReportGenerationStrategy generationStrategy) {
    System.out.println(generationStrategy.generate());
  }

}
