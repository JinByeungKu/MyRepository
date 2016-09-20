package ch12.exam11;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread ast = new AutoSaveThread();
		ast.setDaemon(true);   //start하기전에 Daemon을 설정해줘야 함
		ast.start();
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		
		System.out.println("메인스레드 종료");
		
	}
}
