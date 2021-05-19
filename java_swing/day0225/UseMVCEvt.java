package day0225;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * 이름을 JTextField에 입력하고 버튼을 클릭(ActionEvent)하면, 입력된 이름이 JList에 추가되고,
 * JList의 item을 클릭 선택(ListSelectionEvent)하면 해당 item의 값이 JTextField에 설정되는 일
 * @author user
 */
@SuppressWarnings("serial")
//1.윈도우 컴포넌트를 상속, 발생이벤트를 처리할 수 있는 Listener를 구현
public class UseMVCEvt extends JFrame implements ActionListener, ListSelectionListener{
	//2. 이벤트가 발생했을 때 사용할 컴포넌트를 선언.
	private JTextField jtfName;
	private JList<String> jlName; //MVC Pattern을 도입하여 제작된 컴포넌트
	
	private DefaultListModel<String> dlmName; //Model 객체(값) 
	
	public UseMVCEvt() {
		super("Container Component 사용");
		//컴포넌트 생성 : : (컴포넌트종류 + 하는 일) 
		JLabel jlblName = new JLabel("이름");
		jtfName = new JTextField(12);
		JButton jbtnInput = new JButton("입력");

		dlmName = new DefaultListModel<String>();//Model객체 생성
		jlName = new JList<String>(dlmName); //Model객체를 사용하여 View객체 생성 
		
		JScrollPane jspName = new JScrollPane(jlName); //JList를 J.S.P에 할당
		jspName.setBorder(new TitledBorder("입력 이름"));
		
		//4. 배치관리자 설정
		//여러개의 컴포넌트를 한번에 배치하기위한 Container Component => JPanel
		JPanel jpNorth = new JPanel();
		jpNorth.add(jlblName);
		jpNorth.add(jtfName);
		jpNorth.add(jbtnInput);
		
		//스크롤바가 필요한 객체에 스크롤바를 배치하기위한 Container Component => JScrollPane
		
		//5. 배치
		
		add("North",jpNorth);
		
		add("Center",jspName);
		
		//버튼에서 발생한 이벤트를 처리할 수 있도록, 이벤트에 등록
		jbtnInput.addActionListener(this);//버튼클릭
		jtfName.addActionListener(this);//텍스트필드 엔터
		jlName.addListSelectionListener(this);//리스트의 아이템 선택
		
		//6. 크기설정
		setSize(500,400);
//		setLocation(100,200); //x 100 y 200 만큼 
		
		//7. 가시화
		setVisible(true);
		
		//8. 윈도우 종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//UseContainerComponent
	
	//2. 이벤트처리를 할 수 있는 method Override
	@Override
	public void actionPerformed(ActionEvent ae) {
		//JTextField의 입력 값을 가져와서
		String name = jtfName.getText();		
		
		//JList에 추가(View가 아닌 Model 객체를 사용하여 값을 추가)
		dlmName.addElement(name);
		
		//JTextField의 값을 초기화한다.
		jtfName.setText(""); //액션이 발생하면 텍스트초기화 : empty
		//JTextField
		jtfName.requestFocus();
	}//actionPerformed
	
//	boolean flag;
	@Override
	public void valueChanged(ListSelectionEvent lse) {
		//한번만 실행되도록 만들어보세요.
//		if(flag) {
		if(jlName.getValueIsAdjusting()) {
			//JTextField에 선택된 값을 설정
			jtfName.setText(dlmName.getElementAt(jlName.getSelectedIndex()));
//			System.out.println("선택한 인덱스 : "+jlName.getSelectedIndex());
//			//선택된 인덱스의 값은 View와 Model의 합
//			System.out.println("선택한 인덱스의 값 : "+dlmName.getElementAt(jlName.getSelectedIndex()));
//			System.out.println(jlName.getSelectedValue());
		}
//		flag = !flag;
	}//valueChanged
	
	
	
	public static void main(String[] args){
		new UseMVCEvt();
	}

}
