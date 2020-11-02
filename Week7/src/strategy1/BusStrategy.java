package strategy1;

public class BusStrategy implements TravelStrategy {

	@Override
	public void travel(Person p, String location) {
		p.setLocation(location);
		System.out.println(p.getName() + " has traveled to " + p.getLocation() + " by bus.");
	}

}
