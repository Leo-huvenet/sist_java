package day0304;

import java.io.File;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *	0304 ����01
 *	����  c:/dev/temp/java_read.txt
 *	����  c:/dev/temp/
 * @author user
 */
public class Work01 {

	public Work01() {
		
		String InputData = JOptionPane.showInputDialog(null,"�������� �Է��ϼ���.");
		File file = new File(InputData);
		
		String directory = file.getName(); //������
		long lmDirectory = file.lastModified(); // ������ ����
		Date date = new Date(lmDirectory); //������ Date Class�� ��ȯ
		long lengDirectory = file.length(); //����(byte)
		
		
		if(file.isDirectory() == true) {
			JTextArea jta = new JTextArea();
			jta.setText("�̸�\t������������\t����\tũ��\n"+
					directory+"\t"+date+"\t"+" "+"\t"+lengDirectory);
			jta.setEditable(false);
			JScrollPane jsp = new JScrollPane(jta);
			JOptionPane.showMessageDialog(null, jsp);
		}else {
			JOptionPane.showMessageDialog(null, "������ ó���� �� �����ϴ�.");
		}
			
	}//Work01
	
	public void type(File file) {
		if((file.isFile()) == true) {
			System.out.println("����");
		}else if(file.isDirectory() == true) {
			System.out.println("����");
		}
	}
	
	public static void main(String[] args) {
		new Work01();
	}

}
