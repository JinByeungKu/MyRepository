package ch11.exam10;

import java.util.StringTokenizer;

public class StringSplitStringTokenizer {
	public static void main(String[] args) {
		String data = "홍길동,이수홍,박연수,김자바,최명호";    //토큰
		
		String[] dataArray = data.split(",");
		System.out.println(dataArray.length);
		for(String name : dataArray){
			System.out.println(name);
		}
		
		
		StringTokenizer st = new StringTokenizer(data, ",");  //String str, String delim
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()){    //hasMoreTokens는 토큰이 있냐없냐를 물어는 것이기 때문에 무한루프를 돈다
			String name = st.nextToken();
			System.out.println(name);
			
		}
		
		
		
		data = "홍길동&이수홍,박연수,김자바-최명호";    //토큰
		
		dataArray = data.split("&|-|,");
		System.out.println(dataArray.length);
		for(String name : dataArray){
			System.out.println(name);
		}
	}
}
