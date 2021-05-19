package day0208;
/**
 *	부모클래스
 * @author SIST
 */
public class Parent{
	public Parent() {
		this(100);
		System.out.println("부모기본생성자");
	}
	
	public Parent(int i) {
		//this();
		
		System.out.println("부모인자생성자"+i);
	}
}
