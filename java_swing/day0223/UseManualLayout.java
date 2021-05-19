package day0223;

import java.awt.Color;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


@SuppressWarnings("serial")
//1. 윈도우 컴포넌트 상속
public class UseManualLayout extends JFrame {
	//2. 생성자에서 일반컴포넌트 생성
	public UseManualLayout() {
		super("수동배치");
		
		JLabel jlblTitle = new JLabel("제목");
		
		Vector<String> vec = new Vector<String>();
		vec.add("백암순대-한독 뒤");
		vec.add("에그드랍-한독 뒤");
		vec.add("탄-한독 뒤옆");
		vec.add("미스터김밥-한독뒤 주차장옆");
		vec.add("김천-한독 옆");
		
		JComboBox<String> jcb = new JComboBox<String>(vec); //값을 가진 콤보박스객체 생성.
		
		JButton jbtn = new JButton("입력");
		
		//3. 배치관리자 해제 : BorderLayout => null
		setLayout(null);
		
		//4.위치, 크기 설정
//		jlblTitle.setLocation(10, 30);
//		jlblTitle.setSize(30,30);
		jlblTitle.setBounds(10,30,30,30);
		
		
//		jcb.setSize(200,30);
//		jcb.setLocation(40, 30);
		jcb.setBounds(40,30,200,30);
		
		
//		jbtn.setSize(60,30);
//		jbtn.setLocation(245, 30);// 원도우의 타이틀바 아래 좌상단이 시작좌표
		jbtn.setBounds(245,30,60,30);
		
		//5.배치
		add(jlblTitle);
		add(jcb);
		add(jbtn);
		
		//6. 윈도우 크기설정
		setSize(450,400);
		setLocation(150,100);// Window Component => monitor의 좌상단 시작좌표
		
		//7. 가시화
		setVisible(true);
		
		//8.종료이벤트 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}//UseManualLayout
	
	
	
	

	public static void main(String[] args) {
		new UseManualLayout();
	}

}
