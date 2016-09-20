package ch15.exam01;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java","JDBC","Database"); //배열이 들어가있는 내부 배열인덱스를 만들어서 리스트를 만드는 것
		System.out.println(list.size());
		for(String str : list){
			System.out.println(str);
		}
		
		//list.add("SQL");
		list.remove(1);
	}
}
