package k_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_INSERT {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "SEM";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "INSERT INTO LPROD VALUES (?, ?, ?, sysdate)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, 15);
			ps.setString(2, "P601");
			ps.setString(3, "기타제품");
//			ps.setDate(1, new Date(2021, 6, 10));
			
			int result = ps.executeUpdate();
			
			System.out.println(result + "개의 행이 영향을 받았습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
	}

}











