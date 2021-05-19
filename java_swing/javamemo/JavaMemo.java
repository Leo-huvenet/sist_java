package javamemo;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



@SuppressWarnings("serial")
public class JavaMemo extends JFrame {

	private JMenuItem jmiNew, jmiOpen, jmiSave, jmiNewSave, jmiEnd, jmiFont, jmiHelp;
	//새글, 열기,저장, 새이름으로, 종료, 글꼴, 도움말
	private JTextArea jtaNote;
	
	public JavaMemo(Font initFont) {
		super("메모장");
		
		//컴포넌트 생성.
		JMenuBar jmb=new JMenuBar();
		
		JMenu jmFile=new JMenu("파일");
		JMenu jmFormat=new JMenu("서식");
		JMenu jmHelp=new JMenu("도움말");
		
		jmiNew=new JMenuItem("새글");
		jmiOpen=new JMenuItem("열기");
		jmiSave=new JMenuItem("저장");
		jmiNewSave=new JMenuItem("새이름으로"); 
		jmiEnd=new JMenuItem("종료"); 
		jmiFont=new JMenuItem("글꼴"); 
		jmiHelp=new JMenuItem("메모장정보");
		
		jtaNote=new JTextArea();
		//읽어들인 폰트를 설정한다.
		if(initFont != null) { //읽어들인 Font가 존재한다면 JTextArea에 Font를 설정한다.
			jtaNote.setFont(initFont);
		}
		JScrollPane jspNote=new JScrollPane( jtaNote );//스크롤바가 없는 객체에 스크롤바를 붙인다.  
				
		//배치.
		//메뉴아이템->메뉴 배치 ( 구분선 필요 : addSeparator() )
		jmFile.add(jmiNew); //새글
		jmFile.addSeparator();
		jmFile.add(jmiOpen); //열기
		jmFile.add(jmiSave); //저장
		jmFile.add(jmiNewSave); //새이름
		jmFile.addSeparator();
		jmFile.add(jmiEnd); //닫기
		
		jmFormat.add(jmiFont); //서식
		
		jmHelp.add(jmiHelp);//도움말
		
		//메뉴->메뉴바 배치
		jmb.add( jmFile );
		jmb.add( jmFormat );
		jmb.add( jmHelp );
		
		//메뉴바 프레임 배치
		setJMenuBar(jmb);
		
		//JTextArea를 Frame에 배치
		add("Center",jspNote);
		
		//이벤트 처리 클래스의 객체생성.
		JavaMemoEvt jme=new JavaMemoEvt(this);
		
		//컴포넌트를 이벤트에 등록하고, 이벤트 발생 시 처리할 객체 설정한다.
		jmiFont.addActionListener( jme );
		jmiNew.addActionListener( jme );
		
		jmiOpen.addActionListener( jme );
		jmiSave.addActionListener( jme );
		jmiNewSave.addActionListener( jme );
		jmiEnd.addActionListener( jme );
		
		jmiHelp.addActionListener( jme );
		
		addWindowListener( jme );
		
		//윈도우 크기설정.
		setBounds(100, 100, 800, 700);
		//가시화
		setVisible(true);
		
	}//JavaMemo

	public JMenuItem getJmiNew() {
		return jmiNew;
	}

	public JMenuItem getJmiOpen() {
		return jmiOpen;
	}

	public JMenuItem getJmiSave() {
		return jmiSave;
	}

	public JMenuItem getJmiNewSave() {
		return jmiNewSave;
	}

	public JMenuItem getJmiEnd() {
		return jmiEnd;
	}

	public JMenuItem getJmiFont() {
		return jmiFont;
	}

	public JMenuItem getJmiHelp() {
		return jmiHelp;
	}

	public JTextArea getJtaNote() {
		return jtaNote;
	}
	
	
}//class
