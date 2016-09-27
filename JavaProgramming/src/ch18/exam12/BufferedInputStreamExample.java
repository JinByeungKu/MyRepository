package ch18.exam12;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws IOException {
		//버퍼를 안쓰는 경우
		
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("src/ch18/exam12/Desert.JPG");
		start = System.currentTimeMillis();
		while(fis1.read() != -1){}
		end = System.currentTimeMillis();
		System.out.println(end-start);
		
		
		//버퍼를 사용하는경우
		FileInputStream fis2 = new FileInputStream("src/ch18/exam12/Desert.JPG");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while(bis.read() != -1){}
		end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}
