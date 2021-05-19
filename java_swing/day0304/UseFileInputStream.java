package day0304;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *	8bit Stream을 사용하여 파일의 내용읽기(한글깨짐 - 파일을 복사하면 깨지지 않는다.)
 * @author user
 */
public class UseFileInputStream {


		public UseFileInputStream() {
		File file = new File("c:/dev/temp/java_read.txt"); //파일의 정보를 얻을 수 있다.
		
		try {
			if( file.exists()) {//파일이 존재한다면
				FileInputStream fis = new FileInputStream(file);//파일에  스트림을 연결하고
//				int data = fis.read();//처음 글자를 읽어 들인다.
//				System.out.println(data);
				
				int data = 0;
				while((data = fis.read()) != -1) {//read()로 데이터를 읽어 들이다가 데이터가 없으면 -1이 읽혀진다.
					System.out.println((char)data);//1byte씩 읽어 들인 내용을 출력, 숫자나 영어는 1byte이기 때문에
					//1byte 를 읽어들여 출력하면 깨지지 않지만, 한글은 최소 2byte의 조합으로 글자가 만들어지기
					//때문에 1byte씩 읽어들여 출력하면 깨진다.
				}
				
				//스트림 사용이 끝났다면 스트림을 끊어서 메모리를 확보한다.
				fis.close();
			}else {
				System.err.println(file +"의 경로를 확인해주세요.");
			}
		}catch (IOException ie) {
			System.err.println("파일을 읽는 도중 문제가 발생.");
			ie.printStackTrace();
			}
		}
			public static void main(String[] args) {
			 new UseFileInputStream();
			}
	
}