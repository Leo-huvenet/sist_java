package day0119;
/**
3��(����)������
����?��1:��2
*/

class Operator6{

	public static void main(String[] args) {
		int num = 1;
		//num ������ �Ҵ�� �������� ������� �������� �Ǵ��ϱ�
		System.out.println(num + "��(��)"+ (num>-1?"���":"����"));

		int num2=2021;
		//num2������ �Ҵ�� �������� Ȧ������ ¦������ �Ǵ��Ͽ� ����ϴ� �ڵ�
		System.out.println(num2 + "��(��)"+ ((num2%2==0)?"¦��":"Ȧ��"));
	}
}
