package ch06.exam04;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("È«±æµ¿", "³²ÀÚ", 26, 178.9);
		System.out.println(p1.name);
		System.out.println(p1.sex);
		System.out.println(p1.age);
		System.out.println(p1.height);
		System.out.println(p1.married);
		
		p1.age = 27;
	}
}