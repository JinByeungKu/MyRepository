package ch13.example;

public class Container2 <T, E>{
	private T Key;
	private E Value;
	
	public T getKey() {
		return Key;
	}
	public void set(T key, E Value) {
		this.Key = key;
		this.Value = Value;
	}
	public E getValue() {
		return Value;
	}
}
