package day0224;

import java.awt.Choice;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

@SuppressWarnings("serial")
public class HomeWork extends JFrame {

	private JTextField jtf1;
	private JTextField jtf2;
	private JTextField jtf3;
	
	private JList<String> jlsFont;
	private JList<String> jlsFontStyle; 
	private JList<Integer> jlsSize; 

	private DefaultListModel<Integer> dlmSize;
	private DefaultListModel<String> dlmFontStyle;
	private DefaultListModel<String> dlmFont; 
	
	private JLabel jlSee;
	
	public HomeWork(){
		super("글꼴");
		
		setLayout(null);
		setBounds(300, 300, 550, 650);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel jlSize = new JLabel("크기(S):");
		JLabel jlFontStyle = new JLabel("글꼴 스타일(Y):");
		JLabel jlFont = new JLabel("글꼴(F):");
		jlSee = new JLabel();
		jlSee.setBorder(new TitledBorder("보기"));
		JLabel jlScript = new JLabel("스크립트(R):");
		
		JButton jbtnCheck = new JButton("확인");
		JButton jbtnRevoke = new JButton("취소");
		
		 jtf1 = new JTextField(10);
		 jtf2 = new JTextField(10);
		 jtf3 = new JTextField(10);
		
		Choice choScript = new Choice();
		choScript.add("한글");
		choScript.add("영어");
		
		//Font
		
		Font fontJbtn = new Font("맑은 고딕", Font.BOLD, 15);
		Font preview = new Font("맑은 고딕", Font.BOLD, 35);
		jlSee.setFont(preview);
		jbtnCheck.setFont(fontJbtn);
		jbtnRevoke.setFont(fontJbtn);
		
		//JList
		dlmSize = new DefaultListModel<Integer>();
		dlmFontStyle = new DefaultListModel<String>();
		dlmFont = new DefaultListModel<String>();
		
		String[] font = {"Dialog","DialogInput","Monospaced","Serif","SansSerif", "맑은 고딕", "궁서체"};
		
		
		
		for(int i =0; i<font.length; i++) {
			dlmFont.addElement(font[i]);
		}
		
		String[] fontStyle = {"보통","굵게","기울임꼴","굵은 기울임꼴"};
		
		for(int i =0; i<fontStyle.length; i++) {
			dlmFontStyle.addElement(fontStyle[i]);
			
		}
		
		for(int i =7; i<81; i++) {
			dlmSize.addElement(i);
		if(i==10) {
			dlmSize.addElement(i+2);
			}
			
		}
		
		jlsFont = new JList<String>(dlmFont); 
		JScrollPane fontList = new JScrollPane(jlsFont);
		
		jlsFontStyle = new JList<String>(dlmFontStyle); 
		JScrollPane fontStyleList = new JScrollPane(jlsFontStyle);
		
		jlsSize = new JList<Integer>(dlmSize); 
		JScrollPane fontSize = new JScrollPane(jlsSize);

	//배치
		//JList
		add(fontList);
		add(fontStyleList);
		add(fontSize);
		
		fontList.setBounds(15, 80, 200, 180);
		fontStyleList.setBounds(230, 80, 170, 180);
		fontSize.setBounds(415, 80, 100, 180);
		
		//JLabel
		add(jlSee);
		add(jlFont);
		add(jlFontStyle);
		add(jlSize);
		add(jlScript);
		
		jlSee.setBounds(230, 270, 285, 90);
		jlFont.setBounds(15, 30, 55, 30);
		jlFontStyle.setBounds(230, 30, 100, 30);
		jlSize.setBounds(415 , 30, 55, 30);
		jlScript.setBounds(235, 370, 283, 30);
		
		//JTextField
		add(jtf1);
		add(jtf2);
		add(jtf3);
		
		jtf1.setBounds(15, 55, 200, 25);
		jtf2.setBounds(230, 55, 170, 25);
		jtf3.setBounds(415, 55, 100, 25);
		
		//Choice
		add(choScript);
		
		choScript.setBounds(232, 400, 283, 80);
		
		//JButton
		add(jbtnCheck);
		add(jbtnRevoke);
		
		jbtnCheck.setBounds(315, 565, 90, 33);
		jbtnRevoke.setBounds(420, 565, 90, 33);
	}




	
	public static void main(String[] args) {
		new HomeWork();
	}//main
}
