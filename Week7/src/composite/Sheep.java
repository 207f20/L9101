package composite;

/**
 * This class represents an individual sheep (this is the leaf).
 */
public class Sheep {
	
	  String name;

	  public Sheep(String name) {
		  this.name = name; 
	  }

	  public String getSheepName() { 
		  return name; 
	  }

}
