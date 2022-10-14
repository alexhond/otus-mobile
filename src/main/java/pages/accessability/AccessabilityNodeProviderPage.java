package pages.accessability;

import com.codeborne.selenide.Condition;
import data.accessability.AccessabilityTextViewData;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.$;

public class AccessabilityNodeProviderPage extends BasePage<AccessabilityNodeProviderPage> {

  public AccessabilityNodeProviderPage checkViewText(AccessabilityTextViewData textViewData) {
    $(String.format("[text='%s']", textViewData.getName())).should(Condition.visible);

    return this;
  }

  public AccessabilityNodeProviderPage checkColorView() {
    $("[class='android.view.View']").shouldBe(Condition.visible);

    return this;
  }
}
