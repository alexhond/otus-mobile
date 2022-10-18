package apppages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PostsPage extends BasePage<PostsPage> {
  private static final String POSTS_PAGE = "//android.view.View[contains(@content-desc, '%s')]";

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

  public void scroll() {
    int size = $$(By.xpath("//*[contains(@content-desc, 'id')]")).should(CollectionCondition.sizeGreaterThan(0)).size();
    System.out.println("Количество элементов: " + size);

    //не получилось сделать скролл вниз чтобы посчитать элементы

//    $(By.xpath("//android.view.View[contains(@content-desc, 'id: 100')]")).scrollTo();
//    $(By.xpath("//android.view.View[contains(@content-desc, 'id: 100')]")).scrollIntoView(false);
  }

  public void checkPostByUserId(String s) {
    $(By.xpath(String.format("//*[contains(@content-desc, 'id: %s')]", s))).click();
    $("android.view.View").shouldBe(Condition.visible);
  }
}
