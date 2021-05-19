package day0209;

/**
 *	Parent의 자식 클래스
 * @author SIST
 */
public class Child1 extends Parent{
	int child1;
	
	@Override
	public void printName() {
		System.out.println("자식이 Override 한 method");
	}
}
