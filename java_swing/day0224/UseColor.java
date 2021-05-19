package day0224;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseColor extends JFrame{
	
	public UseColor() {
		super("색 설정");
		
		JTextField jtf = new JTextField(20);//보더레이아웃에 맞게 크기가 들어가기 때문에 크기설정안해도된다.
		JTextArea jta = new JTextArea();
		
		//jtf, jta의 글꼴을 궁서체, 진하게, 25로 설정.
		//궁서와 궁서체의 차이
		//~체가 붙으면 모든 글자의 넓이가 같다. 
		Font font = new Font("궁서체", Font.BOLD, 25);
		jtf.setFont(font);
		jta.setFont(font);
		
		//상수사용
		jtf.setBackground(Color.yellow);
		jta.setBackground(Color.gray);
		//생성
		jta.setBackground(new Color(0xB2CCFF)); //16진수로 색표현.
		jta.setForeground(new Color(0x102A5D));
		//색은 대문자 소문자 구별없이 사용.
		
		JPanel jp = new JPanel();
		jp.setBorder(new TitledBorder("입력"));
		
		JLabel jl = new JLabel("전화번호");//투명도가 설정되어있어 바닥색이 그대로 배경색이 된다.
		jl.setBorder(new TitledBorder("휴대폰"));
		jta.setBorder(new TitledBorder("010만 입력"));
		jtf.setBorder(new TitledBorder("휴대폰리스트"));
		jl.setForeground(Color.RED);
		
		
//		jl.setBackground(Color.yellow); //전경색은 적용된다.
	
		
		//투명도 해제하고
		jl.setOpaque(true);
		//바닥색을 설정한다.
		jl.setBackground(Color.yellow);
		
		jp.add(jl);
		jp.add(jtf);
		
		
		add("North",jp);
		add("North",jtf);
		
		
		//원도우 크기설정 w 600 h 500
		setBounds(500, 500, 600, 500);
		
		//가시화
		setVisible(true);
		
		//종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		
		
		
	}//UseColor
	
	
	
	
	
	
	
	public static void main(String[] args) {
			new UseColor();
	}

}
