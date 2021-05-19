package day0121;

/**
 *	if~else<br>
 * 둘 중 하나의 코드를 실행해야할 때 사용<br>
 * 문법) <br>
 * if(조건식){ <br>
 * 		조건에 맞을 때 수행 문장 <br>
 * }else{ <br>
 * 		조건에 맞지 않을 때 수행문장 <br>
 * }
 * @author SIST
 */
public class TestIfElse {

	public static void main(String[] args) {
		//수를 입력받아 입력받은 수를 출력한 후 홀수인지 짝수인지 출력
		int num = Integer.parseInt(args[0]); //값을 입력받아 수로 변환
		System.out.print(num+"은(는) ");
		
		if(num%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}//end else
		
		//수가 "양수"인지 "음수"인지를 출력하는 코드
		
		System.out.print(num+"은(는) ");
		
		if(num>=0) {
			System.out.println("양수");
		}else {
			System.out.println("음수");
		}//end else
		
		//범위비교
		
		int score = Integer.parseInt(args[1]); //경계값 테스트, -1,0,중간값,100,101
		System.out.print(score+"점 ");

		if(score>=0 && score<=100) {
			System.out.print("유효점수");
		}else {
			System.out.print("무효점수"); 
		}//end else
		
	}//main

}//class
