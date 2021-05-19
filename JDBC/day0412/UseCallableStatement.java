package day0412;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import kr.co.sist.dao.DbConnection;

public class UseCallableStatement {

	public UseCallableStatement() throws SQLException{
		
		Connection con = null;
		CallableStatement cstmt = null;
		
		DbConnection dc = DbConnection.getInstance();
		//1. 드라이버로딩
		try {
		//2. 커넥션얻기
			con = dc.getConnection();
		//3. 쿼리문 생성객체 얻기
			cstmt = con.prepareCall("{ call proc_plus( ?, ?, ?, ?) }");
		//4. 바인드변수에 값 할당
		//in parameter
			cstmt.setInt(1, 4);
			cstmt.setInt(2, 12);
		//out parameter
			cstmt.registerOutParameter(3, Types.NUMERIC);
			cstmt.registerOutParameter(4, Types.VARCHAR);
		//5. 프로시저 실행
			cstmt.execute();
		//6. out parameter에 설정된 값 얻기
			int sum = cstmt.getInt(3);
			String msg = cstmt.getString(4);
			
			System.out.println(sum + " / "+ msg);
		}finally {
		//7. 연결 끊기
			//PreparedStatement는 CallableStatement의 부모이기 때문에 자식인
			//CallableStatement를 받을 수 있다.
		dc.close(null, cstmt, con);
		}
	}

	public static void main(String[] args) {
		try {
			new UseCallableStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
