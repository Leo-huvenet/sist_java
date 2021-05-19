package day0310;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

/**
 *	서버에 접속하여 서버에서 보내오는 데이터를 읽기 위한 클라이언트
 * @author user
 */
public class SimpleDataClient {
	
	public SimpleDataClient() throws IOException {
		//2. 소켓을 생성하여 서버에 접속
		Socket client = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {//211.63.89.138 <- 고정ip (public ip), 외부에서 컴퓨터를 식별할 수 있다.
			// 사설ip (private ip) || 유동ip - 외부에서 컴퓨터를 식별할 수 없다.
			//211.63.89.137(localhost) -> loopback 
//			client = new Socket("localhost",65000);
			String ip = JOptionPane.showInputDialog("접속할 서버의 주소 입력\n130,132,133,134,135,153");
			client = new Socket("211.63.89."+ip,65000);
			
			//4.서버에서 보내오는 메시지를 읽기위해서 읽기 스트림을 연결
			dis = new DataInputStream(client.getInputStream());
			//7.서버에서 보내는 메시지 읽기
			String revMsg = dis.readUTF();
			
			
			String sendMsg = JOptionPane.showInputDialog("응답받은 메시지\n"+revMsg);
			//8. 서버로 메시지를 보내기위한 쓰기 스트림 연결
			dos = new DataOutputStream(client.getOutputStream());
			//9. 스트림에 메시지 기록
			dos.writeUTF(sendMsg);
			//10. 스트림의 내용을 목적지로 분출
			dos.flush();
			
		}finally {
			if(dos != null) { dos.close(); }//end if
			if(dis != null) { dis.close(); }//end if
			if(client != null) { client.close(); }//end if
		}
	}//SimpleDataClient
	
	public static void main(String[] args) {
		try {
			new SimpleDataClient();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
