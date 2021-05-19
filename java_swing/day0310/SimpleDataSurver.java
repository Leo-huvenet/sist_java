package day0310;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *	�����ڰ� �����ϸ� ������ �޽����� ������ �޽��� ����
 * @author user
 */
public class SimpleDataSurver {
	
	public SimpleDataSurver() throws IOException {
		//1. ServerSocket����( PORT���� )
		ServerSocket server = null;
		Socket client = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		
		try {
			server = new ServerSocket(65000);
			System.out.println("�������� ��...");
			while(true) {
				
			//3. ������ ������ �޴´�.
			client = server.accept();
			System.out.println("������ ����");
			//4. �����ڿ��� �޽����� ������ ���� ���Ͽ��� ��Ʈ���� ��´�.
			String msg = "211.63.89.130������ �����Ͽ����ϴ�. - ��ƴ�..";
			dos = new DataOutputStream(client.getOutputStream());
			//5. ��Ʈ���� �����͸� ���
			dos.writeUTF(msg);
			//6. ������(����)�� ����(����� �����ʹ� ����� ��ǻ���� �������� ���޵ȴ�)
			dos.flush();
			//8. �����ڰ� �������� �޽����� �б����� ��Ʈ�� ���Ͽ��� ���
			dis = new DataInputStream(client.getInputStream());
			//11. �������� �޽����� �б�
			System.out.println("�������� �޽��� : "+dis.readUTF());
			
			}//end while
			
			
			}finally {
			
				if(dos != null) { dos.close(); }
				if(dis != null) { dis.close(); }
				if(client != null) { client.close(); }
				if(server != null) { server.close(); }
			
			} 
		
	}//SimpleDataSurver
	
	public static void main(String[] args) {
		try {
			new SimpleDataSurver();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
