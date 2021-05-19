package javamemo;

import java.awt.Font;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RunJavaMemo {

	public RunJavaMemo() throws ClassNotFoundException, IOException {
		//글꼴정보를 저장한 파일에서 글꼴을 읽어들여 디자인 객체(JavaMemo)에 전달
		Font font = null;
		ObjectInputStream ois = null;
		
		try {
			//파일에 스트림 연결
			ois = new ObjectInputStream(new FileInputStream("c:/dev/memo/memo.dat"));
			//파일에 기록된 객체 읽기
			font =(Font)ois.readObject();
		}finally {
			//스트림 연결 끊기
			if(ois != null) {ois.close();}
			//스트림에서 읽어들이기를 실패하더라도 연결은 반드시 끊고, 사용자에게 프로그램은 제공되어야한다.
			new JavaMemo(font);
		}
	}

	
	
	public static void main(String[] args) {
		try {
			new RunJavaMemo();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
