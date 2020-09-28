package inheritanceDemo;

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

		// Q2: Which 'hello' method gets called here?
		System.out.println(p2.hello()); 
		
		// Q3: What will happen with the line below?
		System.out.println(p2.getStudentNumber());
		
		// Q4: Are there any issues with any of the lines below? Discuss.
		Student s3 = null;
		s3 = p2;
		s3 = (Student)p2;

		// Q5: What will happen with the following calls?
		System.out.println(s3.hello());
		System.out.println(s3.getStudentNumber());

		// Q6: Are there any issues with the next line? If so, will it be found
		// in compile time or runtime?
		s3 = (Student) p1;
    
	}
}




