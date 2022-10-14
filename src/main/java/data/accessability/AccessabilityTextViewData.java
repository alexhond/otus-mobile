package data.accessability;

public enum AccessabilityTextViewData {
  NODE_PROVIDER("Enable TalkBack and Explore-by-touch from accessibility settings. Then touch the colored squares.");

  private String name;

  AccessabilityTextViewData(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
