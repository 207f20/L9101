package strategy2;

public class RobotStrategyAggressive implements RobotStrategy {

	@Override
	public String nextCommand() {
		return "attack";
	}
}
