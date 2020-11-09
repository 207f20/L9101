package command3;

public class Client {
	
	public static void main(String[] args) {
		
		Balloon b1 = new Balloon("RED", 100);
		Balloon b2 = new Balloon("GREEN", 200);
		
		BalloonOperator operator = new BalloonOperator();
		
		// the operator queues up a sequence of commands.
		operator.acceptCommand(new InflateCommand(b1, 20));
		operator.acceptCommand(new DeflateCommand(b1, 10));
		operator.acceptCommand(new InflateCommand(b1, 20));
		
		operator.acceptCommand(new InflateCommand(b2, 20));
		operator.acceptCommand(new InflateCommand(b2, 20));
		
		// execute all commands in the queue.
		operator.operateAll();
		
		operator.acceptCommand(new InflateCommand(b1, 20));
		operator.acceptCommand(new InflateCommand(b1, 20));
		operator.acceptCommand(new DeflateCommand(b1, 20));
		
		operator.acceptCommand(new InflateCommand(b2, 20));
		operator.acceptCommand(new DeflateCommand(b2, 20));
		operator.acceptCommand(new InflateCommand(b2, 20));
		
		operator.operateAll();
	}
}
