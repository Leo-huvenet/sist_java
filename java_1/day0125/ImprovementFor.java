package day0125;

/**
 * JDK 1.5�������� �����Ǵ� ������ for loop<br>
 * �迭, List, Set�� ��� ��(element)�� ���� ����� �� ���.<br>
 *  �ε����� �������� �ʴ´�.
 * @author user
 */
public class ImprovementFor {

	public static void main(String[] args) {
		
		int[] arr= {10, 20, 300, 4000, 50000};
		
		//������ for��� �ۼ��ϴ� �ڵ尡 ª��.
		for(int value : arr) {
			System.out.println( value );
		}//end for
		
		System.out.println("-----------------------");
		for( int i= 0 ; i < arr.length ; i++) {
			System.out.println( arr[i] );
		}
		
		
	}//main

}//class
