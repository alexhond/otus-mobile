package data.accessability;

import data.MainMenuItemsData;

public enum AccessabilityItemsData implements ISubmenuItems {
  NODE_PROVIDER("Accessibility Node Provider", MainMenuItemsData.ACCESSIBILITY);

  private String name;
  private MainMenuItemsData mainMenuItemsData;

  AccessabilityItemsData(String name, MainMenuItemsData mainMenuItemsData) {
    this.name = name;
    this.mainMenuItemsData = mainMenuItemsData;
  }

  public String getName() {
    return this.name;
  }

  public MainMenuItemsData getMainMenuItemsData() {
    return mainMenuItemsData;
  }

}
