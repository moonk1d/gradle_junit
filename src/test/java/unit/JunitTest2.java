package unit;

import ch.qos.logback.classic.Logger;
import hooks.LogWatcher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.LoggerFactory;

@ExtendWith(LogWatcher.class)
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
    Assertions.assertEquals(1, 2);
  }
}
