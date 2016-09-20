package ch15.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		//List 계열의 컬렉션 생성
		List<String> list = new ArrayList<>();  //List<Object> list = new ArrayList<Object>(); 와 같음
		//List<String> list = new ArrayList();
		
		//객체 저장
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "DataBase");
		list.add("iBatis");
		
		
		//저장된 객체수 얻기
		int size = list.size();
		System.out.println(size);
		
		//객체 찾기
		String skill = list.get(2);
		System.out.println(skill);
		System.out.println();
		
		//전체 객체를 일괄처리
		for(int i=0;i<list.size();i++){
			String str = list.get(i);
			System.out.println(str);
		}
		
		//Iterable을 구현하고 있어야 향상된 for문에 올수 있음
		for(String str : list){
			System.out.println(str);
		}
		
		System.out.println();
		list.remove(2);
		list.remove(2);
		list.remove("iBatis");  //list.remove(new String("iBatis"));로 해도 삭제가 됨. eqauls로 비교하기 때문
		System.out.println(list.size());
		//System.out.println(list.get(2));
		
		
		
	}
}
