package ch07.exam11;

public class childExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "date1";
		parent.method1();
		parent.method2();
		
		/*parent.field2 = "data2";
		parent.method3();*/
		
		Child child = (Child) parent;
		child.field2 = "yyy";
		child.method3();
		child.method1();
		
	}
	
}
