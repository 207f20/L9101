package sol;

/**
 * This class represents an individual sheep (this is the leaf).
 */
public class Sheep extends SheepComponent {
	  String name;

	  public Sheep(String name) {this.name = name; }

	  public String getSheepName() { return name; }

	  @Override
	  public void sheer() {
	    System.out.println("Sheering " + getSheepName() + "...\n");
	  }
	}
