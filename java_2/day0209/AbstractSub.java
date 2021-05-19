package day0209;

/**
 * 추상클래스의 자식클래스
 * 반드시 부모클래스의 abstract method를 모두 구현해야한다.
 * @author SIST
 */
public class AbstractSub extends AbstractSuper{

	public AbstractSub() {
		System.out.println("자식클래스의 생성자");
	}
	
	//abstract method 구현(Override)
	@Override
	public void typeA() {
		System.out.println("고정 일 : 반환형 없고 매개변수는 없는 형");
	}//A
	
	@Override
	public void typeB(String msg) {
		instanceMethod(); //부모클래스의 일반 method
//		super.typeA(); //추상 method는 직접 호출할 수 없다.
		System.out.println("가변 일 : 반환형 없고, 매개변수 있는 형");
	}//B
	
	@Override
	public int typeC() { //고정 값 : 반환형 있고, 매개변수 없는 형
		return 0;
	}//C
	
	
	@Override
	public int typeD(String m) {// 가변 값 : 반환형 있고, 매개변수 있는 형
		return m.length();
	}//D
	
	
	public static void main(String[] args) {
		//new AbstractSuper(); //직접 객체화 될 수 없다.
		//자식클래스를 객체화 했을 때에만 객체가 생성된다.
		AbstractSub as = new AbstractSub();//자식을 생성하면 추상클래스인 부모클래스가 생성된다.
		as.typeB("가변일");
	}

}
