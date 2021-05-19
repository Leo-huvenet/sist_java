package day0225;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 *	Adapter Ŭ������ ����Ͽ� �̺�Ʈ ó��. => inner class
 * @author user
 */
@SuppressWarnings("serial")
public class UseInnerClassEvt extends JFrame {

	public UseInnerClassEvt() {
		super("anonymous inner class");
		
		//AdapterŬ������ ����� ���� ó��
		addWindowListener(new WindowEvt());
		
		setBounds(100, 100, 400, 400);
		setVisible(true);
		
	}//UseAnonymousEvt
	
	///////������ ���� �̺�Ʈó�� Inner Class ���� /////////
	public class WindowEvt extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			
		dispose();//Window�� �����ϴ� method. inner class������ �ٱ� Ŭ������ �ڿ��� ����� �� �ִ�.
		}
	}
	///////������ ���� �̺�Ʈó�� Inner Class �� /////////
	
	public static void main(String[] args) {
		new UseInnerClassEvt();
	}

}
