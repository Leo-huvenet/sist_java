package day0308;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *	
 * @author user
 */
@SuppressWarnings("serial")
public class FileCopy extends JFrame implements ActionListener {
	
	private JButton jbtn16bitStream, jbtn8bitStream;

	public FileCopy() {
		super("파일 복사");
		
		jbtn16bitStream = new JButton("16bit 파일선택");
		jbtn8bitStream = new JButton("8bit 파일선택");
		
		
		JPanel panel = new JPanel();
		panel.add(jbtn16bitStream);
		panel.add(jbtn8bitStream);
		
		
		add("Center",panel);
		
		jbtn16bitStream.addActionListener(this);
		jbtn8bitStream.addActionListener(this);
		
		setBounds(100,100,500,250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//FileCopy
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		//FileDialog를 읽기모드로 열기
		FileDialog fdOpen = new FileDialog(this, "복사할 파일 선택",FileDialog.LOAD);
		fdOpen.setVisible(true);
		
		
		String path = fdOpen.getDirectory(); //폴더경로
		String file = fdOpen.getFile(); //파일
		
		if(path != null) {
			//선택한 원본파일을 사용하여 "파일명_cp.확장자" 형태의 이름을 만들어보세요. 
			StringBuilder sb = new StringBuilder(file); //복사할 파일명을 생성할 StringBuilder
			sb.insert(sb.lastIndexOf("."), "_cv");//삽입

			if(ae.getSource() == jbtn16bitStream) {
				try {
					use16bit(path+file, path+sb.toString());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(ae.getSource() == jbtn8bitStream) {
				try {
					use8bit(path+file, path+sb.toString());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}//actionPerformed
	
	public void use16bit(String originalName, String cpName)throws IOException {
		
		BufferedReader br = null; 
		BufferedWriter bw =null; 
	
	try {
		//읽기스트림 연결
		br = new BufferedReader(new FileReader(originalName));
		//쓰기스트림 연결
		bw = new BufferedWriter(new FileWriter(cpName));
		
		String data = "";
		
		while((data = br.readLine()) != null) {//스트림에서 읽기
			//스트림에서 읽어들인 내용 스트림쓰기
//			System.out.println(data);//출력
			bw.write(data);
			
		}
		
		bw.flush();
		JOptionPane.showMessageDialog(this,cpName+"파일로 복사 되었습니다.");
		
	}finally {
		if(br != null) {br.close();}
		if(bw != null) {bw.close();}
		
	}
	
	
	
	
	}
	
	public void use8bit(String originalName, String cpName)throws IOException{
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			//읽기스트림 생성
			fis = new FileInputStream(originalName);
			//쓰기스트림 생성
			fos = new FileOutputStream(cpName);
			
			//////////////////DISK IO가 적게 발생하는 코드 /////////////////// 
			byte[] readData = new byte[512];
			int leng = 0; //배열에 채워진 방의 갯수.
			
			while((leng = fis.read(readData)) != -1) { //파일에서 읽어들인 갯수가 있다면.
				fos.write(readData,0,leng); //배열의 처음방에서 읽어들인 방까지 기록
				
				
			}
			
			
			//////////////////DISK IO가 적게 발생하는 코드 /////////////////// 
			
			////////////////// DISK IO가 많이 발생하는 코드 /////////////////// 
			
//			int readData = 0;
//			
//			while((readData = fis.read()) != -1) {//1byte씩 읽어들여
//				//읽어들인 1byte를 스트림에 쓴다.
//				fos.write(readData);
//				//System.out.println(readData);
//			}
			
			//////////////////DISK IO가 많이 발생하는 코드 /////////////////// 
			
//			스트림에 존재하는 내용을 목적지로 분출
			fos.flush();
			
			JOptionPane.showMessageDialog(this,cpName+"파일로 생성 되었습니다.");
			
			
			
		}finally {
			if(fis != null) {fis.close();}
			if(fos != null) {fos.close();}
		}
	}
	
	
	
	public static void main(String[] args) {
		new FileCopy();
	}

}
