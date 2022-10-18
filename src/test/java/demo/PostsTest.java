package demo;

import apppages.PostsPage;
import extensions.AppiumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(AppiumExtension.class)
public class PostsTest {

  @Test
  public void checkPostsById() {
    PostsPage postPage = new PostsPage();
    postPage.open()
        .checkPostPage()
        .clickPostPage()
        .checkPostByUserId("1");
  }

  @Test
  public void checkCommentsPosts() {
    PostsPage postPage = new PostsPage();
    postPage.open()
        .checkPostPage()
        .clickPostPage()
        .scroll();
  }
}
