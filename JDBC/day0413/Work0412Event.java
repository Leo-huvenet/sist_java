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
		//마우스버튼이 클릭 되었을 때 동작하는 메소드
		switch(me.getButton()) {
		case MouseEvent.BUTTON1 :
			
			selectFlag = true;
			
			//선택된 아이템을 받아와서 JTextField에 추가한다.
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
				JOptionPane.showMessageDialog(rcDAO, "삭제하실려면 아이템을 먼저 선택해 주세요.");
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
				JOptionPane.showMessageDialog(rcDAO, "변경하실려면 아이템을 먼저 선택해 주세요.");
				return;
			}
			 
			String num =rcDAO.getJtfNum().getText().trim();
			String name = rcDAO.getJtfName().getText().trim();
			String age = rcDAO.getJtfAge().getText().trim();
			String addr = rcDAO.getJtfAddr().getText().trim();
			
			if("".equals(name)) {
				JOptionPane.showMessageDialog(rcDAO,"이름은 필수 입력");
				rcDAO.getJtfName().requestFocus();
				return;
			}
			
			if("".equals(age)) {
				JOptionPane.showMessageDialog(rcDAO,"나이는 필수 입력");
				rcDAO.getJtfAge().requestFocus();
				return;
			}
			
			@SuppressWarnings("unused")
			int intAge = 0;
			try {
				intAge = Integer.parseInt(age);
			}catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(rcDAO,"나이는 숫자로 입력해주세요.");
				rcDAO.getJtfAge().setText("");
				rcDAO.getJtfAge().requestFocus();
				return;
			}
			
			if("".equals(addr)) {
				JOptionPane.showMessageDialog(rcDAO,"주소는 필수 입력");
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
	
		//버튼을 눌러서 작업을 수행하고 난 이후에는 JList의 item선택상태를 해제한다
	      selectFlag=false;

	
}
	
	
	
	private void addWork() {
		//JTextField 의 값을 받아와서 DB에 추가
			String name = rcDAO.getJtfName().getText().trim();
			String age = rcDAO.getJtfAge().getText().trim();
			String addr = rcDAO.getJtfAddr().getText().trim();
			
			if("".equals(name)) {
				JOptionPane.showMessageDialog(rcDAO,"이름은 필수 입력");
				rcDAO.getJtfName().requestFocus();
				return;
			}
			
			if("".equals(age)) {
				JOptionPane.showMessageDialog(rcDAO,"나이는 필수 입력");
				rcDAO.getJtfAge().requestFocus();
				return;
			}
			
			int intAge = 0;
			try {
				intAge = Integer.parseInt(age);
			}catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(rcDAO,"나이는 숫자로 입력해주세요.");
				rcDAO.getJtfAge().setText("");
				rcDAO.getJtfAge().requestFocus();
				return;
			}
			
			if("".equals(addr)) {
				JOptionPane.showMessageDialog(rcDAO,"주소는 필수 입력");
				rcDAO.getJtfAddr().requestFocus();
				return;
			}
			
			WorkAddVO waVO = new WorkAddVO(name, intAge, addr);
			Work0412DAO wDAO = Work0412DAO.getInstance();
			try {
				wDAO.insertWork(waVO); //데이터를 DBMS Table에 추가하고 
				setJListWork(); //입력된 상태의 데이터를 갱신하여 JList에 출력하고
				JOptionPane.showMessageDialog(rcDAO, "입력하신 정보가 추가되었습니다.");
			} catch (SQLException se) {
				se.printStackTrace();
				JOptionPane.showMessageDialog(rcDAO, "예외발생");
			}
	}
	
	
	/**
	 * Work 테이블의 모든 레코드를 조회하여 JList에 설정하는 일
	 */
	public void setJListWork() {
		Work0412DAO wDAO = Work0412DAO.getInstance();
		try {
		List<WorkAllVO> list = wDAO.selectAllWork();
		
		//디자인 클래스에서 뷰(JList)의 데이터를 관리하는 객체(DefaultLsitModel)를 얻는다.
		DefaultListModel<String> dlm = rcDAO.getDflm();
		//기존의 데이터를 초기화
		dlm.clear();
		
		//조회된 결과를 Model객체에 설정한다,
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
			JOptionPane.showMessageDialog(rcDAO, "서비스가 원할하지 못합니다.");
			e.printStackTrace();
			
		}
	}



}
