package ch11.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataPrintExample {
	public static void main(String[] args) {
		Date now = new Date();
		
		String sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분").format(now);
		System.out.println(sdf.toString());
	}
}
