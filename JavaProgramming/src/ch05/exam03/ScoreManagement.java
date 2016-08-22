package ch05.exam03;

import java.util.Scanner;

public class ScoreManagement {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.print("학생수: ");
		String strNum = scanner.nextLine();
		int num = Integer.parseInt(strNum);
		String[][] scores = new String[num][2];

		for (int i = 0; i < scores.length; i++) {
			System.out.print("이름: ");
			String name = scanner.nextLine();
			System.out.print("점수: ");
			String score = scanner.nextLine();
			String[] arr = { name, score };
			scores[i] = arr;
		}

		while (true) {
			System.out.println("---------------------------");
			System.out.println("1.총 학생수 | 2.입력 | 3.최고점수 | 4.평균점수 | 5.종료");
			System.out.println("---------------------------");
			System.out.print("선택> ");
			String choiceNum = scanner.nextLine();

			if (choiceNum.equals("1")) {
				
			}else if (choiceNum.equals("2")) {
				
			} else if (choiceNum.equals("3")) {
				int max = 0;
				for (String[] arr : scores) { // 최고점수 찾기
					if (max < Integer.parseInt(arr[1])) {
						max = Integer.parseInt(arr[1]);
					}
				}

				for (String[] arr : scores) { // 구한 최고점수의 이름찾기
					if (max == Integer.parseInt(arr[1])) {
						System.out.println(arr[0] + ", " + arr[1]);
					}
				}
			} else if (choiceNum.equals("4")) {
				int sum = 0;
				for (String[] arr : scores) {
					sum += Integer.parseInt(arr[1]);
				}
				int avg = sum / scores.length;

				System.out.println("평균점수: " + avg);
			} else if (choiceNum.equals("5")) {
				break;
			}
		}
	}
}
