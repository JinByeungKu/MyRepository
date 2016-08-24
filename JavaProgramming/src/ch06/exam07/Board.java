package ch06.exam07;

public class Board {
	//Field
	int no;
	String title;
	String content;
	String writer;
	int hitcount;
	
	
	//Constructor
	Board() {
		
	}
	Board(int no) {
		this(no, null, null, null, 0);
	}
	Board(int no, String title) {
		this(no, title, null, null, 0);
	}
	Board(int no, String title, String content){
		this(no, title, content, null, 0);
	}
	Board(int no, String title, String content, String writer){
		this(no, title, content, writer, 0);
	}
	Board(int no, String title, String content, String writer, int hitcontent){
		this.no= no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.hitcount = hitcontent;
	}
	
	
	
	//Method
}
