package kr.co.sist.javamemo.evt;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import kr.co.sist.javamemo.JavaMemo;
import kr.co.sist.javamemo.MemoFont;

/**
 *	JavaMemo디자인의 이벤처리 클래스
 * @author user
 */
/**
 * @author user
 *
 */
public class JavaMemoEvt extends WindowAdapter implements ActionListener {
	
	private JavaMemo jm; //has a
	
	
	
	public JavaMemoEvt(JavaMemo jm) {
		this.jm = jm;
	}

	@Override
	public void windowClosing(WindowEvent we) {
		jm.dispose();
	}//windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {
			JTextArea jtaNote = jm.getJtaNote();
			
			if(ae.getSource() == jm.getJmiFont()) { //글꼴에서 이벤트 발생
				memoFont();
			}
			
			if(ae.getSource() == jm.getJmiNew()) { //새글
				jtaNote.setText("");//초기화
			}
			
			if(ae.getSource() == jm.getJmiOpen()) { //열기
				FileDialog fdOpen = new FileDialog(jm,"열기",FileDialog.LOAD);
				fdOpen.setVisible(true);
			
				String fileName = fdOpen.getFile();
				jm.setTitle(fileName);				
			}
			
			if(ae.getSource() == jm.getJmiSave()) { //저장
				FileDialog fdSave = new FileDialog(jm,"저장",FileDialog.SAVE);
				fdSave.setVisible(true);
				
				String fileName = fdSave.getFile();
				jm.setTitle(fileName);	
				
			}
			
			if(ae.getSource() == jm.getJmiNewSave()) { //새이름으로
				FileDialog fdNewSave = new FileDialog(jm,"새이름으로",FileDialog.SAVE);
				fdNewSave.setVisible(true);
				
				String fileName = fdNewSave.getFile();
				jm.setTitle(fileName);
			}
			
			if(ae.getSource() == jm.getJmiEnd()) { //종료
				jm.dispose();
			}
			
			
			if(ae.getSource() == jm.getJmiHelp()) { //도움말
			//JDialog
			JDialog jdMemo = new JDialog(jm,"메모장정보",true);
			TitledBorder tb = new TitledBorder("자바 메모장정보");
			JTextArea jtaMemo = new JTextArea("Version 1.0\n제작자 : 유경우\n이메모장은 JavaSE 14를 사용하여 개발한 버전이고\nLicense는 RPL(RyuKyeongWoo Public License)입니다."
					+ "\n아무나 자유롭게 사용해 주세요.\n항후 버전의 업그레이드는 계획되어있지 않습니다.");
			JButton btnMemo = new JButton("닫기");
			JLabel jlMemo = new JLabel();
			ImageIcon ii=new ImageIcon("C:\\dev\\workspace\\javase_prj2\\src\\day0224\\img\\[꾸미기][꾸미기]img1.jpg");
			
			jdMemo.setLayout(null);
			jdMemo.setBounds(jm.getX()+100,jm.getY()+150, 550, 320);
			
			jdMemo.add(jtaMemo);
			jdMemo.add(btnMemo);
			jdMemo.add(jlMemo);
			
			jtaMemo.setBorder(tb);
			jtaMemo.setBounds(170,20, 350, 150);
			
			btnMemo.setBounds(225,230, 70, 30);
			
			jlMemo.setBounds(20,20, 175, 150);
			jlMemo.setIcon(ii);
			
			//버튼의 이벤트 처리
			btnMemo.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					jdMemo.dispose();
				}
			});
			
			//다이얼로그의 이벤트
			jdMemo.addWindowListener(new WindowAdapter() { 
				@Override
				public void windowClosing(WindowEvent e) {
					jdMemo.dispose();
				}
			});	
			
			jdMemo.setVisible(true);
			jdMemo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
		}
	}//actionPerformed
	
	
	
	
	/**
	 * 글꼴 설정
	 */
	public void memoFont() {
		new MemoFont(jm); //글꼴설정 JDialog 생성
	}
	
	
}
