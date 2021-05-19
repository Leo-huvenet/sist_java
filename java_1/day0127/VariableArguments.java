package day0127;

/**
 *	하나의 매개변수에 여러개의 값을 넣어서 사용하는 VariableArguments
 * @author SIST
 */
public class VariableArguments {

	public void year(int ... a) {
		//V.A는 method 안에서 배열로 처리되며,매개변수에 한 개만 사용가능하다.
		for(int i =0; i <a.length; i++) {
			System.out.println(a[i]);
		}
	}//year
	
	//매개변수가 여러개 정의 될 때 V.A는 가장 마지막에만 만들 수 있다.
	public void temp(int i , int a, char ... c) {
		
	}
	
	public static void main(String[] args) {
		VariableArguments va = new VariableArguments();
		va.year();//year(), year(1), year(1,2,3) method의 입력값을 여러개 넣을 수 있다.
		
		
		
	}//main

}//class
