package ch06.exam14;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("1234-5678", "계백");
		System.out.println(p1.nation);
		System.out.println(p1.name);
		
		//p1.nation = "usa";
		//p1.ssn = "6789-4343";
		p1.name = "을지문덕";
	}
}
