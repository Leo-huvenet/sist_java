package day0204;

/**
 *	this Ű���������� ���
 * 	this�� �޼ҵ带 ȣ���ϴ� ��ü�� �ּ�
 * @author SIST
 */
public class TestThis {
	private int i ;
	
	public void useInstance(TestThis tt) {
		//�ּҸ� ����Ϸ��� �ּҸ� ���� �޾ƾ��Ѵ�.
		System.out.println("method�� ȣ���� ��ü�� �ּ� : "+tt);
	}

	/**
	 * stack�� ������� heap�� �������� ���ٸ� stack�� �ִ� ������ ����Ѵ�<br>
	 * ���� �̸��� heap�� ������ ����Ϸ��� heap�� �ּ�(Instance)�� �޾ƾ��Ѵ�. 
	 * heap memory address => instance -> ��ü
	 * @param i
	 */
	public void useInstanceVariable(int i, TestThis tt) {
		tt.i = i; //heap�� �����ϴ� i������ stack �����ϴ� i �������� �Ҵ��Ѵ�
		System.out.println(i);	
		
	}

	/**
	 * parameter��� instance �������� ���� ������ instance������ parameter��
	 * �ĺ��ϱ����� instance�� �ּҸ� �־���ϴµ� instance�ּҸ� ���� �ʰ� this��
	 * ����ϸ� method�� ȣ���ϴ� ��ü�� �ּҷ� ����ȴ�.
	 * @param i
	 */
	public void useInstanceVariable(int i) {
		this.i = i; //this : �޼ҵ带 ȣ���ϴ� ��ü�� �ּ�
		System.out.println(i);	
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		TestThis tt1= new TestThis();
		TestThis tt2= new TestThis();
		System.out.println("tt1 instance�� �ּ� : "+tt1);
		System.out.println("tt2 instance�� �ּ� : "+tt2);
		System.out.println("----------------��ü�ּ�----------------------");
		tt1.useInstance(tt1);
		tt2.useInstance(tt2);
		System.out.println("-------------------��, ��ü�ּ�-------------------");
		
		tt1.useInstanceVariable(100,tt1);
		tt2.useInstanceVariable(200,tt2);
		System.out.println(tt1.i);// tt ��ü�� �Ҹ�ɶ����� ���� �����ȴ� 
		System.out.println("-----------------this���---------------------");
		tt1.useInstanceVariable(1000);
		//���� �־ �޼ҵ带 ȣ���ϴ� ��ü�� �ּҸ� ����� �� �ִ�. this
		
		//System.out.println(this); 
		//static ���������� ȣ���ϴ� ��ü�� ������ �������� �ʱ� ������ this�� ����� �� ����.
	}//main

}
