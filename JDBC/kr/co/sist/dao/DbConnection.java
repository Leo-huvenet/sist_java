package kr.co.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *	DB Connection���
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
	 * Ŀ�ؼ� ��ȯ�ϴ� ��
	 * @return DB�� ����� Connection
	 */
	public Connection getConnection() throws SQLException {
		//1.����̹��ε�
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//2. Connection ���
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String id="scott";
		String pass="tiger";
		
		Connection con = DriverManager.getConnection(url, id, pass);
	
		return con;	
	}
	
	/**
	 * ResultSet, PreparedStatement , Connection�� ������ ���� ��
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
