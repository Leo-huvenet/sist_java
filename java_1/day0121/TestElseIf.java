package day0121;

/**
 *	else if, ���� if<br>
 *	������ ���� ������ ���� �� ���<br>
 *	����) <br>
 *	if(���ǽ�){<br>
 *		���ǿ� ���� �� ������ ����� <br>
 *	}else if(���ǽ�) <br>
 *		���ǿ� ���� �� ������ ����� <br>
 *		.<br>
 *		.<br>
 *	}else{ <br>
 *		��� ���ǿ� ���� ���� �� ������ ����� <br>
 *	}		
 * @author SIST
 */
public class TestElseIf {

	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		
		System.out.println("�Է����� ["+ score + "]�� �Դϴ�.");
		if(score < 0) {
			System.out.println("0������ �۾Ƽ� ����");
		}else if(score > 100) {
			System.out.println("100������ Ŀ�� ����.");
		}else {
			System.out.println("�Է¼���.");
		}//end if

		System.out.println("-------------------------------------------");
		//// ������ �Է¹޾� ��������
		//0~39������ - ����
		//40~59������ - �ٸ����� Ȯ��
		//60~100������ - �հ�
		
		System.out.println("�Է����� ["+ score + "]�� �Դϴ�.");
		if(score>=0 && score<=39) {
			System.out.println("����");
		}else if(score <=59) {//���� ���۹����� ���� �ʾƵ� �ȴ�(�� ����(if)���� ��� �Ǿ��ִ�)
			System.out.println("�ٸ����� Ȯ��");
		}else if(score <=100) {
			System.out.println("�հ�");
		}//end if
		
		//���� args[1]
		//����ȣ�� ���й� �̶�� "A������ �л�"
		//�������� �ڱ�� �̶�� "B������ �л�"
		//�ǿ����̳� ������ �̶�� "C������ �л�"
		//�׷��� �ʴٸ� "D������ �л�" ���
		
		//equals�� ���ڿ��� �����ش�(��ȯ ���� boolean)
		//equals�� String�� ���� ��
		//==�� String�� �ּҰ��� ��
		
		if(args[1].equals("����ȣ") || args[1].equals("���й�")) {
			System.out.println("A�������л�");
		}else if(args[1].equals("������") || args[1].equals("�ڱ��")) {
			System.out.println("B�������л�");
		}else if(args[1].equals("�ǿ���") || args[1].equals("������")) {
			System.out.println("C�������л�");
		}else {
			System.out.println("D�������л�");
		}//end if	
	}
}
