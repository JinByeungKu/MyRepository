package ch10.exam03;

public class BalanceInSufficientException extends Exception {
	public BalanceInSufficientException(){}
	public BalanceInSufficientException(String message){
		super(message);
	}
}
