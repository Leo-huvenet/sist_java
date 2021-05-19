package day0126;

/**
 *	
 * @author SIST
 */
public class MethodType2 {
	
	//항상 인사를 출력하는 method를 만들기
	public void hello() {
		System.out.println("안녕하세요? 최홍만입니다.");
		
	}
	
	//항상 올해를 반환하는 method 고정 값.
	public int year() {
		return 2021;
	}
	
	//입력되는 문자의 Unicode값 출력하는 method. 가변 일
	public void printUnicode(char c) {
		System.out.println(c+"의 unicode 값 : "+(int)c);
	}
	
	//실수를 정수로 변환하여 반환하는 method. 가변 값
	public int casting(double d) {
		return (int)d;
	}
	
	public void work() {
		for(int i = 0; i < 5; i++) {
			for(int j=0; j <5; j++) {
				System.out.print((i==0 || i==4 || j==0|| j==4 ? 1:0 )+" ");
			}//end for
			System.out.println();
		}//end for
	}//work
	
	public static void main(String[] args) {
		//1. 객체화
		MethodType2 mt2 = new MethodType2();
		//2. method 호출
		mt2.hello();//고정 
		int value = mt2.year(); //반환값이 있으면 그것을 변수에 담을 수 있다.
		System.out.println(value);
		
		mt2.printUnicode('A'); //가변 일
		
		value = mt2.casting(2021.0126);//가변 값
		System.out.println(value);
		
		mt2.work();
		
	}//main

}//class
