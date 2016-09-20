package ch15.exam03;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		//Map계열 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		//엔트리 추가
		map.put("홍길동", 85); //85는 Integer 객체로 자동 박싱이 됨
		map.put("추가을", 90); 
		map.put("홍길동", 95); //String 객체가 같기 때문에 하나의 객체로 인식되며 뒤에 객체로 덮어씌어짐
		map.put("감자바", 81);
		
		//값얻기
		System.out.println(map.size());
		int score = map.get("홍길동");
		System.out.println(score);
		
		//모든 엔트리 일괄처리
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		for(Map.Entry<String, Integer> str : set){
			String key = str.getKey();
			int value = str.getValue();
			
			System.out.println(key + ":" + value);
		}
		Set<String> set2  = map.keySet();
		for(String key : set2){
			int value = map.get(key);
			System.out.println(key + ":" + value);
		}
		
		//객체 삭제
		map.remove("홍길동");
		
	}
}
