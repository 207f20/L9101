package sol;

public class Client {
	
	  public static void main(String[] args) {

		    TravelContext ctx = new TravelContext();
		    
		    ctx.setTravelStrategy(new CustomStrategy());
		    
		    ctx.takeTrip(new Person("Bumbly", "Canada"), "Dog Park");

	  }
}
