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
 *	�۲� �������� �̺�Ʈ ó�� Ŭ����.
 * @author user
 */
public class MemoFontEvt extends WindowAdapter implements ActionListener, ListSelectionListener, ItemListener{

	
	private MemoFont mf;
	
	private String[] formatArr;
	private String[] styleArr;
	
	private JList<String> jlFormet, jlStyle,  jlSize ;
	
	private Choice chPreview;
	
	private Font memoFont;//JTextArea�� ��Ʈ������ �����ϴ� ��Ʈ��ü. �̸����� JLabel�� ����. 
	private Font tempFont;
	/**
	 * ���� �۲� :  "Dialog", "DialogInput", "Monospaced", "Serif", "SansSerif", "���� ���", "�ü�ü"
	 * ���� ��Ÿ�� : "����", "����", "����Ӳ�", "���� ����Ӳ�"
	 * @param mf
	 */
	public MemoFontEvt (MemoFont mf) {
		this.mf=mf;
		
		formatArr =new String[] { "Dialog", "DialogInput", "Monospaced", "Serif", "SansSerif", "���� ���", "�ü�ü" };
		styleArr = new String[] { "����", "����", "����Ӳ�", "���� ����Ӳ�" };
		
		DefaultListModel<String> dlmFormat = mf.getDlmFormat();
		DefaultListModel<String> dlmStyle = mf.getDlmStyle();
		DefaultListModel<String> dlmSize = mf.getDlmSize();
		
		//�۲� ����
		for (int i = 0; i < formatArr.length; i++) {
			dlmFormat.addElement(formatArr[i]);
		}
		//��Ÿ�� ����
		for (int i = 0; i < styleArr.length; i++) {
			dlmStyle.addElement(styleArr[i]);
		}
		//ũ�� ����
		dlmSize.addElement(String.valueOf("7"));
		dlmSize.addElement(String.valueOf("8"));
		dlmSize.addElement(String.valueOf("9"));
		for (int i = 10; i < 81; i+=2) {
			dlmSize.addElement(String.valueOf(i));
		}
		//�̸�����
		chPreview =mf.getChPreview();
		chPreview.add("�ѱ�");
		chPreview.add("����");
		
		jlFormet = mf.getJlFormat(); //���� ������ JList�� ��´�.
		jlStyle = mf.getJlStyle(); //���� ������ JList�� ��´�.
		jlSize = mf.getJlSize(); //���� ������ JList�� ��´�.
		
		
		//�θ�â�� JTextArea��Ʈ������ ��´�.
		
		//JlPreview��ü Font�������� ����.
		mf.getJlbPreview().setFont(mf.getJm().getJtaNote().getFont());
		memoFont = mf.getJlbPreview().getFont();
		
		//JTextField�� �о���� �۲� ������ �����Ѵ�.
		mf.getJtfFormat().setText(memoFont.getFamily());//family  : �۲�����
		mf.getJtfStyle().setText(styleArr[memoFont.getStyle()]);
		mf.getJtfSize().setText(String.valueOf(memoFont.getSize()));
	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		chPreview =mf.getChPreview();
		JLabel jlbPreview = mf.getJlbPreview();
		
		if(chPreview.getSelectedItem().equals("�ѱ�")) {
			jlbPreview.setText("������AaBbYyZz");
		}else if(chPreview.getSelectedItem().equals("����")) {
			jlbPreview.setText("AaBbYyZz");
		}
		
	}//itemStateChanged
	
	@Override
	public void valueChanged(ListSelectionEvent lse) {//�̺�Ʈ�� �߻���Ų ������Ʈ�� ������ �̺�Ʈ ��ü.
		
		if(lse.getValueIsAdjusting() ){
		//JList���� �̺�Ʈ�� �߻� �Ͽ��ٸ� "�̸�����" ��Ʈ�� ������ ������ ����
		Font previewFont = 	mf.getJlbPreview().getFont();
		String fontFamily = previewFont.getFamily(); //Dialog
		int fontStyle = previewFont.getStyle(); //�Ϲ�
		int fontSize = previewFont.getSize(); //10
		
		if(lse.getSource() == jlFormet ){//������ Ŭ�� �Ǿ��� ��
			mf.getJtfFormat().setText(jlFormet.getSelectedValue());
			fontFamily = jlFormet.getSelectedValue();//������ ��Ʈ�� ������ ����
		}
		
		if(lse.getSource() == jlStyle ){// ��Ÿ���� Ŭ���Ǿ��� ��
			mf.getJtfStyle().setText(jlStyle.getSelectedValue());	
			   //�Ϲ�. ���ϰ԰� �ƴ� 0,1,2 ���ڷ� ��Ÿ���� ���Ǳ⶧���� ������ �ε����� ��´�.
			fontStyle = jlStyle.getSelectedIndex();
		}
		
		if(lse.getSource() == jlSize ){// ũ�Ⱑ Ŭ�� �Ǿ��� ��
			mf.getJtfSize().setText(jlSize.getSelectedValue());
			fontSize =Integer.parseInt(jlSize.getSelectedValue());//������ ��Ʈ�� ������ ����				
		}
		
		//������ ������ ������ ������ JlPreview�� �����Ͽ� ����ڰ� � ��Ʈ������ ����� ������ 
		//�̸� �����ش�.
			tempFont = new Font(fontFamily,fontStyle,fontSize);
			mf.getJlbPreview().setFont(tempFont);
		}//end if
	}//valueChanged

	@Override
	public void actionPerformed(ActionEvent ae) {
		JButton jbtnConfirm = mf.getJbtnConfirm();//Ȯ��
		JButton jbtnCancel = mf.getJbtnCancel();//���
		JTextArea jtaNote = mf.getJm().getJtaNote(); //jtaNote �������¹�
		
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
