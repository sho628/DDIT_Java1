package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import util.JDBCUtil;


public class UserDao {
	
	//싱글톤 패턴
	private static UserDao instance;
	private UserDao(){}
	public static UserDao getInstance(){
		if(instance == null){
			instance = new UserDao();
		}
		return instance;
	}
	
	private JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public int insertUser(Map<String, Object> param){
		String sql = "INSERT INTO TB_JDBC_USER VALUES (?, ?, ?)";
		
		List<Object> p = new ArrayList<>();
		p.add(param.get("USER_ID"));
		p.add(param.get("PASSWORD"));
		p.add(param.get("USER_NAME"));
		
		return jdbc.update(sql, p);
	}
	
	public Map<String, Object> selectUser(String userId, String password) {
		String sql = "SELECT USER_ID, PASSWORD, USER_NAME"
				+ " FROM TB_JDBC_USER"
				+ " WHERE USER_ID = ?"
				+ " AND PASSWORD = ?";
		
		List<Object> p = new ArrayList<>();
		p.add(userId);
		p.add(password);
		
		return jdbc.selectOne(sql, p);
	}
	
}














