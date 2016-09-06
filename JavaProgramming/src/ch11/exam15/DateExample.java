package ch11.exam15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		
		String sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초").format(now);
		//String strDate = sdf.format();
		System.out.println(sdf);
		
		Calendar cal = Calendar.getInstance();
		int year  = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONDAY +1);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		int house = cal.get(Calendar.HOUR_OF_DAY);
		int second = cal.get(Calendar.MINUTE);
		int amPm = cal.get(Calendar.AM_PM);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("year: " + year);
		System.out.println("month: " + month);
		System.out.println("day: " + day);
		System.out.println("house: " + house);
		System.out.println("second: " + second);
		System.out.println("amPm: " + amPm);
		System.out.println("week: " + week);
	}
}
