package day0203;

/**
 *	값 전달 : 매개변수로 참조형데이터형을 사용한다면, 원본객체의 주소가 그대로 전달된다.
 * @author SIST
 */
public class CallByReference {
	private int i;
	private int j;
	
	public void swap(CallByReference cbr) {
		int temp =0;
		temp = cbr.i;
		cbr.i = cbr.j;
		cbr.j = temp;
		System.out.println("swap method 안 cbr.i : "+ cbr.i+", cbr.j : "+ cbr.j);
		
	}
	
	public static void main(String[] args) {
		CallByReference cbr = new CallByReference();
		cbr.i = 100;
		cbr.j = 100;
		System.out.println("swap 전 cbr.i : "+ cbr.i+", cbr.j : "+cbr.j);
		cbr.swap(cbr);
		System.out.println("swap 후 cbr.i : "+ cbr.i+", cbr.j : "+cbr.j);
		
		
		
	}//main

}
