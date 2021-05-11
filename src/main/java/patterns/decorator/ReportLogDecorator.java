package patterns.decorator;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

public final class ReportLogDecorator {

  private static final Logger logger = (Logger) LoggerFactory.getLogger(ReportLogDecorator.class);

  private Report report;

  public ReportLogDecorator(Report report) {
    this.report = report;
  }

  public void print(String reportString) {
    logger.info(reportString);
    report.print(reportString);
  }
}
