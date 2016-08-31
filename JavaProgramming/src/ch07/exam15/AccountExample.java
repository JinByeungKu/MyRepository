package ch07.exam15;

public class AccountExample {
	public static void main(String[] args) {
		Account2 account = new Account2();
		
		account.setBalance(10000);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());
	}

	
}
