package ch07.exam13;

public class Example {
	//public static void use(Phone phone){}
	
	public static void main(String[] args) {
		SmartPhone p1 = new SmartPhone();
		p1.number = "010-1234-1234";
		p1.ring();
		p1.sendVoice();
		p1.receiveVoice();
		p1.internet();
		
		
		HomePhone p2 = new HomePhone();
		p1.number = "02-234-2341";
		p2.address = "서울시 송파구 가락동 IT벤처타워 서관 12층";
		p2.ring();
		p2.sendVoice();
		p2.receiveVoice();
	}
}
