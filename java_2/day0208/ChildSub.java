package day0208;

/**
 *	ParentSuper�� �ڽ� Ŭ����
 * @author SIST
 */
public class ChildSub extends ParentSuper{
	
	int i; //�θ� Ŭ������ ���� �̸��� ���� ����.
	int j; //�ڽ�Ŭ������ ������ �ִ� �̸�.
	
	public void print() {
		super.i = 100; //�̸��� ���� ������ this�� super�� �����ؼ� ����ؾ��ϰ�,
		super.k = 100; // this.k = 200; super.k = 200; //�̸��� �����ϸ� this �� super ���� �ᵵ �������.
		System.out.println("�ڽ� : i = "+this.i+", j = "+this.j);
		System.out.println("�ڽ� : i = "+i+", j = "+j); 
		System.out.println("�θ� i ="+super.i+", k = "+super.k+", k = "+ this.k);
		super.print();//�θ��� print ȣ��
	} 
	
	public static void main(String[] args) {

		ChildSub cs = new ChildSub();
		cs.print();
		
		
	}//main

}
