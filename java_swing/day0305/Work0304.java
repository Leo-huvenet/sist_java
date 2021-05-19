package day0305;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * 폴더를 입력했을 때 폴더안의 하위폴더와 파일 정보를 출력하는
 * @author user
 */
public class Work0304 {

	/**
	 * 경로를 입력받아 경로내의 하위 폴더, 파일을 File[]로 받아와서 반환하는 일
	 * @return
	 */
	public File[] setPath() {
		File[] files = null;
		
		String path = JOptionPane.showInputDialog("경로를 입력하세요.\n예) c:/dev/");
		
		if(path != null && !path.equals("")) { //아무것도 입력하지 않았는지 유효성 검증
			
			File file = new File(path);
			
			if(file.exists()) { //입력한 경로가 존재하는지?
			
				if(file.isDirectory()) {//폴더인지?
					
					files = file.listFiles(); //폴더라면 하위 자원을 모두 가져온다.
					
				}else {
					JOptionPane.showMessageDialog(null,"파일을 처리할 수 없습니다. 폴더를 입력해주세요.");
				
				}
			}else {
				JOptionPane.showMessageDialog(null,"경로가 존재하지 않습니다. 경로를 확인해주세요.");
			}
			
		}else {
			 JOptionPane.showMessageDialog(null,"경로를 입력해 주세요.");
		}
		
		return files;
	}//setPath
	
	/**
	 * 매개변수로 선언된 File[]을 사용하여 출력하는 일
	 * @param contentFile
	 */
	public void printContent ( File[] contentFile) {
		//출력데이터 생성
		StringBuilder sbContent = new StringBuilder();
		sbContent.append("이름\t마지막 수정일\t유형\t크기\n")
		.append("---------------------------------------------------------------------------------\n");
		if(contentFile == null || contentFile.length == 0) {
			sbContent.append("폴더에 하위 폴더나 파일이 존재하지 않습니다.");
		}
		
		if(contentFile != null) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		boolean fileFlag = false;
		for(File temp : contentFile ) {
			
			fileFlag = temp.isFile();
			
			sbContent.append( temp.getName()).append("\t")
			.append(sdf.format(new Date(temp.lastModified()))).append("\t")
			.append(fileFlag?"파일":"폴더");
			
			if(fileFlag) { //파일인경우에만 크기(byte수) 를 출력
				sbContent.append("\t").append(temp.length()).append("byte");
			}
			
			sbContent.append("\n");
		}
		}//end if
		
		JTextArea jtaContent = new JTextArea(sbContent.toString(), 15, 80);
		jtaContent.setEditable(false);
		
		JScrollPane jspContent = new JScrollPane(jtaContent);
		
		JOptionPane.showMessageDialog(null, jspContent);
		
	}

	public static void main(String[] args) {
		Work0304 work = new Work0304();
		File[] files = work.setPath();
		work.printContent(files);
	}

}
