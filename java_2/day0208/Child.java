package day0208;
/**
 *	Parent 의 자식 클래스
 * @author SIST
 */
public class Child extends Parent{
	public Child() {
		//super(200);
		this(100);
		System.out.println("자식기본생성자");
	}
	
	public Child(int i) {
		//this();
		System.out.println("자식인자생성자"+ i);
	}
	
}
