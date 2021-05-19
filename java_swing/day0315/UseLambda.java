package day0315;

/**
 *	구현 클래스를 작성하지 않고, 인터페이스를 쉽게 사용하는 방법
 * @author user
 */
public class UseLambda {
	
	
	
	
	/**
	 * interface를 매개변수로 정의한 method가 존재
	 * @param in1
	 */
	public void method(Inter1 in1) {
		in1.test();
	}
	
	public static void main(String[] args) {
		
		
		//문법 : () -> {};
		Inter1 in1 =()->{ System.out.println("반환형 없고 매개변수 없는 형의 method 구현"); };
		//호출 : method를 호출하면 lambda식으로 정의한 코드가 실행된다.
		in1.test();
		
		//매개변수명은 달라도 된다(데이터 형만 같으면 된다)
		Inter2 in2 =(String name)->{ System.out.println("반환형 없고, 매개변수 있는 형의 method 구현 "+name); };
		//호출
		in2.test("박기범");
		
		//
		Inter3 in3 =()->{return "오늘은 월요일 입니다."; };
		String msg = in3.test();
		System.out.println("반환형 있고, 매개변수 없는 형의 method구현 "+msg);
		
		Inter4 in4 =(String name)->{ return name+"님 안녕하세요?";};
		msg = in4.test("박기범");
		System.out.println("반환형 있고, 매개변수 있는 형의 method 구현 : "+ msg);
		
		//1~100까지 Thread를 사용하여 출력하는 코드 작성
//		Runnable r =()->{
//								for(int i=1; i<101; i++) {
//								System.out.println(i); 
//								}
//							};
//		Thread t = new Thread(r);
//		t.start();
		
		Thread t = new Thread( ()->{
			for(int i=1; i<101; i++) {
				System.out.println(i); 
				}
			} );
			t.start();
			System.out.println("------------------------");
			UseLambda ul = new UseLambda();
//			ul.method(in1);//Lambda식을 사용하여 생성된 객체를 할당
			ul.method(()->{ System.out.println("매개변수로 정의된 lambda"); });
			
		}	
	}


