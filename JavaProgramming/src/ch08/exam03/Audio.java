package ch08.exam03;

public class Audio implements RemoteControl{
	
		@Override //인터페이스의 추상메소드가 잘구현되어 있는지를 검사하는 기능
		public void turnOn() {
			System.out.println("Audio를 켭니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("Audio를 끕니다.");
		}

		@Override
		public void setVolume(int volume) {
			System.out.println("현재 Audio 볼륨: " + volume);
		}
}
