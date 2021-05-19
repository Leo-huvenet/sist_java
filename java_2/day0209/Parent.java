package day0209;

/**
 *	부모클래스 -> 모든 자식클래스가 사용할 공통 특징 정의.
 * @author SIST
 */
public class Parent {
	String name;
	int age;
	
	public void printName() {
		System.out.println( "이름 "+name);
	}
	
	public void printAge() {
		System.out.println( "나이 "+age);
	}
}//class
