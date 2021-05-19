package day0225;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**

 * @author user
 */
//1. 이벤트를 처리할 수 있는 Listener를 구현
@SuppressWarnings("serial")
public class EventCompare extends JFrame implements ActionListener{
	//2. 이벤트처리에 관련된 컴포넌트를 선언
	private JButton jbtn1, jbtn2;
	private JLabel jlblOutput;
	
	public EventCompare() {
		super("이벤트 비교");
		
		jbtn1 = new JButton("열기");
		jbtn2 = new JButton("저장");
		jlblOutput = new JLabel("경로 : ");
		jlblOutput.setBorder(new TitledBorder("선택경로"));
		
		JPanel jp = new JPanel();
		jp.add(jbtn1); //버튼이 고유크기를 가지고 컨테이너컴포넌트에 배치
		jp.add(jbtn2); //버튼이 고유크기를 가지고 컨테이너컴포넌트에 배치
		
		//컴포넌트에서 사용자의 동작이 있을 때 JVM에서 청취할 수 있도록 리쓰너에 등록한다.
		jbtn1.addActionListener(this);
		jbtn2.addActionListener(this);
		
		add("Center", jp); //컨테이너 컴포넌트를 윈도우컴포넌트에 배치
		add("South", jlblOutput);
		
		
		setBounds(100, 100, 400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//2. Listener에서 제공하는 abstract method의 Override
	public void actionPerformed(ActionEvent ae) {
		//사용자의 동작이 있었을 때 JVM에서 호출 (동록된 컴포넌트에서만 호출가능)
		if(ae.getSource() == jbtn1) {
			//열기모드로 파일다이얼로그를 생성
			FileDialog fdOpen = new FileDialog(this, "파일열기", FileDialog.LOAD);
			
			//사용자에게 보여주기
			fdOpen.setVisible(true);
			
			//directory와 filename 얻기
			String path = fdOpen.getDirectory();
			String fileName = fdOpen.getFile();
			
			
			if(path != null) { //취소를 누르면 null이 반환되지 않도록 한다.
			jlblOutput.setText("경로 : "+path+fileName);
			
			//타이틀바의 내용 변경
			setTitle("파일명 : "+ fileName);
				}
		}
		//열기버튼과 닫기버튼은 각각의 다른 기능이기 때문에 단일if사용
		if(ae.getSource() == jbtn2) {
			//저장모드로 파일다이얼로그를 생성
			FileDialog fdSave = new FileDialog(this, "파일저장", FileDialog.SAVE);
			//사용자에게 보여주기
			fdSave.setVisible(true);
			
			//파일경로, 파일명 얻기
			String path = fdSave.getDirectory();
			String fileName = fdSave.getFile();
			
			if(path != null) {
			jlblOutput.setText("경로 : "+path+fileName);
			setTitle("저장 -"+ fileName);
			}
			
		}
		
		
	}//actionPerformed
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new EventCompare();
	}

}
