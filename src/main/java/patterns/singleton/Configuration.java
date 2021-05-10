package patterns.singleton;

public final class Configuration {

  private static Configuration configuration;
  private String value;

  public String getValue() {
    return value;
  }

  private Configuration(String value) {
    this.value = value;
  }

  public static Configuration getInstance(String value) {
    if (configuration == null) {
      configuration = new Configuration(value);
    }

    return configuration;
  }
}
