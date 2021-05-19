package day0303;

import java.util.Random;

/**
 *	예외 강제발생
 * @author user
 */
public class Usethrow {
	
	/**
	 * 발생된 예외는 대부분은 던져서 처리한다.
	 * 던지는 예외는 발생된 예외를 그대로 던져도 되고, 부모예외처리 클래스를 사용하여 던져도 된다.
	 */
	public void useThrow() throws Exception {
		System.out.println("예외발생 전");
		if(new Random().nextBoolean()) {
			//예외를 강제로 발생시킬려면 : throw new 예외처리클래스();
//		try {
			throw new Exception("예외를 생산");
//		}catch(Exception e) {
//			//발생한 예외를 바로 try~catch로 처리할 수 있다.
//			e.printStackTrace();
//		}
	}
		System.out.println("예외발생 후");
	}

	//호출메소드를 따로 만듦
	public void callUseThrow() {
		try {
			useThrow();	
		}catch(Exception e) {//throws된 예외처리클래스를 그대로 써도되고, 부모예외처리 클래스를 정의해도된다.
			System.err.println("호출한 곳에서 예외 처리"+e);
		}
	}

	public static void main(String[] args) {
		Usethrow ut = new Usethrow();
		ut.callUseThrow();
	}

}
