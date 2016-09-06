package ch11.exam13;

public class CompareValueExample {
	public static void main(String[] args) {
		Integer obj1 = 500;
		Integer obj2 = 500;
		System.out.println(obj1 == obj2);    //객체 번지를 비교
		System.out.println(obj1.intValue() == obj2.intValue());   //내부값을 비교
		System.out.println(obj1.equals(obj2));  //Integer에서 재정의 해서 값만 비교한 것	
		
		
		Integer obj3 = -129;
		Integer obj4 = -129;
		System.out.println(obj3 == obj4);
		System.out.println(obj3.intValue() == obj4.intValue());
		System.out.println(obj3.equals(obj4));
		
	}
	
	
	
}
