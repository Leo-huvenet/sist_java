package day0215;

/**
 *	�͸�Ŭ������ ���
 * @author SIST
 */
public class UseAnonymous {
	
	public void useSuperInterA(SuperInterA sia) {
		sia.methodA();
	}
	
	public void useSuperInterB(SuperInterB sia) {
		sia.methodA();
		sia.methodB();
	}
	
	public static void main(String[] args) {
		//��üȭ 
		UseAnonymous ua = new UseAnonymous();
		//anonymous inner class�� ����Ͽ� method ȣ��
		ua.useSuperInterA(new SuperInterA() {
			@Override
			public void methodA() {
				System.out.println("methodA");
				test();
			}
			//Ŭ������ �̸��� �����Ƿ� �����ڸ� ������ �� ����.
			
			
			//���ǵ� method�� anonymous inner class�ȿ����� ȣ��ɼ� �ִ�.
			public void test() {
				System.out.println("anonymous inner class���� ������ method");
			}
		});
		
		//useSuperInterB()�� anonymous inner class�� ����Ͽ� ȣ��
		ua.useSuperInterB(new SuperInterB() {

			@Override
			public void methodA() {
				System.out.println("A");
			}
			@Override
			public void methodB() {
				System.out.println("B");
			}
		});
	}

}
