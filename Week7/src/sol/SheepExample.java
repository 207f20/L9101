package sol;

public class SheepExample {

	  public static void main(String agrs[]) {
	    SheepGroup sg1 = new SheepGroup("Sheep Group 1");

	    Sheep s1 = new Sheep("Sheep 1");
	    Sheep s2 = new Sheep("Sheep 2");
	    Sheep s3 = new Sheep("Sheep 3");
	    Sheep s4 = new Sheep("Sheep 4");
	    Sheep s5 = new Sheep("Sheep 5");

	    sg1.add(s2);
	    sg1.add(s3);
	    sg1.add(s4);
	    sg1.add(s5);

	    // I can use the same method call to sheer an individual sheep s1,
	    // as I would to sheer a group of sheep sg1
	    //s1.sheer();
	    //sg1.sheer();

	    SheepGroup sg2 = new SheepGroup("SheepGroup 2");
	    sg2.add(s1);
	    // Now, compose a group of sheep with another group of sheep
	    sg2.add(sg1);
	    Sheep s6 = new Sheep("Sheep 6");
	    sg2.add(s6);
	    
	    
	    sg2.sheer();
	  }
	}
