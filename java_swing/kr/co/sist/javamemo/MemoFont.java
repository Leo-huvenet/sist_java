package kr.co.sist.javamemo;

import java.awt.Choice;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import kr.co.sist.javamemo.evt.MemoFontEvt;

@SuppressWarnings("serial")
public class MemoFont extends JDialog {
	
	private JavaMemo jm;
	
	private JButton jbtnConfirm, jbtnCancel;
	private JLabel jlbPreview;
	private JTextField jtfFormat, jtfStyle, jtfSize;
	private DefaultListModel<String> dlmFormat, dlmStyle, dlmSize;
	private JList<String> jlFormat, jlStyle, jlSize;
	private Choice chPreview;
	
	public MemoFont(JavaMemo jm) {
		super(jm,"글꼴",true);
		this.jm =jm;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//다이얼로그 닫을 때 사용
		setBounds(jm.getX()+200, jm.getY()+80, 500, 600);
//		setLocationRelativeTo(null);
		setLayout(null);
		
		 jbtnConfirm = new JButton("확인");
		 jbtnCancel = new JButton("취소");
		
		JLabel jlbFormat = new JLabel("글꼴(F):");
		JLabel jlbStyle = new JLabel("글꼴 스타일(Y):");
		JLabel jlbSize = new JLabel("크기(S):");
		
		jlbPreview = new JLabel("가나다AaBbYyZz");
		JLabel jlbSctipt = new JLabel("스크립트(R):");
		jlbPreview.setBorder(new TitledBorder("보기"));
		
		 jtfFormat = new JTextField(20);
		 jtfStyle = new JTextField(15);
		 jtfSize = new JTextField(5);
		
		dlmFormat = new DefaultListModel<String>();
		dlmStyle = new DefaultListModel<String>();
		dlmSize = new DefaultListModel<String>();

		jlFormat = new JList<String>(dlmFormat);
		jlStyle = new JList<String>(dlmStyle);
		jlSize = new JList<String>(dlmSize);

		JScrollPane jspJlFormat = new JScrollPane(jlFormat);
		JScrollPane jspJlStyle = new JScrollPane(jlStyle);
		JScrollPane jspJlSize = new JScrollPane(jlSize);
		
		chPreview = new Choice();
		
		//이벤트처리 클래스 생성
		MemoFontEvt mfe = new MemoFontEvt(this);
		//이벤트에 등록
		//윈도우 이벤트
		addWindowListener(mfe);
		//액션이벤트
		jbtnConfirm.addActionListener(mfe);
		jbtnCancel.addActionListener(mfe);
		//Choice이벤트
		chPreview.addItemListener(mfe);
		//JList이벤트
		jlFormat.addListSelectionListener(mfe);
		jlStyle.addListSelectionListener(mfe);
		jlSize.addListSelectionListener(mfe);

		jlbFormat.setBounds(20, 15, 50, 30);
		jlbStyle.setBounds(220, 15, 100, 30);
		jlbSize.setBounds(380, 15, 50, 30);
		jlbPreview.setBounds(220,250,250,100);
		jlbSctipt.setBounds(220,360,100,30);
		
		jbtnConfirm.setBounds(300, 500 ,60 ,30 );
		jbtnCancel.setBounds(400, 500 ,60 ,30 );

		jtfFormat.setBounds(20, 50, 190, 30);
		jtfStyle.setBounds(220, 50, 150, 30);
		jtfSize.setBounds(380, 50, 90, 30);

		jspJlFormat.setBounds(20, 90, 190, 150);
		jspJlStyle.setBounds(220, 90, 150, 150);
		jspJlSize.setBounds(380, 90, 90, 150);
		
		chPreview.setBounds(220, 400, 250, 50);

		add(jlbFormat);
		add(jlbStyle);
		add(jlbSize);
		add(jtfFormat);
		add(jtfStyle);
		add(jtfSize);
		add(jspJlFormat);
		add(jspJlStyle);
		add(jspJlSize);
		add(jlbPreview);
		add(jlbSctipt);
		add(chPreview);
		add(jbtnConfirm);
		add(jbtnCancel);

		setVisible(true);
	}

	public JavaMemo getJm() {
		return jm;
	}

	public JButton getJbtnConfirm() {
		return jbtnConfirm;
	}

	public JButton getJbtnCancel() {
		return jbtnCancel;
	}

	public JLabel getJlbPreview() {
		return jlbPreview;
	}

	public JTextField getJtfFormat() {
		return jtfFormat;
	}

	public JTextField getJtfStyle() {
		return jtfStyle;
	}

	public JTextField getJtfSize() {
		return jtfSize;
	}

	public DefaultListModel<String> getDlmFormat() {
		return dlmFormat;
	}

	public DefaultListModel<String> getDlmStyle() {
		return dlmStyle;
	}

	public DefaultListModel<String> getDlmSize() {
		return dlmSize;
	}

	public JList<String> getJlFormat() {
		return jlFormat;
	}

	public JList<String> getJlStyle() {
		return jlStyle;
	}

	public JList<String> getJlSize() {
		return jlSize;
	}

	public Choice getChPreview() {
		return chPreview;
	}
	
	
	
	
}
