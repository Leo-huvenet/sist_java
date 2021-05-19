package day0409;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class RunPreparedStatementDAO {

	public void selectMenu() {
		boolean exitFlag = false;
		String menu = "�μ�����\n 1.�μ��Է� 2.�μ����� 3.�μ����� 4.���μ���ȸ 5. Ư���μ���ȸ 6. ����";
		String inputMenu ="";
		do {
			
			inputMenu = JOptionPane.showInputDialog(menu);
			
			switch (inputMenu) {
			case "1": addCpDept(); break;
			case "2": modifyCpDept(); break;
			case "3": removeCpDept(); break;
			case "4": searchAllCpDept(); break;
			case "5": searchOneCpDept(); break;
			case "6": exitFlag = true; break;
			default : 
				JOptionPane.showMessageDialog(null, "�޴��� ��ȣ�� 1~6������ �Է�");
			}
			
		}while(!exitFlag);
	}
	
	public void addCpDept() {
		String inputData 
			= JOptionPane.showInputDialog("�μ������߰�\n�Է� ��)�μ���ȣ,�μ���,��ġ\n�� �������� �Է�");
		
		String[] tempData = inputData.replaceAll(" ","").split(",");
		
		if(tempData.length != 3) {
			JOptionPane.showMessageDialog(null, "�Է� ������ ������ �ùٸ��� �ʽ��ϴ�. \n��)�μ���ȣ,�μ���,��ġ");
			//��ȯ���� void�� �� ����ϴ� return;
			//��ȯ���� void�� �� return�� ����ϸ� �ڵ��� ������ ���߰� ȣ���� ������ ���ư���� �ǹ�
			return;
		}
		
			//���� �� �Էµ� ���. �迭�� �Էµ� ���� VO�� �Ҵ��
			DeptVO dVO = new DeptVO(Integer.parseInt(tempData[0]),tempData[1],tempData[2]);
		
			//Singleton Pattern�� ���Ե� DAOŬ������ ���
			PreparedStatementDAO psDAO = PreparedStatementDAO.getInstance();
			
		
			try {
				psDAO.insertCpDept(dVO);
				JOptionPane.showInternalMessageDialog(null, dVO.getDeptno()+"�� �μ������� �߰��Ǿ����ϴ�.");
			} catch (SQLException se) {
				se.printStackTrace();
				String errMsg =se.getMessage();
				if(se.getErrorCode() == 1) {
					errMsg = "�μ���ȣ�� �̹� �����ϴ� �κ�";
				}
				if(se.getErrorCode() == 1438) {
					errMsg = "�μ���ȣ�� �ʰ��� �κ�. �μ���ȣ 2�ڸ��� �����Դϴ�.";
				}
				if(se.getErrorCode() == 12899) {
					errMsg = "�μ��� �Ǵ� ��ġ�� �ʰ��� �κ�. �μ��� �ѱ� 4�� �Ǵ� ���� 14��, ��ġ �ѱ�4�� ���� 13��";	
				}
				JOptionPane.showMessageDialog(null, errMsg);
			}
			
	}
	
	public void modifyCpDept() {
		String inputData 
		= JOptionPane.showInputDialog("�μ���������\n�Է� ��)�μ���ȣ,�μ���,��ġ\n�� �������� �Է�");
	
	String[] tempData = inputData.replaceAll(" ","").split(",");
	
	if(tempData.length != 3) {
		JOptionPane.showMessageDialog(null, "�Է� ������ ������ �ùٸ��� �ʽ��ϴ�. \n��)�μ���ȣ,�μ���,��ġ");
		//��ȯ���� void�� �� ����ϴ� return;
		//��ȯ���� void�� �� return�� ����ϸ� �ڵ��� ������ ���߰� ȣ���� ������ ���ư���� �ǹ�
		return;
	}
	
		//���� �� �Էµ� ���. �迭�� �Էµ� ���� VO�� �Ҵ��
		DeptVO dVO = new DeptVO(Integer.parseInt(tempData[0]),tempData[1],tempData[2]);
	
		//Singleton Pattern�� ���Ե� DAOŬ������ ���
		PreparedStatementDAO psDAO = PreparedStatementDAO.getInstance();
		
	
		try {
			int cnt = psDAO.updateCpDept(dVO);
			if(cnt == 1) {
				JOptionPane.showInternalMessageDialog(null, dVO.getDeptno()+"�� �μ������� ����Ǿ����ϴ�.");
			}else {
				JOptionPane.showInternalMessageDialog(null, dVO.getDeptno()+"�� �μ������� �������� �ʽ��ϴ�.");
			}
			} catch (SQLException se) {
			se.printStackTrace();
			String errMsg =se.getMessage();
			if(se.getErrorCode() == 12899) {
				errMsg = "�μ��� �Ǵ� ��ġ�� �ʰ��� �κ�. �μ��� �ѱ� 4�� �Ǵ� ���� 14��, ��ġ �ѱ�4�� ���� 13��";	
			}
			JOptionPane.showMessageDialog(null, errMsg);
		}
	}
	
	public void removeCpDept() {
		String inputData = JOptionPane.showInputDialog("�μ���������\n���� �� �μ���ȣ�� �Է����ּ���.");
	
		if(inputData != null && !"".equals(inputData)) {
			try {
			int deptno = Integer.parseInt(inputData);
			//singleton pattern�� ���Ե� ��ü ���
			PreparedStatementDAO psDAO = PreparedStatementDAO.getInstance();
			int cnt = psDAO.deleteCpDept(deptno);
			
			if(cnt == 1) {
				JOptionPane.showMessageDialog(null, deptno+"�μ������� ���� �Ǿ����ϴ�.");
			}else {
				JOptionPane.showMessageDialog(null, deptno+"�μ������� �������� �ʽ��ϴ�.");				
			}
			
			}catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "�μ���ȣ�� �����̾�� �մϴ�.");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void searchAllCpDept() {
		//Singleton Pattern�� ���Ե� Ŭ������ ����Ͽ� ��ü�� ���
		PreparedStatementDAO psDAO = PreparedStatementDAO.getInstance();
		
		try {
			List<DeptVO> list = psDAO.selectAllCpDept();
			
			StringBuilder output = new StringBuilder();
			output.append("�μ���ȣ\t�μ���\t��ġ\n")
			.append("---------------------------------------------\n");
			
			if(list.isEmpty()) {
				output.append("�μ������� �������� �ʽ��ϴ�.\n");
			}
			
			for(DeptVO dv : list) {
				output
				.append(dv.getDeptno()).append("\t")
				.append(dv.getDname()).append("\t")
				.append(dv.getLoc()).append("\n");
			}
			output.append("---------------------------------------------\n");
			if(!list.isEmpty()) {
				output.append(list.size()+"���� ������ ��ȸ�Ǿ����ϴ�.");
				
			}
			
			JTextArea jta = new JTextArea(output.toString(),10,50);
			jta.setEditable(false);
			JScrollPane jsp = new JScrollPane(jta);
			
			JOptionPane.showMessageDialog(null, jsp);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void searchOneCpDept() {
		String inputData = JOptionPane.showInputDialog("�μ�������ȸ\n��ȸ �� �μ���ȣ�� �Է����ּ���.");
		
		if(inputData != null && !"".equals(inputData)) {
			try {
			int deptno = Integer.parseInt(inputData);
			//singleton pattern�� ���Ե� ��ü ���
			PreparedStatementDAO psDAO = PreparedStatementDAO.getInstance();
			
			DeptOneVO doVO = psDAO.selectOneCpDept(deptno);
			
			StringBuilder sb = new StringBuilder();
			sb.append(deptno).append("��");
				
			if(doVO == null) {
				sb.append("�μ���ȣ�� �������� �ʽ��ϴ�.");
			}else {
				sb.append("�μ������� ��ȸ���\n �μ��� : ").append(doVO.getDname())
				.append(", ��ġ : ").append(doVO.getLoc());	
			}
			
			JOptionPane.showMessageDialog(null, sb.toString());	
			
			}catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "�μ���ȣ�� �����̾�� �մϴ�.");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		RunPreparedStatementDAO rpsDAO = 	new RunPreparedStatementDAO();
		rpsDAO.selectMenu();
	}

}
