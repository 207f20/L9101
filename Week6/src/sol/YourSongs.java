package sol;

import java.util.Iterator;

public class YourSongs implements Iterable<Song> {

	Song[] songs;
	
	public YourSongs() {
		songs = new Song[3];
		
		songs[0] = new Song("Rainy Summer", "Sereno");
		songs[1] = new Song("My Tears Ricochet", "Taylor Swift");
		songs[2] = new Song("Winter", "Kina Grannis");
	}

	@Override
	public Iterator<Song> iterator() {
		return new YourSongsIterator(songs);
	}
	
	
}
