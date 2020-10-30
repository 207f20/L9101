package sol;

import java.util.Iterator;

public class SongsMain {

	public static void main(String[] args) {
		
		MySongs songs1 = new MySongs();
		YourSongs songs2 = new YourSongs();
				
		for (Song s: songs1) {
			System.out.println(s);
		}

		// the above is the same as:
		Iterator<Song> it = songs1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		// can do the same for songs2:
		for (Song s: songs2) {
			System.out.println(s);
		}

		// the above is the same as:
		Iterator<Song> it2 = songs2.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
	}
}
