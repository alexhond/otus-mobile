package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import data.accessability.ISubmenuItems;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MainPage extends BasePage<MainPage> {

  public MainPage open() {
    Selenide.open();

    return this;
  }


  public void clickMenuItem(ISubmenuItems menuItems) {
    String selectorTemplate = "[text='%s']";

    $(String.format(selectorTemplate, menuItems.getMainMenuItemsData().getName())).click();

    $(String.format(selectorTemplate, menuItems.getName())).shouldBe(Condition.visible);
    $(String.format(selectorTemplate, menuItems.getName())).click();
  }

//  public void clickMenuItem(ISubmenuItems menuItems) {
//    String selectorTemplate = "[text='%s']";
//    $$(By.id("android.view.View")).asDynamicIterable().stream().forEach(s -> System.out.println(s.getText()));
//
//    $(By.id("00000000-0000-000b-0000-001700000001")).click();
//
//    $(String.format(selectorTemplate, menuItems.getName())).shouldBe(Condition.visible);
//    $(String.format(selectorTemplate, menuItems.getName())).click();
//  }

}
