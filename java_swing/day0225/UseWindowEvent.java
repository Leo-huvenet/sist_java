package day0225;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

/**
 *	
 * @author user
 */
@SuppressWarnings("serial")
//1. 이벤트처리 리스너를 구현
public class UseWindowEvent extends JFrame implements WindowListener{
	
	public UseWindowEvent() {
		super("윈도우 이벤트처리");
		
		//발생된 윈도우 이벤트를 처리할 수 있도록 리쓰너에 등록
		addWindowListener(this);
		
		setBounds(100, 100, 600, 400);
		setVisible(true);
		
	}//UseWindowEvent

	public static void main(String[] args) {
		new UseWindowEvent();
	}//main
	
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
//		dispose();
		System.exit(0);//윈도우가 완전히 종료된 이후에 처리해야할 작업을 수행 할 수 없다.
	}

	@Override
	public void windowClosed(WindowEvent e) {
		//윈도우가 완전히 종료된 이후에 처리해야할 작업.
		System.out.println("windowClosed");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated(활성화)");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated(비활성화)");
	}

}
