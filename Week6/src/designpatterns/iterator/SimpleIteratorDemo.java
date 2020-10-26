package designpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class SimpleIteratorDemo {

	public static void main(String args[]) {

		ArrayList<String> names = new ArrayList<>();

		names.add("Bob");
		names.add("Frank");
		names.add("Arnold");
		names.add("Robyn");

		// these iterators are independent of each other
		Iterator<String> it = names.iterator();
		Iterator<String> it2 = names.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println(it.hasNext());
		System.out.println(it2.hasNext()); // TRUE OR FALSE?
		System.out.println(it2.next());

		for (String s : names) {
			System.out.println(s);
		}
	}
}
