package providers;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class SelenideWebDriver implements WebDriverProvider {
  private static final String url = System.getProperty("url.android");

  @Nonnull
  @Override
  public WebDriver createDriver(@Nonnull Capabilities capabilities) {
    UiAutomator2Options options = new UiAutomator2Options();
    options.merge(capabilities);
    options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
    options.setPlatformName("Android");
    options.setDeviceName("Galaxy A50");
    options.setPlatformVersion("11.0");
    options.setAdbPort(5037);
    options.setRemoteAdbHost("host.docker.internal");
    options.setApp("/opt/app-java-pro-v2.apk");

    try {
      return new AndroidDriver(new URL(url), options);
    } catch (MalformedURLException e) {
      throw new RuntimeException(e);
    }
  }
}