package day0121;

/**
 *	if~else<br>
 * �� �� �ϳ��� �ڵ带 �����ؾ��� �� ���<br>
 * ����) <br>
 * if(���ǽ�){ <br>
 * 		���ǿ� ���� �� ���� ���� <br>
 * }else{ <br>
 * 		���ǿ� ���� ���� �� ���๮�� <br>
 * }
 * @author SIST
 */
public class TestIfElse {

	public static void main(String[] args) {
		//���� �Է¹޾� �Է¹��� ���� ����� �� Ȧ������ ¦������ ���
		int num = Integer.parseInt(args[0]); //���� �Է¹޾� ���� ��ȯ
		System.out.print(num+"��(��) ");
		
		if(num%2==0) {
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}//end else
		
		//���� "���"���� "����"������ ����ϴ� �ڵ�
		
		System.out.print(num+"��(��) ");
		
		if(num>=0) {
			System.out.println("���");
		}else {
			System.out.println("����");
		}//end else
		
		//������
		
		int score = Integer.parseInt(args[1]); //��谪 �׽�Ʈ, -1,0,�߰���,100,101
		System.out.print(score+"�� ");

		if(score>=0 && score<=100) {
			System.out.print("��ȿ����");
		}else {
			System.out.print("��ȿ����"); 
		}//end else
		
	}//main

}//class
