package sol;

public class TravelContext {

	private TravelStrategy strategy;
	
	public void setTravelStrategy(TravelStrategy s) {
		strategy = s;
	}
	
	public void takeTrip(Person p, String location) {
		strategy.travel(p, location);
	}
	
}
