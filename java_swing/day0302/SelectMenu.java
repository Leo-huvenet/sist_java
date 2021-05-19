package day0302;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class SelectMenu {

		private ArrayList<DataVO2> dataList;
		private int year;
		public SelectMenu(){
			 year = (Calendar.getInstance().get(Calendar.YEAR));
			dataList = new ArrayList<DataVO2>();
		}//HomeWork
		
		public void addDataVO2 (String name, int age) {
			DataVO2 dv = new DataVO2(name,age);
			dataList.add(dv);
		}//addDataVO2
		
		public void inputData() {
			int number = 0;
			
			String InputData = JOptionPane.showInputDialog(null,"메뉴 1. 입력, 2. 출력, 3.종료");
			int menu = Integer.parseInt(InputData);
			switch(menu) {
			case 1 : 
				String InputData1 = JOptionPane.showInputDialog(null,"이름과 나이를 입력해주세요,\n예)홍길동,20");
				String csvData = InputData1;
				StringTokenizer stk = new StringTokenizer(csvData,",");
				String token = stk.nextToken();
				int token2 =Integer.parseInt(stk.nextToken());
				addDataVO2(token,token2);
				inputData(); 
			case 2 : 
				for(DataVO2 av : dataList) {
					
					System.out.println(number+1+" "+av.getName()+" "+av.getAge()+" "+(year-av.getAge()+1));
				}
				inputData(); 
			case 3 :
				int flag = JOptionPane.showConfirmDialog
				(null, "프로그램을 종료하시겠습니까?","에러",JOptionPane.INFORMATION_MESSAGE);//예,아니오,취소 제공
				switch(flag) {
				case JOptionPane.OK_OPTION : System.exit(0); break;
				case JOptionPane.NO_OPTION : inputData();  break;
				case JOptionPane.CANCEL_OPTION : inputData();  break;
			}
		}			
	}
}