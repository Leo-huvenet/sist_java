package day0218;

import java.util.Random;


/**
 *		
 * @author SIST
 */
public class UseRandom {
	
	public UseRandom() {
		//1.��üȭ
		Random random = new Random();
		//2. ��
		//������ ��� ��
		int i = random.nextInt(); //������ ��� int��(����� ����)�� ��ģ ������ ������ ��ȯ�Ѵ�.
		System.out.println("�߻��� ���� : "+i);
		System.out.println("������ ���� : "+i%10);
		System.out.println("������ �������� ���밪 : "+Math.abs(i%10));
		
		//������ ��� ��
		int j = random.nextInt(10);//0 ~ num-1���� ���´�.
		System.out.println("�߻��� ���� : "+j);
		
		//�Ǽ��� ��� ��
		double d = random.nextDouble();
		System.out.println("�߻��� �Ǽ� : " +d);
		System.out.println("�߻��� �Ǽ����� ���� : " +d*5);
		System.out.println("�߻��� �Ǽ����� ��������. ������� : " +(int)(d*5));
		
		//�Ҹ����
		boolean b = random.nextBoolean();
		System.out.println("�߻��� boolean : "+b);
		
	}

	public static void main(String[] args) {
		new UseRandom();
	}

}
