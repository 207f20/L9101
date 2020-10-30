package sol;

import java.util.Iterator;

public class RangeIterator implements Iterator<Integer> {
	
	private int start, stop, step, current;

	// this.current is the next thing to return from this Iterator
	public RangeIterator(int start, int stop, int step) {
		this.start = start;
		this.stop = stop;
		this.step = step;
		this.current = this.start;
	}

	@Override
	public boolean hasNext() {
		return this.current < this.stop;
	}

	@Override
	public Integer next() {
		int previous = this.current;
		this.current += this.step;
		return previous;
	}
}
