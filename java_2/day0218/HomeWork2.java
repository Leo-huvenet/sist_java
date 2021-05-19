package day0218;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;


public class HomeWork2 {

	
	/**
	 * 한국,미국,일본,중국이 입력되면 해당 국가에서 사용하는 날짜형식으로 반환하는 일.
	 * 한국, 미국, 일본, 중국이 아니면 한국으로 설정.
	 * @param nation 국가
	 * @return 날짜형식.
	 */
	public String dateFormat(String nation) {
		String tempDate = "";
		
		Locale tempLoc = Locale.KOREA;
		
		switch(nation) {
			case "미국" : tempLoc=Locale.US; break;
			case "일본" : tempLoc=Locale.JAPAN; break;
			case "중국" : tempLoc=Locale.CHINA; break;
		}
		
		tempDate = new SimpleDateFormat("MM-dd-yyyy EEEE HH:mm",tempLoc).format(new Date());
		
		return tempDate;
		
	}//dateFormat
	
	public void printDate(String date) {
		System.out.println(date);
	}//printDate
	
	/**
	 * 입력한 월에 일요일을 구하는 일
	 * 입력월이 1~12월이 아니라면 1월로 설정
	 * @param month 월
	 * @return 일요일의 일자
	 */
	public List<Integer> sundayList(int month){
		List<Integer> list = new ArrayList<Integer>();
		
		//자바는 사람이 생각하는 월보다 1적음
		int tempMonth = 0;
		if(month > 0 && month < 13) { //1~12월까지만 동작
			tempMonth = --month;
			}
		
		Calendar cal = Calendar.getInstance();//Calendar는 객체를 따로 불러와야한다.
		cal.set(Calendar.MONTH, tempMonth); //입력한 월로 설정
		
		// 월에 마지막날 구하기. cal.getAcutalMaximum(Calendar.DATE);
		int lastDay = cal.getActualMaximum(Calendar.DATE)+1;
		
		for(int tempDay = 1; tempDay < lastDay; tempDay++) {
			//임시일자를 Calendar객체에설정
			cal.set(Calendar.DAY_OF_MONTH, tempDay);
			//설정된 일자가 일요일 인지 판단.
			switch(cal.get(Calendar.DAY_OF_WEEK)) {
			case Calendar.SUNDAY :
				//리스트에 일요일을 추가
//				list.add(tempDay);//autoboxing
				list.add(Integer.valueOf(tempDay)); //autoboxing 이 아니다.
			}
		}
		return list;
	}//sundayList
	
/**
 * 입력된 리스트를 출력하는 일
 * @param list
 */
public void printSunday(int month, List<Integer> list) {

	System.out.println( month +"월의 일요일");
	for(int temp : list) {
		System.out.printf("%-4d", temp);
	}
}
	
	
	public static void main(String[] args) {
		HomeWork2 hw = new HomeWork2();
		hw.printDate(hw.dateFormat("미국"));
		System.out.println("----------------------");
		int month = 2;
		hw.printSunday(month,hw.sundayList(month));
		
		
	}

}
