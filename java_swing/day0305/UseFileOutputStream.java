package day0305;

import java.awt.JobAttributes;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;



/**
 *	JVM내부의 데이터를 JVM외부로 내보내기위한 스트림.
 * @author user
 */
public class UseFileOutputStream {
	
	public UseFileOutputStream() throws IOException{
		//1. 스트림 생성
//		FileOutputStream fos = new FileOutputStream("c:/dev/temp/write_test.txt");
		
		//c:/dev/temp1 이라는 폴더가 존재하지 않으면 폴더를 생성하고 
		//폴더가 존재하면 폴더를 생성하지 않는다.
		File dir = new File("c:/dev/temp1");
		
		if(!dir.exists())
		{
			dir.mkdirs();
		}
		
		File file = new File(dir.getAbsolutePath()+"/Write_test.txt");

		//파일이 없다면 파일을 생성하고, 파일이 존재한다면 덮어쓸것인지 ConfirmDialog를 사용하여 물어보고, "Yes"까 눌려지면
		//파일에 덮어 쓰고, 그렇지 않다면 파일에 덮어쓰지 않도록 작성

      	boolean overWriteFlag = false;
      	
      	if(file.exists()){ //파일이 존재하는 경우
		switch( JOptionPane.showConfirmDialog(null, file+"파일이 존재하면 덮어 쓸 것입니까?")) {
		case JOptionPane.OK_OPTION: 
			overWriteFlag = true;
		}
	}else { //파일이 없는 경우
		overWriteFlag = true;
	}	
      	////제어에 따라 실행되는 코드////
		if( overWriteFlag) { 
		FileOutputStream fos = null;
		try {
			//1. 스트림 생성
			fos = new FileOutputStream(file);
			//2. 스트림에 파일로 기록 내용 쓰기
			fos.write(65);
			//3. 스트림에 기록된 내용을 목적지로 분출
		}finally {
			//4. 스트림 사용이 종료되었으면 연결을 끊는다.
			if(fos != null ) {
				fos.close();
			 }
		  }
	   }
	}//UseFileOutputStream
	
	
	public static void main(String[] args) {
		try {
			new UseFileOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
