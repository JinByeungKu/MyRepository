package ch07.exam13;

public abstract class Phone {
	public String number;

	public abstract void ring(); //추상클래스 안에만 추상메소드가 있어야 한다.

	public void sendVoice() {
		System.out.println("전화를 겁니다.");
	}

	public void receiveVoice() {
		System.out.println("전화를 받습니다.");
	}
}
