package day0126;

/**
 *	다른 클래스에 존재하는 instance variable를 사용
 * @author SIST
 */
public class UseInstanceValue {

	public static void main(String[] args) {
		//1.객체화 (클래스명 객체명 = new 클래스명();
		UseAccessModifier uam = new UseAccessModifier();
		//public, protected, default 접근 지정자는 같은 패키지의 다른 클래스에서 사용가능
		
		//2. 변수사용
		System.out.println("public : a "+ uam.a);
		System.out.println("protected : b "+ uam.b);
		System.out.println("default : c "+ uam.c);
	//	System.out.println("private : d "+ uam.d);
	}

}
