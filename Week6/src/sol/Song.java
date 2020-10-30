package sol;

public class Song {
	  String name;
	  String artist;

	  public Song(String name, String artist) {
	    this.name = name;
	    this.artist = artist;
	  }

	  public String getName() { return name; }
	  public String getArtist() { return artist; }
	  
	  public String toString() {
		  return ("Name: " + this.getName() +
			      " Artist: " + this.getArtist());
	  }
	  
	  
	}
