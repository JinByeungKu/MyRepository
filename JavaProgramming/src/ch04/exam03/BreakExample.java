package ch04.exam03;

public class BreakExample {
	public static void main(String[] args) {
		// 주사위의 눈이 6이 나오면 프로그램을 종료하세요.
		while (true) {
			int num = (int) (Math.random()*6 + 1);
			System.out.println(num);
			
			if(num == 6){
				break;
			}
		}
	}
}
