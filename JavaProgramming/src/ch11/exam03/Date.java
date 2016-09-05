package ch11.exam03;

import java.util.Calendar;

public class Date {
	@Override
	public String toString() {
		Calendar now = Calendar.getInstance(); //static으로 정의되어 있어 바로 접근함
		int year = now.get(Calendar.YEAR);     //Calendar.YEAR은 상수
		int month = now.get(Calendar.MONTH) +1;   //get은 0~11값을 주기 때문에 +1을 한다
		int day = now.get(Calendar.DAY_OF_MONTH)+1;
		
		return year + "-" + month + "-" + day;
	}
	
}
