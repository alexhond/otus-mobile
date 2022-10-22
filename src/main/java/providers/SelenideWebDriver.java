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

  @Nonnull
  @Override
  public WebDriver createDriver(@Nonnull Capabilities capabilities) {
//    File app = downloadApk();

    UiAutomator2Options options = new UiAutomator2Options();
    options.merge(capabilities);
    options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
    options.setPlatformName("Android");
    options.setDeviceName("Galaxy A50");
    options.setPlatformVersion("11.0");
    options.setAdbPort(5037);
    options.setRemoteAdbHost("host.docker.internal");
    options.setApp("/opt/app-java-pro-v2.apk");
//    options.setApp("build/app-java-pro-v2.apk");
//    options.setApp(app.getAbsolutePath());

    try {
      return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
    } catch (MalformedURLException e) {
      throw new RuntimeException(e);
    }
  }

//  private File downloadApk() {
//    File apk = new File("build/app-java-pro-v2.apk");
//    if (!apk.exists()) {
//      String url = "https://github.com/alexhond/otus-mobile/raw/master/build/app-java-pro-v2.apk";
//      try (InputStream in = new URL(url).openStream()) {
//        copyInputStreamToFile(in, apk);
//      } catch (IOException e) {
//        throw new AssertionError("Failed to download apk", e);
//      }
//    }
//    return apk;
//  }
}