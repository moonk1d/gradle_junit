package tests;

import ch.qos.logback.classic.Logger;
import hooks.LogWatcher;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.LoggerFactory;

@ExtendWith(LogWatcher.class)
public class JunitTest1 {

  private static final Logger logger = (Logger) LoggerFactory.getLogger(JunitTest1.class);

  @Test
  public void test1() {
    logger.info("Run test: " + JunitTest1.class.getName() + " test1");
  }

  @Test
  public void test2() {
    logger.info("Run test: " + JunitTest1.class.getName() + " test2");
  }
}
