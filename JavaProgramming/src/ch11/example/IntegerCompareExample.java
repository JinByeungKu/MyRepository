package ch11.example;

public class IntegerCompareExample {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);    
		System.out.println(obj3 == obj4);  //박싱 정수 범위를 넘어섰기 때문에 false 출력
	}
}
