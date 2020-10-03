package sol;

public class PlayWithPeople {
	
	public static void main(String args[]) {
				
		Person p1 = null;
		System.out.println(p1);
		
		p1 = new Person("Alice", 22);
		System.out.println(p1.getName());
		System.out.println(p1.hello());
		
		Student s1 = new Student("Bob", 24, "1234512345");
		System.out.println(s1.getStudentNumber());
		System.out.println(s1.hello());
		
		Person p2 = s1;  // Q1: What is happening here?
		// Q1 answer: 
		//	This is fine, auto-conversion happens from Student to Person
		// 	p2 is reference that refers to a Student as a Person
		
		// Q2: Which 'hello' method gets called here?
		System.out.println(p2.hello()); 
		// Q2 answer:
		// 	the hello() method of the Student class is invoked because the object
		// 	p2 is referring to is _created_ as a Student.
		// 	this is "dynamic binding"
		
		// Q3: What will happen with the line below?
		// System.out.println(p2.getStudentNumber());
		// Q3 answer: this is NOT OK. p2 is a 'Student' but it's acting as a 'Person',
		//				so in this state it CANNOT access methods which the 'Person' class cannot. 
		
		// Q4: Are there any issues with any of the lines below? Discuss.
		Student s3 = null;
		//s3 = p2; // Q4 answer: this line causes an issue; we cannot implicitly cast Person type to Student
		s3 = (Student) p2; // this is allowed -- Programmer who writes this casting
		// is saying "Trust me, I know what I'm doing. I am sure that this Person that 
		// p2 is referring to is indeed a Student (has student number and stuff), 
		// i.e., I know that the Person living at the address 
		// stored in p2 is a Student; so this casting is safe, nothing will go wrong".

		// Q5: What will happen with the following calls?
		// Q5 answer: Student methods will get called
		System.out.println(s3.hello());
		System.out.println(s3.getStudentNumber());

		// Q6: Are there any issues with the next line? If so, will it be found
		// in compile time or runtime?
		s3 = (Student) p1;
		// Q6 answer: This casting is NOT safe because p1 (Alice) is not a Student; runtime error.
    
	}
}




