package day0225;

import javax.swing.JFrame;

/**
 *	Adapter Ŭ������ ����Ͽ� �̺�Ʈ ó��. =>has a����
 * @author user
 */
@SuppressWarnings("serial")
public class UseHasADesign extends JFrame {

	public UseHasADesign() {
		super("has a");
		
		//has a���踦 ����� ���� ó��
		UseHasAEvent uhae = new UseHasAEvent(this);
		addWindowListener(uhae);
		
		setBounds(100, 100, 400, 400);
		setVisible(true);
		
	}//UseAnonymousEvt
	
	public static void main(String[] args) {
		new UseHasADesign();
	}

}
