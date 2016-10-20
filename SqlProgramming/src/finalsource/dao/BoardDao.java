package finalsource.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import finalsource.dto.Board;


public class BoardDao {
   private Connection conn= null;
   
   
   public void setConn(Connection conn) {
      this.conn = conn;
   }

   public int Insert(Board board) throws SQLException {
      String sql = "insert into board(bno,btitle,bcontent,bwriter,bhitcount,bdate) values(seq_board_bno.nextval,?,?,?,0,sysdate)";
      PreparedStatement pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, board.getBtitle());
      pstmt.setString(2, board.getBcontent());
      pstmt.setString(3, board.getBwriter());
      int rowNo = pstmt.executeUpdate();
      pstmt.close();
      
      return rowNo;
   }

   // id는 고유하기떄문에 한개의 행이 가져오거나 아니면 아무것도 안가져온다 그래서 Member객체를 씀
   public Board selectByMid(int bno) throws SQLException {
      String sql = "select bno,btitle,bcontent,bwriter,bhitcount,bdate from board where bno=?";
      Board board = null;
      PreparedStatement pstmt = conn.prepareStatement(sql);
      pstmt.setInt(1, bno);
      ResultSet rs = pstmt.executeQuery();
      
      //bno pk이기 떄문이다 
      if(rs.next()){
         board = new Board();
         board.setBno(rs.getInt("bno"));
         board.setBtitle(rs.getString("btitle"));
         board.setBcontent(rs.getString("bcontent"));
         board.setBwriter(rs.getString("bwriter"));
         board.setBhitcount(rs.getInt("bhitcount"));
         board.setBdate(rs.getDate("bdate"));
      }
      rs.close();
      pstmt.close();
      return board;
   }
   
   
   public List<Board> selectByBtitle(String btitle) throws SQLException{
      List<Board> list = new ArrayList<Board>();
      String sql = "select bno,btitle,bcontent,bwriter,bhitcount,bdate from board where btitle like ?";
      PreparedStatement pstmt = conn.prepareStatement(sql);
      pstmt.setString(1,"%" + btitle + "%");
      
      ResultSet rs = pstmt.executeQuery();
      
      while(rs.next()){
         Board board = new Board();
         board.setBno(rs.getInt("bno"));
         board.setBtitle(rs.getString("btitle"));
         board.setBcontent(rs.getString("bcontent"));
         board.setBwriter(rs.getString("bwriter"));
         board.setBhitcount(rs.getInt("bhitcount"));
         board.setBdate(rs.getDate("bdate"));
         list.add(board);
      }
      rs.close();
      pstmt.close();
      return list;
      
   }
   
   public int Update(Board board) throws SQLException{
      String sql = "update board set btitle =?, bcontent=?, bwriter=?, bhitcount=?, bdate=? where bno=?";
      PreparedStatement pstmt = conn.prepareStatement(sql);
      
      pstmt.setString(1, board.getBtitle());
      pstmt.setString(2, board.getBcontent());
      pstmt.setString(3, board.getBwriter());
      pstmt.setInt(4, board.getBhitcount());
      pstmt.setDate(5, new Date(board.getBdate().getTime()));
      pstmt.setInt(6,board.getBno());

      int rowNo = pstmt.executeUpdate();
      pstmt.close();
      return rowNo;
   }
   
   public int Delete(int bno) throws SQLException{
      String sql = "delete from board where bno=?";
      PreparedStatement pstmt = conn.prepareStatement(sql);
      pstmt.setInt(1, bno);
      int rowNo = pstmt.executeUpdate();
      pstmt.close();
      return 0;
   }
}