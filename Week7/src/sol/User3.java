package sol;

// OPTION 4: User class with UserBuilder as an inner class
public class User3 {
    
    //All final attributes
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional
    
    private User3 (UserBuilder builder){
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
	
	public static class UserBuilder {

	    private final String firstName; // required
	    private final String lastName; // required
	    private int age; // optional
	    private String phone; // optional
	    private String address; // optional
	    
		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
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
		
		public User3 build() {
			User3 user = new User3(this);
			return user;
		}
		
	}
    
}
