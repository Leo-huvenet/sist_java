package day0202;

/**
 *	������ �迭�� �⺻������ ���� ���
 * @author SIST
 */
public class UseArray1 {
	
	public static void main(String[] args) {
		//1.�⺻�� �������� ����. ��������[] �迭�� = (��...};
		int[] arr = {10,20,30,40,5};
		int[] arr1 = new int[] {10,20,30,40,50,60,70,80,90,100}; 
		//�ԷµǴ� ���� ������ ���� ũ�Ⱑ �����ǹǷ� ���� ũ�⸦ ������ �� ����.
		
		System.out.println("arr �迭�� ���� ũ�� : "+arr.length);
		System.out.println("arr1 �迭�� ���� ũ��� : "+arr1.length);
		
		//2.�� ����
		System.out.println(arr[4]);
		arr[4] = 50;
		//3.�� ���
		System.out.println(arr[4]);
		
		//�ϰ�ó�� : ����������� ó�� ����� ���
		for(int i =  arr1.length-1 ;  i > -1; i--  ) {
			System.out.println(arr1[i]);
		}
		//������ for�� ����ϸ� �ε����� ����� Ư�� ���� ���� ����� �� �ִ�.

		
		System.out.println("------------------------------");
		//������ for�� ����ϸ� ��� ���� ���� ����� �� �ִ�.
		for(int i : arr1) {
			System.out.println(i);
		}
		
		//char�迭
		char[] chArr = new char[6];
		chArr[0] = 'H';
		chArr[1] = 'e';
		chArr[2] = 'l';
		chArr[3] = 'l';
		chArr[4] = 'o';
		chArr[5] = '!';
		
		System.out.println(chArr); //�ּҰ� �ƴ� ���ڿ��� ��µȴ�.
	}//main

}
