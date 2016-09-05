package ch11.exam04;

public class ExitExample {
	public static void main(String[] args) {
		
		System.setSecurityManager(new SecurityManager(){    //system.exit()을 검증하는 코드
			@Override
			public void checkExit(int status) {    //exit(i) i 값이 매개변수 값으로 들어옴
				if(status != 5){
					throw new SecurityException(); //정상적으로 실행시키기 위해 일부러 예외를 만듬
				}
				System.out.println("나 죽내~");
			}
		});
		
		
		for(int i=0;i<10;i++){
			System.out.println(i);
				try{
					System.exit(i); // 프로그램을 종료해라
				//break; // 
				//return; //for문을 빠져나가라
				} catch(SecurityException e){}
			}
		}
}
