package apppages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import enums.Users;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UsersPage extends BasePage<UsersPage> {

  private static final String USERS_PAGE = "//android.view.View[@content-desc=\"Пользователи\nTab 1 of 2\"]";
  private static final String CONTENT_DESC = "//android.view.View[contains(@content-desc, '%s')]";

  public UsersPage open() {
    Selenide.open();
    return this;
  }

  public UsersPage checkUserPage() {
    $(By.xpath(USERS_PAGE)).shouldBe(Condition.visible);
    return this;
  }


  public UsersPage clickUserPage() {
    $(By.xpath(USERS_PAGE)).click();
    return this;
  }

  public void checkUserOnUserPage(Users user) {
    $(By.xpath(String.format(CONTENT_DESC, user.getRequestId()))).click();
    $(By.xpath(String.format(CONTENT_DESC, user.getResponseId()))).shouldBe(Condition.visible);
  }
}
