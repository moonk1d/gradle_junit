package hooks;

import configuration.api.AppConfiguration;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class ApiConfigurationSetupHook implements BeforeAllCallback {

  @Override
  public void beforeAll(ExtensionContext context) {
    AppConfiguration.init();
  }
}
