package javamemo;

import java.awt.FileDialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.MulticastSocket;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * JavaMemo디자인의 이벤트처리 클래스
 * @author user
 */
public class JavaMemoEvt extends WindowAdapter implements ActionListener {

	private JavaMemo jm; //has a
	private String flagNote; //열기(새글,저장)에 비교를 하기위한 문자열 값
	private String endNote; //닫기 비교
	private String path;//열기나 저장작업이후의 파일의 경로를 저장
	private String fileName; //열기나 저장작업이후의 파일명 저장
	
	
	public JavaMemoEvt( JavaMemo jm ) {
		this.jm=jm;
		flagNote = ""; //null을 JTextArea의 초기값과 일치시키기위한 초기화 값.
		endNote = "";
		path ="";
		fileName ="";
	}                                 
	
	@Override
	public void windowClosing(WindowEvent we) {
		jm.dispose();
	}//windowClosing
	
	@Override
	public void windowClosed(WindowEvent e) {
		try {
			saveFontInfo();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}//windowClosed
	
	/**
	 * 프로그램이 종료되면 JTextArea의 Font정보를 다음 번에도 사용하기위해 파일에 저장한다.
	 * @throws IOException
	 */
	private void saveFontInfo() throws IOException{
		
		//정보파일을 저장할 폴더가 존재하지 않을 수 있다.
		File dir = new File("c:/dev/memo"); 
		if(!dir.exists()) { //저장할 폴더가 존재하지 않으면
			dir.mkdirs(); //폴더를 생성하고
		}
		ObjectOutputStream oos = null;
		try {
			//지정된 경로에 파일스트림 연결
			oos = new ObjectOutputStream(new FileOutputStream(dir.getAbsolutePath()+"/memo.dat"));
			Font font = jm.getJtaNote().getFont(); //JTextArea의 Font정보를 얻는다
			//Font객체를 스트림에 기록
			oos.writeObject(font);
			oos.flush();
		}finally {
			if( oos != null) {oos.close();}
		}
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == jm.getJmiFont()) {//글꼴에서 이벤트를 발생.
			memoFont();
			
		}//end if
		
		if(ae.getSource() == jm.getJmiNew()) {//새글에서 이벤트를 발생.
			newMemo();
		}//end if
		
		if(ae.getSource() == jm.getJmiOpen()) {//열기에서 이벤트를 발생.
			try {
				openMemo();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(jm, "파일을 여는 도중 문제발생");
				e.printStackTrace();
			}
		}//end if
		
		if(ae.getSource() == jm.getJmiNewSave()) {//"새이름으로저장"에서 이벤트를 발생.
			newSaveMemo();
		}//end if
		
		if(ae.getSource() == jm.getJmiSave()) {//"저장"에서 이벤트를 발생.
			 saveMemo();
		}//end if
		
		if(ae.getSource() == jm.getJmiEnd()) { //"닫기"에서 이벤트를 발생
			end();
		}

	}//actionPerformed

	/**
	 * 글꼴 설정
	 */
	public void memoFont() {
		new MemoFont( jm ); //글꼴설정 JDialog 생성.
	}//memoFont
	
	/**
	 * 새글 
	 */
	public void newMemo() {
		JTextArea jtaMemo = jm.getJtaNote();
		
		boolean newMemoFlag = false;
		
		if(!jtaMemo.getText().equals("") && !flagNote.equals(jtaMemo.getText())) { //텍스트 에어리어에 내용 존재하면 저장여부를 묻는다.
			//열기작업후의 내용과 다른지
			switch(JOptionPane.showConfirmDialog(jm, "저장하시겠습니까?")){
			case JOptionPane.OK_OPTION : saveMemo(); newMemoFlag = false; break; //저장 후 새글
			case JOptionPane.NO_OPTION: newMemoFlag = false; break; //저장하지 않고 새글
			case JOptionPane.CANCEL_OPTION: newMemoFlag = true;//현재상태 유지
			}
		}
		
		if(newMemoFlag ) {//제어는 위에서 하고 아래에서는 실행만 한다.
		jtaMemo.setText("");
		jm.setTitle("메모장 - 새글");
		//열기했던 파일명 또는 저장했던 경로와 파일명을 초기화한다.
		path ="";
		fileName = "";
		}
	}
	
	/**
	 * 열기
	 */
	public void openMemo() throws IOException{
		
		//열기했던 내용과 현재 JTextArea 의 내용이 같다면 열기를 하지만 다르다면 저장여부를 묻고 열기를 수행
		boolean openFlag = false;
		if(!flagNote.equals(jm.getJtaNote().getText())) {
			switch(JOptionPane.showConfirmDialog(jm, "저장하시겠습니까?")) {
			case JOptionPane.OK_OPTION : saveMemo(); openFlag = false; break;
			case JOptionPane.NO_OPTION : openFlag = false; break;
			case JOptionPane.CANCEL_OPTION : openFlag = true; break;
			}
		}
		
		if(!openFlag)
		{	
			FileDialog fdOpen= new FileDialog(jm, "열기 - 자바메모장",FileDialog.LOAD);
			fdOpen.setVisible(true);
	
			String path = fdOpen.getDirectory();
			String fileName = fdOpen.getFile();
			
			if(path != null) { //사용자가 파일을 선택하고 열기를 했을 때
				
				BufferedReader br = null; //파일을 읽기위한 스트림 연결
				
				try {
					//선택한 파일의 내용을 읽어 들이기위해 파일에 스트림 생성
					br = new BufferedReader(new FileReader(path+fileName));
					String lineData ="";
					StringBuilder sbReadData = new StringBuilder();
					
					while((lineData = br.readLine()) != null) {//한줄 읽어들여 
						sbReadData.append(lineData).append("\n"); //라인을 누적하고
					}//end while
					
					jm.getJtaNote().setText(sbReadData.toString());// JTextArea에 설정
					flagNote = jm.getJtaNote().getText(); // 기준으로 사용할 변수에 현재 값을 설정
					this.path = path;//열었던 파일경로를 사용하기위한 변수
					this.fileName = fileName;//열었던 파일명을 사용하기위한 변수
					
					jm.setTitle("메모장 - 열기["+ fileName+"]");
					
				}finally {
					if( br != null) {br.close();}
				}//end finally
			}
		}
	}
	
	/**
	 * 저장
	 */
	public void saveMemo() {
		//파일이 열린적이 없거나, 새글이 눌린 이후에는 저장할 파일명이 없으므로 파일다이얼로그를
		//제공하고 저장.
		//파일이 열렸거나 저장이 되었다면 기존의 경로와 파일명을 사용하여 저장.
		try {
			if(path.equals("")) {
				newSaveMemo();
			}else {
				saveFile(path, fileName);
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(jm, "저장작업 중 문제 발생.");
			e.printStackTrace();
		}
		
		
	}
	
	/**
	 * 새이름으로 저장
	 */
	public void newSaveMemo() {
		FileDialog fdSave = new FileDialog(jm,"저장 - 자바메모장",FileDialog.SAVE);
		fdSave.setVisible(true);
		
		String path = fdSave.getDirectory(); //경로
		String fileName = fdSave.getFile(); //파일명
		
		if(path != null) {
			try {
				saveFile(path, fileName);
			} catch (IOException e) {
				JOptionPane.showMessageDialog(jm, "새이름으로 저장하는 중 문제 발생");
				e.printStackTrace();
			}
		}
		
		
	}
	
	/**
	 * 메뉴에서 닫기를 눌렀을 때
	 */
	public void end() {
		
		boolean endFlag = false;
		if(!endNote.equals(jm.getJtaNote().getText())) {
			switch(JOptionPane.showConfirmDialog(jm, "저장하시겠습니까?")) {
			case JOptionPane.OK_OPTION : saveMemo(); endFlag = false; break;
			case JOptionPane.NO_OPTION : jm.dispose(); break;
			case JOptionPane.CANCEL_OPTION : endFlag = true; break;	
			}
		}else {
			jm.dispose();
		}
		
		//글꼴 유지
		try {
			saveFontInfo();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
		
	
	
	/**
	 * 출력 스트림을 사용하여 파일에 저장
	 * @param path
	 */
	private void saveFile(String path, String fileName) throws IOException{
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(path+fileName));
			//텍스트에어리어의 내용을 파일에 저장 
			String text = jm.getJtaNote().getText();
			bw.write(text); //스트림에 내용 기록
			bw.flush(); //스트림에 기록된 내용을 목적지로 분출
			
			this.path = path;//열었던 파일경로를 사용하기위한 변수
			this.fileName = fileName;//열었던 파일명을 사용하기위한 변수
			
			jm.setTitle("메모장 - 저장["+fileName+"]");

			}finally {
			if(bw != null) {bw.close();}
		}
		
	}
	
}//class
