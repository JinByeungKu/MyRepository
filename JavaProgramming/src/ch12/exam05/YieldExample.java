package ch12.exam05;

public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();   //실행대기
		threadB.start();
		
		//실행하고 대기하고 실행하고 대기하고를 반복
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		threadA.work = false;
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		threadA.work = true;
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		threadA.stop = true;       //터미네이트 상태로 만든다.
		threadB.stop = true;
	}
}
