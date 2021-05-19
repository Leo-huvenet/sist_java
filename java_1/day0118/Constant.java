package day0118;
/**
	Constant 사용(변수를 상수처럼 사용하기)<br>
	선언 (class field에만 선언 가능하다)<br>
	public static final 데이터형 상수명 = 값;<br>
	사용) <br>
		상수명<br>
		클래스명.상수명
*/
class Constant{
	//class field
	public static final int MAX_SCORE = 100;//프로그램 안에서 사용되는 기준값
	public static final int MIN_SCORE = 0;



	public static void main(String[] args) {

		
		
		System.out.println("최고점 : " + MAX_SCORE); //상수명
		System.out.println("최하점 : " + Constant.MIN_SCORE); //클래스명.상수명

		int myScore=89;

		System.out.println("획득점수 : " + myScore); 
		// 변수명만 봐도 상수는 대문자 변수는 소문자이기 때문에 구별가능하다
		myScore = 90;
		//MAX_SCORE=99;// 상수는 선언한 문장위치 이외에는 바꿀 수 없다.

		System.out.println("내 점수는 " + myScore +"점 이고, 최고점수는 "+ Constant.MAX_SCORE + "점 입니다. 최고점수와 내점수간의 차이는 " + (MAX_SCORE-myScore)+ "점 입니다.");
	

	//java.lang package에서 제공하는 Wrapper class의 상수 사용
	System.out.println("Byte의 최소값 : "+Byte.MIN_VALUE+", 최대값 : "+Byte.MAX_VALUE);

	byte b1 = 10;
	byte b2 = 20;
	int result = b1+b2;//연산의 결과가 4byte로 발생 Error

	System.out.println( b1+"+"+b2+"="+result);




	}//main
}//class
