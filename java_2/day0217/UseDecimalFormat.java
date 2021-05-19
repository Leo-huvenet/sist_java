package day0217;

import java.text.DecimalFormat;

/**
 *	숫자포멧
 * @author SIST
 */
public class UseDecimalFormat {

	public UseDecimalFormat() {
	int i =1_000_000; //JDK 1.7에서부터 지원되는 기능 _로 정주상수의 자릿수를 구분할 수 있다.
	// _는 출려되지 않는다.
	System.out.println(i);
	
	DecimalFormat df = new DecimalFormat("0,000,000"); //자릿수를 맞춰 출력할 때
	DecimalFormat df1 = new DecimalFormat("#,###,###");// 데이터가 존재하는 것까지만 출력할 때
	
	System.out.println(df.format(2021));
	System.out.println(df1.format(2021));
	
	DecimalFormat df2 = new DecimalFormat("#,###"); //자릿수를 초과하는 숫자가 들어오면 3자리마다 ,를 넣어준다.
	System.out.println(df2.format(20212021));
	
	//실수의 자릿수도 설정가능
	DecimalFormat df3 = new DecimalFormat("#,###.00"); 
	System.out.println(df3.format(2021.2021));
	
	}
	

	public static void main(String[] args) {
		new UseDecimalFormat();
		
		
	}

}
