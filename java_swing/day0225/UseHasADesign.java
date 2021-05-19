package day0225;

import javax.swing.JFrame;

/**
 *	Adapter 클래스를 사용하여 이벤트 처리. =>has a관계
 * @author user
 */
@SuppressWarnings("serial")
public class UseHasADesign extends JFrame {

	public UseHasADesign() {
		super("has a");
		
		//has a관계를 사용한 종료 처리
		UseHasAEvent uhae = new UseHasAEvent(this);
		addWindowListener(uhae);
		
		setBounds(100, 100, 400, 400);
		setVisible(true);
		
	}//UseAnonymousEvt
	
	public static void main(String[] args) {
		new UseHasADesign();
	}

}
