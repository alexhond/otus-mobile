package apppages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PostsPage extends BasePage<PostsPage> {
  private static final String POSTS_PAGE = "//android.view.View[contains(@content-desc, '%s')]";
  private static final String USER_ID = "//android.view.View[contains(@content-desc, 'user id: %s')]";

  public PostsPage open() {
    Selenide.open();
    return this;
  }

  public PostsPage checkPostPage() {
    $(By.xpath(String.format(POSTS_PAGE, "Посты"))).shouldBe(Condition.visible);
    return this;
  }

  public PostsPage clickPostPage() {
    $(By.xpath(String.format(POSTS_PAGE, "Посты"))).click();
    return this;
  }

  public void checkPostByUserId(String id) {
    $(By.xpath(String.format(USER_ID, id))).click();
  }

}
