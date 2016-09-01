package ch09.exam02;

public class Example {
	public static void main(String[] args) {
		//A a = new A();
		//A.B b = a.new B();
		A.B.method2();
		A.B.field2 = 10;
		
		
		A.B b = new A.B();
		b.field1 = 10;
		b.method1();
		
	}
}
