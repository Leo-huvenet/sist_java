package kr.co.sist.chat.server;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.List;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;




@SuppressWarnings("serial")
public class ChatServerView extends JFrame implements ActionListener, Runnable {
	
	private JList<String> clientView;
	private DefaultListModel<String> dlmClientStatus;
	
	public static List<ChatServerHelper> connList;//접속자를 관리하기위한 List
	private ServerSocket server; //접속자 소켓을 받기위한 ServerSocket
	private Thread connThread; //접속자를 디자인과 동시에 처리하기위한 Thread
	
	public ChatServerView() {
		super(":::::::::::::채팅 관리자:::::::::::::::::");
		
		//접속자를 관리할 List를 생성한다.
//		connList = new ArrayList<ChatServerHelper>(); // 동시접근 가능
		connList = new Vector<ChatServerHelper>(); // 동시접근이 불가능
		
		dlmClientStatus=new DefaultListModel<String>();
		dlmClientStatus.addElement("채팅 관리자");
		
		clientView=new JList<String>( dlmClientStatus );
		JButton jbtServerStart=new JButton("서버가동");
		
		JScrollPane jspClientView=new JScrollPane( clientView  );
		jspClientView.setBorder(new TitledBorder("접속자 정보"));
		
		JPanel jp=new JPanel();
		jp.add( jbtServerStart );
		
		add("Center", jspClientView);
		add("South",jp);
		
		jbtServerStart.addActionListener(this);
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				try {
					closeServer();
				} catch (IOException e1) {
					e1.printStackTrace();
				}finally {
					dispose();
				}
			}

			@Override
			public void windowClosed(WindowEvent e) {
				System.exit(JFrame.ABORT);
			}
			
		});
		
		setBounds(100,100, 400, 600);
		setVisible(true);
		
	}//ChatserverView
	
	/**
	 * ServerSocket 종료
	 */
	public void closeServer()throws IOException {
		if(server != null) {server.close();}
	}
	
	/**
	 * 서버소켓을 열고 접속자를 받는다.
	 */
	@Override
	public void run() {
		try {
			int port = 2021;
			server = new ServerSocket(port);
			
			dlmClientStatus.addElement("서버가 구동되었습니다.");
			dlmClientStatus.addElement("사용포트 ["+port+"]");
			
			ChatServerHelper csh = null;
			for(int cnt = 0;;cnt++) {
				//접속자를 받고
				csh = new ChatServerHelper(server.accept(), dlmClientStatus, cnt);
				//접속자 관리 리스트에 추가한 후
				connList.add(csh);
				//메시지를 읽을 수 있도록 Thread를 실행한다.
				csh.start();
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "서버구동 중 문제가 발생하였습니다.");
			e.printStackTrace();
		}
		
	}//run

	@Override
	public void actionPerformed(ActionEvent e) {
		if(connThread == null) {//서버가 실행된적이 없음 -> 서버소켓 생성하여 접속자를 받는다.
			connThread = new Thread(this);
			connThread.start();
			
		}else {//서버가 실행되었습니다.
			JOptionPane.showMessageDialog(this, "서버가 이미 실행중입니다.");
		}
	}//actionPerformed

	public static void main(String[] args) {
		new ChatServerView();
	}//main

}//main
