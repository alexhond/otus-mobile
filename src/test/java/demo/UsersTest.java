package demo;

import apppages.UsersPage;
import enums.Users;
import extensions.AppiumExtension;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import providers.SelenideWebDriver;

import java.util.Random;

@ExtendWith(AppiumExtension.class)
@Tag("mobile")
@Tag("users")
public class UsersTest {

  @Test
  public void checkUserBret() {
    UsersPage usersPage = new UsersPage();
    usersPage.open()
        .checkUserPage()
        .clickUserPage()
        .checkUserOnUserPage(Users.BRET);
  }

  @Test
  public void checkUserSamantha() {
    UsersPage usersPage = new UsersPage();
    usersPage.open()
        .checkUserPage()
        .clickUserPage()
        .checkUserOnUserPage(Users.SAMANTHA);
  }

  @Test
  public void checkUserLeopoldo() {
    UsersPage usersPage = new UsersPage();
    usersPage.open()
        .checkUserPage()
        .clickUserPage()
        .checkUserOnUserPage(Users.LEOPOLDO);
  }

  @Test
  public void checkRandomUser() {
    UsersPage usersPage = new UsersPage();
    usersPage.open()
        .checkUserPage()
        .clickUserPage()
        .checkUsersOnUserPage();
  }
}
