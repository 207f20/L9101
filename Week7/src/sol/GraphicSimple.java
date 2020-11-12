package sol;

// a simple graphic component is something like a square, a circle, etc
public class GraphicSimple implements GraphicComponent {

	private String name = "";
	
	public GraphicSimple(String name) {
		this.name = name;
	}
	
	@Override
	public void paint() {
		System.out.println(name + ": simple component");
	}
}
