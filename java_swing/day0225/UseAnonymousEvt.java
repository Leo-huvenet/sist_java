package day0225;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 *	Adapter Ŭ������ ����Ͽ� �̺�Ʈ ó��. => anonymous inner class
 * @author user
 */
@SuppressWarnings("serial")
public class UseAnonymousEvt extends JFrame {

	public UseAnonymousEvt() {
		super("anonymous inner class");
		
		//AdapterŬ������ ����� ���� ó��
		addWindowListener(new WindowAdapter() {
			//WindowAdapter�� abstract method�� �ϳ��� ���� ���ϴ� method�� Override�ϸ� ��
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
