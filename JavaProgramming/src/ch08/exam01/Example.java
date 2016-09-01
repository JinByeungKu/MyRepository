package ch08.exam01;

public class Example {
	public static void powerOn(RemoteControl rc){ //다형성이 발생
		rc.turnOn();
	}
	public static void main(String[] args) {
		int max = RemoteControl.MAX_VOLUME;
		int min = RemoteControl.MIN_VOLUME;
		
		RemoteControl.changeBattery();
		
		System.out.println();
		
		
		Television tv = new Television();
		
		tv.turnOn();
		
		RemoteControl rc = tv;
		rc.turnOn();
		
		Audio audio = new Audio();
		audio.turnOff();
		
		RemoteControl rc1 = audio;
		
		rc1.turnOff();
		
		System.out.println();
		
		powerOn(new Television());
	}
}
