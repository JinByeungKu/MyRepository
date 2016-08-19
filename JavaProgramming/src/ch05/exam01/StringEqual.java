package ch05.exam01;

public class StringEqual {

		public static void main(String[] args) {
			String name1 = "자바";
			String name2 = "자바"	;	
			String name3 = new String("자바");
		
			System.out.println(name1 == name2); //번지 비교
			System.out.println(name1 == name3);
			
			System.out.println(name1.equals(name2)); //내부 문자열
			System.out.println(name2.equals(name2));
		}
}
