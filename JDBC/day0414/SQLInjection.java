package day0414;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class SQLInjection extends JFrame implements ActionListener {

	private JTextField jtfId;
	private JPasswordField jpfPass;
	private JLabel jlOutput;
	
	public SQLInjection() {
		super("SQLInjection 연습");
		jtfId=new JTextField();
		jpfPass=new JPasswordField();
		jlOutput=new JLabel("결과 출력");
		
		jtfId.setBorder(new TitledBorder("아이디"));
		jpfPass.setBorder(new TitledBorder("비밀번호"));
		jlOutput.setBorder(new TitledBorder("출력"));
		
		setLayout(new GridLayout(3,1));
		
		add( jtfId );
		add( jpfPass );
		add( jlOutput );
		
		jtfId.addActionListener(this);
		jpfPass.addActionListener(this);
		
		setBounds(100, 100, 300, 250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//SQLInjection
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == jtfId) {
			chkNull();
		}
		
		if(e.getSource() == jpfPass) {
			chkNull();
		}
	}//actionPerformed 

	private void chkNull() {
		String id = jtfId.getText();
		String pass = new String(jpfPass.getPassword());
		
		if("".endsWith(id)) {
			JOptionPane.showMessageDialog(this, "아이디는 필수 입력사항");
			jtfId.requestFocus();
			return;
		}
		
		if("".endsWith(pass)) {
			JOptionPane.showMessageDialog(this, "비밀번호는 필수 입력사항");
			jtfId.requestFocus();
			return;
		}
		
		login(id, pass);
		
	}//chkNull
	
	private void login(String id, String pass){
		InjectionDAO iDAO = new InjectionDAO();
		try {
			String name = iDAO.preparedStatementLogin(id, pass);
//			String name = iDAO.statementLogin(id, pass);
			if( "".equals(name) ) {
				jlOutput.setText("아이디나 비밀번호를 확인해주세요.");
			}else {
				jlOutput.setText(name+"님 로그인하셨습니다.");				
			}//end else
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new  SQLInjection();
	}//main

}//class
