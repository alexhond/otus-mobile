package extensions;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import providers.SelenideWebDriver;

import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

public class AppiumExtension implements BeforeEachCallback {

  @Override
  public void beforeEach(ExtensionContext extensionContext) {
    closeWebDriver();
    Configuration.browserSize = null;
    Configuration.browser = SelenideWebDriver.class.getName();
  }
}
