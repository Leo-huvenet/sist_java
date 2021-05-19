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
 *	JavaMemo�������� �̺�ó�� Ŭ����
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
			
			if(ae.getSource() == jm.getJmiFont()) { //�۲ÿ��� �̺�Ʈ �߻�
				memoFont();
			}
			
			if(ae.getSource() == jm.getJmiNew()) { //����
				jtaNote.setText("");//�ʱ�ȭ
			}
			
			if(ae.getSource() == jm.getJmiOpen()) { //����
				FileDialog fdOpen = new FileDialog(jm,"����",FileDialog.LOAD);
				fdOpen.setVisible(true);
			
				String fileName = fdOpen.getFile();
				jm.setTitle(fileName);				
			}
			
			if(ae.getSource() == jm.getJmiSave()) { //����
				FileDialog fdSave = new FileDialog(jm,"����",FileDialog.SAVE);
				fdSave.setVisible(true);
				
				String fileName = fdSave.getFile();
				jm.setTitle(fileName);	
				
			}
			
			if(ae.getSource() == jm.getJmiNewSave()) { //���̸�����
				FileDialog fdNewSave = new FileDialog(jm,"���̸�����",FileDialog.SAVE);
				fdNewSave.setVisible(true);
				
				String fileName = fdNewSave.getFile();
				jm.setTitle(fileName);
			}
			
			if(ae.getSource() == jm.getJmiEnd()) { //����
				jm.dispose();
			}
			
			
			if(ae.getSource() == jm.getJmiHelp()) { //����
			//JDialog
			JDialog jdMemo = new JDialog(jm,"�޸�������",true);
			TitledBorder tb = new TitledBorder("�ڹ� �޸�������");
			JTextArea jtaMemo = new JTextArea("Version 1.0\n������ : �����\n�̸޸����� JavaSE 14�� ����Ͽ� ������ �����̰�\nLicense�� RPL(RyuKyeongWoo Public License)�Դϴ�."
					+ "\n�ƹ��� �����Ӱ� ����� �ּ���.\n���� ������ ���׷��̵�� ��ȹ�Ǿ����� �ʽ��ϴ�.");
			JButton btnMemo = new JButton("�ݱ�");
			JLabel jlMemo = new JLabel();
			ImageIcon ii=new ImageIcon("C:\\dev\\workspace\\javase_prj2\\src\\day0224\\img\\[�ٹ̱�][�ٹ̱�]img1.jpg");
			
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
			
			//��ư�� �̺�Ʈ ó��
			btnMemo.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					jdMemo.dispose();
				}
			});
			
			//���̾�α��� �̺�Ʈ
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
	 * �۲� ����
	 */
	public void memoFont() {
		new MemoFont(jm); //�۲ü��� JDialog ����
	}
	
	
}
