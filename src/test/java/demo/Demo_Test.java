package demo;

import data.accessability.AccessabilityItemsData;
import data.accessability.AccessabilityTextViewData;
import extensions.AppiumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.MainPage;
import pages.accessability.AccessabilityNodeProviderPage;

@ExtendWith(AppiumExtension.class)
public class Demo_Test {

  private MainPage mainPage = new MainPage();
  private AccessabilityNodeProviderPage accessabilityNodeProviderPage = new AccessabilityNodeProviderPage();

  @Test
  public void firstTest() {
    mainPage.open()
        .clickMenuItem(AccessabilityItemsData.NODE_PROVIDER);

    accessabilityNodeProviderPage
        .checkViewText(AccessabilityTextViewData.NODE_PROVIDER)
        .checkColorView();
  }
}
