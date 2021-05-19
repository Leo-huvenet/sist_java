package day0407;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JOptionPane;

/**
 *	DBMS����ó���� �ϴ� DAOŬ������ ����ϴ� Ŭ������ ���������� �����ϴ� ����
 *	�ַ��ϴ� Ŭ����
 *	Ŭ�������� �ַ� Service �Ǵ� Process�� �پ ���������.
 * @author user
 */
public class UseStatementDAO {
	
	private StatementDAO sDAO;
	
	public UseStatementDAO() 
	{
		sDAO = new StatementDAO();
	}
	
	private void addCpEmp() {
		EmpVO eVO = new EmpVO(431,"������",10,"����");
		
		try {
			sDAO.insertCpEmp4(eVO);//method�� ���ܸ� �߻���Ű�� ������ �������
			JOptionPane.showMessageDialog(null, eVO.getEmpno()+"�� ��������� �߰��Ǿ����ϴ�.");
		} catch (SQLException se) {
			se.printStackTrace();
//			System.out.println(se.getErrorCode()+" / "+ se.getMessage()+" / "+se.getSQLState());
			String errMsg ="";
			if(se.getErrorCode() == 1) {
				errMsg = "�����ȣ�� �̹� �����ϴ� �κ�";
			}
			if(se.getErrorCode() == 1438) {
				errMsg = "�����ȣ�� �Ǵ� �μ���ȣ�� �ʰ��� �κ�. �����ȣ 4�ڸ�, �μ���ȣ 2�ڸ�";
			}
			if(se.getErrorCode() == 12899) {
				errMsg = "����� �Ǵ� ������ �ʰ��� �κ�. ����� �ѱ� 3�ڸ� �Ǵ� ���� 10��, ���� �ѱ�3�� ���� 9��";	
			}
			JOptionPane.showMessageDialog(null, errMsg);
		}
	}
	
	private void modifyCpEmp() {
		EmpVO eVO = new EmpVO(431, "������", 30, "����");
		try {
			int cnt = sDAO.updateCpEmp4(eVO);
			String msg = eVO.getEmpno()+"�� ����� �������� �ʽ��ϴ�.";
			if(cnt == 1) {
				msg = eVO.getEmpno()+"�� ��������� ����Ǿ����ϴ�.";
			}
			
			JOptionPane.showMessageDialog(null, msg);
			
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "���񽺰� �������� ����");
		}
	}
	
	private void removeCpEmp() {
		int empno = 431; 
		
		try {
			int cnt = sDAO.deleteCpEmp4(empno);
			StringBuilder resultMsg = new StringBuilder();
			resultMsg.append(empno);
			if(cnt == 1) {
				resultMsg.append("�� ��������� �����Ǿ����ϴ�.");
			}else {
				resultMsg.append("�� ����� �������� �ʽ��ϴ�.");				
			}
			JOptionPane.showMessageDialog(null, resultMsg);
		} catch (SQLException e) {
			e.printStackTrace();
			//������ �߸��Ȱ��. DB�� ������ �ȵǴ� ���.
			JOptionPane.showMessageDialog(null, "���񽺰� ��Ȱ���� ���մϴ�.");
		}
	}
	
	private void searchAllCpEmp() {
		//��ȸ�� ����� �ϳ��� List�� ��� ����Ǿ������Ƿ� List�� �޾Ƽ� ����Ѵ�.
		try {
		List<EmpAllVO> list =	sDAO.selectAllCpEmp4(); //��ȯ ���� ����Ʈ
		
		if(list.isEmpty()) {
			System.out.println("��������� �������� �ʽ��ϴ�.");
		}
		
		EmpAllVO eaVO = null;
		for(int i = 0; i < list.size(); i++) {
			eaVO = list.get(i);
			System.out.println(eaVO.getEmpno()+" / "+ eaVO.getEname()+" / "+
			eaVO.getDeptno()+" / "+eaVO.getJob()+" / "+eaVO.getHiredate());
		}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void searchOneCpEmp() {
		
		int empno = 1234;
		
		EmpOneVO eoVO = null;
	
			try {
				eoVO = sDAO.selectOneCpEmp4(empno);
			if(eoVO == null) {//�����ȣ�� ��ȸ�� ���ڵ尡 ����
				System.out.println(empno + "�� ����� �������� �ʽ��ϴ�.");
			}else {//�����ȣ�� ��ȸ�� ���ڵ� ����
				SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yy EEEE");
				
				System.out.println(eoVO.getEname()+" / "+ eoVO.getDeptno()+" / "+eoVO.getJob()
				+" / "+sdf.format(eoVO.getHiredate()));
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	}

	public static void main(String[] args) {
		UseStatementDAO usDAO = new UseStatementDAO();
//		usDAO.addCpEmp();
//		usDAO.modifyCpEmp();
//		usDAO.removeCpEmp();
		usDAO.searchAllCpEmp();
//		usDAO.searchOneCpEmp();
	}

}
