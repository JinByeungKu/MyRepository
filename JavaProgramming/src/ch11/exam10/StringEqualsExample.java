package ch11.exam10;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "홍길동";   //리터널이라고 함
		String strVar2 = new String("홍길동");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1.equals(strVar2));
	}
}
