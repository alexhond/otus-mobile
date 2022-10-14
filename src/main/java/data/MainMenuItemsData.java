package data;

public enum MainMenuItemsData {
  ACCESSIBILITY("Accessibility");

  private String name;

  MainMenuItemsData(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
