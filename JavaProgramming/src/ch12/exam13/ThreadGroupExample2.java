package ch12.exam13;

public class ThreadGroupExample2 {
	public static void main(String[] args) {
		Thread thread;
		
		
		// main이란 그룹에 t1, t2를 만듬
		thread = new Thread("t1"){
			@Override
			public void run() {
				while(true){
					System.out.println(getName() + "실행중...");
					if(isInterrupted()) break;
					
					//Thread.sleep(1);
				}
				System.out.println(getName() + "종료");
			}
		};
		thread.start();
		
		
		thread = new Thread("t2"){
			@Override
			public void run() {
				while(true){
					System.out.println(getName() + "실행중...");
					if(isInterrupted()) break;
					
					//Thread.sleep(1);
				}
				System.out.println(getName() + "종료");
			}
		};
		thread.start();
		
		
		
		
		ThreadGroup sup = new ThreadGroup("sub");
		
		thread = new Thread(sup,"t3"){   //스레드그룹이름을 주고 t3를 스레드구릅sup에 넣음 
			@Override
			public void run() {
				while(true){
					System.out.println(getName() + "실행중...");
					if(isInterrupted()) break;
					
					//Thread.sleep(1);
				}
				System.out.println(getName() + "종료");
			}
		};
		thread.start();
		
		thread = new Thread(sup,"t4"){   //스레드그룹이름을 주고 t4를 스레드구릅sup에 넣음 
			@Override
			public void run() {
				while(true){
					System.out.println(getName() + "실행중...");
					if(isInterrupted()) break;
					
					//Thread.sleep(1);
				}
				System.out.println(getName() + "종료");
			}
		};
		thread.start();
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		//sup.interrupt();   //sup그룹만 인터럽트 시킨다
		Thread.currentThread().getThreadGroup().interrupt();  //sup.interrupt();과 같은 코드		
		
	}
}
