package day0223;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *	행과 열의 모든 컴포넌트 크기가 같게 설정되는 레이아웃매니저
 * @author user
 */
@SuppressWarnings("serial")
//1. 윈도우 컴포넌트 상속
public class UseGridLayout extends JFrame{
	//2. 컴포넌트 생성
	public UseGridLayout() {
		super("GridLayout 연습");
		
		String[] btnTitle = "1,2,3,4,5,6,7,8,9,#,0,*".split(","); //버튼에 들어갈 라벨 설정
		
		JButton[] jbtn = new JButton[btnTitle.length];//버튼 객체 생성
		
		//글꼴을 설정
		Font font = new Font("Serif", Font.BOLD, 20);
		
		for(int i = 0; i < jbtn.length; i++) {
			jbtn[i] = new JButton(btnTitle[i]);//각방의 버튼 객체를 버튼 타이틀로 부여하여 생성
			jbtn[i].setFont(font);//설정된 글꼴을 적용
		}
		
		//3. 배치관리자 설정 BorderLayout -> GridLayout
		setLayout(new GridLayout(4, 3));
		
		//4. 컴포넌트 배치 : (add(컴포넌트명))
		for(int i =0; i < jbtn.length; i++) {
			add(jbtn[i]);// 생성된 버튼 객체를 배치
		}
		
		//5. 윈도우 크기설정
		setSize(300,450);
		
		//6. 사용자에게 보여주기
		setVisible(true);
		
		//7. 윈도우 종료이벤트처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
	}//UseGridLayout
	public static void main(String[] args) {
		new UseGridLayout();
	}

}
