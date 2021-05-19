package day0226;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class UseDialog extends JFrame implements ActionListener {

	public UseDialog() {
		super("다이얼로그연습");
		
		JButton jbtn = new JButton("다이얼로그열기");
		
		JPanel panel = new JPanel();
		panel.add(jbtn);
		
		jbtn.addActionListener(this);
		
		add("Center", panel);
		
		setBounds(100, 100, 500, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}//UseDialog
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//다이얼로그 열기
		//1. Dialng 생성 : has a
		JDialog jd = new JDialog(this,"정보 다이얼로그",true);
		
		//2. 컴포넌트 배치
		JTextArea jta = new JTextArea("이것은 텍스트에어리어\n여러줄 사용가능");
		JButton btn = new JButton("닫기");
		
		JPanel jpBtn = new JPanel();
		jpBtn.add(btn);
		
		jd.add("Center",jta);
		jd.add("South",jpBtn);
		
		//버튼의 이벤트 처리
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jd.dispose();//특정 윈도우 컴포넌트만 종료 시킬 수 있다.
			}
		});
		
		//다이얼로그의 이벤트는 setVisible 전에 처리해야한다.
		jd.addWindowListener(new WindowAdapter() { //anonymous
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("다이얼로그 종료.");
				jd.dispose();
			}
		});
		
		jd.setBounds(100, 100, 400, 400);
		jd.setVisible(true);
		
		
	}//actionPerformed

	public static void main(String[] args) {
		new UseDialog();
	}//main

}
