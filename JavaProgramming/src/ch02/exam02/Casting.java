package ch02.exam02;

public class Casting {

	public static void main(String[] args) {
		long v1 = 300;
		int v2 = (int)v1;
		System.out.println(v2);
		
		byte v3 = (byte) v1;
		System.out.println(v3);
		
		
		char v5 = 'a';
		int v6 = 'A';
		int v7 = 'a';
		System.out.println(v5);
		System.out.println(v6);
		System.out.println(v7);
		
		int v8 = 65;
		char v9 = (char) v8;
		System.out.println(v9);
	}

}
