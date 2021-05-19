package day0414;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *	tset_trigger1 테이블과 test_trigger2테이블에 모두 insert가 성공하면 transaction이 완료되는 코드.
 * @author user
 */
public class TestTransaction {

	private Connection con ;
	
	
	/**
	 * 쿼리를 작업
	 * @param name
	 * @param age
	 * @return
	 * @throws SQLException
	 */
	public int insert(String name, int age)throws SQLException {
		int cnt = 0; //test_trigger1 테이블의 쿼리 수행 수 
		int cnt2 = 0; //test_trigger2 테이블의 쿼리 수행 수
		
		
		//1.
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pass = "tiger";
		
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		
//		try {
		//2. 커넥션얻기
		con = DriverManager.getConnection(url,id,pass);
		//3. autocommit해제
		con.setAutoCommit(false);
		//4. 쿼리문 수행객체 얻기
		String sql = "insert into test_trigger1(name,age) values(?,?)";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setInt(2, age);		
		//5. 쿼리문 수행 후 결과 얻기
		cnt = pstmt.executeUpdate();
		
		//4. 쿼리문 수행객체 얻기
		String sql2 = "insert into test_trigger2(name,age) values(?,?)";
		pstmt2 = con.prepareStatement(sql2);
		pstmt2.setString(1, name);
		pstmt2.setInt(2, age);		
		//5. 쿼리문 수행 후 결과 얻기
		cnt2 = pstmt2.executeUpdate();
		
//		if(cnt == 1 && cnt2 == 1) {
//			con.commit();
//		}else {
//			con.rollback();
//		}
//				
//		}finally {
//			if(con != null) { con.close(); }			
//		}
		return cnt+cnt2;
	}
	
	/**
	 * 쿼리를 사용하는 업무처리
	 * 커넥션 끊기, commit, rollback을 수행
	 */
	public void add() {
		//DB업무 method 호출 결과 받기
		//목적하는 쿼리수행 횟수가 나왔다면 commit 그렇지 않다면 rollback수행
		//연결끊기
		try {
			int totalCnt = insert("강인섭곽범수", 25);
			if( totalCnt ==2) {
				con.commit();
				System.out.println("정상적인 트랜잭션처리 : 양쪽테이블에 모두 레코드가 추가되었습니다.");
			}
			//update나 delete인 경우 else로 rollback을 수행하고
		} catch (SQLException e) {
			try {
				con.rollback(); //insert인 경우 catch에서 rollback수행
				System.out.println("비 정상적인 트랜잭션처리 : 한쪽테이블에 쿼리가 성공했더라도 모든 추가작업이 취소되었습니다.");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			if(con != null) 
			{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
					}
				}
			}
		}
	
	public static void main(String[] args) {
		TestTransaction tt = new TestTransaction();

			tt.add();
	
		
		
	}

}
