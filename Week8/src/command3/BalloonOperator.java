package command3;

import java.util.ArrayList;

public class BalloonOperator {
	
	ArrayList<BalloonCommand> commandQueue;

	public BalloonOperator() {	
		commandQueue = new ArrayList<BalloonCommand>();
	}
	
	public void acceptCommand(BalloonCommand command) {
		this.commandQueue.add(command);
	}

	void operateAll() {
		
		for (BalloonCommand command: this.commandQueue) {
			command.execute();
		}
		commandQueue.clear();
	}
}
