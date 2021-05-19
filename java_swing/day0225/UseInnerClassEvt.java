package day0225;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 *	Adapter 클래스를 사용하여 이벤트 처리. => inner class
 * @author user
 */
@SuppressWarnings("serial")
public class UseInnerClassEvt extends JFrame {

	public UseInnerClassEvt() {
		super("anonymous inner class");
		
		//Adapter클래스를 사용한 종료 처리
		addWindowListener(new WindowEvt());
		
		setBounds(100, 100, 400, 400);
		setVisible(true);
		
	}//UseAnonymousEvt
	
	///////윈도우 종료 이벤트처리 Inner Class 시작 /////////
	public class WindowEvt extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			
		dispose();//Window에 존재하는 method. inner class에서는 바깥 클래스의 자원을 사용할 수 있다.
		}
	}
	///////윈도우 종료 이벤트처리 Inner Class 끝 /////////
	
	public static void main(String[] args) {
		new UseInnerClassEvt();
	}

}
