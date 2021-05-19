package day0215;

/**
 *	익명클래스의 사용
 * @author SIST
 */
public class UseAnonymous {
	
	public void useSuperInterA(SuperInterA sia) {
		sia.methodA();
	}
	
	public void useSuperInterB(SuperInterB sia) {
		sia.methodA();
		sia.methodB();
	}
	
	public static void main(String[] args) {
		//객체화 
		UseAnonymous ua = new UseAnonymous();
		//anonymous inner class를 사용하여 method 호출
		ua.useSuperInterA(new SuperInterA() {
			@Override
			public void methodA() {
				System.out.println("methodA");
				test();
			}
			//클래스가 이름이 없으므로 생성자를 정의할 수 없다.
			
			
			//정의된 method는 anonymous inner class안에서만 호출될수 있다.
			public void test() {
				System.out.println("anonymous inner class에서 정의한 method");
			}
		});
		
		//useSuperInterB()를 anonymous inner class를 사용하여 호출
		ua.useSuperInterB(new SuperInterB() {

			@Override
			public void methodA() {
				System.out.println("A");
			}
			@Override
			public void methodB() {
				System.out.println("B");
			}
		});
	}

}
