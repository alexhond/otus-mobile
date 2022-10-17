package enums;

public enum Users {
  BRET("hildegard.org", "Bret"),
  ANTONETTE("anastasia.net", "Antonette"),
  SAMANTHA("ramiro.info", "Samantha"),
  KARIANNE("kale.biz", "Karianne"),
  KAMREN("demarco.info", "Kamren"),
  LEOPOLDO("ola.org", "Leopoldo_Corkery"),
  ELWYN_SKILES("elvis.io", "Elwyn.Skiles");

  final String requestId;
  final String responseId;

  Users(String responseId, String requestId) {
    this.requestId = requestId;
    this.responseId = responseId;
  }

  public String getRequestId() {
    return requestId;
  }

  public String getResponseId() {
    return responseId;
  }
}
