package day0310;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

/**
 *	������ �����Ͽ� �������� �������� �����͸� �б� ���� Ŭ���̾�Ʈ
 * @author user
 */
public class SimpleDataClient {
	
	public SimpleDataClient() throws IOException {
		//2. ������ �����Ͽ� ������ ����
		Socket client = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {//211.63.89.138 <- ����ip (public ip), �ܺο��� ��ǻ�͸� �ĺ��� �� �ִ�.
			// �缳ip (private ip) || ����ip - �ܺο��� ��ǻ�͸� �ĺ��� �� ����.
			//211.63.89.137(localhost) -> loopback 
//			client = new Socket("localhost",65000);
			String ip = JOptionPane.showInputDialog("������ ������ �ּ� �Է�\n130,132,133,134,135,153");
			client = new Socket("211.63.89."+ip,65000);
			
			//4.�������� �������� �޽����� �б����ؼ� �б� ��Ʈ���� ����
			dis = new DataInputStream(client.getInputStream());
			//7.�������� ������ �޽��� �б�
			String revMsg = dis.readUTF();
			
			
			String sendMsg = JOptionPane.showInputDialog("������� �޽���\n"+revMsg);
			//8. ������ �޽����� ���������� ���� ��Ʈ�� ����
			dos = new DataOutputStream(client.getOutputStream());
			//9. ��Ʈ���� �޽��� ���
			dos.writeUTF(sendMsg);
			//10. ��Ʈ���� ������ �������� ����
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
