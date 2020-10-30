package sol;

import java.util.Iterator;

public class YourSongsIterator implements Iterator<Song> {

	private Song[] songs; 
	private int indexKey;
	
	public YourSongsIterator(Song[] s) {
		this.songs = s;
		indexKey = 0;
	}
	
	@Override
	public boolean hasNext() {
		return this.indexKey < this.songs.length;
	}

	@Override
	public Song next() {
		return this.songs[indexKey++];
	}

}
