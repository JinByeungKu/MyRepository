package ch12.exam08;

public class ThreadB extends Thread{
	private WorkObject workObject;
	
	public ThreadB(WorkObject workObject) {         //외부에서 객체를 받아서 내부에 저장한다(Injection)
		this.workObject = workObject;
	}
	
	
	
	
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			workObject.methodA();
		}
	}

}
