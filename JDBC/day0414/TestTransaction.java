package day0414;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *	tset_trigger1 ���̺�� test_trigger2���̺� ��� insert�� �����ϸ� transaction�� �Ϸ�Ǵ� �ڵ�.
 * @author user
 */
public class TestTransaction {

	private Connection con ;
	
	
	/**
	 * ������ �۾�
	 * @param name
	 * @param age
	 * @return
	 * @throws SQLException
	 */
	public int insert(String name, int age)throws SQLException {
		int cnt = 0; //test_trigger1 ���̺��� ���� ���� �� 
		int cnt2 = 0; //test_trigger2 ���̺��� ���� ���� ��
		
		
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
		//2. Ŀ�ؼǾ��
		con = DriverManager.getConnection(url,id,pass);
		//3. autocommit����
		con.setAutoCommit(false);
		//4. ������ ���ఴü ���
		String sql = "insert into test_trigger1(name,age) values(?,?)";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setInt(2, age);		
		//5. ������ ���� �� ��� ���
		cnt = pstmt.executeUpdate();
		
		//4. ������ ���ఴü ���
		String sql2 = "insert into test_trigger2(name,age) values(?,?)";
		pstmt2 = con.prepareStatement(sql2);
		pstmt2.setString(1, name);
		pstmt2.setInt(2, age);		
		//5. ������ ���� �� ��� ���
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
	 * ������ ����ϴ� ����ó��
	 * Ŀ�ؼ� ����, commit, rollback�� ����
	 */
	public void add() {
		//DB���� method ȣ�� ��� �ޱ�
		//�����ϴ� �������� Ƚ���� ���Դٸ� commit �׷��� �ʴٸ� rollback����
		//�������
		try {
			int totalCnt = insert("���μ�������", 25);
			if( totalCnt ==2) {
				con.commit();
				System.out.println("�������� Ʈ�����ó�� : �������̺� ��� ���ڵ尡 �߰��Ǿ����ϴ�.");
			}
			//update�� delete�� ��� else�� rollback�� �����ϰ�
		} catch (SQLException e) {
			try {
				con.rollback(); //insert�� ��� catch���� rollback����
				System.out.println("�� �������� Ʈ�����ó�� : �������̺� ������ �����ߴ��� ��� �߰��۾��� ��ҵǾ����ϴ�.");
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
