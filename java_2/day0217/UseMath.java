package day0217;

/**
 *	Math class <br>
 * �����ڰ� ���������ʾ� ��ü ������ ���� �ʰ� ����ϴ� Ŭ����.
 * @author SIST
 */
public class UseMath {
	
	
	public UseMath() {
//		Math m = new Math(); // �����ڰ� �����Ƿ� ��ü ������ �� ����.
		int i = -2021;
		double d = 2021.02;
		System.out.println(i+"�� ���밪 : "+ Math.abs(i));
		System.out.println(d+"�� ���밪 : "+ Math.abs(d));
		
		d = 10.1;
		System.out.println(d+"�ø� "+Math.ceil(d));
		
		d = 10.01;
		System.out.println(d+"�ø� "+Math.ceil(d));
		
		d = 10.001;
		System.out.println(d+"�ø� "+Math.ceil(d));
		
		d = 10.0; //0�̸� �ø��� �ʴ´�.
		System.out.println(d+"�ø� "+Math.ceil(d));
		
		d = 10.9;
		System.out.println(d+"�ݿø� "+Math.round(d));
		
		d = 10.05; 
		System.out.println(d+"�ݿø� "+Math.round(d));
		
		d = 10.9;//10.0
		System.out.println(d+"���� "+Math.floor(d));
		
		//����. casting����ó��
		System.out.println(d+ "����"+(int)d);
		
		double ran = Math.random();
		System.out.println("�߻��� ����"+ran);
		System.out.println("������ ����"+ran*10); //0~9���� 10���� ���� �ϳ� ���(�Ǽ� �߻�)
		System.out.println("������ ����"+(int)(ran*10)); //0~9���� 10���� ���� �ϳ� ���
		
		//1~10������ �� �� ����
		System.out.println("������ ����"+((int)(ran*10)+1)); //0~9���� 10���� ���� �ϳ� ���
		
		//A~Z���� �ƹ� ���ڳ� ���
		//A(65) ~ Z(90)
		//���ĺ� �빮��
		System.out.println((char)((int)(Math.random()*26)+65)); 
		//���ĺ��� 26�� �̹Ƿ� 0 ~ 26 ������ ������ �߻���Ų��.
		
		//���ĺ� �ҹ���
		System.out.println((char)((int)(Math.random()*26)+97)); 

		//0~9���� �ƹ� ���ھ��
		System.out.println((char)((int)(Math.random()*10)+48)); 
		
	}
	public static void main(String[] args) {
		new UseMath();
	}

}
