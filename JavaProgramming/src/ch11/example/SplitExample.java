package ch11.example;

import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		//방법1 (Split() 메소드 이용)
		String[] names = str.split(",");
		for(String name : names){
			System.out.println(name);
		}
		
		
		System.out.println();
		//방법2 (StringTokenizer 이용)
		StringTokenizer st = new StringTokenizer(str, ",");
		int countTokens = st.countTokens();
		for(int i=0;i<countTokens;i++){
			String token = st.nextToken();
			System.out.println(token);
		}
		
	}
}
