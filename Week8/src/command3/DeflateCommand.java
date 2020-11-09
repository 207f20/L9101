package command3;

public class DeflateCommand implements BalloonCommand {
	
	private Balloon balloon;
	private int amount = 0;

	public DeflateCommand(Balloon balloon, int amount) {
		
		this.balloon = balloon;
		this.amount = amount;
	}

	@Override
	public void execute() {
		this.balloon.deflate(amount);
		System.out.println("DEFLATE by " + this.amount + ": " + this.balloon);
	}
}
