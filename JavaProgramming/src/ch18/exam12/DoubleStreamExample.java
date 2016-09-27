package ch18.exam12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class DoubleStreamExample {
	public static void main(String[] args) throws IOException {
/*		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		while(true){
			int value = reader.read();
			if(value == 13) break;
			char data = (char)value;
			System.out.print(data);
		}*/
		
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);  //보조스트림을 2개 달앗음
		
		String data = br.readLine();   //문자열을 여러개 읽어줌
		System.out.println(data);
		
	}
}
