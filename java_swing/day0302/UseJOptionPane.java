package day0302;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class UseJOptionPane extends JFrame implements ActionListener {
	private JButton jbtnInput, jbtnMessage, jbtnConfirm;
	public UseJOptionPane() {
		super("JOptionPane 사용");
		
		jbtnInput = new JButton("입력 다이얼로그");
		jbtnMessage = new JButton("메시지 다이얼로그"); 
		jbtnConfirm = new JButton("컨펌 다이얼로그"); 
		
		JPanel panel = new JPanel();
		panel.add(jbtnInput);
		panel.add(jbtnMessage);
		panel.add(jbtnConfirm);
		
		add(panel);
		
		jbtnConfirm.addActionListener(this);
		jbtnInput.addActionListener(this);
		jbtnMessage.addActionListener(this);
		
		setBounds(100, 100, 500, 250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseJOptionPane
	
	public void useInput() {
		String name = JOptionPane.showInputDialog(this,"이름 입력해주세요\n예)홍길동");
		
		setTitle("JOptionPane 사용 - 입력이름 : "+name);
	
	}//useInput - actionPerformed에서 처리하면 코딩량이 많아지기 때문에 메소드로 처리
	
	public void useMessage() {
//		JOptionPane.showMessageDialog(this,"오늘은 화요일 입니다.");
		//showMessageDialog는 반환형이 void이다(얼럿창과 같은 일) 
		//정보제공용 아이콘을 변경(JOptionPaen의 Constant 사용)
		//ERROR_MESSAGE, INFOMATION_MESSAGE, PLAIN_MESSAGE, QUESTION_MESSAGE
//		JOptionPane.showMessageDialog(this, "에러메시지 제공", "에러",JOptionPane.ERROR_MESSAGE);
//		JOptionPane.showMessageDialog(this, "정보메시지 제공", "정보",JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(this, "질문 메시지 제공", "정보",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(this, "아이콘이 없는 메시지 제공", "일반",JOptionPane.PLAIN_MESSAGE);
		
	}//useInput - actionPerformed에서 처리하면 코딩량이 많아지기 때문에 메소드로 처리
	
	public void useConfirm() {
//		int flag = JOptionPane.showConfirmDialog(this, "계속 진행 하시겠습니까?");//예,아니오,취소 제공
//		int flag = JOptionPane.showConfirmDialog
//				(this, "에러각 발생하였습니다.\n계속 진행 하시겠습니까?","에러",JOptionPane.ERROR_MESSAGE);//예,아니오 제공
//		int flag = JOptionPane.showConfirmDialog
//				(this, "에러각 발생하였습니다.\n계속 진행 하시겠습니까?","에러",JOptionPane.PLAIN_MESSAGE);//예 제공
		int flag = JOptionPane.showConfirmDialog
				(this, "에러각 발생하였습니다.\n계속 진행 하시겠습니까?","에러",JOptionPane.INFORMATION_MESSAGE);//예,아니오,취소 제공
		
		switch(flag) {
		case JOptionPane.OK_OPTION : System.out.println("\"예\"를 누른 경우 처리");break;
		case JOptionPane.NO_OPTION : System.out.println("\"아니오\"를 누른 경우 처리");break;
		case JOptionPane.CANCEL_OPTION : System.out.println("\"취소\"를 누른 경우 처리");break;
		//0, 1, 2로 case 조건을 주는것보다 가독성을 위해서 상수를 이용해서 처리하였다.
		
		}
	}//useInput - actionPerformed에서 처리하면 코딩량이 많아지기 때문에 메소드로 처리
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == jbtnInput) {
			useInput();
		}
		
		if(ae.getSource() == jbtnMessage) {
			useMessage();
		}
		
		if(ae.getSource() == jbtnConfirm) {
			useConfirm();
		}
		
	}//actionPerformed

	

	public static void main(String[] args) {
			new UseJOptionPane();
	}	
}
