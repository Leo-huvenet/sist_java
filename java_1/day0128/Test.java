package day0128;

/**
 *	public 접근 지정자가 설정된 class<br>
 *	패키지가 달라도 접근가능
 * @author SIST
 */
public class Test {
	
	public static void main(String[] args) {
		
	//Test2클래스는 package 접근지정자를 설정하고 있으므로 
	//같은 패키지의 다른 클래스에서 접근가능
	Test2 t2 = new Test2();
	System.out.println(t2);
	
	}//main

}//class
