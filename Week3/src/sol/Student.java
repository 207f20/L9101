package sol;

/**
 * A Student is a subtype of Person
 * A Student has a student number besides what a Person has 
 */
public class Student extends Person {
	
	private String studentNumber;
	
	public Student(String name, int age, String stuNumber) {
		super(name, age);
		this.studentNumber = stuNumber;
	}
	
	public String getStudentNumber() {
		return this.studentNumber;
	}
	
	/**
	// Not elegant: This implementation repeats the code in the Person class.
	public String hello(){
		return "Hello, I'm "+this.getName()+" my student number is "+this.getStudentNumber();
	}
	*/
	
	/**
	// Not working: infinite recursion
	public String hello(){
		return hello()+" my student number is "+this.getStudentNumber();
	}
	**/

	@Override
	public String hello() {
		return super.hello() + " and my student number is " + this.studentNumber;
	}
	
	/**
	 * The search for a method starts at the type of the instance and works
	 * its way up the hierarchy. So Student then Person.
	 * If you say super, the search starts at your superclass.
	 * 
	 * So, Java can find this method to invoke even without the @Override label. 
	 * But in practice, the label is still highly recommended. WHY? What kind of 
	 * mistake does it avoid?
	 * 
	 * If you have a typo in the method name, e.g., "helloo". Without the @Override,
	 * the hello() in the Person class will be called, which wrong but undetected; 
	 * with the @Override label, compiler would detect the typo because "helloo" is
	 * not overriding anything.
	 */
}