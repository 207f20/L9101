package sol;

// Scenario: I want to have a User class that has first name, last name, and a number of attributes that are
//				all optional: age, phone and address
public class User {

    private final String firstName; 
    private final String lastName; 
    private int age; 
    private String phone; 
    private String address; 
 
	// If only the first two arguments are mandatory, rest are optional
	// What are my choices?

	   	 // OPTION 1: Multiple constructors allowing for the optional arguments
		public User (String firstName, String lastName, int age, String phone, String address){
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.phone = phone;
			this.address = address;
		}

		public User (String firstName, String lastName){
			this.firstName = firstName;
			this.lastName = lastName;
		}

		// and more...
		//public User (String firstName, String lastName, int age, String phone) { .. }
		//public User (String firstName, String lastName, String phone, String address) { .. }
		//public User (String firstName, String lastName, int age, String address) { .. }
		
		// Issues with this:
		// 1) Having to remember the exact order
		// 2) What if some of them are optional?
		//    - We can create multiple constructors
		
		// OPTION 2: Using a bunch of different setter methods and the client can call whichever is relevant
		// Issue: Results in a loss of immutability
		public void setAge(int age) {
			this.age = age;
		}
		
		// and so on....
		
		// OPTION 3: Use the Builder Design Pattern - see User2 and UserBuilder

}
