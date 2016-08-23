package ch05.exam03;

import java.util.Scanner;

public class BoardExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] boarders = new String[100][];
		String boarderNum = null;
		String title = null;
		String text = null;
		String author = null;
		int count = 0;
		int modify = 0;
		int select = 0;

		while (true) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.목록 | 2.글쓰기 | 3.상세보기 | 4.수정하기 | 5.삭제하기 | 6.종료");
			System.out.println("----------------------------------------------------");

			System.out.print("선택> ");
			String choiceNum = scanner.nextLine();

			if (choiceNum.equals("1")) {

				System.out.println("------------------------------------------------------");
				System.out.println("게시물 번호\t\t게시물 제목\t\t글쓴이\t\t조회수");
				System.out.println("------------------------------------------------------");

				for (String[] boarder : boarders) {
					if (boarder != null) {
						System.out.println(boarder[0] + "\t\t" + boarder[1] + "\t\t" + boarder[3] + "\t\t" + boarder[4]);
					}
				}
			} else if (choiceNum.equals("2")) { // 글쓰기
				System.out.print("글쓴이: ");
				author = scanner.nextLine();
				System.out.print("제목: ");
				title = scanner.nextLine();
				System.out.print("내용: ");
				text = scanner.nextLine();

				for (int i = 0; i < boarders.length; i++) {
					if (boarders[i] == null) {
						boarderNum = String.valueOf(i);
						String[] boarder = { boarderNum, title, text, author, String.valueOf(count) };
						boarders[i] = boarder;
						break;
					}
				}
			} else if (choiceNum.equals("3")) { // 상세보기

				System.out.println("-----");
				System.out.println("번호\t\t제목\t\t조회수");
				System.out.println("-----");

				for (String[] boarder : boarders) { // 목록출력
					if (boarder != null) {
						System.out.println(boarder[0] + "\t\t" + boarder[1] + "\t\t" + boarder[4]);
					}
				}
				if (boarderNum != null) {
					System.out.print("선택> ");
					// String[] boarder = {boarderNum, title, text,
					// String.valueOf(count)};
					select = Integer.parseInt(scanner.nextLine());
						if (boarders[select] != null) {
							System.out.println(boarders[select][2]);
							// System.out.println(boarder[2]);

							// count = Integer.parseInt(boarder[3]);

							count = Integer.parseInt(boarders[select][4]);
							count++;
							boarders[select][4] = String.valueOf(count);
					}
				} else
					System.out.println("목록이 없습니다.");
			} else if (choiceNum.equals("4")) { // 수정
				if (boarderNum != null) {
					System.out.print("수정할 번호> ");
					modify = Integer.parseInt(scanner.nextLine());
					if (boarders[modify] != null) {
						// boarders[modify] = null;
						System.out.print("수정할 제목> ");
						title = scanner.nextLine();
						System.out.print("수정할 내용> ");
						text = scanner.nextLine();
						// String[] boarder= {boarderNum, title, text, author,
						// String.valueOf(count)};
						boarders[modify][1] = title;
						boarders[modify][2] = text;
					}
				} else
					System.out.println("목록이 없습니다.");
			} else if (choiceNum.equals("5")) { // 삭제
				if (boarderNum != null) {
					System.out.print("삭제할 번호> ");
					int sno = Integer.parseInt(scanner.nextLine());
					if (boarders[sno] != null) {
						boarders[sno] = null;
					}
				} else
					System.out.println("목록이 없습니다.");
			} else if (choiceNum.equals("6")) {
				break;
			}
		}

	}

}
