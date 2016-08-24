package ch06.exam11;

import java.util.Scanner;

public class BoardExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Board[] boarders = new Board[30];;
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

				for (Board boarder : boarders) {
					if (boarder != null) {
						System.out.println(boarder.boarderNum + "\t\t" + boarder.titile + "\t\t" + boarder.author + "\t\t" + boarder.count);
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
						boarders[i] = new Board(boarderNum, title, author, count);
						break;
					}
				}
			} else if (choiceNum.equals("3")) { // 상세보기

				System.out.println("-----");
				System.out.println("번호\t\t제목\t\t조회수");
				System.out.println("-----");

				for (int i=0;i<boarders.length;i++) { // 목록출력
					if (boarders[i] != null) {
						System.out.println(boarders[i].boarderNum + "\t\t" + boarders[i].titile + "\t\t" + boarders[i].count);
					}
				}
				if (boarderNum != null) {
					System.out.print("선택> ");
					// String[] boarder = {boarderNum, title, text,
					// String.valueOf(count)};
					select = Integer.parseInt(scanner.nextLine());
						if (boarders[select] != null) {
							System.out.println(boarders[select].text);
							// System.out.println(boarder[2]);

							// count = Integer.parseInt(boarder[3]);

							count = boarders[select].count;
							count++;
							boarders[select].count = count;
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
						boarders[modify].titile = title;
						boarders[modify].text = text;
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
