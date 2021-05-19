package day0412;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.dao.DbConnection;
import oracle.jdbc.OracleTypes;

public class UseCallableStatementDAO {
	
	private static UseCallableStatementDAO ucsDAO;
	
	private UseCallableStatementDAO() {
		
	}
	
	public static UseCallableStatementDAO getInstance() {
		if(ucsDAO == null) {
			ucsDAO = new UseCallableStatementDAO();
			}
		return ucsDAO;
	}
	
	public String insertCpEmp4(CpEmp4VO ceVO) throws SQLException{
		
		String str ="";
		
		Connection con = null;
		CallableStatement cstmt = null;
		
		DbConnection dc = DbConnection.getInstance();
		//1. 드라이버로딩
		try {
		//2. 커넥션얻기
			con = dc.getConnection();
		//3. 프로시저를 호출할 수 있는 객체얻기
			cstmt = con.prepareCall("{ call proc_insert(?,?,?,?,?,?) }");
		//4. 바인드변수에 값 설정
		//in parameter
			cstmt.setInt(1, ceVO.getEmpno());
			cstmt.setString(2, ceVO.getEname());
			cstmt.setInt(3, ceVO.getDeptno());
			cstmt.setString(4, ceVO.getJob());
		//out parameter
			cstmt.registerOutParameter(5, Types.NUMERIC);
			cstmt.registerOutParameter(6, Types.VARCHAR);
		//5. 프로시저실행
			cstmt.execute();
		//6. out parameter에 설정된 값 받기
			int cnt = cstmt.getInt(5); //PL/SQL bind 변수에 저장된 값 얻는 것
			System.out.println("추가된 행 수  : "+cnt);
			str = cstmt.getString(6);
		}finally {
		//7. 연결 끊기
			dc.close(null, cstmt, con);
		}
		return str;
		
	}

	public String updateCpEmp4(CpEmpModifyVO cemVO) throws SQLException{
		String result = "";
		
		Connection con = null;
		CallableStatement cstmt = null;
		
		DbConnection dc = DbConnection.getInstance();
		
		
		//1.
		try {
		//2.
			con = dc.getConnection();
		//3.
			cstmt = con.prepareCall("{ call proc_update(?,?,?,?,?) }");
		//4. 바인드 변수에 값 설정
				//in parameter
				cstmt.setInt(1, cemVO.getEmpno());
				cstmt.setString(2, cemVO.getJob());
				cstmt.setInt(3, cemVO.getDeptno());
				//out parameter
				cstmt.registerOutParameter(4, Types.NUMERIC);
				cstmt.registerOutParameter(5, Types.VARCHAR);
		//5. 프로시저 실행
				cstmt.execute();
		//6. out parameter에 할당된 값 받기
				int cnt = cstmt.getInt(4);
				result = cstmt.getString(5);
				System.out.println(cnt+"건 변경");
		}finally {
		//7.
			dc.close(null, cstmt, con);
		}
		return result;
	}
	
	public String deleteCpEmp(int empno)throws SQLException{
		String result = "";
		
		Connection con =null;
		CallableStatement cstmt = null;
		
		DbConnection dc = DbConnection.getInstance();
		
		//1.
		try {
		//2.
			con = dc.getConnection();
		//3.
			cstmt = con.prepareCall("{ call proc_delete(?,?,?)}");
		//4.
			//in parameter
			cstmt.setInt(1, empno);		
			//out parameter
			cstmt.registerOutParameter(2, Types.NUMERIC);
			cstmt.registerOutParameter(3, Types.VARCHAR);
		//5.
			cstmt.execute();
		//6. out parameter에 설정된 값 받기
			System.out.println(cstmt.getInt(2)+" / 건 삭제");
			result = cstmt.getNString(3);
		}finally {
		//7.
			dc.close(null, cstmt, con);
		}
		return result;
	}
	
	public List<ZipcodeVO> selectZipcode(String dong)throws SQLException{
		List<ZipcodeVO> list = new ArrayList<ZipcodeVO>();
		
		Connection con = null;
		CallableStatement cstmt = null;
		ResultSet rs = null;
		
		DbConnection dc = DbConnection.getInstance();
				
		//1.
		try {
		//2.
			con = dc.getConnection();
		//3.
			cstmt = con.prepareCall("{call proc_zipcode(?, ?) }");
		//4.
			//in parameter
			cstmt.setString(1, dong);
			//out parameter : OracleTypes.CURSOR을 사용
//			cstmt.registerOutParameter(2, Types.REF_CURSOR); //19c 에서는 사용가능
			cstmt.registerOutParameter(2, OracleTypes.CURSOR); //12c까지는 OracleTypes.CURSOR를 사용해야한다.
		//5.
			cstmt.execute();
		//6.
			rs = (ResultSet) cstmt.getObject(2);
			
			ZipcodeVO zVO = null;
			
			while(rs.next()) {
				zVO = new ZipcodeVO(rs.getString("zipcode"), rs.getString("sido"), rs.getString("gugun"), 
						rs.getString("dong"), rs.getString("bunji"));
				list.add(zVO);
			}
			
		}finally {
		//7.
			dc.close(rs, cstmt, con);
		}
		return list;
	}
	
	public static void main(String[] args) {
		try {
			new UseCallableStatementDAO().selectZipcode("상도동");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}//main
