package ch04.exam02;

public class ForExample {
	public static void main(String args[]) {
		
		double Snum=0;
		double avg =0;
		
		for (int i = 0; i < 3; i++) {
			int num = (int)(Math.random()*6+1);
			Snum += num;
			System.out.println(num);
		}
		avg = Snum/3;
		System.out.println(Snum);
		System.out.println(avg);  
		
	}
}
