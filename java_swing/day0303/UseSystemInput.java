package day0303;

import java.io.IOException;

/**
 *	�Է��� �ٿ��� Keyboard�϶��� ó��
 * @author user
 */
public class UseSystemInput {
	
	public UseSystemInput() {
//		
//		System.out.println("�ƹ�Ű�� ������ ���͸� ġ����.");
//		////////////////////////////ó�� �ѱ��� �б�////////////////////////////
//		try {
//		int KeyValue = System.in.read();// read() : Ű���� �Է°� �ѱ��ڸ� �Է� ���� �� �ִ�.
//		System.out.println("�Է��� �� : "+KeyValue+"\t"+(char)KeyValue);
//		}catch(IOException ie) {
//			System.err.println("Ű���� �Է��� ������ �߻�"+ie);
//		}
//
//	}
		
		////////////////////////////1byte�� �� ��������[�ѱ� ���� �� ����] �б�////////////////////////////
		
		int readChar =0;
		
	 try {
		while((readChar = System.in.read())!=(13 )) {
			System.out.println("�Է��� �� : "+readChar+"\t"+(char)readChar);
		  }
		}catch(IOException ie) {
			System.err.println("�����߻�");
		}
	}//UseSystemInput
	
	public static void main(String[] args) {
		new UseSystemInput();
	
	}
}
