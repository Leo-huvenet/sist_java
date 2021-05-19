package day0225;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 *	Adapter 클래스를 사용하여 이벤트 처리. => anonymous inner class
 * @author user
 */
@SuppressWarnings("serial")
public class UseAnonymousEvt extends JFrame {

	public UseAnonymousEvt() {
		super("anonymous inner class");
		
		//Adapter클래스를 사용한 종료 처리
		addWindowListener(new WindowAdapter() {
			//WindowAdapter는 abstract method가 하나도 없어 원하는 method만 Override하면 됨
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}//windowClosing
		});
		
		setBounds(100, 100, 400, 400);
		setVisible(true);
		
	}//UseAnonymousEvt
	
	public static void main(String[] args) {
		new UseAnonymousEvt();
	}

}
