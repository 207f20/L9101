package sol;

public class User2 {

	// Instead of having a whole bunch of construtors, we can make things more flexible
	// by using the builder design patterns
	
	//All final attributes
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional
    
    public User2 (UserBuilder builder){
	    this.firstName = builder.firstName;
	    this.lastName = builder.lastName;
	    this.age = builder.age;
	    this.phone = builder.phone;
	    this.address = builder.address;
	}
    
    public String getFirstName() {
    		return firstName;
    }

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}
	
	public String toString() {
		return "User: " + this.firstName +  " , " + this.lastName + " " + this.age + " " + this.address;
	}
	
	public static void main(String[] args) {
		
		User2 u = new UserBuilder("Bob", "Bobson")
				.age(4)
				.address("Some address")
				.build();
		System.out.println(u);
		
	}
	
}

