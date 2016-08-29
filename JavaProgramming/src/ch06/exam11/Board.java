package ch06.exam11;

public class Board {
	private String boarderNum;
	private String titile;
	private String text;
	private String author;
	private int count;
	private int modify;
	private int select;
	
	Board() {}
	Board(String boarderNum, String title, String author, String text, int count){
		this.boarderNum = boarderNum;
		this.titile = title;
		this.author = author;
		this.text = text;
		this.count = count;
	}
	public String getBoarderNum() {
		return boarderNum;
	}
	public void setBoarderNum(String boarderNum) {
		this.boarderNum = boarderNum;
	}
	public String getTitile() {
		return titile;
	}
	public void setTitile(String titile) {
		this.titile = titile;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getModify() {
		return modify;
	}
	public void setModify(int modify) {
		this.modify = modify;
	}
	public int getSelect() {
		return select;
	}
	public void setSelect(int select) {
		this.select = select;
	}
	
	
	
}
