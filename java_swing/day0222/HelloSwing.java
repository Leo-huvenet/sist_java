package day0222;




import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Window Application 작성
 * @author user
 */
//1. Window Component상속

@SuppressWarnings("serial")
public class HelloSwing extends JFrame{
	
	//2. 생성자에서 사용할 컴포넌트를 생성
	public HelloSwing() {
		super("스윙연습"); //부모클래스의 생성자를 호출(모든클래스의 생성자는 super();가 존재한다)
		
		JButton jbtn = new JButton("Hello Swing!!!");
		
		//3. 생성된 컴포넌트를 배치
		add(jbtn);
		
		//4. 윈도우 컴포넌트 크기 설정
		setSize(400, 300);
		
		//5. 사용자에게 보여주기
		setVisible(true);
		
		//6. 종료처리 : anonymous inner class
		//addWindowListener method는 java.awt.Window 클래스에 존재하는 method로
		//Window, JWindow JFrame, Frame 클래스에서 모두 사용할 수 있다(코드의 재사용성)
//		addWindowListener(new WindowAdapter() {
//
//			@Override
//			public void windowClosing(WindowEvent e) {
//				dispose(); //특정 윈도우를 종료처리하고, JVM를 종료한다.
//			}//windowClosing		
//		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//HelloSwing
	
	

	public static void main(String[] args) {
		new HelloSwing();
		
		
		
	}//main

}
