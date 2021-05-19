package day0304;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *	16bit��Ʈ���� ����Ͽ� ���ڿ� ���� �б�( �������� ������ ���� �ܼ� ���ڿ��� �о�鿩 Ȯ�� �� �� �ִ�)
 *	�׷��� �ѱ�,�������� �ȵȴ�.
 * @author user
 */
public class UseFileRdader {
	public UseFileRdader()throws FileNotFoundException, IOException {
		File file = new File("c:/dev/temp/java_read.txt");//UTF-8
//		//���ϰ� �����ϴ� ����� ���� ��Ʈ��
//		FileReader fr = new FileReader(file);
//		//�ٴ����� �о���̴� ����� ���� ��Ʈ��
//		BufferedReader br = new BufferedReader(fr);
		
//		BufferedReader br = new BufferedReader(new FileReader(file));// charset�� �����ʾ� �ѱ��� ������.
		BufferedReader br = null;
		try{
		br = new BufferedReader(
				new InputStreamReader(new FileInputStream(file), "UTF-8"));
			String lineData = "";
			
			while((lineData = br.readLine()) != null) {//readLine() �ٴ����� �о� ���̴µ� \n������ �о���δ�.
				System.out.println(lineData);
			}
		}finally {
			if(br!=null) {br.close();}//�ݵ�� ���������Ѵ�.
		}
	}//UseFileRdader
	
	public static void main(String[] args) {
		try {
			new UseFileRdader();
		} catch (FileNotFoundException fnfe) {
			System.err.println("������ �������� �ʽ��ϴ�.");
			fnfe.printStackTrace();
		} catch (IOException ie) {
			System.err.println("�����б� �۾� �� ���� �߻�");
			ie.printStackTrace();
		}
	}

}
