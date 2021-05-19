package day0203;

/**
 *	값 복사 : 매개변수가 기본형 데이터형이라면 arguments가 복사되어 전달된다.
 * @author SIST
 */
public class CallByValue {
	
	public void swap(int i , int j) {
		int temp = 0;
		temp = i;
		i=j;
		j=temp;
		System.out.println("swap method 안 i :"+i+",j: "+j);
	}

	public static void main(String[] args) {
		CallByValue cbv = new CallByValue();
		int i = 100;
		int j = 200;
		System.out.println("swap 전 i : "+i+",j : "+j);
		cbv.swap(i, j); //method안에서 변경된 값은 원래 변수에 영향을 주지 않는다.
		System.out.println("swap 후 i : "+i+",j : "+j);
		
		
		
	}

}
