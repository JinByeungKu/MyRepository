package ch12.exam09;

public class StopFlagExample {
	public static void main(String[] args) throws InterruptedException {
		PrintThread1 pt = new PrintThread1();
		pt.start();
		
		Thread.sleep(3000);
		 
		pt.setStop(true);    //스레드를 안전하게 종료시키는 첫번째 방법
	}
}
