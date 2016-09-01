package ch09.exam12;

public class AnonymousTest {
	private RemoteControl rc = new RemoteControl(){};  //필드를 초기화
	
	
	public AnonymousTest(){
		RemoteControl rc = new RemoteControl(){};   //변수 초기화
	}
	
	public void method1(RemoteControl rc){
		
	}
	
	public void method2(){
		method1(new RemoteControl() {
			
		});
	}
}
