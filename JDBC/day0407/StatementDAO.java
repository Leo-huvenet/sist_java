package day0407;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



/**
 *	DBMS�� �۾��� ���õ� �ڵ带 �����ϴ� Ŭ����
 *	�������� ���� �۾��� ����
 * @author user
 */
public class StatementDAO {
	
	/**
	 * cp_emp4 ���̺� VO�� ���� �߰��ϴ� ��
	 *  �߰������ƴϸ� ���ܻ�Ȳ �� �� �ϳ��� ��� ����
	 * @param eVO �����ȣ, �����, �μ���ȣ, ������ ���� VO
	 * @throws SQLException 
	 */
	public void insertCpEmp4(EmpVO eVO) throws SQLException {
		//1. ����̹��ε� (ojdbc8.jar)
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}//end catch
		
		//2. Ŀ�ؼǾ��
		String url ="jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pass = "tiger";
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			 con = DriverManager.getConnection(url,id,pass);
 		//3. ������������ü ���
			 stmt = con.createStatement(); 
		//4. ������ ���� �� ��� ���
			String insertCpEmp = 
				"insert into cp_emp4(empno,ename,deptno,job,hiredate)values("+eVO.getEmpno()+",'"+eVO.getEname()+"',"+eVO.getDeptno()+",'"+eVO.getJob()+"',sysdate)";
			 int cnt = stmt.executeUpdate(insertCpEmp);
			
			System.out.println(cnt+"�� �߰�"); 
			
		}finally {
		//5. ���� ����. �ݵ�� ����Ǿ���ϱ� ������ finally������ ����
			if(stmt != null) {stmt.close();}
			if(con != null) {con.close();}	
		}
		
		
	}

	/**
	 * �����ȣ, �����, �μ���ȣ, ������ �Է¹޾� �����ȣ�� �ش��ϴ� ��������� 
	 * �����ϴ� ��
	 * @param eVO ������ �������
	 * @return ����� ���� ��
	 * @throws SQLException 
	 */
	public int updateCpEmp4(EmpVO eVO) throws SQLException {
		int cnt = 0;
		//1. ����̹��ε�
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null;
		Statement stmt = null;
		
		try {
		//2. Connection���
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "scott";
			String pass = "tiger";
			
			con = DriverManager.getConnection(url,id,pass);
			
		//3. ������ ������ü ���
			stmt = con.createStatement();
		//4. ������ ���� �� ��� ���
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
		//5. ���� ����
				if( stmt != null ) { stmt.close(); }
				if( con != null) { con.close(); }
		}
		return cnt;
	}
	
	public int deleteCpEmp4(int empno) throws SQLException {
		int cnt = 0;
		//1. ����̹��ε�
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null;
		Statement stmt = null;
		
		//2. Connection���
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "scott";
			String pass = "tiger";
			
			con = DriverManager.getConnection(url,id,pass);
			
		//3. ������ ������ü ���
			stmt = con.createStatement();
			
		//4. ������ ���� �� ��� ���
			String deleteCpEmp = "delete from cp_emp4 where empno="+empno;
			cnt = stmt.executeUpdate(deleteCpEmp);
			//executeUpdate : �������� Int Ÿ���� ���� ��ȯ
			//SELECT ������ ������ �ٸ� ������ ������ �� ���Ǵ� �Լ�
			//INSERT / DELETE / UPDATE ���� ���������� �ݿ��� ���ڵ��� �Ǽ��� ��ȯ�մϴ�
			//CREATE / DROP ���� ���������� -1 �� ��ȯ�մϴ�.
			
		}finally {
		//5. ���� ����
			if( stmt != null ) { stmt.close(); }
			if( con != null) { con.close(); }	
		}
		return cnt;
	}
	
	public List<EmpAllVO> selectAllCpEmp4() throws SQLException{
		List<EmpAllVO> list = new ArrayList<EmpAllVO>();
		
		//1. ����̹��ε�
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		//ResetSet�� cursor�� ������� �ް�, DBMS�� ���������� Java ������ ���� �ٸ��Ƿ� ������ ���� ��ȯ�ϴ� ��
		try {
		//2. Ŀ�ؼǾ��
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pass = "tiger";
		
		con = DriverManager.getConnection(url,id,pass);
		
		//3. ������������ü ���
		stmt = con.createStatement();
		//Statement ��ü�� Statement �������̽��� ������ ��ü�� Connection Ŭ������ createStatement( ) �޼ҵ带 ȣ�������ν� �������.
		
		//4. ������ ���� �� ��� ���
		
		String selectCpEmp = "select empno,ename,deptno,job,to_char(hiredate,'yyyy-mm-dd') hiredate from cp_emp4";
		
		rs = stmt.executeQuery(selectCpEmp);
		//Statement ��ü�� �����Ǹ� executeQuery( ) �޼ҵ带 ȣ���Ͽ� SQL���� �����ų �� �ִ�. �޼ҵ��� �μ��� SQL���� ���� String��ü�� �����Ѵ�.
		//Statement�� ������ �������� ó���� �� �ִ�. �� �������� ���� �̸� �ԷµǾ� �־�� �Ѵ�.


		
		EmpAllVO eaVO = null;
		
		while(rs.next()) {//���ڵ� �����Ͱ� �����ϴ� �� ���� ���� �����ϴ� ��?
			//cursor �� ��ġ�� ���ڵ��� �÷� ���� �����ͼ� ������ ����(������ ��)
		    //�÷����� ����Ͽ� ��ȸ ������ �� ���
		
			eaVO = new EmpAllVO(rs.getInt("empno"), rs.getString("ename"),rs.getInt("deptno"),rs.getString("job"), rs.getString("hiredate"));
			
		//�÷��� �ε����� ����Ͽ� �� ��� ( ó�� ���� �÷��� �ε����� 1������ �����Ѵ� )
//			empno = rs.getInt(1);
//			ename = rs.getString(2);
//			deptno = rs.getInt(3);
//			job = rs.getString(4);
//			hiredate = rs.getString(5);
			
			//�������� ���� ������ ���Ǹ� ���� VO�� ��� ����(��ȸ�� �� ���� ���ڵ尡 ����)
			//n���� ���� �ϳ��� ��� �����ϱ����� List�� �߰�
			list.add(eaVO);	
							 }
			}finally {
				//5. ���� ����
				if(rs != null) {rs.close();}
				if(stmt != null) {stmt.close();}
				if(con != null) {con.close();}
			}
		return list;
	}
	
	public EmpOneVO selectOneCpEmp4(int empno) throws SQLException {
		EmpOneVO eoVO = null;
		
		//1. ����̹��ε�
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
		//2. Ŀ�ؼǾ��
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "scott";
			String pass = "tiger";
			
			con = DriverManager.getConnection(url,id,pass);
		//3. ������ ������ü ���
			stmt = con.createStatement();
		//4. ������ ���� �� ��� ���
			StringBuilder selectCpEmp = new StringBuilder();
			//Date ���������� to_char�Լ��� ������� �ʰ� �״�� ��ȸ 
			//����ڰ� ���ϴ� ��¥������ �ڹٿ��� ó���ؾ��Ѵ�.
			selectCpEmp
			.append("select ename, deptno, job, hiredate from cp_emp4 where empno = ")
			.append(empno);
			
			rs = stmt.executeQuery(selectCpEmp.toString());
			
			if(rs.next()) {// ��ȸ�� ���ڵ尡 ������ ��
				eoVO = new EmpOneVO(rs.getString("ename"),rs.getInt("deptno"),rs.getString("job"),
						rs.getDate("hiredate"));
			}
			
		}finally {
		//5. ���� ����
			if(rs != null) {rs.close();}
			if(stmt != null) {stmt.close();}
			if(con != null) {con.close();}
		}
		return eoVO;
	}
	
	
	public static void main(String[] args) {
		StatementDAO s = new StatementDAO();
//		try {
//			s.updateCpEmp4(new EmpVO(1212,"����",20,"�븮"));
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

