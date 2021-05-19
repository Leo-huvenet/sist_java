package day0216;

import static java.lang.Integer.MAX_VALUE;
//import static java.lang.Byte.MAX_VALUE;//클래스가 다르고 상수명이 같다면 둘 중 하나만 사용가능
import static java.lang.Integer.parseInt;

/**
 *	다른 클래스에 존재하는 static 변수나 static method 를 내 클래스 안에 있는 것처럼 사용할 때.
 * @author SIST
 */
public class UseStaticImport {

	public static void main(String[] args) {
		System.out.println("int의 최고값 : "+ MAX_VALUE);
		
		String str = "2021";
		int i = parseInt(str);
		System.out.println(i);
		
		int j = parseInt(str);
		System.out.println(j);
		
	 
	}

}
