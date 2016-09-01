package ch08.exam03;

public interface RemoteControl {
	//Constant
	int MAX_VOLUME = 10;   //상수는 관례적으로 대문자로 작성한다.
	int MIN_VOLUME = 1;
	
	//Abstract Method
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//Default Method
	default void setMute(boolean mute){
		if(mute){
			System.out.println("무음 처리합니다.");
		} else{
			System.out.println("무음 해제합니다.");
		}
	} 
	
	
	//Static Method
	static void changeBattery(){
		System.out.println("건전지를 교환합니다.");
	}
}
