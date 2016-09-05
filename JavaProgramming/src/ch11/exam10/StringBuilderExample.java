package ch11.exam10;

public class StringBuilderExample {
	public static void main(String[] args) {
		String data = "a";
		data += "b";
		data += "c";
		System.out.println(data);
		
		StringBuilder sb = new StringBuilder();
		sb.append("a");
		sb.append("b");
		sb.append("c");
		System.out.println(sb);
		
		String data2 = "abc";
		StringBuilder sb2 = new StringBuilder(data2);
		sb2.insert(1, "0");
		data2 = sb2.toString(); //StringBuilder로 insert를 해준다음 문자열로 변환하고 출력해줘야한다.
		System.out.println(data2);
	}
}
