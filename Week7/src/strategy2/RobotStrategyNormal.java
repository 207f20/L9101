package strategy2;

import java.util.Random;

public class RobotStrategyNormal implements RobotStrategy {

	private Random rand = new Random();

	@Override
	public String nextCommand() {
		int x = this.rand.nextInt(100);
		if (x < 60) {
			return "hold";
		} else if (x < 80) {
			return "attack";
		}
		return "defense";
	}
}
