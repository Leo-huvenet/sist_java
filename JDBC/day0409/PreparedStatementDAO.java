package day0409;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.proxy.annotation.Pre;



/**
 * 	Singleton Pattern 도입한 클래스
 * @author user
 */
public class PreparedStatementDAO {
	
	private static PreparedStatementDAO psDAO;
	
	private PreparedStatementDAO() {
		
	}
	
	/**
	 * singleton으로 생성된 instance를 반환하는 메소드
	 * @return 하나의 객체
	 */
	public static PreparedStatementDAO getInstance() {
		if(psDAO == null) {
			psDAO = new PreparedStatementDAO();
		}
		
		return psDAO;
	}
	
	/**
	 * 커넥션 반환하는 일
	 * @return DB와 연결된 Connection
	 */
	private Connection getConnection() throws SQLException {
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
	 * 부서정보를 추가하는 일
	 * @param dVO 부서번호, 부서명, 위치를 가진 VO
	 * @throws SQLException
	 */
	public void insertCpDept(DeptVO dVO)throws SQLException{
		
		Connection con = null;
		PreparedStatement pstmt = null;
		//1. DB Vendeor사에서 배포된 드라이버로딩
		try {
		//2. 로딩된 드라이버를 사용하여 커넥션얻기
			con = getConnection();
		//3. 쿼리문을 할당하여 쿼리문 실행객체 얻기 
			String insertCpDept = "insert into cp_dept(deptno, dname, loc) values(?,?,?)";
			pstmt = con.prepareStatement(insertCpDept);
		//4. 바인드변수에 값 할당
			pstmt.setInt(1, dVO.getDeptno());
			pstmt.setString(2, dVO.getDname());
			pstmt.setString(3, dVO.getLoc());
		//5. 쿼리문을 실행 후 결과를 얻기 
			pstmt.executeUpdate();
		}finally {
		//6. 연결 끊기
			close(null, pstmt, con);
		}
	}
	
	/**
	 * 부서정보를 변경하는 일
	 * 부서번호와 일치하는 부서명과 위치를 변경합니다.
	 * @param dVO
	 * @return
	 * @throws SQLException
	 */
	public int updateCpDept(DeptVO dVO)throws SQLException{
		int cnt = 0;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		//1. 드라이버 로딩
		try {
		//2. 커넥션 얻기
			con = getConnection();
		//3. 쿼리문 생성객체 얻기
			StringBuilder updateCpDept = new StringBuilder();
			updateCpDept
			.append("	update cp_dept	")
			.append("   set 	dname=?, loc=? ")
			.append("	where deptno =?	");
			
			pstmt = con.prepareStatement(updateCpDept.toString());			
		//4. 바인드에 변수에 값 할당
			pstmt.setString(1, dVO.getDname());
			pstmt.setString(2, dVO.getLoc());
			pstmt.setInt(3, dVO.getDeptno());
		//5. 쿼리문 실행 후 결과 얻기
			cnt = pstmt.executeUpdate();
			
		}finally {
		//6. 연결끊기
			close(null, pstmt, con);
		}		
		return cnt;
	}
	
	/**
	 * 부서번호를 입력받아 부서정보를 삭제하는 일
	 * @param deptno 삭제할 부서번호
	 * @return 
	 * @throws SQLException
	 */
	public int deleteCpDept(int deptno)throws SQLException{
		int cnt = 0;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		//1.드라이버로딩	
		try {
		//2.커넥션얻기
		con = getConnection();
		//3.쿼리문 생성객체 얻기
		String deleteCpDept = "delete from cp_dept where deptno = ?";
		pstmt = con.prepareStatement(deleteCpDept);
		//4.바인드변수에 값 설정
		pstmt.setInt(1, deptno);
		//5.쿼리문 수행 후 결과 얻기
		cnt = pstmt.executeUpdate();
		}finally {
		//6.연결 끊기
			close(null, pstmt, con);
		}
		return cnt;
	}
	
	/**
	 * 모든 부서정보 조회
	 * @return
	 * @throws SQLException
	 */
	public List<DeptVO> selectAllCpDept()throws SQLException{
		List<DeptVO> list = new ArrayList<DeptVO>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//1. 드라이버로딩
		try {
		//2. 커넥션얻기
			con = getConnection();
		//3. 쿼리문생성객체 얻기
			String selectCpDept = "select deptno,dname,loc from cp_dept";
			pstmt = con.prepareStatement(selectCpDept);
		//4. 바인드변수에 값 할당
		//5. 쿼리문 수행 후 결과 얻기
			rs = pstmt.executeQuery();
			//ResetSet은 cursor의 제어권을 받고, DBMS의 데이터형과 Java 데이터 형이 다르므로 데이터 형을 변환하는 일
			
			DeptVO dVO = null;
			
			while(rs.next()) {
				//조회된 컬럼값을 VO에 할당
				dVO = new DeptVO(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
				//생성된 VO(레코드 값을 가지고 있음)를 List에 추가
				list.add(dVO);
			}
			
		}finally {
		//6. 연결 끊기
			close(rs, pstmt, con);
		}
		
		
		
		
		
		return list;
	}
	
	/**
	 * 부서번호를 입력받아 하나의 부서정보를 조회하는 일
	 * @param deptno 조회할 부서번호
	 * @return 
	 */
	public DeptOneVO selectOneCpDept(int deptno)throws SQLException{
		DeptOneVO doVO = null;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//1. 드라이버로딩
		try {
		//2. 커넥션얻기
			con = getConnection();
		//3. 쿼리문 생성객체 얻기
			StringBuilder selectCpDept = new StringBuilder();
			selectCpDept
			.append("	select dname, loc	")
			.append("	from	cp_dept 		")
			.append("	where	 deptno = ? ");
			
			pstmt = con.prepareStatement(selectCpDept.toString());
		//4. 바인드 변수에 값 설정
			pstmt.setInt(1, deptno);
		//5. 쿼리문 수행 후 결과 얻기
			rs = pstmt.executeQuery();
			
			if(rs.next()) {//조회결과가 있다면 
				doVO = new DeptOneVO(rs.getString("dname"), rs.getString("loc"));
			}
		}finally {
		//6. 연결 끊기
			close(rs, pstmt, con);
		}
		return doVO;
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
