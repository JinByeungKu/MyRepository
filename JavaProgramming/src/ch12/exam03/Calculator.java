package ch12.exam03;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {    //하나의 스레드만을 실행보장하기 위해 syncronized를 붙인것
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}
}
