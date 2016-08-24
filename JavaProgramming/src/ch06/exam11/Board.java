package ch06.exam11;

public class Board {
	String boarderNum;
	String titile;
	String text;
	String author;
	int count;
	int modify;
	int select;
	
	Board() {}
	Board(String boarderNum, String title, String author, int count){
		this.boarderNum = boarderNum;
		this.titile = title;
		this.author = author;
		this.count = count;
	}
	
}
