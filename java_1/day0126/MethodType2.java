package day0126;

/**
 *	
 * @author SIST
 */
public class MethodType2 {
	
	//�׻� �λ縦 ����ϴ� method�� �����
	public void hello() {
		System.out.println("�ȳ��ϼ���? ��ȫ���Դϴ�.");
		
	}
	
	//�׻� ���ظ� ��ȯ�ϴ� method ���� ��.
	public int year() {
		return 2021;
	}
	
	//�ԷµǴ� ������ Unicode�� ����ϴ� method. ���� ��
	public void printUnicode(char c) {
		System.out.println(c+"�� unicode �� : "+(int)c);
	}
	
	//�Ǽ��� ������ ��ȯ�Ͽ� ��ȯ�ϴ� method. ���� ��
	public int casting(double d) {
		return (int)d;
	}
	
	public void work() {
		for(int i = 0; i < 5; i++) {
			for(int j=0; j <5; j++) {
				System.out.print((i==0 || i==4 || j==0|| j==4 ? 1:0 )+" ");
			}//end for
			System.out.println();
		}//end for
	}//work
	
	public static void main(String[] args) {
		//1. ��üȭ
		MethodType2 mt2 = new MethodType2();
		//2. method ȣ��
		mt2.hello();//���� 
		int value = mt2.year(); //��ȯ���� ������ �װ��� ������ ���� �� �ִ�.
		System.out.println(value);
		
		mt2.printUnicode('A'); //���� ��
		
		value = mt2.casting(2021.0126);//���� ��
		System.out.println(value);
		
		mt2.work();
		
	}//main

}//class
