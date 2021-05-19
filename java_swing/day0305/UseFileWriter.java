package day0305;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *	16bit Stream����� ���Ͽ� ���ڿ� ���
 * @author user
 */
public class UseFileWriter {
	
	public UseFileWriter() throws IOException {
		String data = "�ƹ����� �������� �ñ��մϴ�. �ýú� 2����";
		
		File file = new File("c:/dev/temp1/string_data.txt");
		
		BufferedWriter bw = null;
		
		try {
			//1.��Ʈ�� ������ ���Ͽ� �����Ѵ�.
			bw = new BufferedWriter(new FileWriter(file));
			//2. ��Ʈ���� ���Ϸ� ����� ������ ����.
			bw.write(data);
			//3. ��Ʈ���� ��ϵ� ������ ������ ���Ϸ� ����
			bw.flush();//close()�� ���ؼ� ���Ⱑ��
			
			
		}finally {
			//4. ��Ʈ�� ���� ���� ( ��Ʈ���� ��ϵ� ������ �������� ����ǰ� ������ ��������)
			if(bw != null) { bw.close();}
		}
		
		
	}//UseFileWriter
	
	public static void main(String[] args) {
		try {
			new UseFileWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
