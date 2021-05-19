package day0218;

import java.util.Random;


/**
 *		
 * @author SIST
 */
public class UseRandom {
	
	public UseRandom() {
		//1.객체화
		Random random = new Random();
		//2. 일
		//정수를 얻는 일
		int i = random.nextInt(); //가능한 모든 int값(양수와 음수)에 걸친 범위의 난수를 반환한다.
		System.out.println("발생된 난수 : "+i);
		System.out.println("범위의 난수 : "+i%10);
		System.out.println("범위의 난수에서 절대값 : "+Math.abs(i%10));
		
		//정수를 얻는 일
		int j = random.nextInt(10);//0 ~ num-1값이 나온다.
		System.out.println("발생된 난수 : "+j);
		
		//실수를 얻는 일
		double d = random.nextDouble();
		System.out.println("발생된 실수 : " +d);
		System.out.println("발생된 실수에서 범위 : " +d*5);
		System.out.println("발생된 실수에서 범위설정. 정수얻기 : " +(int)(d*5));
		
		//불린얻기
		boolean b = random.nextBoolean();
		System.out.println("발생된 boolean : "+b);
		
	}

	public static void main(String[] args) {
		new UseRandom();
	}

}
