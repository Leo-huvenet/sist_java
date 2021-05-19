package day0304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *	키보드에서 입력된 데이터를 JVM내부로 읽어들이기
 *	문제 : 한글이 깨진다.
 *	해결 : 8bit stream 과 16bit stream을 연결  
 *  * @author user
 */
public class UseBufferedReader {
	
	public UseBufferedReader()throws IOException{
//	//키보드에서 읽을 수 있는 스트림 얻기
//	InputStream is = System.in;
//	//8bit 스트림과 16bit 스트림을 연결 
//	InputStreamReader isr = new InputStreamReader(is);
//	//줄단위로 읽기기능이 구현된 스트림을 연결
//	BufferedReader br = new BufferedReader(isr);
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("아무키나 누르고 엔터");
	String text = br.readLine();
	
	System.out.println("입력 값 : " +text);
	
	br.close();//젤 마지막만 끊어도 된다.
	
	}//UseBufferedReader
	
	
	public static void main(String[] args) {
		try {
			new UseBufferedReader();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main

}//class
