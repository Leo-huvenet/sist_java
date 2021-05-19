package day0414;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import day0412.ZipcodeVO;

@SuppressWarnings("serial")
public class SQLInjection2 extends JFrame implements ActionListener {

	private JTextField jtfDong;
	private JButton jbtnSercarch;
	
	private DefaultTableModel dtm;
	private JTable jt;
		
	public SQLInjection2() {
		super("우편번호 검색");
	
		jtfDong=new JTextField(10);
		jbtnSercarch=new JButton("검색");
		
		String[] columnName= {"우편번호","주소"};
		dtm=new DefaultTableModel(columnName,0);
		jt=new JTable(dtm);
		jt.getColumnModel().getColumn(0).setPreferredWidth(80);
		jt.getColumnModel().getColumn(1).setPreferredWidth(520);
		
		JScrollPane jsp=new JScrollPane( jt );
		jsp.setBorder(new TitledBorder( "우편번호"));
		
		JPanel jp=new JPanel();
				
		jp.add(new JLabel("동 이름"));
		jp.add( jtfDong );
		jp.add( jbtnSercarch );
		
		add("North", jp );
		add("Center",jsp);
		
		jtfDong.addActionListener(this);
		jbtnSercarch.addActionListener(this);
		
		setBounds(100,100,700,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//SQLInjection2
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		setZipcode();

	}//actionPerformed
	
	
	private void setZipcode() {
	String dong=jtfDong.getText();
	
	if("".equals(dong)) {
		JOptionPane.showMessageDialog(this,"동이름은 필수입력");
		jtfDong.requestFocus();
		return;
	}//if
	
	InjectionDAO iDAO=new InjectionDAO();
	try {
		List<ZipcodeVO> list=iDAO.selectZipcode(dong);
		
		//기존의 JTable의 데이터를 초기화
		dtm.setRowCount(0);
		
		if(list.isEmpty()) {
			JOptionPane.showMessageDialog(this,dong+"은 존재하지 않습니다");
		}//if
		
		Object[] rowData=null;
		StringBuilder tempAddr=new StringBuilder();
		for(ZipcodeVO zVO:list) {
			//테이블에 들어갈 행을 배열로 생성
			rowData=new Object[2];
			tempAddr.append(zVO.getSido()).append(" ").append(zVO.getGugun())
			.append("").append(zVO.getDong()).append("").append(zVO.getBunji());
			rowData[0]=zVO.getZipcode();
			rowData[1]=tempAddr.toString();
			
			//생성된 테이터를JTable에 설정
			dtm.addRow(rowData);
			
			tempAddr.delete(0,tempAddr.length());

		}//for
		
	} catch (SQLException e) {
		e.printStackTrace();
		JOptionPane.showMessageDialog(this,"ㅈㅅㅈㅅ");
	}
		
	}//setZipcode

	
	public static void main(String[] args) {
		new SQLInjection2();
	}//main

}//class
