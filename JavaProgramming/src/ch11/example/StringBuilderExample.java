package ch11.example;

public class StringBuilderExample {
	public static void main(String[] args) {
		String str = "";
		for(int i=1;i<=100;i++){
			str += i;
		}
		
		System.out.println(str);
		
		//개선 코드 작성 위치
		
		StringBuilder sb = new StringBuilder();
		StringBuilder result = sb.append(str);
		System.out.println(result);
	}
}
