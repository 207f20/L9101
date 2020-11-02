package composite2;

import java.util.ArrayList;

//a composite graphic component contains other simple or composite components
public class GraphicComposite implements GraphicComponent {
	
	// TODO: Fix this
	private ArrayList<?> children = new ArrayList<?>();
	// Should the type of this list be:
	// A. GraphicSimple
	// B. GraphicComposite
	// C. GraphicComponent
	// D. None of the Above
	
	private String name = "";
	
	public GraphicComposite(String name) {
		this.name = name;
	}

	// TODO: Complete the two methods below (you can use SheepGroup as reference)
	@Override
	public void paint() {
		System.out.println(this.name + ": composite component");
		// YOUR CODE HERE
	}
	
	public void add(GraphicComponent c) {
		// YOUR CODE HERE
	}
}
