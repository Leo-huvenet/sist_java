package day0223;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.plaf.FontUIResource;

/**
 *	컴포넌트가 한 줄로 배치되고 원도우의 크기에 따라 위치가 변경되는 Layout
 * @author user
 */
@SuppressWarnings("serial")
//1.윈도우컴포넌트를 상속
public class UseFlowLayout extends JFrame{
	
	//2. 컴포넌트를 생성
	public UseFlowLayout() {
		super("FlowLayout연습");
		
		JButton jbtn = new JButton("버튼");
		JCheckBox jcbLang1 = new JCheckBox("Java");
		JCheckBox jcbLang2 = new JCheckBox("C/C++");
		JCheckBox jcbLang3 = new JCheckBox("Pyhton");
		JCheckBox jcbLang4 = new JCheckBox("VB");
		
		Font font = new FontUIResource("궁서체", Font.PLAIN , 20); //PLAIN : 기본글꼴
		jcbLang1.setFont(font);
		jcbLang2.setFont(font);
		jcbLang3.setFont(font);
		jcbLang4.setFont(font);
		
		JRadioButton jrbGender1 = new JRadioButton("남자",true);
		JRadioButton jrbGender2 = new JRadioButton("남자");
		//버튼그룹으로 묶이지 않은 라디오버튼은 여러개가 선택된다.
		//버튼 그룹 생성.
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrbGender1); //그룹으로 묶을 객체
		bg.add(jrbGender2);
		
		JTextField jtf = new JTextField(10);// 고유크기가 0
		//JTextField에 Font설정
		jtf.setFont(new Font("휴먼편지체", Font.ITALIC | Font.BOLD, 25));
		
		//3. 배치관리자 설정(BorderLayout => FlowLayout)
		setLayout ( new FlowLayout());
		
		//4. 컴포넌트 배치
		add(jbtn);
		add(jcbLang1);
		add(jcbLang2);
		add(jcbLang3);
		add(jcbLang4);
		add(jrbGender1);
		add(jrbGender2);
		
		add(jtf);
		
		//5. 윈도우 크기설정
		setSize(500,250);
		
		//6. 사용자에게 보여주기
		setVisible(true);
		
		//7. 종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
	public static void main(String[] args) {
		new UseFlowLayout();
	}

}
