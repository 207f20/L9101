package sol;

import java.util.HashMap;
import java.util.Iterator;

public class MySongs implements Iterable<Song> {

	 HashMap<Integer, Song> mySongs;
	 
	 public MySongs() {
		 mySongs = new HashMap<Integer, Song>();
		 
		 mySongs.put(0, new Song("Kingdom Hearts Theme Song", "Utada Hikaru"));
		 mySongs.put(1, new Song("Sephiroth's Theme Song", "Nobuo Uematsu"));
		 mySongs.put(2, new Song("It's my life", "Bon Jovi"));
	 }

	@Override
	public Iterator<Song> iterator() {
		return new MySongsIterator(mySongs);
	}
}
