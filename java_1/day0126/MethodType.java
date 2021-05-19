package day0126;

/**
 *	method의 4가지 형태
 * @author SIST
 */
public class MethodType {
	
	/**
	 *  고정적인 일을한다 (반환형 없고, 매개변수 없는 형)
	 */
	public void typeA() {
		System.out.println("고정적인 일을한다");
	}//typeA
	
	/**
	 * 가변적인 일을한다 (반환형 없고, 매개변수 있는 형)
	 * @param i
	 */
	public void typeB(int i) {
		System.out.println("고정적인 일 i = "+i);
	}//typeB
	
	/**
	 * 고정 값 (반환형 있고 매개변수 없는 형)
	 * @return
	 */
	public int typeC() {
		return 2021;
	}//typeC
	
	/**
	 * 가변 값 (반환형 있고, 매개변수 있는 형)
	 * @param i
	 * @return
	 */
	public int typeD(int i) {
		
		long l = i; // i*2; int * int =결과가 int를 초과하는 값이 나와서 잘못된 연산결과 할당
		l*=2; 
		if( l > Integer.MAX_VALUE ) 
		{//입력된 값이 int의 양의 최대범위를 초과한다면 long 변수에 int형의 최고 값을 할당 하고
		l = Integer.MAX_VALUE	;                                 
		}
		
		return (int)l; //long을 int로 변환하여 반환
	}//typeD
	
	public static void main(String[] args) {
		//1. 객체화
		MethodType mt = new MethodType();
		//2. method호출
			mt.typeA()	;//고정적인 일 몇번 호출하든 같은 결과가 나온다.
			mt.typeB(0);//가변적인 일 입력값에 따라 다른 결과가 나온다.
			
			int temp = mt.typeC(); //고정 값. 몇번 호출하든 동일한 결과가 반환된다.
			System.out.println("고정값 : " +temp);
			
			int temp1 = mt.typeD(2147483646);
			System.out.println("가변값 : "+temp1);
			//typeC,D는 값이 반환되기때문에  그 값을 변수에 넣어줄 수 있다.
		
	
	}

}
