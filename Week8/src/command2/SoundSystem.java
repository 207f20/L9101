package command2;
/**
 * 
 * Source: https://iluxonchik.github.io/design-patterns-notes/ 
 *
 */
public class SoundSystem {
	  int soundLevel;
	  int state; // 0:off 1:on

	  public SoundSystem() {
	    soundLevel = 0;
	    state = 0;
	  }

	  public void volumeUp() {
	    soundLevel++;
	    System.out.println("Sound is at " + soundLevel);
	  }

	  // COMPLETE THIS CLASS
	  
	}