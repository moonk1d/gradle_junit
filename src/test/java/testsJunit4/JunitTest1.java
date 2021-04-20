package testsJunit4;

import org.junit.Test;

public class JunitTest1 {

    @Test
    public void test1() {
        System.out.println("Run test: " + JunitTest1.class.getName() + " test1");
    }

    @Test
    public void test2() {
        System.out.println("Run test: " + JunitTest1.class.getName() + " test2");
    }
}
