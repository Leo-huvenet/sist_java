package day0413;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.dao.DbConnection;

public class Work0412DAO {
	private static Work0412DAO wDAO;
	
	private Work0412DAO() {
		
	}
	
	public static Work0412DAO getInstance() {
		if( wDAO == null) {
			wDAO = new Work0412DAO();
		}
		return wDAO;
	}
	
	public List<WorkAllVO> selectAllWork()throws SQLException{
		List<WorkAllVO> list = new ArrayList<WorkAllVO>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		DbConnection dc = DbConnection.getInstance();
		//1.
		try {
		//2.
			con = dc.getConnection();
		//3.
			String selectWork = "select num, name, age, addr from work12 order by num";
			pstmt = con.prepareStatement(selectWork);
		//4.
			 //바인드변수가 없으므로 pass
		//5.
			rs = pstmt.executeQuery();
			
			WorkAllVO waVO = null;
			while(rs.next()) {
				//커서가 존재하는 레코드위치에 컬럼값을 받아와서 VO설정
				waVO = new WorkAllVO(rs.getInt("num"), rs.getString("name"), 
						rs.getInt("age"), rs.getString("addr"));
				//레코드의 정보를 가진 VO를 list에 추가
				list.add(waVO);
			}
		}finally {
		//6.
			dc.close(rs, pstmt, con);
		}
		return list;
	}
	
	public void insertWork(WorkAddVO waVO)throws SQLException{
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		DbConnection dc = DbConnection.getInstance();
		//1.
		try {
		//2.
			con = dc.getConnection();
		//3.
			String insertWork = "insert into work12(num,name,age,addr)values(seq_work.nextval,?,?,?)";
			pstmt=con.prepareStatement(insertWork);
		//4.
			pstmt.setString(1, waVO.getName());
			pstmt.setInt(2, waVO.getAge());
			pstmt.setString(3, waVO.getAddr());
		//5.
			pstmt.executeUpdate();
		}finally {
		//6.
			dc.close(null, pstmt, con);
		}
	}
	
	public int deleteWork(int num)throws SQLException{
		int cnt = 0;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		DbConnection dc = DbConnection.getInstance();
		//1.드라이버로딩	
		try {
		//2.커넥션얻기
		con = dc.getConnection();
		//3.쿼리문 생성객체 얻기
		String deleteWork = "delete from work12 where num = ?";
		pstmt = con.prepareStatement(deleteWork);
		//4.바인드변수에 값 설정
		pstmt.setInt(1, num);
		//5.쿼리문 수행 후 결과 얻기
		cnt = pstmt.executeUpdate();
		}finally {
		//6.연결 끊기
			dc.close(null, pstmt, con);
		}
		return cnt;
	}
	
	public int updateWork(WorkAllVO wVO)throws SQLException{
		int cnt = 0;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		DbConnection dc = DbConnection.getInstance();
		
		//1. 드라이버 로딩
		try {
		//2. 커넥션 얻기
			con = dc.getConnection();
		//3. 쿼리문 생성객체 얻기
			StringBuilder updateWork = new StringBuilder();
			updateWork
			.append("	update work12		")
			.append("   set 	  name=?, age=?, addr=?")
			.append("	where  num =?	");
			
			pstmt = con.prepareStatement(updateWork.toString());			
		//4. 바인드에 변수에 값 할당
			pstmt.setString(1,  wVO.getName());
			pstmt.setInt(2, wVO.getAge());
			pstmt.setString(3, wVO.getAddr());
			pstmt.setInt(4, wVO.getNum());
		//5. 쿼리문 실행 후 결과 얻기
			cnt = pstmt.executeUpdate();
			
		}finally {
		//6. 연결끊기
			dc.close(null, pstmt, con);
		}		
		return cnt;
	}

	
	
}//class
