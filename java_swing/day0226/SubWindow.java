package day0226;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *	부가적인 기능을 제공하는 자식창(Dialog)  
 * @author user
 */
@SuppressWarnings("serial")
public class SubWindow extends JDialog implements ActionListener{

	public SubWindow(MainWindow mv) {
		//다이얼로그 열기
				//1. Dialng 생성 : has a
				super(mv,"정보 다이얼로그",true);	
				
				//2. 컴포넌트 배치
				JTextArea jta = new JTextArea("이것은 텍스트에어리어\n여러줄 사용가능");
				JButton btn = new JButton("닫기");
				
				JPanel jpBtn = new JPanel();
				jpBtn.add(btn);
				
				add("Center",jta);
				add("South",jpBtn);
				
				//버튼의 이벤트 처리
				btn.addActionListener(this);
				
				//다이얼로그의 이벤트는 setVisible 전에 처리해야한다.
				addWindowListener(new WindowAdapter() { //anonymous
					@Override
					public void windowClosing(WindowEvent e) {
						System.out.println("다이얼로그 종료.");
						dispose(); //JDialog의 dispose
					}
				});
				
				//자식창을 부모창 안쪽으로 띄우자
				//부모창의 x좌표, y좌표를 얻기
				//getX(), getY();
				setBounds(mv.getX()+50, mv.getY()+80, 400, 400);
				setVisible(true);
		
	}//SubWindow
	

	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
	}//actionPerformed

}
