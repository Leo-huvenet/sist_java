package day0125;



/**
 * do~while<br>
 * ���۰� ���� �𸦶� ����ϴ� �ݺ���.<br>
 *  �ּ� 1�� ����, �ִ� ���Ǳ��� ����.<br>
 *  do{<br>
 * 		�ݺ����� ����;<br>
 *  }while( ���ǽ� );
 * @author user
 */
public class TestDoWhile {

	public static void main(String[] args) {

		int i=100; //�ʱⰪ
		do {
			System.out.println("�ȳ��ϼ���?");//�ݺ����� ����.
			i++; //��.���ҽ�
		}while( i < 10 );//���ǽ�.
		
		////// �޴��� ����.
//		boolean exitFlag=false;
//		do {
//			String menu=JOptionPane.showInputDialog("�޴�����\n1.�Է�  2.���  3. ����  4.����");
//			
//			if(menu.equals("4")) {
//				exitFlag=true;
//			}//end if
//			
//		}while( !exitFlag );
		
		// ���� loop
		do {
			System.out.println("���ѷ���");
			break;// do~while Ż��.
		}while( true );
		
		System.out.println("----------------");
		
	}//main

}//class
