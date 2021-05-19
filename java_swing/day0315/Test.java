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
		//API를 보고 e.printStackTrace();에서 출력하는 내용을 Consle이 아닌 파일(c:/dev/err.log)로
		//출력 
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



