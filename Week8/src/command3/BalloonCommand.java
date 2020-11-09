package command3;

// a generic balloon command
public interface BalloonCommand {
	
	void execute();
	
	// execute can also take an argument, e.g., execute(args)
}
