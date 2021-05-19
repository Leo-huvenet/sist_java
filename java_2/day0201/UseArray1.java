package day0201;

/**
 *	일차원 배열의 사용
 * @author SIST
 */
public class UseArray1 {

	public static void main(String[] args) {
		
		//1.배열 선언. 데이터형[] 배열명 = null;
		int[] arr = null;
		//2. 생성. 배열명 = new 데이터형[방의 갯수];
		arr = new int[5]; //생성할 때의 방의 크기는 프로그램 실행도중 변경되지 않는다
		//고정길이형
		System.out.println(arr);//배열명을 출력하면 배열의 시작 주소가 출력
		System.out.println(arr[0] +" "+ arr[4]);
		//3. 값할당. 배열명[방의번호]=값;
		
		arr[0]=2021;
		arr[1]=2;
		arr[2]=1;
		arr[3]=16;
		arr[4]=27;
		
		//4. 값사용. 배열명[방의번호]
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		System.out.println("배열의 방의 개수 : " +arr.length);
		//일괄처리 : 배열의 방은 0번부터 시작하고, length 번째 까지 1씩 증가하면서 도달하게된다.
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}//end for
		
		

	}//main

}
