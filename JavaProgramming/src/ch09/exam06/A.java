package ch09.exam06;

public class A {
	int field = 10;
	public void method(){
		//B b = new B(); 메소드내부에서는 순서를 따진다.
		final int local = 10;
		class B{
			void method(){
				field = 5;
				//local = 5;
				int result = local + field;
			}
		}
		
	}
}
