package ch15.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String,Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;  //최고 점수를 받은 아이디 저장
		int maxScore = 0;  //최고 점수 저
		int totalScore = 0;  //점수 합계 저장
		
		Set<String> keySet = map.keySet(); //KeySet 얻기
		Iterator<String> keyInterator = keySet.iterator(); //map의 값을 하나하나 가져오기 위해서 Iterator를 만들었음 
		while(keyInterator.hasNext()){ //가져올 객체가 있는지 없는지 검사
			String key = keyInterator.next();  //컬렉션에서 하나의 객체를 가져와서 String타입의 key란 변수에 저장
			Integer value = map.get(key); //가져온 하나의 객체의 key값을 분리해 Integer타입의 value에 저장
			totalScore += value; //totalScore에 value값을 누적
			if(value>maxScore){ //maxScore보다 value값이 크다면
				maxScore = value; //value값을 maxScore에 저장
				name = key; //위 value값에 대응하는 key값을 name에 저장
			}
		}
		System.out.println(name);
		System.out.println(maxScore);
		System.out.println(totalScore);
	}
}
