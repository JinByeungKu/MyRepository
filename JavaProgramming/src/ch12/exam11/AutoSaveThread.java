package ch12.exam11;

public class AutoSaveThread extends Thread{
	public void save(){
		System.out.println("작업 내용을 저장함");
	}
	
	@Override
	public void run() {
		while(true){
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
			save();       //1초 단위로 계속 저장을 하겠다.
		}
	}
}
