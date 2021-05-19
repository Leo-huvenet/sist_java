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
	
	private Thread connThread; //메시지를 읽기위한 Thread
	
	private JScrollPane jspChatView;
	private String nick;
	
	public ChatClientView() {
		super(":::::::::::채팅 클라이언트::::::::::::::::");
		
		 jtfServerIp=new JTextField(10); 
		 jtfNick=new JTextField(10); 
		 jtfTalkInput=new JTextField(); 
		
		 jtaChatView=new JTextArea();
		
		 jbtnConn=new JButton("서버접속");
		 jbtnCapture=new JButton("캡처");//갈무리
		 		
		 JPanel jpControl=new JPanel();
		 jpControl.setBorder(new TitledBorder("접속정보"));
		 jpControl.add(new JLabel("서버주소"));
		 jpControl.add(jtfServerIp);
		 jpControl.add(new JLabel("대화명"));
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
					dispose(); //dispose가 호출되면 windowClosed가 자동으로 실행된다.
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
		
		try { //try가 반복문 안에 있으면 계속 돈다(밖에 있어야된다)
		while(true) {
			//메시지를 읽어서
			revMsg = readStream.readUTF();
			//대화창에 출력하고
			jtaChatView.append(revMsg);	
			jtaChatView.append("\n");
			//대화가 누적되면 종ScrollBar의 값을 재설정하여 최신대화가 보일 수 있도록 설정한다.
			jspChatView.getVerticalScrollBar().setValue(jspChatView.getVerticalScrollBar().getMaximum());
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this,"서버와 연결이 끊어졌습니다.");
			e.printStackTrace();
		}
	}//run
	
	/**
	 * 서버에 연결하고, 스트림을 연결한 후, 대화를 읽어 들인다.
	 * @param ipAddress
	 * @throws IOException
	 */
	public void connectToServer(String ipAddress) throws IOException{
		someClient = new Socket(ipAddress,2021);
		readStream = new DataInputStream(someClient.getInputStream());
		writeStream = new DataOutputStream(someClient.getOutputStream());
		//연결하자마자 닉네임을 보낸다.
		nick = jtfNick.getText();
		writeStream.writeUTF(nick);
		writeStream.flush();
		
		jtaChatView.setText("서버에 접속 하였습니다.\n");
		jtaChatView.append(nick+"(으)로 접속하였습니다. 즐거운 채팅되세요.\n");
		
		connThread = new Thread(this);
		connThread.start();
		
	}
	
	/**
	 * 서버로 메시지를 보내는 일
	 * @param msg
	 * @throws IOException 
	 */
	public void sendMsg(String msg) throws IOException {
		if(writeStream != null){
		//스트림에 메시리 쓰고
		writeStream.writeUTF(msg);
		//스트림에 기록된 내용을 목적지(소켓)로 분출
		writeStream.flush();
		}
	}
	
	/**
	 * 대화내용 갈무리
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
			JOptionPane.showMessageDialog(this, "대화내용이 저장 되었습니다.");
		}finally {
			if(bw != null) {bw.close();}
		}
	}//capture

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == jbtnConn) {//서버접속
			String ipAddress = jtfServerIp.getText().replaceAll(" ",""); //공백 없애기
			if(ipAddress.equals("")) {
				JOptionPane.showMessageDialog(this, "서버의 ip주소를 입력해주세요.");
			}else {
				
			
				
			if(connThread == null) {
				try {
					connectToServer(ipAddress);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}else {
				JOptionPane.showMessageDialog(null, "이미서버에 접속중 입니다.");
			}
		}
	}
		
		if(ae.getSource() == jbtnCapture) {//캡처
			try {
				capture();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		if(ae.getSource() == jtfTalkInput) {//대화내용 입력
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
