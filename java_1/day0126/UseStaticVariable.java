package day0126;

/**
 *	공용변수의 사용
 * @author SIST
 */
public class UseStaticVariable {

	static int a ; // static variable (class variable)
	static double b ;
	
	/**
	 * instance method
	 */
	public void methodA(){
		System.out.println(a);
	}//methodA
	
	/**
	 * static method
	 */
	public static void methodB(){
		System.out.println(a);
	}//methodB
	
	public static void main(String[] args) {
		//static 변수는 클래스가 실행되는 순간에 메모리에 올라가기 때문에 클래스의 어디에서든 사용할 수 있다
		System.out.println(a);
		System.out.println(b);
		System.out.println("--------------------------------------");
		
		//static 변수는 특정객체에 속해있는 변수가 아니므로 객체명.변수명으로 사용하지 않는다.
		UseStaticVariable usv = new UseStaticVariable();
		UseStaticVariable usv1 = new UseStaticVariable();
		
		usv.a=100;//usv객체의 a변수를 변경하면 usv1객체의 a도 같이 변경된다.
		System.out.println("usv.a "+ usv.a); //인스턴스변수 방식으로 쓸 수는 있지만 옳은방법이 아니다.
		System.out.println("usv.b "+ usv.b);
		
		System.out.println("usv1.a "+ usv1.a); //다른 객체가 변경한 값을 적용받는다.
		System.out.println("usv1.b "+ usv1.b);
		System.out.println("--------------------------------------");
		
		System.out.println(	UseStaticVariable.a);//static 변수는 어떤 객체에도 속해있지 않은 공용변수이므로
		//(클래스명.변수명)으로 사용한다.
		
		
		
		
	}//main

}//class
