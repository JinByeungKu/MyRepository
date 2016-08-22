package ch05.exam03;

import java.util.Scanner;

public class BoardExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] boarders = new String[100][];
		String boarderNum = null;
		String title = null;
		String text = null;
		int count = 0;

		
		
		while(true){
			System.out.println("----------------------------------------------------");
			System.out.println("1.목록 | 2.글쓰기 | 3.상세보기 | 4.수정하기 | 5.삭제하기 | 6.종료");
			System.out.println("----------------------------------------------------");
			
			System.out.print("선택> ");
			String choiceNum = scanner.nextLine();
			
			
			if(choiceNum.equals("1")){

					System.out.println("-------------------------------------------------");
					System.out.println("게시물 번호\t게시물 제목\t글쓴이\t조회수");
					System.out.println("-------------------------------------------------");
					
					for(String[] boarder : boarders){
						if(boarder != null){ 
							System.out.println(boarder[0] + "\t\t" +boarder[1] + "\t\t" + boarder[2] + "\t\t" + boarder[3]); 
						}
					//}
				}
			} else if(choiceNum.equals("2")){  //글쓰기
				System.out.print("제목: ");
				title = scanner.nextLine();
				System.out.print("내용: ");
				text = scanner.nextLine();
				
				for(int i=0;i<boarders.length;i++){
					if(boarders[i] == null){
						boarderNum = String.valueOf(i);
						String[] boarder= {boarderNum, title, text, String.valueOf(count)};
						boarders[i] = boarder;
						break; 
					}
				}
			} else if(choiceNum.equals("3")){      //상세보기

				System.out.println("-----");
				System.out.println("번호\t\t제목\t\t조회수");
				System.out.println("-----");

					for(String[] boarder : boarders){
						if(boarder != null){ 
							System.out.println(boarder[0] + "\t\t"+boarder[1] + "\t\t" + boarder[3]);
						}
					}
				System.out.println("선택> ");
				String[] boarder= {boarderNum, title, text, String.valueOf(count)};
				int select = Integer.parseInt(scanner.nextLine());
				System.out.println(boarder[2]);
				count = Integer.parseInt(boarder[3]);
				count = count + 1;
				boarder[3] = String.valueOf(count);
				
			} else if(choiceNum.equals("4")){      //수정
				System.out.print("수정할 번호> ");
				int sno = Integer.parseInt(scanner.nextLine());
				boarders[sno] = null;
				System.out.println("수정할 제목");
				title = scanner.nextLine();
				System.out.println("수정할 내용");
				text = scanner.nextLine();
				
				String[] boarder= {boarderNum, title, text, String.valueOf(count)};
				boarders[sno] = boarder;
			} else if(choiceNum.equals("5")){    //삭제
				System.out.print("삭제할 번호> ");
				int sno = Integer.parseInt(scanner.nextLine());
				boarders[sno] = null;
			} else if(choiceNum.equals("6")){
				break;
			}
		}

	}

}
