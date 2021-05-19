package kr.co.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *	DB Connection사용
 * @author user
 */
public class DbConnection {
	
	private static DbConnection dc;
	
	private DbConnection() {
		
	}
	
	public static DbConnection getInstance() {
		
		if( dc == null) {
			dc = new DbConnection(); 
		}
		return dc;
	}
	
	/**
	 * 커넥션 반환하는 일
	 * @return DB와 연결된 Connection
	 */
	public Connection getConnection() throws SQLException {
		//1.드라이버로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//2. Connection 얻기
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String id="scott";
		String pass="tiger";
		
		Connection con = DriverManager.getConnection(url, id, pass);
	
		return con;	
	}
	
	/**
	 * ResultSet, PreparedStatement , Connection의 연결을 끊는 일
	 * @param rs
	 * @param pstmt
	 * @param con
	 * @throws SQLException
	 */
	public void close(ResultSet rs, PreparedStatement pstmt, Connection con)throws SQLException {
		if (rs != null) { rs.close();}
		if (pstmt != null) { pstmt.close();}
		if (con != null) { con.close();}
	}
	
	

	
	
	
	
	
	
	
	
}//class
