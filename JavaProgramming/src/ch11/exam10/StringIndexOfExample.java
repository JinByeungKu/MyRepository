package ch11.exam10;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍 자바 핵심";
		
		boolean result1 = subject.contains("자바");
		if(result1){
			System.out.println("자바 관련 책이군요.");
		} else {
			System.out.println("자바 관련 책이 아니군요");
		}
		
		
		int result2 = subject.indexOf("자바");
		if(result2 != -1){
			System.out.println("자바 관련 책이군요.");
		} else {
			System.out.println("자바 관련 책이 아니군요");
		}
		
		int startIndex = subject.lastIndexOf("자바");   //indexOf는 문자열을 넣고 int 값을 반환한다.
		int endIndex = startIndex +2;
		String token1 = subject.substring(startIndex, endIndex);    //문자를 잘라내서 가져오겟다
		System.out.println(token1);
		
		
		
		String find = "프로그래밍";
		startIndex = subject.indexOf(find);
		//endIndex = startIndex + find.length();  //문자열의 길이를 모를때 
		//String token2 = subject.substring(startIndex, endIndex);    //문자를 잘라내서 가져오겟다
		String token2 = subject.substring(startIndex);
		
		System.out.println(token2);
	}
}
