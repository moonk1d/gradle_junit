package hooks;

import configuration.AppConfiguration;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class UiConfigurationSetupHook implements BeforeAllCallback {

  @Override
  public void beforeAll(ExtensionContext context) throws Exception {
    AppConfiguration.init();
  }
}
