package ch15.exam01;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
	public static void main(String[] args) {
		//Set 계열 컬렉션 생성
		Set<String> set = new TreeSet<>();
		
		//객체저장
		set.add("java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("java");
		set.add("iBatis");
		System.out.println(set.size());
		
		//객체를 일괄처리하기
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			String str = iterator.next();
			if(str.equals("JDBC")){
				iterator.remove();
			}
			System.out.println(str);
		}
		System.out.println();
		
		for(String str : set){
			System.out.println(str);
		}
	}
}
