package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		
		/*char data = (char)is.read();   //read()는 1바이트르 읽기때문에 한글을 입력하면 깨진
		System.out.println(data);
		
		byte[] values = new byte[100];
		int byteNum;
		String data = new String(values,0,values.length);*/
		
		
		Reader reader = new InputStreamReader(is);  //바이트 스트림을 Reader로 만들어주는 역할
		
		char data = (char)reader.read();
		System.out.println(data);
	}
}
