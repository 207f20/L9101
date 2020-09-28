package inheritanceDemo;

/**
 * Without using inheritance, the implementation of this student
 * class duplicates part of the implementation of the Person class. 
 * Not elegant.
 * 
 * Exercise: In this package, in a file named Student.java, make a Student class that
 * inherits from Person, and avoids repeating any code from the superclass
 * (Hint: The first line in the file, after package inheritanceDemo, will be
 * "public class Student extends Person")
 */
public class StudentWithoutInheritance {
	
	private String name;
	private int age;
	private String studentNumber;
	
	public StudentWithoutInheritance(String name, int age, String stuNumber) {
		this.name = name;
		this.age = age;
		this.studentNumber = stuNumber;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getStudentNumber() {
		return this.studentNumber;
	}
}
