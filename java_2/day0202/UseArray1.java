package day0202;

/**
 *	일차원 배열의 기본형형식 문법 사용
 * @author SIST
 */
public class UseArray1 {
	
	public static void main(String[] args) {
		//1.기본형 형식으로 선언. 데이터형[] 배열명 = (값...};
		int[] arr = {10,20,30,40,5};
		int[] arr1 = new int[] {10,20,30,40,50,60,70,80,90,100}; 
		//입력되는 값의 갯수로 방의 크기가 설정되므로 방의 크기를 설정할 수 없다.
		
		System.out.println("arr 배열의 방의 크기 : "+arr.length);
		System.out.println("arr1 배열의 방의 크기기 : "+arr1.length);
		
		//2.값 변경
		System.out.println(arr[4]);
		arr[4] = 50;
		//3.값 사용
		System.out.println(arr[4]);
		
		//일괄처리 : 마지막방부터 처음 방까지 출력
		for(int i =  arr1.length-1 ;  i > -1; i--  ) {
			System.out.println(arr1[i]);
		}
		//기존의 for를 사용하면 인덱스를 사용한 특정 방의 값만 사용할 수 있다.

		
		System.out.println("------------------------------");
		//개선된 for를 사용하면 모든 방의 값을 사용할 수 있다.
		for(int i : arr1) {
			System.out.println(i);
		}
		
		//char배열
		char[] chArr = new char[6];
		chArr[0] = 'H';
		chArr[1] = 'e';
		chArr[2] = 'l';
		chArr[3] = 'l';
		chArr[4] = 'o';
		chArr[5] = '!';
		
		System.out.println(chArr); //주소가 아닌 문자열이 출력된다.
	}//main

}
