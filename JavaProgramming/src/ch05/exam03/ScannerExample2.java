package ch05.exam03;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("--------------------------------------------");
		
		System.out.print("선택> ");
	
		int keycheck = scanner.nextInt();
		
		while(true){
			switch(keycheck){
				case 1:
					System.out.print("학생수> ");
					String studentNum = scanner.nextLine();
					
				case 2:
					
					
				case 3:
					
					
				case 4:
					
					
				case 5:

			}
		}
		
	}
	
}
