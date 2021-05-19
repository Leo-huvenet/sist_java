package day0224;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *	MVC패턴이 도입되어 제작된 클래스.
 * @author user
 */
@SuppressWarnings("serial")
public class UseMVComponent extends JFrame {
	
	public UseMVComponent() {
		super("MVC Pattern이 도입된 컴포넌트의 사용");
		
		//1. 데이터를 관리하는 Model객체를 생성
		DefaultComboBoxModel<String> dcbm = new DefaultComboBoxModel<String>();
		//데이터는 Model객체에 설정
		dcbm.addElement("자바");
		dcbm.addElement("오라클");
		dcbm.addElement("JDBC");
		dcbm.addElement("HTML");
		dcbm.addElement("CSS");
		dcbm.addElement("JavaScript");
		dcbm.addElement("Servlet/JSP");
		dcbm.addElement("XML, JSON");
		dcbm.addElement("MyBatis, Spring");
		
		
		
		//2. 데이터를 보여줄 View객체 생성
		JComboBox<String> jcb = new JComboBox<String>(dcbm);
		
		//AWT에서는 디자인객체에 값이 합쳐져서 제작된 컴포넌트 (Choice)였지만, Swing(JComboBox)
		//에서는 업무별로 구분하여 컴포넌트를 제작하였다.
		Choice cho = new Choice();
		cho.add("Java SE"); //디자인 객체에 값이 저장
		cho.add("Oracle");
		cho.add("JDBC");
		cho.add("Front-End (HTML, CSS, JavaScript");
		
		/////////////////JList///////////////////
		//값을 가진 Model객체를 생성
		DefaultListModel<String> dlm = new DefaultListModel<String>();
		dlm.addElement("정은아");
		dlm.addElement("박기범");
		dlm.addElement("권예원");
		dlm.addElement("석지원");
		dlm.addElement("강인섭");
		dlm.addElement("송준희");
		dlm.addElement("김덕영");
		
		//Model 객체를 사용하여 View객체 생성
		JList<String> jl = new JList<String>(dlm); //스크롤바가 존재하지 않는다.
		//스크롤바 설정
		JScrollPane jspList = new JScrollPane(jl);
		
		///////////////////////////////JTable//////////////////////////////////////////////////////
		String[] columnaNames = {"번호","이름","나이"};
		//모델객체생성
		DefaultTableModel dtm = new DefaultTableModel(columnaNames,0);
		//레코드 추가
		String[] data = {"1","곽범수","20"};//배열로 데이터를 만들고
		dtm.addRow(data);//배열을 모델에 추가
		Vector<String> vec = new Vector <String>();//벡터로 데이터를 만들고
		vec.add("2");
		vec.add("조혜원");
		vec.add("25");
		dtm.addRow(vec);//벡터를 모델에 추가
		
		
		//뷰객체 생성
		JTable jt = new JTable(dtm);
		//ScrollBar 설정 : 컬럼명이 사용자에게 보여진다.
		JScrollPane jspTable = new JScrollPane(jt);
		//스크롤을 해야 컬럼명 보인다.
		
		setLayout(new FlowLayout());
	
		//사용자에게 보여주는 일하는 View객체를 배치
		add(jcb); 
		add(cho); 
		add(jspList); 
		add(jspTable); 
		
		
		setBounds(100,100,900,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
	

	public static void main(String[] args) {
			new UseMVComponent();
	}

}
