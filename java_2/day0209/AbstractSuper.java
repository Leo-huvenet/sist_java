package day0209;

/**
 *	��Ӱ��迡�� �θ�Ŭ������ ������ ��.
 * @author SIST
 */
public abstract class AbstractSuper {
	int i; // instance variable
	
	public AbstractSuper() {
		System.out.println("�߻�Ŭ������ �⺻������");
	}//AbstractSuper
	
	public void instanceMethod() {
		System.out.println("�θ�Ŭ������ �Ϲ� method");
	}
	
	////�߻� method ////
	public abstract void typeA(); //abstract method�� final�� ����� �� ����.
	public abstract void typeB(String msg);
	public abstract int typeC();
	public abstract int typeD(String msg);

	//	public static void main(Stirng[] args) {
//		new AbstractSuper(); //�߻�Ŭ������ ���� ��üȭ �� �� ����.
//	}
}
