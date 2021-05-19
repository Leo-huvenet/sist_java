package day0122;

/**
 *	일치하는 정수를 비교할 때 사용하는 switch~case문<br>
 *	문법)<br>
 *		switch(변수명){<br>
 *			case 상수 : 실행문장 ;<br>
 *			case 상수 : 실행문장 ;<br>
 *			case 상수 : 실행문장 ;<br>
 *						.<br>
 *			default : 실행문장<br>
 *		}
 * @author SIST
 */
public class TsetSwitchCase {
	public static void main(String[] args) {
//		int i =20;//byte,short,int,char (long은 사용할 수 없다)
//		switch(i) { //정수를 저장한 변수만 사용 할 수 있다.
//		case 0 : System.out.println("ZERO");
//		case 1 : System.out.println("ONE");
//		case 2 : System.out.println("TWO");
//		default : System.out.println("일치하는 상수 없음");
//		}//end switch
		
		// case의 상수는 입력되는 데이터형의 범위까지만 사용할 수 있다.
		// byte i = 0; 는 case 127 : ~ case -128 : 까지 된다

//		int i = 20;
//		switch(i) {//정수를 저장한 변수만 사용할 수 있다.
//		case 48 : System.out.println("ZERO");
//		case 'B' : System.out.println("ONE");
//		case 'C' : System.out.println("TWO");
//		default : System.out.println("일치하는 상수 없음");
//		}//end switch
		
		///////////////////////// char /////////////////////////
//		char i = '0'; //char는 입력되는 문자에 대응하는 Unicode값을 저장
//		switch(i) {
//		case 48 : System.out.println("ZERO");
//		case 'B' : System.out.println("ONE");
//		case 'C' : System.out.println("TWO");
//		default : System.out.println("일치하는 상수 없음");		
//		}//end switch
		
		///////////////////////// char /////////////////////////
		String i = "HTML"; //String은 JavaSE 7(JDK1.7)부터 지원
		switch(i) {
		case "Java" : System.out.println("완벽한 OOP언어");
		case "Oracle" : System.out.println("대용량 데이터베이스");
		case "HTML" : System.out.println("마크업 언어");
		default : System.out.println("일치하는 상수 없음");		
		}//end switch
		
	}//main

}//class
