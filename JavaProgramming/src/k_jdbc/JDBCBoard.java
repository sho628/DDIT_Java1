package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import e_oop.ScanUtil;

public class JDBCBoard {

	//데이터베이스 접속 정보
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "SEM";
	String password = "java";
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public static void main(String[] args) {
		new JDBCBoard().start();
	}
	
	void start(){
		while(true){
			try {
				con = DriverManager.getConnection(url, user, password);
				
				String sql = "SELECT BOARD_NO, TITLE, CONTENT, A.MEM_ID, B.MEM_NAME, TO_CHAR(REG_DATE, 'MM-DD') AS REG_DATE"
						+ " FROM TB_JDBC_BOARD A"
						+ " LEFT OUTER JOIN MEMBER B ON A.MEM_ID = B.MEM_ID"
						+ " ORDER BY BOARD_NO DESC";
				ps = con.prepareStatement(sql);
				
				rs = ps.executeQuery();
				
				System.out.println("-----------------------------------------");
				System.out.println("번호\t제목\t작성자\t작성일");
				System.out.println("-----------------------------------------");
				while(rs.next()){
					System.out.println(rs.getInt("BOARD_NO")
							+ "\t" + rs.getString("TITLE")
							+ "\t" + rs.getString("MEM_NAME")
							+ "\t" + rs.getString("REG_DATE"));
				}
				System.out.println("-----------------------------------------");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if(rs != null) try { rs.close(); } catch(Exception e) {}
				if(ps != null) try { ps.close(); } catch(Exception e) {}
				if(con != null) try { con.close(); } catch(Exception e) {}
			}
			
			System.out.println("1.조회\t2.등록\t0.종료");
			System.out.print("입력>");
			int input = ScanUtil.nextInt();
			
			switch (input) {
			case 1:
				select();
				break;
			case 2:
				insert();
				break;
			case 0:
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
				break;
			}
		}
	}

	private void select() {
		System.out.print("조회할 게시물 번호>");
		int input = ScanUtil.nextInt();
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT BOARD_NO, TITLE, CONTENT, A.MEM_ID, B.MEM_NAME, TO_CHAR(REG_DATE, 'MM-DD') AS REG_DATE"
					+ " FROM TB_JDBC_BOARD A"
					+ " LEFT OUTER JOIN MEMBER B ON A.MEM_ID = B.MEM_ID"
					+ " WHERE BOARD_NO = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, input);
			
			rs = ps.executeQuery();
			
			if(rs.next()){
				int boardNo = rs.getInt("BOARD_NO");
				System.out.println("번호\t: " + rs.getInt("BOARD_NO"));
				System.out.println("작성자\t: " + rs.getString("MEM_NAME"));
				System.out.println("작성일\t: " + rs.getString("REG_DATE"));
				System.out.println("제목\t: " + rs.getString("TITLE"));
				System.out.println("내용\t: " + rs.getString("CONTENT"));
				
				System.out.println("1.수정\t2.삭제\t0.목록");
				System.out.print("입력>");
				input = ScanUtil.nextInt();
				
				switch (input) {
				case 1:
					update(boardNo);
					break;
				case 2:
					delete(boardNo);
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
	}

	private void delete(int boardNo) {
		System.out.print("정말 삭제 하시겠습니까?(Y/N)>");
		String input = ScanUtil.nextLine();
		
		if(input.equals("Y")){
			try {
				con = DriverManager.getConnection(url, user, password);
				
				String sql = "DELETE FROM TB_JDBC_BOARD"
						+ " WHERE BOARD_NO = ?";
				ps = con.prepareStatement(sql);
				ps.setInt(1, boardNo);
				
				int result = ps.executeUpdate();
				
				if(0 < result){
					System.out.println("삭제가 완료되었습니다.");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if(rs != null) try { rs.close(); } catch(Exception e) {}
				if(ps != null) try { ps.close(); } catch(Exception e) {}
				if(con != null) try { con.close(); } catch(Exception e) {}
			}
		}
	}

	private void update(int boardNo) {
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "UPDATE TB_JDBC_BOARD"
					+ " SET TITLE = ?"
					+ " , CONTENT = ?"
					+ " WHERE BOARD_NO = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, boardNo);
			
			int result = ps.executeUpdate();
			if(0 < result){
				System.out.println("수정이 완료되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
	}

	private void insert() {
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		System.out.print("아이디>");
		String memId = ScanUtil.nextLine();
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "INSERT INTO TB_JDBC_BOARD VALUES ("
					+ "(SELECT NVL(MAX(BOARD_NO), 0) + 1 FROM TB_JDBC_BOARD)"
					+ ", ?, ?, ?, SYSDATE)";
			ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, memId);
			
			int result = ps.executeUpdate();
			
			if(0 < result){
				System.out.println("등록이 완료되었습니다.");
			}else{
				System.out.println("등록에 실패하였습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
	}

}















