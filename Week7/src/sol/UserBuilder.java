package sol;

// See more: https://jlordiales.me/2012/12/13/the-builder-pattern-in-practice/

public class UserBuilder {
	
	// STEP 1: Declare all the possible attributes
	
    final String firstName; // required - we declare these as final to make sure they're set at time of construction
    final String lastName; // required
    int age; // optional
    String phone; // optional
    String address; // optional
    
    // STEP 2: Create a constructor which takes in required parameters
    
	public UserBuilder(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	// STEP 3: Create a setter method for each attribute
	// Each of the following setters sets the given value,
	// then returns the UserBuilder instance
	
	public UserBuilder age(int age) {
		this.age = age;
		return this;
	}
	
	public UserBuilder phone(String phone) {
		this.phone = phone;
		return this;
	}
	
	public UserBuilder address(String address) {
		this.address = address;
		return this;
	}
	
	// STEP 4: Create a build() method which creates and returns a User based on this builder
	
	public User2 build() {
		User2 user = new User2(this);
		return user;
	}
	
}
