package day0204;

/**
 *	부모클래스 : 내 자식이 가져야할 공통 특징을 정의.
 * @author SIST
 */
public  class Parent {
	int i;
	
	public Parent() {
		System.out.println("부모의 기본 생성자");
	}//생성자


	public void useI() {
		System.out.println("부모의 method : "+i);
	}//usel
	
}
