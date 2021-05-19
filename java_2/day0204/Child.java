package day0204;

import java.awt.Frame;

/**
 *	Parent 클래스의 자식클래스
 * @author SIST
 */
public class Child extends Parent{
	int j;
	
	public Child() {
		System.out.println("자식클래스의 기본생성자");
	}//생성자
	
	public void useJ() {
		System.out.println("자식클래스의 method : "+j);
	}
	
	public static void main(String[] args) {
		//자식클래스를 사용하여 객체화
		Child c = new Child();
		//자식클래스의 객체를 통해 부모 클래스의 자원을 사용할 수 있다.
		System.out.println("자식의 변수 : "+c.j );
		c.useJ();
		//코드의 재 사용성 : 부모클래스의 자원(변수,method)
		System.out.println("부모의 변수 : "+c.i);
		c.useI();
		//Object method 호출 : toString() -> 객체의 주소를 문자열로 반환하는 일
		System.out.println(c.toString());
		//java.lang.Object 클래스에서 제공하는 모든 method는 모든 클래스에서 사용할 수 있다.
		//코드의 재사용성
		Integer i = new Integer(10);
		System.out.println(i.toString());
		String s = new String("Hello");
		System.out.println(s.toString());
		Frame f = new Frame();
		System.out.println(f.toString());
		
		
		
	}//main

}
