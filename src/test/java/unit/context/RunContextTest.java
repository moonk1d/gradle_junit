package unit.context;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import context.RunContext;
import org.junit.jupiter.api.Test;

class RunContextTest {

  @Test
  void clearContext() {
    // arrange
    RunContext.put("key", 123);
    RunContext.get("key", Integer.class);

    // act
    RunContext.clearContext();

    // assert
    assertThrows(RuntimeException.class,
        () -> RunContext.get("key", Integer.class));
  }

  @Test
  void put_and_get() {
    // arrange
    int expectedObject = 123;
    RunContext.put("key", expectedObject);

    // act
    int actualObject = RunContext.get("key", Integer.class);

    // assert

    assertEquals(expectedObject, actualObject);
  }
}