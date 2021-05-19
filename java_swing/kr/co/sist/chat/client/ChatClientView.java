package kr.co.sist.chat.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class ChatClientView extends JFrame implements ActionListener, Runnable {

	private JTextField jtfServerIp, jtfNick, jtfTalkInput;
	private JTextArea jtaChatView;
	private JButton jbtnConn, jbtnCapture;
	
	private Socket someClient; //
	private DataInputStream readStream; //
	private DataOutputStream writeStream; //
	
	private Thread connThread; //�޽����� �б����� Thread
	
	private JScrollPane jspChatView;
	private String nick;
	
	public ChatClientView() {
		super(":::::::::::ä�� Ŭ���̾�Ʈ::::::::::::::::");
		
		 jtfServerIp=new JTextField(10); 
		 jtfNick=new JTextField(10); 
		 jtfTalkInput=new JTextField(); 
		
		 jtaChatView=new JTextArea();
		
		 jbtnConn=new JButton("��������");
		 jbtnCapture=new JButton("ĸó");//������
		 		
		 JPanel jpControl=new JPanel();
		 jpControl.setBorder(new TitledBorder("��������"));
		 jpControl.add(new JLabel("�����ּ�"));
		 jpControl.add(jtfServerIp);
		 jpControl.add(new JLabel("��ȭ��"));
		 jpControl.add(jtfNick);
		 jpControl.add(jbtnConn);
		 jpControl.add(jbtnCapture);
		 
		 jspChatView=new JScrollPane(jtaChatView);

		 add("Center",jspChatView);
		 add("North",jpControl);
		 add("South",jtfTalkInput);
		 
		 jtfTalkInput.addActionListener(this);
		 jbtnConn.addActionListener(this);
		 jbtnCapture.addActionListener(this);
		 
		 
		 addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent we) {
				try {
					closeCilent();
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					dispose(); //dispose�� ȣ��Ǹ� windowClosed�� �ڵ����� ����ȴ�.
				}
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				System.exit(ABORT);
			}
		 
			 
		 });
		 
		 setBounds(100, 100, 600, 400);
		 setVisible(true);
		 
	}//ChatClientView
	
	public void closeCilent()throws IOException{
		if(readStream != null) { readStream.close();}
		if(writeStream != null) { writeStream.close();}
		if(someClient != null) { someClient.close();}
	}
	
	@Override
	public void run() {
		String revMsg = "";
		
		try { //try�� �ݺ��� �ȿ� ������ ��� ����(�ۿ� �־�ߵȴ�)
		while(true) {
			//�޽����� �о
			revMsg = readStream.readUTF();
			//��ȭâ�� ����ϰ�
			jtaChatView.append(revMsg);	
			jtaChatView.append("\n");
			//��ȭ�� �����Ǹ� ��ScrollBar�� ���� �缳���Ͽ� �ֽŴ�ȭ�� ���� �� �ֵ��� �����Ѵ�.
			jspChatView.getVerticalScrollBar().setValue(jspChatView.getVerticalScrollBar().getMaximum());
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this,"������ ������ ���������ϴ�.");
			e.printStackTrace();
		}
	}//run
	
	/**
	 * ������ �����ϰ�, ��Ʈ���� ������ ��, ��ȭ�� �о� ���δ�.
	 * @param ipAddress
	 * @throws IOException
	 */
	public void connectToServer(String ipAddress) throws IOException{
		someClient = new Socket(ipAddress,2021);
		readStream = new DataInputStream(someClient.getInputStream());
		writeStream = new DataOutputStream(someClient.getOutputStream());
		//�������ڸ��� �г����� ������.
		nick = jtfNick.getText();
		writeStream.writeUTF(nick);
		writeStream.flush();
		
		jtaChatView.setText("������ ���� �Ͽ����ϴ�.\n");
		jtaChatView.append(nick+"(��)�� �����Ͽ����ϴ�. ��ſ� ä�õǼ���.\n");
		
		connThread = new Thread(this);
		connThread.start();
		
	}
	
	/**
	 * ������ �޽����� ������ ��
	 * @param msg
	 * @throws IOException 
	 */
	public void sendMsg(String msg) throws IOException {
		if(writeStream != null){
		//��Ʈ���� �޽ø� ����
		writeStream.writeUTF(msg);
		//��Ʈ���� ��ϵ� ������ ������(����)�� ����
		writeStream.flush();
		}
	}
	
	/**
	 * ��ȭ���� ������
	 */
	public void capture()throws IOException {
		File path = new File("c:/dev/capture");
		
		if(!path.exists()) {
			path.mkdirs();
		}
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(path+"/capture_"+System.currentTimeMillis()+".dat"));
			bw.write(jtaChatView.getText());;
			bw.flush();
			JOptionPane.showMessageDialog(this, "��ȭ������ ���� �Ǿ����ϴ�.");
		}finally {
			if(bw != null) {bw.close();}
		}
	}//capture

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == jbtnConn) {//��������
			String ipAddress = jtfServerIp.getText().replaceAll(" ",""); //���� ���ֱ�
			if(ipAddress.equals("")) {
				JOptionPane.showMessageDialog(this, "������ ip�ּҸ� �Է����ּ���.");
			}else {
				
			
				
			if(connThread == null) {
				try {
					connectToServer(ipAddress);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}else {
				JOptionPane.showMessageDialog(null, "�̹̼����� ������ �Դϴ�.");
			}
		}
	}
		
		if(ae.getSource() == jbtnCapture) {//ĸó
			try {
				capture();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		if(ae.getSource() == jtfTalkInput) {//��ȭ���� �Է�
//			String nick = "["+jtfNick.getText()+"]";
			String talk ="[" +nick+"] "+jtfTalkInput.getText();
			try {
				sendMsg(talk);
				jtfTalkInput.setText("");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
}//actionPerformed

	public static void main(String[] args) {
		new ChatClientView();
	}//main

}//class
