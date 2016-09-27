package ch18.exam12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample2 {
	public static void main(String[] args) throws IOException {


		FileReader fr = new FileReader("src/ch18/exam12/NAVER.html");
		BufferedReader br = new BufferedReader(fr);
		
		int count = 0;
		while(true){
			String line = br.readLine();  //readLine은 더이상 읽을 것이 없으면 null이 반환된다
			if(line == null){
				break;
			}
			System.out.println(++count +" " + line);
		}

	}
}
