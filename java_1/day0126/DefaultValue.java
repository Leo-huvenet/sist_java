package day0126;

/**
 *	instance variable의 기본값(default value)
 * @author SIST
 */
public class DefaultValue {
	///instance variable : 클래스안에 instance 영역에서는 그냥 사용할 수 있는 변수///
	
	///기본형 데이터형 
	int a; //정수형 기본값 0
	char b; //문자형 기본 값 : \u0000 (UniCode는 코딩창에서 직접 사용할 수 없다)
	float c; //실수형 기본 값 : 0.0
	boolean d; //불린형 기본값 : false
	///참조형 데이터형
	DefaultValue dv; //class : null
	String s; //String : null
	int[] arr;  //array : null
	
	/**
	 * instance method
	 */
	public void methodA() { //instance 영역에서는 instance variable를 그냥 객체명 없이 사용할 수 있다.
		System.out.println(a);
	}
	
	/**
	 * static method
	 */
	public static void methodB() { 
	//	System.out.println(a); // static 영역에서는 instance variable를 반드시 객체화하여 사용해야한다.
	}
	
	public static void main(String[] args) {
	//인스턴스변수를 왜 메인메소드에서 실행못하는가?
	//java DefaultValue 로 클래스를 실행하면 main method가 가장 처음 실행된다.
	//class field를 실행하지 않는다 - 인스턴스 변수가 메모리에 올라가지 않는다
	//System.out.println(dv); <-안됨 객체화 필요
	
	//객체화 : 클래스명 객체명 = new 클래스명(); - 인스턴스변수가 메모리에 올라간다 - 사용가능
	//new : 객체 생성용 키워드
	DefaultValue dv = new DefaultValue(); //객체화
	//변수의 사용 : 객체명.변수명
	System.out.println("정수형 : "+dv.a);
	System.out.println("문자형 : ["+dv.b+"]");
	System.out.println("실수형 : "+dv.c);
	System.out.println("불린형 : "+dv.d);
	System.out.println("class : "+dv.dv);
	System.out.println("String : "+dv.s);
	System.out.println("array : "+dv.arr);
	System.out.println("--------------------------------------");
	//instance 변수는 객체마다 생성되고 사용되는 변수
	DefaultValue dv1 = new DefaultValue();
	DefaultValue dv2 = new DefaultValue();
	
	dv1.a = 500; 
	System.out.println("dv1.a : "+dv1.a);
	System.out.println("dv2.a : "+dv2.a);
	
	
		
		
		
	}//main

}//class
