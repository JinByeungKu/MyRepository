package ch11.exam10;

import java.io.IOException;

public class KeyBoardToString {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes); //값을 주지 않으면 1개만 읽음
		
		String str = new String(bytes, 2, readByteNo-2);
		System.out.println(str);
	}
}
