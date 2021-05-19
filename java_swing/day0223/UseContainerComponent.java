package day0223;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *	일반 컴포넌트 여러개를 한번에 배치할 때 사용하는 Container Component<br>
 *	Panel : 투명유리판
 *	JScrollPane : 스크롤바를 제공하는 유리판.
 * @author user
 */
@SuppressWarnings("serial")
//1.윈도우 컴포넌트를 상속
public class UseContainerComponent extends JFrame {
	//2. 컴포넌트 생성
	public UseContainerComponent() {
		super("Container Component 사용");
		//컴포넌트 생성 : : (컴포넌트종류 + 하는 일) 
		JLabel jlblName = new JLabel("이름");
		JTextField jtfName = new JTextField(12);
		JButton jbtnInput = new JButton("입력");
		JTextArea jtaOutput = new JTextArea();
		
		//4. 배치관리자 설정
		//여러개의 컴포넌트를 한번에 배치하기위한 Container Component => JPanel
		JPanel jpNorth = new JPanel();
		jpNorth.add(jlblName);
		jpNorth.add(jtfName);
		jpNorth.add(jbtnInput);
		
		//스크롤바가 필요한 객체에 스크롤바를 배치하기위한 Container Component => JScrollPane
		JScrollPane jspCenter = new JScrollPane(jtaOutput);
		
		//5. 배치
		
		add("North",jpNorth);
		
		add("Center",jspCenter);
		
		//6. 크기설정
		setSize(500,400);
//		setLocation(100,200); //x 100 y 200 만큼 
		
		//7. 가시화
		setVisible(true);
		
		//8. 윈도우 종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//UseContainerComponent

	public static void main(String[] args){
		new UseContainerComponent();
	}

}
