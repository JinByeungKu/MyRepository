package ch12.exam08;

public class WorkObject {        //공유객체
	public synchronized void methodA(){        //하나의 스레드만 실행보장을 하는 것이 synchronized, 객체 자체가 락이 걸리기 때문에 하나의 스레드만 사용가능
		System.out.println("ThreadA의 methodA() 작업 실행");
		notify();    //상대방의 스레드를 깨움
		try {
			wait();   //상대방의 스레드를 깨우고 자신은 잔다
		} catch (InterruptedException e) {
		}      
	}
	public synchronized void methodB(){
		System.out.println("ThreadB의 methodB() 작업 실행");
		notify();    //상대방의 스레드를 깨움
		try {
			wait();   //상대방의 스레드를 깨우고 자신은 잔다
		} catch (InterruptedException e) {
		}
	}
}
