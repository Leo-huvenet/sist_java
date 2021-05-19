package day0315;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class Test{
	static String error ;
	
	public Test()throws ClassNotFoundException {
		Class.forName("day0315.Test1");
	}
	
	
	public static void main(String[] args) throws IOException{
		//API�� ���� e.printStackTrace();���� ����ϴ� ������ Consle�� �ƴ� ����(c:/dev/err.log)��
		//��� 
		File log = new File("c:/dev/err.log");
		PrintStream fos = null;
		fos = new PrintStream(log);
		System.setErr(fos);
		try {
			new Test();
		} catch (ClassNotFoundException e) {
			e.printStackTrace(System.err);
		}finally {
			if(fos !=null) fos.close();
		}
	}
}



