package day0215;

/**
 *	인터페이스 : 다중 상속의 장점을 사용하기 위해서 <br>
 *		약결합의 구현으로 객체간의 유연성을 높이기 위해서.
 *		상수(static변수)
 * @author SIST
 */
public interface TestInter {
	
	//int i; 객체의 크기에 영향을 주는 인스턴스 변수를 가질 수 없다. 
	public static final int i = 100; //상수
	
//	public TestInter() { 객체가 생성될 때 값을 넣을 수 있는 생성자를 가질 수 없다.
//		
//	}
	
//	public void Test() { //일을 할 수 있는 일반 method를 가질 수 없다.
//		
//	}
	
	//abstract이 들어간 abstract method(A,B 차이없음)
	public abstract void methodA();
	
	//abstract이 들어가지 않은 abstract method(차이없음)
	public void methodB();
	
	//default method : body가 있는 method(일을 할 수 있는 method)
	public default void methodC(int i) {
		System.out.println("default method : i = "+i);
	}
	
	
}//interface
