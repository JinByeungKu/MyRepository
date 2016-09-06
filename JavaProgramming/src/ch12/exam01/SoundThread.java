package ch12.exam01;

import java.awt.Toolkit;

public class SoundThread extends Thread{
	
	
	public SoundThread() {
		setName("Sound Thread");
	}
	
	@Override
	public void run() {
		Toolkit toolKit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++){
			toolKit.beep();
			System.out.println("소리: " + Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}
