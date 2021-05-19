package day0216;

import java.util.StringTokenizer;

/**
 *	문자열을 짧은 한 마디로 구분하는 StringTokenizer의 사용.
 * @author SIST
 */
public class UseStringTokenizer {
	
	public UseStringTokenizer() {
		String data = "자바 오라클 앙냥냥 JDBC HTML";
		
		//문자열을 공백으로 구분하여 자를 수 있는 객체 생성.
		StringTokenizer stk = new StringTokenizer(data);
		
		
		
		System.out.println("토큰의 수 : "+stk.countTokens());
//		System.out.println("토큰 : "+stk.nextToken());
//		System.out.println("토큰 : "+stk.nextToken());
//		System.out.println("토큰 : "+stk.nextToken());
//		System.out.println("토큰 : "+stk.nextToken());
//		System.out.println("토큰 : "+stk.nextToken());
//		System.out.println("토큰존재?"+stk.hasMoreTokens());
		
		String token = "";
		while(stk.hasMoreTokens()) {//토큰이 존재하는 지?
			token = stk.nextToken();
			System.out.println(token);
		}//end while
		
		System.out.println("---------포인터는 한 번 지나가면 뒤로 돌아가지 않습니다-----------");
		
		//포인터는 한 번 지나가면 다시 돌지 않는다.
		//다시 반복시키고 싶다면 객체를 새로 생성하여 포인터를 앞으로 이동시킨다.
		stk = new StringTokenizer(data); 
		while(stk.hasMoreTokens()) {//토큰이 존재하는 지?
			token = stk.nextToken();
			System.out.println(token);
		}//end while
	}

	public static void main(String[] args) {
		
		new UseStringTokenizer();
	}

}
