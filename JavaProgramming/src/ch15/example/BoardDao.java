package ch15.example;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public List<Board> getBoardList(){  //저장되는 타입이 List<Board>이므로 반환타입을 List<Board>로 설정
		List<Board> list = new ArrayList<Board>();  //Board타입의 ArrayList 생성
		//결과값이 3개이므로 3개의 객체를 생성
		list.add(new Board("내용1", "제목1"));
		list.add(new Board("내용2", "제목2"));
		list.add(new Board("내용3", "제목3"));
		
		return list;  //반환 타입이 List<Board>이므로 list를 리턴
		
		
	}
}
