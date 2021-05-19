package day0218;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class HomeWork {
	
	//숙제1
	public void world (String world) {
		
		Date date = new Date();
		
		switch(world) {
		case "미국": 
			SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy EEEE HH:mm",Locale.US);
			System.out.println(sdf.format(date));
			break;
		case "일본": 
			SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yyyy EEEE HH:mm",Locale.JAPAN);
			System.out.println(sdf1.format(date));
			break;
		case "중국": 
			SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-yyyy EEEE HH:mm",Locale.CHINA);
			System.out.println(sdf2.format(date));
			break;
		default : 
			SimpleDateFormat sdf3 = new SimpleDateFormat("MM-dd-yyyy EEEE HH:mm",Locale.KOREA);		
			System.out.println(sdf3.format(date));
			break;
		}	
	}
	
	//숙제2
	public void sunday() {
		Calendar cal1 =Calendar.getInstance();
		int[] sunday = new int[4];
		//String[] weekTtile = {"일","월","화","수","목","금","토"};

		cal1.set(Calendar.YEAR, 2021);//2021
		cal1.set(Calendar.MONTH,1);//2
		cal1.set(Calendar.DAY_OF_MONTH,1);//1
		cal1.set(Calendar.DAY_OF_WEEK,2);//월
		

		for(int i=cal1.get(Calendar.DAY_OF_MONTH); i<29; i++) {
			cal1.set(Calendar.DAY_OF_MONTH,i);//o
			cal1.get(Calendar.MONTH);
			cal1.get(Calendar.DAY_OF_MONTH);
			cal1.get(Calendar.DAY_OF_WEEK);
					for(int j =0; j<sunday.length; j++) {
						if(cal1.get(Calendar.DAY_OF_WEEK)==1) 
						sunday[j] = cal1.get(Calendar.DAY_OF_MONTH);
					}
				
			}
			
		
		
		for(int value : sunday) {
			System.out.printf("일요일 : %d\t",value);
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		HomeWork hw = new HomeWork();
		hw.world("북한");
		System.out.println("--------------------------------------");
		hw.sunday();
	}

}
