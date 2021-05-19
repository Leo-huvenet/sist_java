package day0203;

/**
 * 배열을 사용.
 * @author SIST
 */
public class UseArray {
	
	public void max() {
		int[] temp = {87, 74, 99, 45, 69};
		int max = temp[0]; // 최고 값을 구하기 위해 처음 방의 값을 저장
		
		for(int i =0; i < temp.length; i++) {
			System.out.printf("%-4d", temp[i]);
			if(max < temp[i]) {
				max = temp[i];
			}//end if
		}//end for
		System.out.println("\n 최고점수 "+ max);
	}
		
	public void min() {
		int[] temp = {87, 74, 99, 45, 69};
		int min = temp[0]; // 최소 값을 구하기 위해 처음 방의 값을 저장
		
		for(int i =0; i < temp.length; i++) {
			System.out.printf("%-4d", temp[i]);
			if(min > temp[i]) {
				min = temp[i];
			}//end if
		}//end for
		System.out.println("\n 최소점수 "+ min);
	}
	
	public void sort() {
		int[] score = {87, 74, 99, 45, 69};
		
		int temp = 0;
		for(int i =0; i < score.length-1; i++) {//앞방을 비교
			for(int j =i+1; j < score.length; j++) {//다음방을 비교
			if(score[i] < score[j] ) {//앞방의 값이 다음방의 값보다 작다면
				temp = score[i]; //앞방값을 임시변수에 저장
				score[i] = score[j]; // 다음방의 값을 앞방에 저장
				score[j] = temp; // 임시변수의 값을 다음 방에 저장
				} 
			}	
		}
		for(int i =0; i<score.length; i++) {
			System.out.println(score[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		UseArray ua = new UseArray();
		ua.max();
		System.out.println("-----------------------");
		ua.min();
		System.out.println("-----------------------");
		ua.sort();
		System.out.println("-----------------------");
	
	}

}
