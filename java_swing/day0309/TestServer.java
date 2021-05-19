package day0309;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


/**
 *	포트를 열고 접속자 컴퓨터가 접속하기를 기다리는 일
 *	컴퓨터에서 열리는 포트의 갯수는 0~65535까지 이다.
 *	그중 1024번 이하의 포트는 이미 사용 중인 경우가 많으므로 포트 충돌(선점)
 *	1024번 이후의 포트를 열어서 사용
 * @author user
 */
public class TestServer {
	
	
	public static void main(String[] args) {
		try {
			//1. 서버컴퓨터에서 Port를 연다. (Port는 선점이기 때문에 같은 프로그램 일지라도 두 번 실행하면 에러)
			ServerSocket server = new ServerSocket(50000);
			System.out.println("서버실행 중");
			//3. 클라이언트에서 Socket을 생성하면 서버에 연결을 시도한다.
			// 연결을 시도하는 Socket을 허가하여 받는다.
			Socket client = server.accept(); //클라이언트가 들어올 때까지 대기
			System.out.println("접속자 접속 : "+client);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
