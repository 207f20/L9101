package strategy1;

public class Client {
	
	  public static void main(String[] args) {

		    TravelContext ctx = new TravelContext();
		    
		    ctx.setTravelStrategy(new BusStrategy());
		    
		    ctx.takeTrip(new Person("Bumbly", "Home"), "Dog Park");

	  }
}
