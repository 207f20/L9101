package command3;

public class InflateCommand implements BalloonCommand {
	
	private Balloon balloon;
	private int amount = 0;

	public InflateCommand(Balloon balloon, int amount) {
		
		this.balloon = balloon;
		this.amount = amount;
	}

	@Override
	public void execute() {
		this.balloon.inflate(amount);
		System.out.println("INFLATE by " + this.amount + ": " + this.balloon);
	}
}
