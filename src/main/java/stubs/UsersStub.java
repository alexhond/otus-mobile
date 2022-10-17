package stubs;

import net.minidev.json.JSONArray;
import stubs.dto.User;

import java.util.ArrayList;
import java.util.List;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class UsersStub {

  {
    registerUsersStub();
  }

  private void registerUsersStub() {
    List<User> user = new ArrayList<>();
    user.add(new User(1, "QA MOCK", "mock2@mail.ru", "LeonidMock"));
    user.add(new User(2, "Java MOCK", "mock1@mail.ru", "KolyaMock"));

    stubFor(post("172.67.155.76")
        .willReturn(aResponse()
            .withBody(JSONArray.toJSONString(user))
            .withStatus(200)));
  }
}
