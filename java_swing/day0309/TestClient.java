package day0309;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *	서버소켓을 생성한 컴퓨터에 연결을 시도
 *	 211.63.89.138
 * @author user
 */
public class TestClient {

	public static void main(String[] args) {
		//2. 소켓 생성. 서버로 연결을 시도.
		try {
			Socket client = new Socket("211.63.89.138", 50000);
			System.out.println("서버에 접속 하였습니다.");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
