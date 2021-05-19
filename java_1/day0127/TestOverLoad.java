package day0127;

/**
 *	클래스에서 같은 이름의 method를 여러개 만들수 있는 Overload 사용<br>
 *	규칙) 접근지정자, 반환형을 달라도 되고,
 *				method명은 같아야하고
 *				매개변수의 개수 또는 타입은 반드시 달라야 한다.
 * @author SIST
 */
public class TestOverLoad {
	
	public void printStar() {
		System.out.println("★");
	}//printStar
	
	/**
	 * 입력받은 수대로 별을 출력하는 일
	 * method Overload(Overloading)
	 * @param count 출력한 별의 갯수
	 */
	public void printStar(int count) {
		for(int i=0; i< count; i++) {
			for(int j=0; j< i+1; j++) {
				System.out.print("☆");
			}//end for
			System.out.println();
		}//end for
	}//printStar
	
	
	public static void main(String[] args) {
		TestOverLoad to = new TestOverLoad();
		to.printStar(); //고정 일(반환형x 매개변수x)
		to.printStar(4);//가변 일(반환형x 매개변수o)
		
	}

}
