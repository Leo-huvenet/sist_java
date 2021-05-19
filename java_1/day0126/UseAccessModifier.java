package day0126;

/**
 *	instance variable의 접근지정자<br>
 * public : 클래스외부에서 접근가능 패키지가 달라도 접근가능<br>
 * protected : 같은 패키지의 다른 클래스에서 접근가능 패키지가 다르면 자식클래스(상속)만 접근 가능<br>
 * default : 같은 패키지의 다른 클래스에서 접근가능 패키지가 다르면 접근 불가능<br>
 * private : 클래스안에서만 사용가능 외부에서는 접근 불가능
 * @author SIST
 */
public class UseAccessModifier {
	
	public int a;
	protected int b;
	int c;
	private int d;
	
	public static void main(String[] args) {
		UseAccessModifier uam = new UseAccessModifier();
		//변수를 가진 클래스 안에서 객체화를 하면 모든 접근지정자에 상관없이 모든 변수를 사용할 수 있다.
		System.out.println("public : a "+ uam.a);
		System.out.println("protected : b "+ uam.b);
		System.out.println("default : c "+ uam.c);
		System.out.println("private : d "+ uam.d);
	}
}