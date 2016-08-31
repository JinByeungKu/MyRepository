package ch07.exam12;

public class Example {
	public static void main(String[] args) {
		Theater cgv = new Theater();
		
		Adult adult = new Adult();
		adult.ssn = "12345-12345";
		Student student = new Student();
		student.sno = "2016030105";
		
		cgv.check(adult);
		cgv.check(student);
	}
}
