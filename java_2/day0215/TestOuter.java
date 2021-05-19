package day0215;

/**
 *	����Ŭ������ �ν��Ͻ� ����ó�� ����� �� ����ϴ� inner class
 *	Ư�� ������ ������ ��ü�ȿ��� �̺�Ʈ�� ó���� ��(������ Ŭ���� �ϳ����� �ͼӵ� �̺�Ʈ�� ó���� ��)
 * @author SIST
 */
public class TestOuter {
	int outI;
	
	public TestOuter() {
		System.out.println("�ٱ� Ŭ������ ������");
	}
	
	public void outMethod() {
		System.out.println("�ٱ� Ŭ������ method"+outI);
		//�ٱ� Ŭ���������� ���� Ŭ������ �ڿ��� ������� ����� �� ����.
//		inI = 100;
//		inMethod();
		//�ٱ�Ŭ�������� ����Ŭ������ �ڿ��� ����Ϸ��� ��üȭ�� �ؾ��Ѵ�.
		//�ٱ�Ŭ������ ��ü���� this�� ��ü�� �� �ִ�.
		//�ٱ�Ŭ�������� ������ �� �ִ�.
//		TestOuter.Inner in = this.new Inner();
		
		//this�� ������ �� �ִ�.
		Inner in = new Inner();
		
		in.inMethod();
		System.out.println("--outMethod ��--");
	}
	
	///////////////////////////////////inner class ����/////////////////////////////////////////////////
	public class Inner{
		int inI;
		
		public Inner() {
			System.out.println("���� Ŭ������ ������");
			
		}
		
		public void inMethod() {
			System.out.println("���� Ŭ������ method : "+inI);
			//����Ŭ���������� �ٱ� Ŭ������ ������ method�� ����� �� �ִ�.
			System.out.println("�ٱ� Ŭ������ ���� : "+outI);
//			outMethod();
		}
	}//class
	///////////////////////////////////inner class ����/////////////////////////////////////////////////
	
	public static void main(String[] args) {
		//1. �ٱ� Ŭ���� ��üȭ
		TestOuter to = new TestOuter(); //�ٱ� Ŭ������ ��üȭ �Ǿ��ٰ� ����Ŭ������ ��üȭ���� �ʴ´�.
		//�ٱ�Ŭ������ ��ü�δ� ����Ŭ������ �ڿ��� ����� �� ����,
//		to.inI = 10;
//		to.inMethod();
		to.outMethod();
		
		//2. ���� Ŭ���� ��üȭ : �ٱ�Ŭ������.����Ŭ������ ��ü�� = �ٱ�Ŭ������ü��.new ����Ŭ����������();		
//		TestOuter.Inner in = to.new Inner();
		Inner in = to.new Inner();
		in.inMethod();
		
		
	}//main

}//class
