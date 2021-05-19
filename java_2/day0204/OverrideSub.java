package day0204;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *	Method Override( Overriding ) 연습
 *	Override : 부모클래스의 method가 자식클래스의 상황과 맞지 않는다면, 
 *	자식클래서에서 부모클래스의 method와 동일한 method를 정의하여 사용하는 것
 *
 * @author SIST
 */
public class OverrideSub extends OverrideSuper{
	
	public String toString() {//부모에서 제공하는 기능이 자식과 맞지 않는다면 자식클래스에서 method를 재정의
		return "주소가 싫어요!!!";
	}//toString
	
//	public String superMethod() { //번환형이 다르면 Override 규칙에 위배되므로 Error발생
//		System.out.println("자식클래스에서 변환!!!");
//		return "";
//	}//supermethod

//	public void superMethod(int i) { //매개변수를 선언하면 method호출이 다르게 되기 때문에 Override가 성립되지 않는다.
//		System.out.println("자식클래스에서 변환!!!");
//	}//supermethod
	
	public void superMethod1() { //Override 된 method에서 접근지정자는 광의의 접근 지정자로 변경 가능
		//부모 : protected - > 자식 : public
		System.out.println("자식클래스에서 변환!!!");
	}//protected void superMethod1()
		
		/**
		 * 비추천메소드 : 요즘애들은 라떼와 달라서...
		 */
		@Deprecated
		public void test() {
			System.out.println("HDD"); //Hard Disk Drive ->후덜덜
		}
		
	//	@SuppressWarnings("unused")//method내 전체 적용
		@SuppressWarnings("unused")
		public void temp() {
			
		//	@SuppressWarnings("rawtypes")//바로 아랫줄의 코드만 적용
			int i =0;
			int j =0;
			
			@SuppressWarnings("rawtypes")
			List list = new ArrayList();
		}
	
	
	public static void main(String[] args) {
		OverrideSub os = new OverrideSub();
		System.out.println("----------------------Object class의 toSting() Overide------------------------");
		System.out.println(os.toString()); // Object 클래스에서 제공하는 toString()가 호출 =>주소
		//System.out.println() 에 instance를 넣어 출력하면 그안에서 toString()가 호출되어 주소가 출력
		System.out.println(os);
	
		os.superMethod();
		os.superMethod1();
		System.out.println("--------------------------------------------------------");
		
		Date date = new Date();
		System.out.println(date);
	//	System.out.println(date.getYear());
		
		os.test();
		
	}//main
	

}
