package ch06.exam12;

public class StatiMember {
	static String filed;
	
	static String field;
	
	static{
		System.out.println("static block 실행");
		field = "자바";
	}
	
	static void method(){
		
	}
}
