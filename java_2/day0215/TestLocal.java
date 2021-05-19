package day0215;

/**
 *	method안에 클래스를 정의하는 지역클래스
 * @author SIST
 */
public class TestLocal {
	int outI;
	
	public TestLocal() {
		System.out.println("바깥클래스의 생성자");
	}
	//parameter에 final을 붙이면 method 내부에서는 값변경을 막고, 입력한 그대로만 사용하게된다. 
	public void methodA(int paramA,final int paramB) {
			int locA = 0;
			final int locB = 0;
			
			////////////////////////////////지역클래스 시작////////////////////////////////
			class Local{
				
				int i;
				public Local() {
					System.out.println("지역클래스 생성자");
				}//생성자
				
				public void locMethod() {
					System.out.println("지역클래스의 method : 지역클래스의 instance 변수 " +i);
//					paramA = 10; //final이 붙어있지 않은 매개변수, 지역변수 일지라도 값 변경 불가
//					locA = 100; 
					System.out.println("method의 매개변수 "+paramA+", final : "+paramB);
					System.out.println("method의 매개변수 "+locA+", final : "+locB);
				}
			}//Local
			////////////////////////////////지역클래스 종료////////////////////////////////
			//지역클래스의 객체화.
			Local loc = new Local();
			loc.locMethod();//지역클래스의 method 호출
	}//methodA
	
	public void methodB() {
		//외부 method 안에서는 지역클래스를 사용할 수 없다.
		
	}//methodB
	
	public static void main(String[] args) {
			TestLocal tl = new TestLocal();
			tl.methodA(2021, 2);
	}

}
