package finalsource.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import finalsource.dao.BoardDao;

import finalsource.dto.Board;

public class TestBoardDao {

	public static void main(String[] args) {
		// testInsert();
		// testselectByMid();
		// testselectByMname();
		// testupdate();
		// testdeleteByMid();
		testSelectByPage(2, 10);
	}

	private static void testSelectByPage(int pageNo, int rowsPerPage) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");

			BoardDao dao = new BoardDao();
			dao.setConn(conn);

			List<Board> list = dao.selectByPage(pageNo, rowsPerPage);
			for (Board board : list) {
				System.out.print(board.getBno() + ":");
				System.out.print(board.getBtitle() + ":");
				System.out.print(board.getBcontent() + ":");
				System.out.print(board.getBwriter() + ":");
				System.out.print(board.getBhitcount() + ":");
				System.out.print(board.getBdate());
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { conn.close(); } catch (SQLException e) { }
		}
	}

	public static void testInsert() {
		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");

			BoardDao dao = new BoardDao();
			dao.setConn(conn);

			Board board = new Board();
			board.setBno(1);
			board.setBtitle("테스트 제목1");
			board.setBcontent("테스트 내용1");
			board.setBwriter("user10");

			int rowNo = dao.Insert(board);
			System.out.println(rowNo + "행이 저장됨");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { conn.close(); } catch (SQLException e) { }
		}
	}

	public static void testselectByMid() {
		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");

			BoardDao dao = new BoardDao();
			dao.setConn(conn);

			Board board = dao.selectByMid(1);
			if (board != null) {
				System.out.println(board.getBno() + ":");
				System.out.println(board.getBtitle() + ":");
				System.out.println(board.getBcontent() + ":");
				System.out.println(board.getBwriter() + ":");
				System.out.println(board.getBhitcount() + ":");
				System.out.println(board.getBdate() + ":");
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { conn.close(); } catch (SQLException e) { }
		}
	}

	public static void testselectByMname() {
		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");

			BoardDao dao = new BoardDao();
			dao.setConn(conn);

			List<Board> list = dao.selectByBtitle("10");
			for (Board board : list) {
				System.out.println(board.getBno() + ":");
				System.out.println(board.getBtitle() + ":");
				System.out.println(board.getBcontent() + ":");
				System.out.println(board.getBwriter() + ":");
				System.out.println(board.getBhitcount() + ":");
				System.out.println(board.getBdate() + ":");
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {	conn.close(); } catch (SQLException e) { }
		}
	}

	public static void testupdate() {
		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");

			BoardDao dao = new BoardDao();
			dao.setConn(conn);

			Board board = new Board();
			board.setBno(1);
			board.setBtitle("테스트 제목2");
			board.setBcontent("테스트 내용2");
			board.setBwriter("user10");
			board.setBhitcount(5);
			board.setBdate(new Date());

			int rowNo = dao.Update(board);
			System.out.println(rowNo + "행이 수정됨");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { conn.close(); } catch (SQLException e) { }
		}
	}

	public static void testdeleteByMid() {
		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");

			BoardDao dao = new BoardDao();
			dao.setConn(conn);

			int rowNo = dao.Delete(1);
			System.out.println(rowNo + "행이 삭제됨");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { conn.close(); } catch (SQLException e) { }
		}
	}
}