package day0311;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * �� �� �� ä��Ŭ���̾�Ʈ : Thread ������ : �޽����� ���� ������ �о���̴� �ڵ带 Thread�� ó��
 * �б�� ���Ⱑ ���ÿ� ����ȴ�.
 * @author user
 */
@SuppressWarnings("serial")
public class SimpleChatClient extends JFrame implements ActionListener, Runnable{
	private JTextField jtfTalk;
	private JTextArea jtaTalkDisplay;
	private JButton jbtnConnectServer;
	
	private Socket client;
	private DataInputStream readStream;
	private DataOutputStream writeStream;
	private JScrollPane jspTalkDisplay;
	
	public SimpleChatClient() {
		super("::::::::::::::::::::::::ä��Ŭ���̾�Ʈ::::::::::::::::::::::::::::::::::::::::::::");
		jtfTalk=new JTextField();
		jbtnConnectServer=new JButton("��������");
		jtaTalkDisplay=new JTextArea();
		jtaTalkDisplay.setEditable(false);
		jtfTalk.setBackground(Color.WHITE);
		
		jspTalkDisplay=new JScrollPane( jtaTalkDisplay );
		jspTalkDisplay.setBorder(new TitledBorder("��ȭ����"));
		
		JPanel jpanel=new JPanel();
		jpanel.add(jbtnConnectServer);
		jtfTalk.setBorder(new TitledBorder("��ȭ�Է�"));
		
		add("North",jpanel);
		add("Center", jspTalkDisplay);
		add("South", jtfTalk);
		
		jtfTalk.addActionListener(this);
		jbtnConnectServer.addActionListener(this);
		
		setBounds(100,100,400,500);
		setVisible(true);
		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				try {
					closeClient();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				dispose();
			}
			
		});
		
		jtfTalk.requestFocus();
	}//SimpleChatServer
	
	/**
	 * ������ �����Ͽ� �������Ͽ� ���� �õ�
	 * @throws IOException
	 */
	public void connectToServer() throws IOException{
		if(client == null) {
		String ipAddr = JOptionPane.showInputDialog("���Ӽ����� �ּ� �Է�","211.63.89.");
		
//		client = new Socket(ipAddr , 10000);//������ ����
		client = new Socket(ipAddr , 2021);//������ ����
		//�����͸� �ְ�ޱ� ���� ��Ʈ���� ����
		readStream = new DataInputStream(client.getInputStream()); //�����͸� ���� �غ� �� ����
		writeStream = new DataOutputStream(client.getOutputStream()); //�����͸� �� �غ� �� ����
	
		
		//�޽����� ���ÿ� �о���δ�.
		Thread thread = new Thread(this);
		thread.start();
		
		}
	}	
	
	/**
	 * ��ȭ��밡 �������� �޽��� �б�
	 * @throws IOException 
	 */
	@Override
	public void run(){
		String msg = "";
		
			try {
				while(true) {
				msg = readStream.readUTF();
				jtaTalkDisplay.append(msg+"\n");//��ȭ���� â�� �޽��� ���
				jspTalkDisplay.getVerticalScrollBar().setValue(jspTalkDisplay.getVerticalScrollBar().getMaximum());
				
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	
	/**
	 * �Էµ� �޽����� ������ �����ϴ� ��
	 * @throws IOException
	 */
	public void sendMsg() throws IOException{
		//��ȭ������ �Է��ϴ� JTextField���� �Էµ� ����
		String sendMsg = "[Test]"+jtfTalk.getText();
		//��ȭ����â�� ��ȭ ����
		jtaTalkDisplay.append(sendMsg+"\n");
		//��Ʈ���� ����Ѵ�
		writeStream.writeUTF(sendMsg);
		//��Ʈ���� ������ �������� ����
		writeStream.flush();
	}
	
	public void closeClient()throws IOException {
		if(readStream != null) {readStream.close();}
		if(writeStream != null) {writeStream.close();}
		if(client != null) {client.close();}
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == jbtnConnectServer) {
			try {
				connectToServer();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		if(ae.getSource() == jtfTalk) {
			try {
				sendMsg();
				jtfTalk.setText("");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}//actionPerformed

	public static void main(String[] args) {
		new SimpleChatClient();
	}//main

}//class
