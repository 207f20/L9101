package sol;

public interface Observer {
	public void update(Observable o, Object arg);
}

/**

Alternate update:

public void update();



**/