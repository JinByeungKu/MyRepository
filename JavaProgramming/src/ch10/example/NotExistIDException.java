package ch10.example;

public class NotExistIDException extends Exception{
	public NotExistIDException() {}
	public NotExistIDException(String message){
		super(message);
	}
}
