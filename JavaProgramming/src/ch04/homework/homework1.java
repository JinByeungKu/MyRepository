package ch04.homework;

public class homework1 {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) { //0~99까지 100번 반복을 함
			int dice1 = (int) (Math.random() * 6 + 1); //0~6까지의 랜덤값을 int 타입의 dice1 변수에 저장
			int dice2 = (int) (Math.random() * 6 + 1); //0~6까지의 랜덤값을 int 타입의 dice2 변수에 저장
			if ((dice1 + dice2) == 10) { //dice1과 dice2의 랜덤값의 합이 10일 경우 if블록을 실행
				System.out.println("dice1의 눈 : " + dice1 + "  " + "dice2의 눈 : " + dice2); //if문이 true일 경우 dice1과 dice2 값을 출력
			}
		}

	}

}
