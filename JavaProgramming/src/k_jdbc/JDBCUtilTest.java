package k_jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JDBCUtilTest {

	public static void main(String[] args) {
		JDBCUtil jdbc = JDBCUtil.getInstance();
		
//		String str = "줄\n바꿈";
//		
//		String sql = "INSERT INTO TB_JDBC_BOARD VALUES ("
//				+ "(SELECT NVL(MAX(BOARD_NO), 0) + 1 FROM TB_JDBC_BOARD)"
//				+ ", ?, ?, ?, SYSDATE)";
//		
//		ArrayList<Object> param = new ArrayList<>();
//		param.add("제목");
//		param.add(str);
//		param.add("a001");
//		
//		jdbc.update(sql, param);
		
		String sql = "select * from tb_jdbc_board";
		List<Map<String, Object>> list = jdbc.selectList(sql);
		for(Map<String, Object> board : list){
			System.out.println(board.get("CONTENT"));
		}
	}

}







