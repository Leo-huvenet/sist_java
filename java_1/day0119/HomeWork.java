package day0119;


class HomeWork{

	public static void main(String[] args) {
		// 1������
		int variable = 20;
		System.out.println("~"+variable+"���� : "+(~variable+1));

		/* 2������

		��� 
		31
		temp1 = 11 / temp2 = 19

		temp2�� ������������ ���� ���� ����ϰ� ���ҿ����� �����ϱ� ������ ù��° �޼ҵ忡���� 20 �״�� ��µǾ� temp1�� ��������*/

		//3������ 
		int temp3 = 0;
		temp3 = Integer.MAX_VALUE<<4;
		System.out.println("temp3 �� : "+temp3);
		//2147483647  

		//4������
		System.out.println("Integer�� ���� 2Byte �� : "+(Integer.MAX_VALUE & 65535));

		
	}
}
