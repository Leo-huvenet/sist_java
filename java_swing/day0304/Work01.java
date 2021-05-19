package day0304;

import java.io.File;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *	0304 숙제01
 *	파일  c:/dev/temp/java_read.txt
 *	폴더  c:/dev/temp/
 * @author user
 */
public class Work01 {

	public Work01() {
		
		String InputData = JOptionPane.showInputDialog(null,"폴더명을 입력하세요.");
		File file = new File(InputData);
		
		String directory = file.getName(); //폴더명
		long lmDirectory = file.lastModified(); // 마지막 수정
		Date date = new Date(lmDirectory); //수정일 Date Class로 변환
		long lengDirectory = file.length(); //길이(byte)
		
		
		if(file.isDirectory() == true) {
			JTextArea jta = new JTextArea();
			jta.setText("이름\t마지막수정일\t유형\t크기\n"+
					directory+"\t"+date+"\t"+" "+"\t"+lengDirectory);
			jta.setEditable(false);
			JScrollPane jsp = new JScrollPane(jta);
			JOptionPane.showMessageDialog(null, jsp);
		}else {
			JOptionPane.showMessageDialog(null, "파일은 처리할 수 없습니다.");
		}
			
	}//Work01
	
	public void type(File file) {
		if((file.isFile()) == true) {
			System.out.println("파일");
		}else if(file.isDirectory() == true) {
			System.out.println("폴더");
		}
	}
	
	public static void main(String[] args) {
		new Work01();
	}

}
