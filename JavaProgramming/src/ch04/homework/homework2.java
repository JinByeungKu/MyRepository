package ch04.homework;

public class homework2 {

	public static void main(String[] args) {
		for (int x = 1; x <= 10; x++) { //1~10까지 10번 반복함
			for (int y = 1; y <= 10; y++) { // 1~10까지 10번 반복함
				if((4*x) + (5*y) == 60){ //if문안의 조건식이 만족한다면 if문 블록 실행  
					System.out.println("x값 : " + x + " " + "y값 : " + y); //if문이 true일 경우 x와 y 값을 출력
				}
			}
		}
	}

}
