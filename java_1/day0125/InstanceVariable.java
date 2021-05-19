package day0125;

/**
 *	객체화 후 사용할 수 있는 instance variable의 사용.<br>
 *  객체화 : 클래스명 객체명 = new 클래스명();<br>
 *  사용 :  객체명.변수명<br>
 * @author user
 */
public class InstanceVariable {
	
	int i; //클래스가 실행 되었다고 메모리에 로딩되지 않는다.
	int j;

	public static void main(String[] args) {
		//인스턴스 변수는 static영역에서 직접 사용불가. ( static 영역은 클래스를 실행하면 가장 먼저 로딩되기
		// 때문에 메모리에 로딩될지 되지 않을 지 알 수 없는 instance 변수를 사용할 수 없다.)
		// System.out.println( i );
		 //System.out.println( j );
		
		//객체화 : instance 변수를 사용하기위해 1번으로 해야할 코드.
		 // 클래스명 객체명=new 클래스명();
		InstanceVariable iv=new InstanceVariable(); // 인스턴스 변수들이 heap메모리에 load된다. 
	// 변수를 사용하기 위한 2번 코드.
		//생성된 객체에는 instance variable들이 들어가기 때문에 "객체명.변수명"으로 해당 변수를 사용할 수 있다.
		 iv.i=2021;
		 System.out.println("iv객체가 가진 i변수 : " + iv.i );
		 System.out.println("iv객체가 가진 j변수 : "+ iv.j );
		
	}//main

}//class
