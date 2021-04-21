package context;

import java.util.HashMap;
import java.util.Map;

public final class RunContext {
  private static RunContext instance;
  private static final Map<String, Object> context = new HashMap<>();

  private RunContext() {
  }

  public static RunContext getInstance() {
    if (instance == null) {
      instance = new RunContext();
    }

    return instance;
  }

  public void clearContext() {
    context.clear();
  }

  public <T> T get(String key, Class<T> objectClass) {
    Object object;
    try {
      object = context.get(key);
    } catch (NullPointerException e) {
      // TODO: Add meaningful exception
      throw new RuntimeException();
    }

    return objectClass.cast(object);
  }

  public <T> void put(String key, T object) {
    context.put(key, object);
  }
}