package day0129;

/**
 *	생성자의 사용<br>
 *	개발자가 생성자를 하나도 정의하지 않으면 Compiler가 기본생성자를 정의해준다.
 * @author SIST
 */
public class UseConstructor {

	public UseConstructor() {
		System.out.println("기본생성자");
		test();
		//UseConstructor(10);  // 생성자는 method호출하는 문법으로 호출할 수 없다.
	}//생성자
	
	public UseConstructor(int i) {
		System.out.println("매개변수 있는 생성자");
	}//매개변수있는 생성자
	
	public void test() {
		System.out.println("method!!!");
	}//메소드
	
	public static void main(String[] args) {
		//생성자는 객체화하여 호출 가능
		new UseConstructor();
//		UseConstructor uc=new UseConstructor();
//		uc.test()(); //영역이 다르면 객체를 만들고 객체를 통해서 method를 호출
		
	}

}
