package ch11.exam03;

public class Example {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		String d1Str = d1.toString();
		System.out.println(d1Str);
		System.out.println(d1);
		String result = d1 + " 맑음"; //d1이라는 대표문자열을 얻어서 결합을한다. d1의 대표문자열은 toString
		System.out.println(result);
		
		
		java.util.Date d2 = new java.util.Date();
		String d2Str = d2.toString();
		System.out.println(d2Str);
	}
	
	
}
