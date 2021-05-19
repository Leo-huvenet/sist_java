package day0217;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *	Formatter class
 * @author SIST
 */
public class UseSimpleDateFormat {

	public UseSimpleDateFormat() {
		//1.생성 :
		//.M~ 1~9까지 1짜리로 출력 MM 1~9월까지 0이 붙어 출력된다
		//.d~ 1~9까지 1짜리로 출력, dd - 1~9월까지 0이 붙어 출력된다.
		//h,k 1~9까지 1자리로 출력, hh, KK - 1~9일까지 0이 붙어 출력된다.
		//
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh,KK, HH,kk:mm:ss E요일");
		//2. 일
		System.out.println(sdf.format(date ));
		
		//월-일-년의 형식으로 출력
		SimpleDateFormat sdf1= new SimpleDateFormat("MM-dd-yyyy");
		//2. 일
		System.out.println(sdf1.format(date ));
		
		//Locale클래스와 같이 사용하면 다른 나라의 날짜형식으로 출력이 가능
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss EEEE", Locale.KOREA);
		//2. 일
		System.out.println(sdf2.format(date ));
		
		
		
		
		
		
		
		
		
	}
	

	public static void main(String[] args) {
		new UseSimpleDateFormat();
	}

}
