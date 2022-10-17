package demo;

import apppages.PostsPage;
import extensions.AppiumExtension;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import stubs.UsersStub;

import static com.github.tomakehurst.wiremock.client.WireMock.configureFor;

@ExtendWith(AppiumExtension.class)
public class PostsTest {

  {
    new UsersStub();
  }

  @BeforeAll
  public static void startWireMock() {
    configureFor(443);
  }

  @Test
  public void checkPosts() {
    PostsPage usersPage = new PostsPage();
    usersPage.open()
        .checkPostPage()
        .clickPostPage()
        .checkPostByUserId("1");
  }
}
