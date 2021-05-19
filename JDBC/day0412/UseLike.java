package day0412;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import kr.co.sist.dao.DbConnection;

/**
 *	car_model테이블에서 입력한 옵션을 가지고 있는 차량의 모델명, 가격, 옵션, 년식을 조회
 * @author user
 */
public class UseLike {
	public UseLike()throws SQLException{
		String option = JOptionPane.showInputDialog("옵션입력");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		DbConnection dc = DbConnection.getInstance();
		//1. 드라이버로딩
		try{
		//2. 커넥션얻기
			con = dc.getConnection();
		//3. 쿼리문 생성객체 얻기
			String selectCar
//			="select model, price, car_option, car_year from car_model where car_option like %?%";
			="select model, price, car_option, car_year from car_model where car_option like '%'||?||'%'";
			
			pstmt = con.prepareStatement(selectCar);
			//4. 바인드 변수에 값 설정
			pstmt.setString(1, option);
		//5. 쿼리문 수행 후 결과 얻기
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("model")+" / "+rs.getInt("price")+" / "+
						rs.getString("car_option")+" / "+rs.getString("car_year"));
			}
			
		}finally {
		//6. 연결 끊기	
		dc.close(rs, pstmt, con);
		}
			
	}

	
	public static void main(String[] args) {
		try {
			new UseLike();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
