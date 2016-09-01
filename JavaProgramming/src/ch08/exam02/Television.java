package ch08.exam02;

public class Television implements RemoteControl{ //오디오는 리모트컨트롤로 사용할수 있다 
	private int volume;
	
	
	@Override //인터페이스의 추상메소드가 잘구현되어 있는지를 검사하는 기능
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME){
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		} else{
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + volume);
	}
	
}
