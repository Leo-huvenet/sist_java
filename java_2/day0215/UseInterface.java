package day0215;

/**
 *	인터페이스를 사용하기 위한 클래스 
 *	인터페이스는 클래스가 구현(implements)하여 사용할 수 있다.(객체다형성)
 * @author SIST
 */
public class UseInterface implements TestInter{
	
	//구현 인터페이스의 추상method를 반드시 Override해야한다.
		@Override
		public void methodA() {
			System.out.println("methodA");
		}

		@Override
		public void methodB() {
			System.out.println("접근지정자는 광의의 접근지정자로 달라져도 되고, 반환형, method명,매개변수는 같게 만든다.");			
		}
		
		@Override
		public void methodC(int i) {
			System.out.println("default method의 Override : "+i);
		}//default method도 필요에 따라서 Override를 할 수 있다.(안해도됨)
	
	public static void main(String[] args) {
		//인터페이스는 직접 객체화를 할 수 없다.
//		TestInter ti = new TestInter();
		TestInter ti = new UseInterface();
		System.out.println(ti);
		ti.methodA();//구현클래스의 method가 호출 된다.(인터페이스의 추상 method가 호출되는 것이 아니다.)
		ti.methodB();//구현클래스의 method가 호출 된다.(인터페이스의 추상 method가 호출되는 것이 아니다.)
		ti.methodC(2021); //default method의 호출 
		
	}
	
	

}//class
