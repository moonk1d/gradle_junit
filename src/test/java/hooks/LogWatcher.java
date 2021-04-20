package hooks;

import ch.qos.logback.classic.Logger;
import io.qameta.allure.Allure;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class LogWatcher implements BeforeEachCallback, AfterEachCallback {

  private static final Logger logger = (Logger) LoggerFactory.getLogger(LogWatcher.class);

  @Override
  public void beforeEach(ExtensionContext context) {
    MDC.put("testCaseName", buildTestCaseName(context));
  }

  @Override
  public void afterEach(ExtensionContext context) {
    Path content = Paths
        .get(String.format("%s/build/logs/%s.log", System.getProperty("user.dir"),
            buildTestCaseName(context)));
    try (InputStream is = Files.newInputStream(content)) {
      Allure.addAttachment("log", is);
    } catch (IOException e) {
      logger.warn("Log file not found", e);
    }
  }

  private String buildTestCaseName(ExtensionContext context) {
    return String.format("%s.%s", context.getTestClass().get().getName(),
        context.getTestMethod().get().getName());
  }
}
