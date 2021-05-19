package day0209;

/**
 *	상속관계에서 부모클래스를 생성할 때.
 * @author SIST
 */
public abstract class AbstractSuper {
	int i; // instance variable
	
	public AbstractSuper() {
		System.out.println("추상클래스의 기본생성자");
	}//AbstractSuper
	
	public void instanceMethod() {
		System.out.println("부모클래스의 일반 method");
	}
	
	////추상 method ////
	public abstract void typeA(); //abstract method는 final을 기술할 수 없다.
	public abstract void typeB(String msg);
	public abstract int typeC();
	public abstract int typeD(String msg);

	//	public static void main(Stirng[] args) {
//		new AbstractSuper(); //추상클래스는 직접 객체화 할 수 없다.
//	}
}
