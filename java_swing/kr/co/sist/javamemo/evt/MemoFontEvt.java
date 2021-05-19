package kr.co.sist.javamemo.evt;


import java.awt.Choice;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import kr.co.sist.javamemo.MemoFont;

/**
 *	글꼴 디자인의 이벤트 처리 클래스.
 * @author user
 */
public class MemoFontEvt extends WindowAdapter implements ActionListener, ListSelectionListener, ItemListener{

	
	private MemoFont mf;
	
	private String[] formatArr;
	private String[] styleArr;
	
	private JList<String> jlFormet, jlStyle,  jlSize ;
	
	private Choice chPreview;
	
	private Font memoFont;//JTextArea의 폰트정보를 저장하는 폰트객체. 미리보기 JLabel과 같다. 
	private Font tempFont;
	/**
	 * 지원 글꼴 :  "Dialog", "DialogInput", "Monospaced", "Serif", "SansSerif", "맑은 고딕", "궁서체"
	 * 지원 스타일 : "보통", "굵게", "기울임꼴", "굵은 기울임꼴"
	 * @param mf
	 */
	public MemoFontEvt (MemoFont mf) {
		this.mf=mf;
		
		formatArr =new String[] { "Dialog", "DialogInput", "Monospaced", "Serif", "SansSerif", "맑은 고딕", "궁서체" };
		styleArr = new String[] { "보통", "굵게", "기울임꼴", "굵은 기울임꼴" };
		
		DefaultListModel<String> dlmFormat = mf.getDlmFormat();
		DefaultListModel<String> dlmStyle = mf.getDlmStyle();
		DefaultListModel<String> dlmSize = mf.getDlmSize();
		
		//글꼴 설정
		for (int i = 0; i < formatArr.length; i++) {
			dlmFormat.addElement(formatArr[i]);
		}
		//스타일 설정
		for (int i = 0; i < styleArr.length; i++) {
			dlmStyle.addElement(styleArr[i]);
		}
		//크기 설정
		dlmSize.addElement(String.valueOf("7"));
		dlmSize.addElement(String.valueOf("8"));
		dlmSize.addElement(String.valueOf("9"));
		for (int i = 10; i < 81; i+=2) {
			dlmSize.addElement(String.valueOf(i));
		}
		//미리보기
		chPreview =mf.getChPreview();
		chPreview.add("한글");
		chPreview.add("영어");
		
		jlFormet = mf.getJlFormat(); //값을 설정한 JList를 얻는다.
		jlStyle = mf.getJlStyle(); //값을 설정한 JList를 얻는다.
		jlSize = mf.getJlSize(); //값을 설정한 JList를 얻는다.
		
		
		//부모창의 JTextArea폰트정보를 얻는다.
		
		//JlPreview객체 Font정보에도 설정.
		mf.getJlbPreview().setFont(mf.getJm().getJtaNote().getFont());
		memoFont = mf.getJlbPreview().getFont();
		
		//JTextField에 읽어들인 글꼴 정보를 설정한다.
		mf.getJtfFormat().setText(memoFont.getFamily());//family  : 글꼴정보
		mf.getJtfStyle().setText(styleArr[memoFont.getStyle()]);
		mf.getJtfSize().setText(String.valueOf(memoFont.getSize()));
	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		chPreview =mf.getChPreview();
		JLabel jlbPreview = mf.getJlbPreview();
		
		if(chPreview.getSelectedItem().equals("한글")) {
			jlbPreview.setText("가나다AaBbYyZz");
		}else if(chPreview.getSelectedItem().equals("영어")) {
			jlbPreview.setText("AaBbYyZz");
		}
		
	}//itemStateChanged
	
	@Override
	public void valueChanged(ListSelectionEvent lse) {//이벤트를 발생시킨 컴포넌트가 생성한 이벤트 객체.
		
		if(lse.getValueIsAdjusting() ){
		//JList에서 이벤트가 발생 하였다면 "미리보기" 폰트의 정보를 변수에 저장
		Font previewFont = 	mf.getJlbPreview().getFont();
		String fontFamily = previewFont.getFamily(); //Dialog
		int fontStyle = previewFont.getStyle(); //일반
		int fontSize = previewFont.getSize(); //10
		
		if(lse.getSource() == jlFormet ){//포멧이 클릭 되었을 때
			mf.getJtfFormat().setText(jlFormet.getSelectedValue());
			fontFamily = jlFormet.getSelectedValue();//선택한 폰트의 정보를 설정
		}
		
		if(lse.getSource() == jlStyle ){// 스타일이 클릭되었을 때
			mf.getJtfStyle().setText(jlStyle.getSelectedValue());	
			   //일반. 진하게가 아닌 0,1,2 숫자로 스타일이 사용되기때문에 선택한 인덱스를 얻는다.
			fontStyle = jlStyle.getSelectedIndex();
		}
		
		if(lse.getSource() == jlSize ){// 크기가 클릭 되었을 때
			mf.getJtfSize().setText(jlSize.getSelectedValue());
			fontSize =Integer.parseInt(jlSize.getSelectedValue());//선택한 폰트의 정보를 설정				
		}
		
		//위에서 설정된 정보를 가지고 JlPreview를 변경하여 사용자가 어떤 폰트정보를 사용할 것인지 
		//미리 보여준다.
			tempFont = new Font(fontFamily,fontStyle,fontSize);
			mf.getJlbPreview().setFont(tempFont);
		}//end if
	}//valueChanged

	@Override
	public void actionPerformed(ActionEvent ae) {
		JButton jbtnConfirm = mf.getJbtnConfirm();//확인
		JButton jbtnCancel = mf.getJbtnCancel();//취소
		JTextArea jtaNote = mf.getJm().getJtaNote(); //jtaNote 가져오는법
		
		if(ae.getSource() == jbtnConfirm) {
			jtaNote.setFont(tempFont);
			mf.dispose();
		}else if(ae.getSource() == jbtnCancel) {
			mf.dispose();
		}
	}//actionPerformed
	
	@Override
	public void windowClosing(WindowEvent e) {
		mf.dispose();
	}//windowClosing
	
	
}//class
