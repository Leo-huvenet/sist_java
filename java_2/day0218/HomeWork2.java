package day0218;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;


public class HomeWork2 {

	
	/**
	 * �ѱ�,�̱�,�Ϻ�,�߱��� �ԷµǸ� �ش� �������� ����ϴ� ��¥�������� ��ȯ�ϴ� ��.
	 * �ѱ�, �̱�, �Ϻ�, �߱��� �ƴϸ� �ѱ����� ����.
	 * @param nation ����
	 * @return ��¥����.
	 */
	public String dateFormat(String nation) {
		String tempDate = "";
		
		Locale tempLoc = Locale.KOREA;
		
		switch(nation) {
			case "�̱�" : tempLoc=Locale.US; break;
			case "�Ϻ�" : tempLoc=Locale.JAPAN; break;
			case "�߱�" : tempLoc=Locale.CHINA; break;
		}
		
		tempDate = new SimpleDateFormat("MM-dd-yyyy EEEE HH:mm",tempLoc).format(new Date());
		
		return tempDate;
		
	}//dateFormat
	
	public void printDate(String date) {
		System.out.println(date);
	}//printDate
	
	/**
	 * �Է��� ���� �Ͽ����� ���ϴ� ��
	 * �Է¿��� 1~12���� �ƴ϶�� 1���� ����
	 * @param month ��
	 * @return �Ͽ����� ����
	 */
	public List<Integer> sundayList(int month){
		List<Integer> list = new ArrayList<Integer>();
		
		//�ڹٴ� ����� �����ϴ� ������ 1����
		int tempMonth = 0;
		if(month > 0 && month < 13) { //1~12�������� ����
			tempMonth = --month;
			}
		
		Calendar cal = Calendar.getInstance();//Calendar�� ��ü�� ���� �ҷ��;��Ѵ�.
		cal.set(Calendar.MONTH, tempMonth); //�Է��� ���� ����
		
		// ���� �������� ���ϱ�. cal.getAcutalMaximum(Calendar.DATE);
		int lastDay = cal.getActualMaximum(Calendar.DATE)+1;
		
		for(int tempDay = 1; tempDay < lastDay; tempDay++) {
			//�ӽ����ڸ� Calendar��ü������
			cal.set(Calendar.DAY_OF_MONTH, tempDay);
			//������ ���ڰ� �Ͽ��� ���� �Ǵ�.
			switch(cal.get(Calendar.DAY_OF_WEEK)) {
			case Calendar.SUNDAY :
				//����Ʈ�� �Ͽ����� �߰�
//				list.add(tempDay);//autoboxing
				list.add(Integer.valueOf(tempDay)); //autoboxing �� �ƴϴ�.
			}
		}
		return list;
	}//sundayList
	
/**
 * �Էµ� ����Ʈ�� ����ϴ� ��
 * @param list
 */
public void printSunday(int month, List<Integer> list) {

	System.out.println( month +"���� �Ͽ���");
	for(int temp : list) {
		System.out.printf("%-4d", temp);
	}
}
	
	
	public static void main(String[] args) {
		HomeWork2 hw = new HomeWork2();
		hw.printDate(hw.dateFormat("�̱�"));
		System.out.println("----------------------");
		int month = 2;
		hw.printSunday(month,hw.sundayList(month));
		
		
	}

}
