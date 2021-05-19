package day0413;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;



public class Work0412Event extends WindowAdapter implements ActionListener, MouseListener {

	private RunCrudDAO rcDAO;
	boolean selectFlag ;
	
	public Work0412Event(RunCrudDAO rcDAO) {
		this.rcDAO = rcDAO;
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		rcDAO.dispose();
	}

	@Override
	public void mouseClicked(MouseEvent me) {
		//���콺��ư�� Ŭ�� �Ǿ��� �� �����ϴ� �޼ҵ�
		switch(me.getButton()) {
		case MouseEvent.BUTTON1 :
			
			selectFlag = true;
			
			//���õ� �������� �޾ƿͼ� JTextField�� �߰��Ѵ�.
			String csvData = rcDAO.getJl().getSelectedValue();
			String[] arrData = csvData.split(",");
			
			rcDAO.getJtfNum().setText(arrData[0]);
			rcDAO.getJtfName().setText(arrData[1]);
			rcDAO.getJtfAge().setText(arrData[2]);
			rcDAO.getJtfAddr().setText(arrData[3]);

		}	
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		Work0412DAO wDAO = Work0412DAO.getInstance();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(ae.getSource() == rcDAO.getJbtnInsert()) {
			addWork();
			
			rcDAO.getJtfNum().setText(" ");
			rcDAO.getJtfName().setText(" ");
			rcDAO.getJtfAge().setText(" ");
			rcDAO.getJtfAddr().setText(" ");
			rcDAO.getJtfNum().requestFocus();
			
		}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(ae.getSource() == rcDAO.getJbtnClose()) {
			rcDAO.dispose();
		}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(ae.getSource() == rcDAO.getJbtnDelete()) {
			
			if(!selectFlag) {
				JOptionPane.showMessageDialog(rcDAO, "�����ϽǷ��� �������� ���� ������ �ּ���.");
				return;
			}
			
			int num = Integer.parseInt(rcDAO.getJtfNum().getText());
			
			try {
				wDAO.deleteWork(num);
				
				rcDAO.getJtfNum().setText(" ");
				rcDAO.getJtfName().setText(" ");
				rcDAO.getJtfAge().setText(" ");
				rcDAO.getJtfAddr().setText(" ");
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			rcDAO.dispose();
		}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(ae.getSource() == rcDAO.getJbtnUpdate()) {
			
			if(!selectFlag) {
				JOptionPane.showMessageDialog(rcDAO, "�����ϽǷ��� �������� ���� ������ �ּ���.");
				return;
			}
			 
			String num =rcDAO.getJtfNum().getText().trim();
			String name = rcDAO.getJtfName().getText().trim();
			String age = rcDAO.getJtfAge().getText().trim();
			String addr = rcDAO.getJtfAddr().getText().trim();
			
			if("".equals(name)) {
				JOptionPane.showMessageDialog(rcDAO,"�̸��� �ʼ� �Է�");
				rcDAO.getJtfName().requestFocus();
				return;
			}
			
			if("".equals(age)) {
				JOptionPane.showMessageDialog(rcDAO,"���̴� �ʼ� �Է�");
				rcDAO.getJtfAge().requestFocus();
				return;
			}
			
			@SuppressWarnings("unused")
			int intAge = 0;
			try {
				intAge = Integer.parseInt(age);
			}catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(rcDAO,"���̴� ���ڷ� �Է����ּ���.");
				rcDAO.getJtfAge().setText("");
				rcDAO.getJtfAge().requestFocus();
				return;
			}
			
			if("".equals(addr)) {
				JOptionPane.showMessageDialog(rcDAO,"�ּҴ� �ʼ� �Է�");
				rcDAO.getJtfAddr().requestFocus();
				return;
			}
				
			
			
			try {
				wDAO.updateWork(new WorkAllVO(name, Integer.parseInt(age), addr, Integer.parseInt(num)));
				
				rcDAO.getJtfNum().setText(" ");
				rcDAO.getJtfName().setText(" ");
				rcDAO.getJtfAge().setText(" ");
				rcDAO.getJtfAddr().setText(" ");
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			rcDAO.dispose();
		}
	
		//��ư�� ������ �۾��� �����ϰ� �� ���Ŀ��� JList�� item���û��¸� �����Ѵ�
	      selectFlag=false;

	
}
	
	
	
	private void addWork() {
		//JTextField �� ���� �޾ƿͼ� DB�� �߰�
			String name = rcDAO.getJtfName().getText().trim();
			String age = rcDAO.getJtfAge().getText().trim();
			String addr = rcDAO.getJtfAddr().getText().trim();
			
			if("".equals(name)) {
				JOptionPane.showMessageDialog(rcDAO,"�̸��� �ʼ� �Է�");
				rcDAO.getJtfName().requestFocus();
				return;
			}
			
			if("".equals(age)) {
				JOptionPane.showMessageDialog(rcDAO,"���̴� �ʼ� �Է�");
				rcDAO.getJtfAge().requestFocus();
				return;
			}
			
			int intAge = 0;
			try {
				intAge = Integer.parseInt(age);
			}catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(rcDAO,"���̴� ���ڷ� �Է����ּ���.");
				rcDAO.getJtfAge().setText("");
				rcDAO.getJtfAge().requestFocus();
				return;
			}
			
			if("".equals(addr)) {
				JOptionPane.showMessageDialog(rcDAO,"�ּҴ� �ʼ� �Է�");
				rcDAO.getJtfAddr().requestFocus();
				return;
			}
			
			WorkAddVO waVO = new WorkAddVO(name, intAge, addr);
			Work0412DAO wDAO = Work0412DAO.getInstance();
			try {
				wDAO.insertWork(waVO); //�����͸� DBMS Table�� �߰��ϰ� 
				setJListWork(); //�Էµ� ������ �����͸� �����Ͽ� JList�� ����ϰ�
				JOptionPane.showMessageDialog(rcDAO, "�Է��Ͻ� ������ �߰��Ǿ����ϴ�.");
			} catch (SQLException se) {
				se.printStackTrace();
				JOptionPane.showMessageDialog(rcDAO, "���ܹ߻�");
			}
	}
	
	
	/**
	 * Work ���̺��� ��� ���ڵ带 ��ȸ�Ͽ� JList�� �����ϴ� ��
	 */
	public void setJListWork() {
		Work0412DAO wDAO = Work0412DAO.getInstance();
		try {
		List<WorkAllVO> list = wDAO.selectAllWork();
		
		//������ Ŭ�������� ��(JList)�� �����͸� �����ϴ� ��ü(DefaultLsitModel)�� ��´�.
		DefaultListModel<String> dlm = rcDAO.getDflm();
		//������ �����͸� �ʱ�ȭ
		dlm.clear();
		
		//��ȸ�� ����� Model��ü�� �����Ѵ�,
		StringBuilder viewData = new StringBuilder();
		for(WorkAllVO waVO : list) {
			viewData
			.append(waVO.getNum()).append(",")
			.append(waVO.getName()).append(",")
			.append(waVO.getAge()).append(",")
			.append(waVO.getAddr());
			
			dlm.addElement(viewData.toString());
			
			viewData.delete(0, viewData.length());
		}
		
		} catch (SQLException e){
			JOptionPane.showMessageDialog(rcDAO, "���񽺰� �������� ���մϴ�.");
			e.printStackTrace();
			
		}
	}



}
