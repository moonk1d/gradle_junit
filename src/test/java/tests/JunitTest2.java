package tests;

import ch.qos.logback.classic.Logger;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

public class JunitTest2 {

  private static final Logger logger = (Logger) LoggerFactory.getLogger(JunitTest2.class);

  @Test
  public void test1() {
    logger.info("Running test 2");
    logger.info("Run test: " + JunitTest2.class.getName() + " test1");
  }

  @Test
  public void test2() {
    logger.info("Run test: " + JunitTest2.class.getName() + " test2");
  }
}
