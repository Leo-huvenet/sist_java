package day0126;

public class HomeWork {

	//�ڽ��� �̸��� ����ϴ� ���� �ϴ� method
	public void name() {
		System.out.println("�����");
	}
	//�ڽ��� �̸� �̴ϼ� ù ���ڸ� ��ȯ�ϴ� method
	public void lastname(String i) {
		System.out.println(i.charAt(0));
	}

	//������ �Է� �޾� ������ ������ ����ϴ� method
		/*������ 0~100�� ���̶�� ������ ������
		�׷��� ������ "�߸��� ����"�� ����Ѵ�
		���� 0~39 -����, 40~59 -�ٸ� ���� ����, 60~100 -�հ� */
	public void jumsu(int i) {
		if(60<=i && 100>=i) {
			System.out.println("�հ�");
		}else if(40<=i) {
			System.out.println("�ٸ� ���� ����");	
		}else if(0<=i) {
			System.out.println("����");
		}else {
			System.out.println("�߸��� ����");
		}
	}
	
	//���ڸ� �Է¹޾� �ش� ���ڰ� "�빮��","�ҹ���","����"������ �Ǵ��Ͽ� ����ϴ� method
	public void unicode(char i) {
		if(i>=48 && i<=57) {
			System.out.println("����");
		}else if(i>=65 && i<=90) {
			System.out.println("�빮��");
		}else if(i>=97 && i<=122) {
			System.out.println("�ҹ���");
		}
	}
	//�¾ �ظ� �Է¹޾� ���̸� ��ȯ�ϴ� method
	//���̸� ���ϴ� �� : ���� - �¾�� +1
	public int age(int i) {
		int a = 2021-i+1;
		return a;
	}
	
	//�� ���� ���� �Է� �޾� �� �� ū ���� ��ȯ�ϴ� method
	public long max(long a, long b) {
		long max = 0;
		if(a<b) {
			max = b;
		}else if(a>b) {
			max = a;
		}
		return max;
	}
	
	public static void main(String[] args) {
	//��ü����
	HomeWork hw = new HomeWork();
	//�޼ҵ弱��
	hw.name();
	hw.lastname("�����");
	hw.jumsu(33);
	hw.unicode('c');
	
	long temp = hw.age(1998);
	System.out.println(temp);
	
	
	temp = hw.max(8l, 7l);
	System.out.println(temp);
	
	}//main

}//class
