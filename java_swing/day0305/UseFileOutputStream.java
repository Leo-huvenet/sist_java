package day0305;

import java.awt.JobAttributes;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;



/**
 *	JVM������ �����͸� JVM�ܺη� ������������ ��Ʈ��.
 * @author user
 */
public class UseFileOutputStream {
	
	public UseFileOutputStream() throws IOException{
		//1. ��Ʈ�� ����
//		FileOutputStream fos = new FileOutputStream("c:/dev/temp/write_test.txt");
		
		//c:/dev/temp1 �̶�� ������ �������� ������ ������ �����ϰ� 
		//������ �����ϸ� ������ �������� �ʴ´�.
		File dir = new File("c:/dev/temp1");
		
		if(!dir.exists())
		{
			dir.mkdirs();
		}
		
		File file = new File(dir.getAbsolutePath()+"/Write_test.txt");

		//������ ���ٸ� ������ �����ϰ�, ������ �����Ѵٸ� ��������� ConfirmDialog�� ����Ͽ� �����, "Yes"�� ��������
		//���Ͽ� ���� ����, �׷��� �ʴٸ� ���Ͽ� ����� �ʵ��� �ۼ�

      	boolean overWriteFlag = false;
      	
      	if(file.exists()){ //������ �����ϴ� ���
		switch( JOptionPane.showConfirmDialog(null, file+"������ �����ϸ� ���� �� ���Դϱ�?")) {
		case JOptionPane.OK_OPTION: 
			overWriteFlag = true;
		}
	}else { //������ ���� ���
		overWriteFlag = true;
	}	
      	////��� ���� ����Ǵ� �ڵ�////
		if( overWriteFlag) { 
		FileOutputStream fos = null;
		try {
			//1. ��Ʈ�� ����
			fos = new FileOutputStream(file);
			//2. ��Ʈ���� ���Ϸ� ��� ���� ����
			fos.write(65);
			//3. ��Ʈ���� ��ϵ� ������ �������� ����
		}finally {
			//4. ��Ʈ�� ����� ����Ǿ����� ������ ���´�.
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
