package day0304;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.xml.crypto.Data;

/**
 *	HDD�� �����ϴ� File�� ������ ������� ������� Ŭ������ ���
 * @author user
 */
public class UseFile {
	public UseFile() {
		//1. ��ü����
		File file = new File("c:/dev/temp/java_read.txt");
		System.out.println(file);
		//��ü�� ������� �� �ּҰ� ������ �ʴ� ����? java.lang.Object Ŭ������ toString()�� Override
		System.out.println("������ ����? "+file.exists());
		
		try {
			System.out.println("�Թ���� : "+file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("������ : "+file.getAbsolutePath());
		System.out.println("����� : "+file.getPath());
		
		System.out.println("������ �ִ� ������ : "+file.getParent());
		System.out.println("���ϸ� : "+file.getName());
		
		System.out.println("����? "+file.isFile());
		System.out.println("����? "+file.isDirectory());

		System.out.println("���డ�� : "+file.canExecute());
		System.out.println("�бⰡ�� : "+file.canRead());
		System.out.println("���Ⱑ�� : "+file.canWrite());//����Ұ����� ����.ODD
		
		System.out.println("�������� : "+file.isHidden());
		long lm = file.lastModified();
		System.out.println("���������� ������ ��¥ : "+lm);
		Date date = new Date(lm);
		System.out.println(date);
		
//		System.out.println("���ϻ��� : "+file.delete());
		
		File mk = new File("c:/test/temp");
		System.out.println(mk.mkdir());
		
	}//UseFile
	
	public static void main(String[] args) {
		new UseFile();
	}//main
}
