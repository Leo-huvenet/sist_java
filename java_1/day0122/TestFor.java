package day0122;
/**
 *	�ݺ��� : Ư���ڵ带 ������ ���� ��Ű�� ����<br>
 *	for : ���۰� ���� �� ������ϴ� �ݺ���<br>
 *	����)
 *		for(�ʱⰪ; ���ǽ�; ��.���ҽ�) {<br>
 *			�ݺ����๮���<br>
 *			}
 * @author SIST
 */
public class TestFor {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println("�ȳ��ϼ���?"+i);
		}//end for
		
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}//end for
		
		System.out.println();
		
		for(int i=100; i>0; i--) {
			System.out.print(i+" ");
		}//end for
		
		System.out.println();
		int count=0;
		for(int i=1; i<=100; i++) {
			if(i%2==1)
			System.out.print(i+" ");
		}//end for
		
		System.out.println();
		System.out.println("�ݺ�Ƚ�� : "+ count);
		
		
		int j =2;
		for(int i=1; i<=9; i++) {
			System.out.println(j+" x "+i+" = " +j*i);
		}//end for
	
		System.out.println();
		
		//�빮�� A~Z���� ���
		for(char i='A'; i<='Z'; i++) {
			System.out.print(i);
		}//end for
		
		System.out.println();
		
		//'0'-48, 'A' -65, 'a'-97
		for(char i=1; i<65535; i++) {
			if((i>47 && i<58) || (i>64 && i<91) || (i>96&& i<123)){
				System.out.print(i+" ");
			}	
		}//end for
		
		System.out.println();
		
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum+=i;
		}//end for
		System.out.print("1���� 100������ �� : "+sum);
		
		
		
		
		
		
		
	}

}
