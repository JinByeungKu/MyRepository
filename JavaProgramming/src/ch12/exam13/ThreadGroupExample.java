package ch12.exam13;

public class ThreadGroupExample {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();  
		System.out.println(thread.getName());    //스레드 이름
		
		for(int i=0;i<10;i++){
			int count =i;  //익명객체에서는 로컬변수는 final특성을 갖기 때문에 i값 변경이 안되어 count에 대입해서 i값을 씀
			Thread thread2 = new Thread(){
				@Override
				public void run() {
					while(true){
						System.out.println("Thread" + count + "실행중...");
						if(isInterrupted()) break;
						
						//Thread.sleep(1);
					}
					System.out.println("Thread" + count + "종료");
				}
			};
			thread2.start();
		}
		
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		System.out.println(mainGroup.getName());   //스레드 안에 있는 그룹이름
		System.out.println(mainGroup.activeCount());   //실행되고 있는 스레드 수를 알아보는 함수
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		mainGroup.interrupt();
	}
}
