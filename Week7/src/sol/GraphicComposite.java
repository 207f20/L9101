package sol;

import java.util.ArrayList;

//a composite graphic component contains other simple or composite components
public class GraphicComposite implements GraphicComponent {
	
	// Answer: C
	private ArrayList<GraphicComponent> children = new ArrayList<GraphicComponent>();
	// Should the type of this list be:
	// A. GraphicSimple
	// B. GraphicComposite
	// C. GraphicComponent
	// D. None of the Above
	
	private String name = "";
	
	public GraphicComposite(String name) {
		this.name = name;
	}

	@Override
	public void paint() {
		System.out.println(this.name + ": composite component");
		for (GraphicComponent c: this.children) {
			c.paint();
		}
	}
	
	public void add(GraphicComponent c) {
		this.children.add(c);
	}
}
