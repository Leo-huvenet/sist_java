package day0414;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;


import day0412.ZipcodeVO;
import kr.co.sist.dao.DbConnection;


public class InjectionDAO {
	
	public String statementLogin(String id, String pass)throws SQLException{
		
		String name ="";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		DbConnection dc = DbConnection.getInstance();
		
		try {
		//1.
		//2.
			con = dc.getConnection();
		//3.
			stmt = con.createStatement();
		//4.
			StringBuilder sb = new StringBuilder();
			sb
			.append(" select name ")
			.append(" from injection_test ")
			.append(" where id = '").append(blockSql(id)).append("' and pass = '").append(blockSql(pass)).append("'");
			
			System.out.println(sb.toString());
			rs = stmt.executeQuery(sb.toString());
			
			if(rs.next()) {//입력한 id와 pass에 일치하는 레코드가 존재
				name = rs.getString("name");
			}
			
		}finally {
		//5.
				if(rs != null) {rs.close();}
				if(con != null) {rs.close();}
				if(stmt != null) {rs.close();}
		}
		return name;
	}
	
	public String preparedStatementLogin(String id, String pass)throws SQLException{
			
			String name ="";
			
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			DbConnection dc = DbConnection.getInstance();
			
			try {
			//1.
			//2.
				con = dc.getConnection();
			//3.
				StringBuilder sb = new StringBuilder();
				sb
				.append(" select name ")
				.append(" from injection_test ")
				.append(" where id = ? and pass = ?");
				
				pstmt = con.prepareStatement(sb.toString());
			//4.
				pstmt.setString(1, id);
				pstmt.setString(2, pass);
				
				rs = pstmt.executeQuery();
				
				if(rs.next()) {//입력한 id와 pass에 일치하는 레코드가 존재
					name = rs.getString("name");
				}
				
			}finally {
			//5.
				dc.close(rs, pstmt, con);
			}
			return name;
		}
	
	public List<ZipcodeVO> selectZipcode(String dong)throws SQLException{
		List<ZipcodeVO> list = new ArrayList<ZipcodeVO>();
		
		Connection con =null;
		Statement stmt = null;
		ResultSet rs = null;
		
		DbConnection dc = DbConnection.getInstance();
		
		try {
		//1.
			con = dc.getConnection();
		//2.
			stmt = con.createStatement();
		//3.
			StringBuilder selectQ = new StringBuilder();
			selectQ
			.append("	select zipcode, sido, gugun, dong, bunji	")
			.append("	from zipcode	")
			.append("	where dong like '").append( blockSql(dong)).append("%'");
			
			rs = stmt.executeQuery(selectQ.toString());
			
			ZipcodeVO zVO = null;
			
			while(rs.next()) {
				zVO = new ZipcodeVO(rs.getString("zipcode"), rs.getString("sido"), 
						rs.getString("gugun"), rs.getString("dong"), rs.getString("bunji"));
				list.add(zVO);
			}
			
			
		//4.
		}finally {
		//5.
			if(rs != null) {rs.close();}
			if(con != null) {rs.close();}
			if(stmt != null) {rs.close();}
		}
		
		return list;
	}
	
	/**
	 * 입력되는 쿼리문에 ', , --, 쿼리문에 대한 부분을 치환
	 * @param originSql
	 * @return
	 */
	public String blockSql(String originSql) {
		String resultSql = originSql;
		
		resultSql = resultSql.replaceAll("'", "").replaceAll(" ","").replaceAll("-", "").replaceAll("select", "").replaceAll("where", "");
		
		return resultSql;
	}
}
