package demo;

import apppages.UsersPage;
import enums.Users;
import extensions.AppiumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Random;

@ExtendWith(AppiumExtension.class)
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
    Random random = new Random();
    int i = random.nextInt(7);
    Users[] values = Users.values();
    UsersPage usersPage = new UsersPage();
    usersPage.open()
        .checkUserPage()
        .clickUserPage()
        .checkUserOnUserPage(values[i]);
  }
}
