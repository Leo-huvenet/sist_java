package day0223;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *	BorderLayout(기본 레이아웃)과 컴포넌트
 * @author user
 */
@SuppressWarnings("serial")
//1. 윈도우 컴포넌트를 상속
public class UseBorderLayout extends JFrame{
	
	//2. 생성자에서 컴포넌트 생성
	public UseBorderLayout() {
		super("BorderLayout 연습"); //title bar 설정
		
		JTextField jtfNorth = new JTextField("North");
		JPasswordField jpfSouth = new JPasswordField("South");//입력문자열은 반향문자로 보인다.
		JLabel jlEast = new JLabel("East");
		JLabel jlWest = new JLabel("West");
		JTextArea jtaCenter = new JTextArea("Center");
		
		//3. 배치관리자를 설정 Window Component의 기본 레이어웃이 BorderLayout이므로 생략가능
//		setLayout(new BorderLayout());
		
		//4. 배치
		//String 상수.
		add("Center", jtaCenter);
		add("North", jtfNorth);
		add("South", jpfSouth);
		//BorderLayout 상수.
		add(BorderLayout.EAST, jlEast);
		add(BorderLayout.WEST,jlWest);
		
		//5. 윈도우 크기설정
		setSize(400,350);
		//6. 사용자에게 보여주기
		setVisible(true);
		//7. 윈도우 종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseBorderLayout
	
	
	public static void main(String[] args) {
		new UseBorderLayout();
	}

	

}
