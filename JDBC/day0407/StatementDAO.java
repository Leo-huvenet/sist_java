package day0407;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



/**
 *	DBMS의 작업에 관련된 코드를 정의하는 클래스
 *	쿼리문에 대한 작업만 정의
 * @author user
 */
public class StatementDAO {
	
	/**
	 * cp_emp4 테이블에 VO의 값을 추가하는 일
	 *  추가성공아니면 예외상황 둘 중 하나의 결과 도출
	 * @param eVO 사원번호, 사원명, 부서번호, 직무를 가진 VO
	 * @throws SQLException 
	 */
	public void insertCpEmp4(EmpVO eVO) throws SQLException {
		//1. 드라이버로딩 (ojdbc8.jar)
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}//end catch
		
		//2. 커넥션얻기
		String url ="jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pass = "tiger";
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			 con = DriverManager.getConnection(url,id,pass);
 		//3. 쿼리문생성객체 얻기
			 stmt = con.createStatement(); 
		//4. 쿼리문 수행 후 결과 얻기
			String insertCpEmp = 
				"insert into cp_emp4(empno,ename,deptno,job,hiredate)values("+eVO.getEmpno()+",'"+eVO.getEname()+"',"+eVO.getDeptno()+",'"+eVO.getJob()+"',sysdate)";
			 int cnt = stmt.executeUpdate(insertCpEmp);
			
			System.out.println(cnt+"건 추가"); 
			
		}finally {
		//5. 연결 끊기. 반드시 실행되어야하기 때문에 finally블럭에서 구현
			if(stmt != null) {stmt.close();}
			if(con != null) {con.close();}	
		}
		
		
	}

	/**
	 * 사원번호, 사원명, 부서번호, 직무를 입력받아 사원번호에 해당하는 사원정보를 
	 * 변경하는 일
	 * @param eVO 변경할 사원정보
	 * @return 변경된 행의 수
	 * @throws SQLException 
	 */
	public int updateCpEmp4(EmpVO eVO) throws SQLException {
		int cnt = 0;
		//1. 드라이버로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null;
		Statement stmt = null;
		
		try {
		//2. Connection얻기
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "scott";
			String pass = "tiger";
			
			con = DriverManager.getConnection(url,id,pass);
			
		//3. 쿼리문 생성객체 얻기
			stmt = con.createStatement();
		//4. 쿼리문 수행 후 결과 얻기
//			String updateCpEmp = "update cp_emp4 set ename='"+eVO.getEname()
//				+"',deptno="+eVO.getDeptno()+",job='"+eVO.getJob()+"'where empno ="+
//					eVO.getEmpno();
			StringBuilder updateCpEmp = new StringBuilder();
			updateCpEmp
			.append("update cp_emp4")
			.append(" set ename='").append(eVO.getEname())
			.append("',deptno=").append(eVO.getDeptno()).append(",job='").append(eVO.getJob())
			.append("' where empno =").append(eVO.getEmpno());
			
			System.out.println(updateCpEmp);
			
			cnt = stmt.executeUpdate(updateCpEmp.toString());
			
		}finally {
		//5. 연결 종료
				if( stmt != null ) { stmt.close(); }
				if( con != null) { con.close(); }
		}
		return cnt;
	}
	
	public int deleteCpEmp4(int empno) throws SQLException {
		int cnt = 0;
		//1. 드라이버로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null;
		Statement stmt = null;
		
		//2. Connection얻기
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "scott";
			String pass = "tiger";
			
			con = DriverManager.getConnection(url,id,pass);
			
		//3. 쿼리문 생성객체 얻기
			stmt = con.createStatement();
			
		//4. 쿼리문 수행 후 결과 얻기
			String deleteCpEmp = "delete from cp_emp4 where empno="+empno;
			cnt = stmt.executeUpdate(deleteCpEmp);
			//executeUpdate : 수행결과로 Int 타입의 값을 반환
			//SELECT 구문을 제외한 다른 구문을 수행할 때 사용되는 함수
			//INSERT / DELETE / UPDATE 관련 구문에서는 반영된 레코드의 건수를 반환합니다
			//CREATE / DROP 관련 구문에서는 -1 을 반환합니다.
			
		}finally {
		//5. 연결 끊기
			if( stmt != null ) { stmt.close(); }
			if( con != null) { con.close(); }	
		}
		return cnt;
	}
	
	public List<EmpAllVO> selectAllCpEmp4() throws SQLException{
		List<EmpAllVO> list = new ArrayList<EmpAllVO>();
		
		//1. 드라이버로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		//ResetSet은 cursor의 제어권을 받고, DBMS의 데이터형과 Java 데이터 형이 다르므로 데이터 형을 변환하는 일
		try {
		//2. 커넥션얻기
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pass = "tiger";
		
		con = DriverManager.getConnection(url,id,pass);
		
		//3. 쿼리문생성객체 얻기
		stmt = con.createStatement();
		//Statement 객체는 Statement 인터페이스를 구현한 객체를 Connection 클래스의 createStatement( ) 메소드를 호출함으로써 얻어진다.
		
		//4. 쿼리문 수행 후 결과 얻기
		
		String selectCpEmp = "select empno,ename,deptno,job,to_char(hiredate,'yyyy-mm-dd') hiredate from cp_emp4";
		
		rs = stmt.executeQuery(selectCpEmp);
		//Statement 객체가 생성되면 executeQuery( ) 메소드를 호출하여 SQL문을 실행시킬 수 있다. 메소드의 인수로 SQL문을 담은 String객체를 전달한다.
		//Statement는 정적인 쿼리문을 처리할 수 있다. 즉 쿼리문에 값이 미리 입력되어 있어야 한다.


		
		EmpAllVO eaVO = null;
		
		while(rs.next()) {//레코드 포인터가 존재하는 행 다음 행이 존재하는 지?
			//cursor 가 위치한 레코드의 컬럼 값을 가져와서 변수에 저장(나눠진 값)
		    //컬럼명을 사용하여 조회 쿼리의 값 얻기
		
			eaVO = new EmpAllVO(rs.getInt("empno"), rs.getString("ename"),rs.getInt("deptno"),rs.getString("job"), rs.getString("hiredate"));
			
		//컬럼의 인덱스를 사용하여 값 얻기 ( 처음 나온 컬럼의 인덱스는 1번으로 시작한다 )
//			empno = rs.getInt(1);
//			ename = rs.getString(2);
//			deptno = rs.getInt(3);
//			job = rs.getString(4);
//			hiredate = rs.getString(5);
			
			//나뉘어진 값을 사용상의 편의를 위해 VO로 묵어서 저장(조회된 한 행의 레코드가 저장)
			//n개의 행을 하나로 묶어서 저장하기위해 List에 추가
			list.add(eaVO);	
							 }
			}finally {
				//5. 연결 끊기
				if(rs != null) {rs.close();}
				if(stmt != null) {stmt.close();}
				if(con != null) {con.close();}
			}
		return list;
	}
	
	public EmpOneVO selectOneCpEmp4(int empno) throws SQLException {
		EmpOneVO eoVO = null;
		
		//1. 드라이버로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
		//2. 커넥션얻기
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "scott";
			String pass = "tiger";
			
			con = DriverManager.getConnection(url,id,pass);
		//3. 쿼리문 생성객체 얻기
			stmt = con.createStatement();
		//4. 쿼리문 수행 후 결과 얻기
			StringBuilder selectCpEmp = new StringBuilder();
			//Date 데이터형을 to_char함수를 사용하지 않고 그대로 조회 
			//사용자가 원하는 날짜형식을 자바에서 처리해야한다.
			selectCpEmp
			.append("select ename, deptno, job, hiredate from cp_emp4 where empno = ")
			.append(empno);
			
			rs = stmt.executeQuery(selectCpEmp.toString());
			
			if(rs.next()) {// 조회된 레코드가 존재할 때
				eoVO = new EmpOneVO(rs.getString("ename"),rs.getInt("deptno"),rs.getString("job"),
						rs.getDate("hiredate"));
			}
			
		}finally {
		//5. 연결 끊기
			if(rs != null) {rs.close();}
			if(stmt != null) {stmt.close();}
			if(con != null) {con.close();}
		}
		return eoVO;
	}
	
	
	public static void main(String[] args) {
		StatementDAO s = new StatementDAO();
//		try {
//			s.updateCpEmp4(new EmpVO(1212,"김사원",20,"대리"));
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		try {
			s.selectAllCpEmp4();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
}

