package day0209;

/**
 * �߻�Ŭ������ �ڽ�Ŭ����
 * �ݵ�� �θ�Ŭ������ abstract method�� ��� �����ؾ��Ѵ�.
 * @author SIST
 */
public class AbstractSub extends AbstractSuper{

	public AbstractSub() {
		System.out.println("�ڽ�Ŭ������ ������");
	}
	
	//abstract method ����(Override)
	@Override
	public void typeA() {
		System.out.println("���� �� : ��ȯ�� ���� �Ű������� ���� ��");
	}//A
	
	@Override
	public void typeB(String msg) {
		instanceMethod(); //�θ�Ŭ������ �Ϲ� method
//		super.typeA(); //�߻� method�� ���� ȣ���� �� ����.
		System.out.println("���� �� : ��ȯ�� ����, �Ű����� �ִ� ��");
	}//B
	
	@Override
	public int typeC() { //���� �� : ��ȯ�� �ְ�, �Ű����� ���� ��
		return 0;
	}//C
	
	
	@Override
	public int typeD(String m) {// ���� �� : ��ȯ�� �ְ�, �Ű����� �ִ� ��
		return m.length();
	}//D
	
	
	public static void main(String[] args) {
		//new AbstractSuper(); //���� ��üȭ �� �� ����.
		//�ڽ�Ŭ������ ��üȭ ���� ������ ��ü�� �����ȴ�.
		AbstractSub as = new AbstractSub();//�ڽ��� �����ϸ� �߻�Ŭ������ �θ�Ŭ������ �����ȴ�.
		as.typeB("������");
	}

}
