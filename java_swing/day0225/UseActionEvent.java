package day0225;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *	버튼을 클릭 했을 때 윈도우를 종료하는 기능을 구현.
 *	버튼클릭 - ActionEvent가 발생
 *	ActionEvent가 처리될려면
 *		1. 이벤트를처리할 코드를 정의
 *			XxxListner 구현
 *		2. 이벤트에 등록.
 *			컴포넌트객체명.addXxxListener(처리될 객체);
 * @author user
 */
//1. 이벤트를 처리할 수 있는 Listener를 구현
@SuppressWarnings("serial")
public class UseActionEvent extends JFrame implements ActionListener{
	
	public UseActionEvent() {
		super("이벤트 처리");
		
		JButton jbtn = new JButton("닫기");
		
		JPanel jp = new JPanel();
		jp.add(jbtn); //버튼이 고유크기를 가지고 컨테이너컴포넌트에 배치
		
		//컴포넌트에서 사용자의 동작이 있을 때 JVM에서 청취할 수 있도록 리쓰너에 등록한다.
		jbtn.addActionListener(this);
		
		add("Center", jp); //컨테이너 컴포넌트를 윈도우컴포넌트에 배치
		setBounds(100, 100, 400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	//2. Listener에서 제공하는 abstract method의 Override
	public void actionPerformed(ActionEvent ae) {
		//사용자의 동작이 있었을 때 JVM에서 호출 (동록된 컴포넌트에서만 호출가능)
		System.out.println("버튼이 클릭 되었습니다.");
		dispose();
		
	}//actionPerformed
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new UseActionEvent();
	}

}
