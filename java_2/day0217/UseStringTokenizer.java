package day0217;

import java.util.StringTokenizer;

public class UseStringTokenizer {
	

	public UseStringTokenizer() {
		String csvData = "기본문법,변수.연산자,제어문~method,OOP,instance,source code,bytecode";
		//문자열 데이터를 ,를 기준문자열로 사용하여 토큰을 구분
		//기준 문자열 설정은 or 기능을 가진다. (해당 되는 것은 모두 자른다)
		
//		StringTokenizer stk = new StringTokenizer(csvData,",");
		//매개변수 3개인 생성자를 사용하면 토큰을 구분하는 문자열까지 토큰으로 취급할 것인지 선택할 수 있다.
		StringTokenizer stk = new StringTokenizer(csvData,",.~문", false);
		
		while(stk.hasMoreElements()) { //토큰 flag로 구분된 토큰이 존재한다면
			System.out.println(stk.nextToken()); //토큰을 얻고, 포인터를 다음으로 이동시킨다.
			
		}
			
	}

	public static void main(String[] args) {
		new UseStringTokenizer();
	}

}
