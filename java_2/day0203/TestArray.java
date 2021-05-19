package day0203;

public class TestArray {

	public static void main(String[] args) {
		
		
		//이차원 배열의 행은 일차원배열의 주소를 가진다.
		int[][] arr = new int[2][3];
		//0행에 1,2,3을 출력
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		//1행 10,20,30입력
		int[] temp = {10,20,30};
		arr[1] = temp;
		
		for(int i = 0; i < arr.length ; i++) {
			for(int j = 0; j < arr[i].length ; j++) {
				System.out.printf(arr[i][j] + " ");
				
			}
			System.out.println();
		}
		
		int[] temp1 = arr[0];
		for(int i=0; i < temp1.length; i++) {
			System.out.println(temp1[i]);
		}
		
		//3차원 배열의 면은 이차원 배열의 주소를 가진다.
	}

}
