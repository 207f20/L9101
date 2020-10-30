package sol;

import java.util.HashMap;
import java.util.Iterator;

public class MySongsIterator implements Iterator<Song> {

	private HashMap<Integer, Song> songs;
	private int indexKey;
	
	public MySongsIterator(HashMap<Integer, Song> s) {
		this.songs = s;
		indexKey = 0;
	}
	
	@Override
	public boolean hasNext() {
		return this.indexKey < this.songs.size();
	}

	@Override
	public Song next() {
		return this.songs.get(indexKey++);
	}

}
