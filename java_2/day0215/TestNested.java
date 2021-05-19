package day0215;

/**
 *	중첩클래스 
 * @author SIST
 */
public class TestNested {
	int insI;
	static int staI;
	
	public TestNested() {
		System.out.println("바깥클래스의 생성자");
	}
	
	public void outInsMethod() {
		System.out.println("바깥클래스의 instance method");
	}
	
	public static void outStaMethod() {
		System.out.println("바깥클래스의 static method");
	}
	
	/////////////////////////////////////////nested class 시작///////////////////////////////////////////////////
	static class Nested{
		//class의 접근 지정자를 static으로 사용하나 클래스영역이 static으로 변경되지는 않는다.
		static int inI;
		//생성자는 가질 수 있지만 객체화하여 사용할 목적으로 만드는 클래스가 아니므로 생성자를 
		//만들지 않는다.
			
		//instance method를 만들 수 있지만 객체화하여 사용해야하므로 만들지 않는다.
		
		public static void inMethod() {
			System.out.println("안쪽 클래스의 method : "+inI);
			//안쪽클래스의 method에서는 바깥 클래스의 자원을 직접 사용할 수 있다.
//			insI = 100; //인스턴스영역의 변수는 사용할 수 없다.
			staI = 100;
			System.out.println("바깥 클래스의 변수 : "+ staI);
			
//   		outInsMethod(); //인스턴스영역의 method는 사용불가
			outStaMethod();
			
		}
	}
	
	/////////////////////////////////////////nested class 종료///////////////////////////////////////////////////
	public static void main(String[] args) {
		//클래스영역안에 static 클래스로 업무를 구분하여 만들어 사용하는 것이므로, 객체화 없이 
		//클래스명.method명으로 호출하여 사용
		Nested.inMethod();
	}

}
