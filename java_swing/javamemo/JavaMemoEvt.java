package javamemo;

import java.awt.FileDialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.MulticastSocket;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * JavaMemo�������� �̺�Ʈó�� Ŭ����
 * @author user
 */
public class JavaMemoEvt extends WindowAdapter implements ActionListener {

	private JavaMemo jm; //has a
	private String flagNote; //����(����,����)�� �񱳸� �ϱ����� ���ڿ� ��
	private String endNote; //�ݱ� ��
	private String path;//���⳪ �����۾������� ������ ��θ� ����
	private String fileName; //���⳪ �����۾������� ���ϸ� ����
	
	
	public JavaMemoEvt( JavaMemo jm ) {
		this.jm=jm;
		flagNote = ""; //null�� JTextArea�� �ʱⰪ�� ��ġ��Ű������ �ʱ�ȭ ��.
		endNote = "";
		path ="";
		fileName ="";
	}                                 
	
	@Override
	public void windowClosing(WindowEvent we) {
		jm.dispose();
	}//windowClosing
	
	@Override
	public void windowClosed(WindowEvent e) {
		try {
			saveFontInfo();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}//windowClosed
	
	/**
	 * ���α׷��� ����Ǹ� JTextArea�� Font������ ���� ������ ����ϱ����� ���Ͽ� �����Ѵ�.
	 * @throws IOException
	 */
	private void saveFontInfo() throws IOException{
		
		//���������� ������ ������ �������� ���� �� �ִ�.
		File dir = new File("c:/dev/memo"); 
		if(!dir.exists()) { //������ ������ �������� ������
			dir.mkdirs(); //������ �����ϰ�
		}
		ObjectOutputStream oos = null;
		try {
			//������ ��ο� ���Ͻ�Ʈ�� ����
			oos = new ObjectOutputStream(new FileOutputStream(dir.getAbsolutePath()+"/memo.dat"));
			Font font = jm.getJtaNote().getFont(); //JTextArea�� Font������ ��´�
			//Font��ü�� ��Ʈ���� ���
			oos.writeObject(font);
			oos.flush();
		}finally {
			if( oos != null) {oos.close();}
		}
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == jm.getJmiFont()) {//�۲ÿ��� �̺�Ʈ�� �߻�.
			memoFont();
			
		}//end if
		
		if(ae.getSource() == jm.getJmiNew()) {//���ۿ��� �̺�Ʈ�� �߻�.
			newMemo();
		}//end if
		
		if(ae.getSource() == jm.getJmiOpen()) {//���⿡�� �̺�Ʈ�� �߻�.
			try {
				openMemo();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(jm, "������ ���� ���� �����߻�");
				e.printStackTrace();
			}
		}//end if
		
		if(ae.getSource() == jm.getJmiNewSave()) {//"���̸���������"���� �̺�Ʈ�� �߻�.
			newSaveMemo();
		}//end if
		
		if(ae.getSource() == jm.getJmiSave()) {//"����"���� �̺�Ʈ�� �߻�.
			 saveMemo();
		}//end if
		
		if(ae.getSource() == jm.getJmiEnd()) { //"�ݱ�"���� �̺�Ʈ�� �߻�
			end();
		}

	}//actionPerformed

	/**
	 * �۲� ����
	 */
	public void memoFont() {
		new MemoFont( jm ); //�۲ü��� JDialog ����.
	}//memoFont
	
	/**
	 * ���� 
	 */
	public void newMemo() {
		JTextArea jtaMemo = jm.getJtaNote();
		
		boolean newMemoFlag = false;
		
		if(!jtaMemo.getText().equals("") && !flagNote.equals(jtaMemo.getText())) { //�ؽ�Ʈ ���� ���� �����ϸ� ���忩�θ� ���´�.
			//�����۾����� ����� �ٸ���
			switch(JOptionPane.showConfirmDialog(jm, "�����Ͻðڽ��ϱ�?")){
			case JOptionPane.OK_OPTION : saveMemo(); newMemoFlag = false; break; //���� �� ����
			case JOptionPane.NO_OPTION: newMemoFlag = false; break; //�������� �ʰ� ����
			case JOptionPane.CANCEL_OPTION: newMemoFlag = true;//������� ����
			}
		}
		
		if(newMemoFlag ) {//����� ������ �ϰ� �Ʒ������� ���ุ �Ѵ�.
		jtaMemo.setText("");
		jm.setTitle("�޸��� - ����");
		//�����ߴ� ���ϸ� �Ǵ� �����ߴ� ��ο� ���ϸ��� �ʱ�ȭ�Ѵ�.
		path ="";
		fileName = "";
		}
	}
	
	/**
	 * ����
	 */
	public void openMemo() throws IOException{
		
		//�����ߴ� ����� ���� JTextArea �� ������ ���ٸ� ���⸦ ������ �ٸ��ٸ� ���忩�θ� ���� ���⸦ ����
		boolean openFlag = false;
		if(!flagNote.equals(jm.getJtaNote().getText())) {
			switch(JOptionPane.showConfirmDialog(jm, "�����Ͻðڽ��ϱ�?")) {
			case JOptionPane.OK_OPTION : saveMemo(); openFlag = false; break;
			case JOptionPane.NO_OPTION : openFlag = false; break;
			case JOptionPane.CANCEL_OPTION : openFlag = true; break;
			}
		}
		
		if(!openFlag)
		{	
			FileDialog fdOpen= new FileDialog(jm, "���� - �ڹٸ޸���",FileDialog.LOAD);
			fdOpen.setVisible(true);
	
			String path = fdOpen.getDirectory();
			String fileName = fdOpen.getFile();
			
			if(path != null) { //����ڰ� ������ �����ϰ� ���⸦ ���� ��
				
				BufferedReader br = null; //������ �б����� ��Ʈ�� ����
				
				try {
					//������ ������ ������ �о� ���̱����� ���Ͽ� ��Ʈ�� ����
					br = new BufferedReader(new FileReader(path+fileName));
					String lineData ="";
					StringBuilder sbReadData = new StringBuilder();
					
					while((lineData = br.readLine()) != null) {//���� �о�鿩 
						sbReadData.append(lineData).append("\n"); //������ �����ϰ�
					}//end while
					
					jm.getJtaNote().setText(sbReadData.toString());// JTextArea�� ����
					flagNote = jm.getJtaNote().getText(); // �������� ����� ������ ���� ���� ����
					this.path = path;//������ ���ϰ�θ� ����ϱ����� ����
					this.fileName = fileName;//������ ���ϸ��� ����ϱ����� ����
					
					jm.setTitle("�޸��� - ����["+ fileName+"]");
					
				}finally {
					if( br != null) {br.close();}
				}//end finally
			}
		}
	}
	
	/**
	 * ����
	 */
	public void saveMemo() {
		//������ �������� ���ų�, ������ ���� ���Ŀ��� ������ ���ϸ��� �����Ƿ� ���ϴ��̾�α׸�
		//�����ϰ� ����.
		//������ ���Ȱų� ������ �Ǿ��ٸ� ������ ��ο� ���ϸ��� ����Ͽ� ����.
		try {
			if(path.equals("")) {
				newSaveMemo();
			}else {
				saveFile(path, fileName);
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(jm, "�����۾� �� ���� �߻�.");
			e.printStackTrace();
		}
		
		
	}
	
	/**
	 * ���̸����� ����
	 */
	public void newSaveMemo() {
		FileDialog fdSave = new FileDialog(jm,"���� - �ڹٸ޸���",FileDialog.SAVE);
		fdSave.setVisible(true);
		
		String path = fdSave.getDirectory(); //���
		String fileName = fdSave.getFile(); //���ϸ�
		
		if(path != null) {
			try {
				saveFile(path, fileName);
			} catch (IOException e) {
				JOptionPane.showMessageDialog(jm, "���̸����� �����ϴ� �� ���� �߻�");
				e.printStackTrace();
			}
		}
		
		
	}
	
	/**
	 * �޴����� �ݱ⸦ ������ ��
	 */
	public void end() {
		
		boolean endFlag = false;
		if(!endNote.equals(jm.getJtaNote().getText())) {
			switch(JOptionPane.showConfirmDialog(jm, "�����Ͻðڽ��ϱ�?")) {
			case JOptionPane.OK_OPTION : saveMemo(); endFlag = false; break;
			case JOptionPane.NO_OPTION : jm.dispose(); break;
			case JOptionPane.CANCEL_OPTION : endFlag = true; break;	
			}
		}else {
			jm.dispose();
		}
		
		//�۲� ����
		try {
			saveFontInfo();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
		
	
	
	/**
	 * ��� ��Ʈ���� ����Ͽ� ���Ͽ� ����
	 * @param path
	 */
	private void saveFile(String path, String fileName) throws IOException{
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(path+fileName));
			//�ؽ�Ʈ������� ������ ���Ͽ� ���� 
			String text = jm.getJtaNote().getText();
			bw.write(text); //��Ʈ���� ���� ���
			bw.flush(); //��Ʈ���� ��ϵ� ������ �������� ����
			
			this.path = path;//������ ���ϰ�θ� ����ϱ����� ����
			this.fileName = fileName;//������ ���ϸ��� ����ϱ����� ����
			
			jm.setTitle("�޸��� - ����["+fileName+"]");

			}finally {
			if(bw != null) {bw.close();}
		}
		
	}
	
}//class
