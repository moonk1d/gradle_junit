package testsJunit4;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({JunitTest1.class, JunitTest2.class})
public class JunitTestSuiteClasses {
}
