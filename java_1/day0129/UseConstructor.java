package day0129;

/**
 *	�������� ���<br>
 *	�����ڰ� �����ڸ� �ϳ��� �������� ������ Compiler�� �⺻�����ڸ� �������ش�.
 * @author SIST
 */
public class UseConstructor {

	public UseConstructor() {
		System.out.println("�⺻������");
		test();
		//UseConstructor(10);  // �����ڴ� methodȣ���ϴ� �������� ȣ���� �� ����.
	}//������
	
	public UseConstructor(int i) {
		System.out.println("�Ű����� �ִ� ������");
	}//�Ű������ִ� ������
	
	public void test() {
		System.out.println("method!!!");
	}//�޼ҵ�
	
	public static void main(String[] args) {
		//�����ڴ� ��üȭ�Ͽ� ȣ�� ����
		new UseConstructor();
//		UseConstructor uc=new UseConstructor();
//		uc.test()(); //������ �ٸ��� ��ü�� ����� ��ü�� ���ؼ� method�� ȣ��
		
	}

}
