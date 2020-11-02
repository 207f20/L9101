package composite;

import java.util.ArrayList;

/**
 * This class can hold a group of sheep (this is the composite).
 */
public class SheepGroup {

  String groupName;
  ArrayList<SheepComponent> sheepComponents;

  public SheepGroup(String name) {
    sheepComponents = new ArrayList<SheepComponent>();
    groupName = name;
  }

  public String getGroupName() {
	  return groupName; 
  }
  
  public void add(SheepComponent sheepComponent) {
    sheepComponents.add(sheepComponent);
  }

  public void remove(SheepComponent sheepComponent) {
    sheepComponents.remove(sheepComponent);
  }

  public SheepComponent getComponent(int index) {
    return sheepComponents.get(index);
  }
  
}