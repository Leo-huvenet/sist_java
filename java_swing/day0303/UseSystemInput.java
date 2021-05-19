package day0303;

import java.io.IOException;

/**
 *	입력의 근원이 Keyboard일때의 처리
 * @author user
 */
public class UseSystemInput {
	
	public UseSystemInput() {
//		
//		System.out.println("아무키나 누르고 엔터를 치세요.");
//		////////////////////////////처음 한글자 읽기////////////////////////////
//		try {
//		int KeyValue = System.in.read();// read() : 키보드 입력값 한글자만 입력 받을 수 있다.
//		System.out.println("입력한 값 : "+KeyValue+"\t"+(char)KeyValue);
//		}catch(IOException ie) {
//			System.err.println("키보드 입력중 문제가 발생"+ie);
//		}
//
//	}
		
		////////////////////////////1byte로 된 여러글자[한글 읽을 수 없다] 읽기////////////////////////////
		
		int readChar =0;
		
	 try {
		while((readChar = System.in.read())!=(13 )) {
			System.out.println("입력한 값 : "+readChar+"\t"+(char)readChar);
		  }
		}catch(IOException ie) {
			System.err.println("문제발생");
		}
	}//UseSystemInput
	
	public static void main(String[] args) {
		new UseSystemInput();
	
	}
}
