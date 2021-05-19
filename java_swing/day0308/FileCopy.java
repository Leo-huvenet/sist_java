package day0308;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *	
 * @author user
 */
@SuppressWarnings("serial")
public class FileCopy extends JFrame implements ActionListener {
	
	private JButton jbtn16bitStream, jbtn8bitStream;

	public FileCopy() {
		super("���� ����");
		
		jbtn16bitStream = new JButton("16bit ���ϼ���");
		jbtn8bitStream = new JButton("8bit ���ϼ���");
		
		
		JPanel panel = new JPanel();
		panel.add(jbtn16bitStream);
		panel.add(jbtn8bitStream);
		
		
		add("Center",panel);
		
		jbtn16bitStream.addActionListener(this);
		jbtn8bitStream.addActionListener(this);
		
		setBounds(100,100,500,250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//FileCopy
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		//FileDialog�� �б���� ����
		FileDialog fdOpen = new FileDialog(this, "������ ���� ����",FileDialog.LOAD);
		fdOpen.setVisible(true);
		
		
		String path = fdOpen.getDirectory(); //�������
		String file = fdOpen.getFile(); //����
		
		if(path != null) {
			//������ ���������� ����Ͽ� "���ϸ�_cp.Ȯ����" ������ �̸��� ��������. 
			StringBuilder sb = new StringBuilder(file); //������ ���ϸ��� ������ StringBuilder
			sb.insert(sb.lastIndexOf("."), "_cv");//����

			if(ae.getSource() == jbtn16bitStream) {
				try {
					use16bit(path+file, path+sb.toString());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(ae.getSource() == jbtn8bitStream) {
				try {
					use8bit(path+file, path+sb.toString());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}//actionPerformed
	
	public void use16bit(String originalName, String cpName)throws IOException {
		
		BufferedReader br = null; 
		BufferedWriter bw =null; 
	
	try {
		//�б⽺Ʈ�� ����
		br = new BufferedReader(new FileReader(originalName));
		//���⽺Ʈ�� ����
		bw = new BufferedWriter(new FileWriter(cpName));
		
		String data = "";
		
		while((data = br.readLine()) != null) {//��Ʈ������ �б�
			//��Ʈ������ �о���� ���� ��Ʈ������
//			System.out.println(data);//���
			bw.write(data);
			
		}
		
		bw.flush();
		JOptionPane.showMessageDialog(this,cpName+"���Ϸ� ���� �Ǿ����ϴ�.");
		
	}finally {
		if(br != null) {br.close();}
		if(bw != null) {bw.close();}
		
	}
	
	
	
	
	}
	
	public void use8bit(String originalName, String cpName)throws IOException{
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			//�б⽺Ʈ�� ����
			fis = new FileInputStream(originalName);
			//���⽺Ʈ�� ����
			fos = new FileOutputStream(cpName);
			
			//////////////////DISK IO�� ���� �߻��ϴ� �ڵ� /////////////////// 
			byte[] readData = new byte[512];
			int leng = 0; //�迭�� ä���� ���� ����.
			
			while((leng = fis.read(readData)) != -1) { //���Ͽ��� �о���� ������ �ִٸ�.
				fos.write(readData,0,leng); //�迭�� ó���濡�� �о���� ����� ���
				
				
			}
			
			
			//////////////////DISK IO�� ���� �߻��ϴ� �ڵ� /////////////////// 
			
			////////////////// DISK IO�� ���� �߻��ϴ� �ڵ� /////////////////// 
			
//			int readData = 0;
//			
//			while((readData = fis.read()) != -1) {//1byte�� �о�鿩
//				//�о���� 1byte�� ��Ʈ���� ����.
//				fos.write(readData);
//				//System.out.println(readData);
//			}
			
			//////////////////DISK IO�� ���� �߻��ϴ� �ڵ� /////////////////// 
			
//			��Ʈ���� �����ϴ� ������ �������� ����
			fos.flush();
			
			JOptionPane.showMessageDialog(this,cpName+"���Ϸ� ���� �Ǿ����ϴ�.");
			
			
			
		}finally {
			if(fis != null) {fis.close();}
			if(fos != null) {fos.close();}
		}
	}
	
	
	
	public static void main(String[] args) {
		new FileCopy();
	}

}
