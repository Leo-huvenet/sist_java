package day0225;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *	�����ξ����� �и��� �̺�Ʈó�� Ŭ���� has a ����
 * @author user
 */
public class UseHasAEvent extends WindowAdapter {
	private UseHasADesign uhad;
	
	public UseHasAEvent(UseHasADesign uhad) {
			this.uhad = uhad;
	}//UseHasAEvent
	
	@Override
	public void windowClosing(WindowEvent e) {
		uhad.dispose();
	}
	
	
	
}
