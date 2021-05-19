package javamemo;

import java.awt.Font;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RunJavaMemo {

	public RunJavaMemo() throws ClassNotFoundException, IOException {
		//�۲������� ������ ���Ͽ��� �۲��� �о�鿩 ������ ��ü(JavaMemo)�� ����
		Font font = null;
		ObjectInputStream ois = null;
		
		try {
			//���Ͽ� ��Ʈ�� ����
			ois = new ObjectInputStream(new FileInputStream("c:/dev/memo/memo.dat"));
			//���Ͽ� ��ϵ� ��ü �б�
			font =(Font)ois.readObject();
		}finally {
			//��Ʈ�� ���� ����
			if(ois != null) {ois.close();}
			//��Ʈ������ �о���̱⸦ �����ϴ��� ������ �ݵ�� ����, ����ڿ��� ���α׷��� �����Ǿ���Ѵ�.
			new JavaMemo(font);
		}
	}

	
	
	public static void main(String[] args) {
		try {
			new RunJavaMemo();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
