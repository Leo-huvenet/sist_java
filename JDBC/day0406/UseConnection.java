package day0406;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UseConnection {
	
	public UseConnection() {
		//1. Driver 로딩
		try {
			//외부 Driver(배포된 jar)를 Eclipse에서 인식하도록 만들려면 build path를 설정해야한다.
			//외부 Driver(배포된 jar)를 실행중인 JDK에서 인식하도록 만들려면 classpath를 설정해야한다.			
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//2. 로딩된 드라이버를 사용하여 Connection얻기
		//tnsnames를 변경하기 전까지는 ip address로 접속할 수 없다.
		String url ="jdbc:oracle:thin:@211.63.89.137:1521:orcl";
		//String url ="jdbc:oracle:thin:@localhost:1521:orcl";
		String id ="scott";
		String pass ="tiger";
		
		try {
			Connection con = DriverManager.getConnection(url, id, pass);
			System.out.println("DB연동성공 : "+con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}//UseConnection

	public static void main(String[] args) {
		new UseConnection();
	}

}
