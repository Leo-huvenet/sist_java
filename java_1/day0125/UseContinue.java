package day0125;

/**
 * continue. �ݺ����� ������ �ǳ� �۶�.
 * @author user
 */
public class UseContinue {

	public static void main(String[] args) {
		//1�������� 100������ ���߿� ¦���� ���
		for( int i=1 ; i < 101 ; i++ ) {
			if(  i % 2 == 1) {
				continue;//���������� ������ġ�� ����
			}//end if
			
			System.out.println( i );// Ȧ���� ������ �ǳ� �پ���� �ڵ�
		}//end for
		
		for( int i=1 ; i <101 ; i++) {
//			if( i%3 == 0) {
//				System.out.print("¦ ");
//			}else {
//				System.out.print( i +" ");
//			}//end else
			if(i % 3 == 0 ) {
				System.out.print("¦ ");
				continue;
			}//end if
			System.out.print(i+" ");
		}//end for
		

	}//main

}//class
