package day0303;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import day0302.DataVO;

public class SelectMenu {
	
	
	private List<DataVO> dataList; //사용자가 입력한 데이터를 저장할 목적의 JCF

	public SelectMenu() {
		//사용자가 입력한 데이터를 저장할 목적의 List를 생성
		dataList = new ArrayList<DataVO>();
	}//SelectMen
	/**
	 * 사용자가 그만 둘때까지 제공할 메뉴
	 * 1. 데이터입력, 2.데이터출력, 3.종료
	 */
	public void menu() {
		
		boolean exitFlag = false; //메뉴를 빠져나가기 위한 변수
		String inputMenu ="";
		do {//반복문 안에서 변수를 생성하지않는다
			inputMenu = JOptionPane.showInputDialog("관리프로그램\n메뉴의 번호를 입력해주세요.\n메뉴) 1. 입력, 2. 출력, 3.종료");
			
			try {
			if(inputMenu.equals("1")||inputMenu.equals("2")||inputMenu.equals("3")) {

				if(inputMenu.equals("1")){
					inputData();
				}
				
				if(inputMenu.equals("2")){
					printData();
				}
				
				if(inputMenu.equals("3")){
					exitFlag = closeApp();
				}
			
			
			}else {
				JOptionPane.showMessageDialog(null, "메뉴는 1,2,3 중 하나만 입력해주세요.");
			}//end else
			}catch(NullPointerException npe) {//입력메뉴Dialog에서 x를 눌렀거나 cancel button을 눌렀을 때
				exitFlag = closeApp();
			}
		}while(!exitFlag);
	}//menu
	
	
	/**
	 * 이름과 나이를 CSV형식의 데이터로 입력받아, List에 추가
	 */
	public void inputData() {
		String csvData = JOptionPane.showInputDialog("데이터입력\n입력예)이름,나이");
		
		try {
			String[] tempData = csvData.split(",");//x와 cancel누르면 NullPointerException 발생
			if(tempData.length == 2) {//입력값의 형식 체크, 값을 넣지 않고 "OK"를 누르면 ""가 입력
		
				String name = tempData[0];
				int age = Integer.parseInt(tempData[1]);//NumberFormatException
				
				//입력데이터를 VO에넣고, VO에 List에 추가
				dataList.add(new DataVO(name,age));
				
		}else {
			JOptionPane.showMessageDialog(null, "입력형식은 이름,나이의 형식이어야 합니다.");
		}	
	}catch(NullPointerException npe) {
		JOptionPane.showMessageDialog(null, "입력할 값을 추가해주세요.");
	}catch(NumberFormatException nfe) {
		JOptionPane.showMessageDialog(null, "나이는 숫자 형식이어야 합니다.");
	}
}
	
	/**
	 * 입력된 이름과 나이를 List에서 받아와서 JTextArea에 출력
	 * 번호(for인덱스), 이름(VO), 나이(VO), 태어난해(날짜객체와 나이를 연산)
	 */
	public void printData() {
		StringBuilder sbOutputData = new StringBuilder(); //출력 데이터를 저장할 변수
		sbOutputData.append("번호\t이름\t나이\t태어난해\n");
		sbOutputData.append("------------------------------------------------------------\n");
		if(dataList.isEmpty()) {//데이터가 존재하지 않는경우
			sbOutputData.append("입력된 데이터가 존재하지 않습니다.");
		}
		
		DataVO dv =null;
		int nowYear = Calendar.getInstance().get(Calendar.YEAR);
	
	for (int idx =0; idx < dataList.size(); idx++) {
		dv = dataList.get(idx); //리스트 방에 들어있는 VO를 꺼내와서 저장 
		
		sbOutputData.append(idx+1);
		sbOutputData.append("\t");
		sbOutputData.append(dv.getName());
		sbOutputData.append("\t");
		sbOutputData.append(dv.getAge());
		sbOutputData.append("\t");
		sbOutputData.append(nowYear+dv.getAge()+1);
		sbOutputData.append("\n");
	}
		
	JTextArea jtaDataDispaly = new JTextArea(10,60);
	jtaDataDispaly.setText(sbOutputData.toString());//생성된 출력 데이터를 J.T.A에 추가
	jtaDataDispaly.setEditable(false);//편집불가
	
	JScrollPane jspDataDisplay = new JScrollPane(jtaDataDispaly);
	
	//MessageDialog에 출력
	JOptionPane.showMessageDialog(null, jspDataDisplay);
	}
	
	/**
	 * 종료처리
	 */
	public boolean closeApp() {
		boolean flag = false;
		
		int selectExitBtn = JOptionPane.showConfirmDialog(null, "관리프로그램을 종료하시겠습니까?");
		switch(selectExitBtn) {
		case JOptionPane.OK_OPTION: flag = true; break;
		//OK 일 때만 flag를 true를 주어서 종료한다.
		}
		return flag;
	}//closeApp
}