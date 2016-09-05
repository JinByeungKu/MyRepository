package ch11.exam10;

public class StringToLowerUpperCaseExample2 {
	public static void main(String[] args) {
		String oldStr = "Java Programming";
		String newStr = oldStr.toLowerCase();
		System.out.println(oldStr);
		System.out.println(newStr);
		System.out.println(oldStr == newStr);
		
		System.out.println(oldStr.equals("JAVA programming"));
		System.out.println(oldStr.toLowerCase().equals("JAVA programming".toLowerCase()));  //2개 다 소문자로 바꾼다음 비교
		System.out.println(oldStr.toUpperCase().equals("JAVA programming".toUpperCase()));  //2개 다 대문자로 바꾼다음 비교 
		
		
		String targetStr = "              Java Programming                ";
		System.out.println(oldStr == targetStr);
		System.out.println(oldStr.equals(targetStr));
		System.out.println(oldStr.equals(targetStr.trim()));
	}
	
}
