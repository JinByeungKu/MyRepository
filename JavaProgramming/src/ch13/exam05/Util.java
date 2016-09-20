package ch13.exam05;

public class Util {
	
	//타입파라메타로서 T를 사용하겠다.
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.setItem(t);
		return box;
	}
}
