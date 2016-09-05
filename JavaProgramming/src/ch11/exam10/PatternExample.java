package ch11.exam10;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String tell = "010-123-1234";
		String tel2 = "013-123-1234";
		String tel3 = "010-1234-1234";
		String tel4 = "010-1234-123";
		
		String regExp = "(010|011)-\\d{3,4}-\\d{4}";
		System.out.println(Pattern.matches(regExp, tell));  //어떤패턴에 일치하는지 검사해라
		System.out.println(Pattern.matches(regExp, tel2));
		System.out.println(Pattern.matches(regExp, tel3));
		System.out.println(Pattern.matches(regExp, tel4));
		
		
		String email = "hong@naver.com";
		String emai2 = "hongnaver.com";
		String emai3 = "hong@naver";
		
		String regExp2 = "\\w+@\\w+\\.\\w+";
		System.out.println(Pattern.matches(regExp2, email));
		System.out.println(Pattern.matches(regExp2, emai2));
		System.out.println(Pattern.matches(regExp2, emai3));
		
	}
}
