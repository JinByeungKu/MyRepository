package ch11.exam02;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		Key key1 = new Key(1);
		Key key2 = new Key(1);
		
		System.out.println(key1 == key2);
		System.out.println(key1.equals(key2));
		System.out.println(key1.hashCode() == key2.hashCode());
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		hashMap.put(key1, "홍길동");
		hashMap.put(key2, "감자바");
		System.out.println(hashMap.size()); //해시맵 공간에 몇개의 해시가 저장되어있는지 검사하는 코드
	}
}
