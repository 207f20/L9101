package sol;

public class GraphicClient {

	public static void main(String[] args) {
		
		// Drawing the picture composite_graphics_example.png in composite2
		
		GraphicSimple carBody = new GraphicSimple("........rectangle");
		GraphicSimple wheel1 = new GraphicSimple("........circle");
		GraphicSimple wheel2 = new GraphicSimple("........circle");
		GraphicSimple treeTop = new GraphicSimple("........triangle");
		GraphicSimple treeBottom = new GraphicSimple("........rectangle");

		GraphicComposite car = new GraphicComposite("....group 1");
		GraphicComposite tree = new GraphicComposite("....group 2");
		
		car.add(carBody);
		car.add(wheel1);
		car.add(wheel2);
		
		tree.add(treeTop);
		tree.add(treeBottom);
		
		GraphicComposite wholePicture = new GraphicComposite("main group");
		wholePicture.add(car);
		wholePicture.add(tree);
		
		// What would the output of this be?
		wholePicture.paint();

	}
}
