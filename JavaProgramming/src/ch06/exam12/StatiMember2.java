package ch06.exam12;

public class StatiMember2 {
	static String filed;
	
	static String field;
	String field2;
	
	static{
		System.out.println("static block 실행");
		field = "자바";
	}
	
	static void method(){
		
	}
	void method2(){
		field = "자바";
		field2 = "자바";
	}
	
	public static void main(String[] args) {
		field = "자바";
		//field2 = "자바"; 객체가 없이도 사용가능해야 하지만 인스턴스 필드는 객체가 있어야 사용가능하기 때문에 에러가 뜸
		
		method();
		//method2();
		
		StatiMember2 sm = new StatiMember2();
		sm.field2 = "자바";
	}
}
