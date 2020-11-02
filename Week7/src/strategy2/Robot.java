package strategy2;

public class Robot {

	private String name;
	private RobotStrategy strategy;

	public Robot(String name) {
		this.name = name;
		this.strategy = new RobotStrategyNormal();
	}

	void setStrategy(RobotStrategy strategy) {
		System.out.println("Setting strategy...");
		this.strategy = strategy;
	}

	void move() {
		System.out.print(name + " makes a move: ");
		String command = this.strategy.nextCommand();
		System.out.println(command);
	}

	public static void main(String[] args) {

		Robot robot = new Robot("AlphaGo");
		for (int i = 0; i < 10; ++i) {
			robot.move(); // these moves are normal
		}

		robot.setStrategy(new RobotStrategyAggressive());
		for (int i = 0; i < 10; ++i) {
			robot.move(); // these moves are aggressive
		}

		robot.setStrategy(new RobotStrategyDefensive());
		for (int i = 0; i < 10; ++i) {
			robot.move(); // these moves are defensive
		}
	}
}
