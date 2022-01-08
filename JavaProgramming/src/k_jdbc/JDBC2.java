package k_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC2 {

	public static void main(String[] args) {
		
		//데이터베이스 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "SEM";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT *"
					+ " FROM CART"
					+ " WHERE CART_MEMBER = ?"
					+ " AND CART_QTY > ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, "a001");
			ps.setInt(2, 5);
			
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData(); //메타데이터 : 데이터에 대한 데이터
			
			int columnCount = metaData.getColumnCount(); //컬럼 수
			
			// 컬럼명 출력
			for(int i = 1; i <= columnCount; i++){
				System.out.print(metaData.getColumnName(i) + "\t");
			}
			System.out.println();
			
			while(rs.next()){
				
				
				for(int i = 1; i <= columnCount; i++){
					Object value = rs.getObject(i);
					System.out.print(value + "\t");
					
//					Date date = rs.getDate(1);
//					new java.util.Date(date.getTime());
				}
				System.out.println();
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









