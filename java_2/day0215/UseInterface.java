package day0215;

/**
 *	�������̽��� ����ϱ� ���� Ŭ���� 
 *	�������̽��� Ŭ������ ����(implements)�Ͽ� ����� �� �ִ�.(��ü������)
 * @author SIST
 */
public class UseInterface implements TestInter{
	
	//���� �������̽��� �߻�method�� �ݵ�� Override�ؾ��Ѵ�.
		@Override
		public void methodA() {
			System.out.println("methodA");
		}

		@Override
		public void methodB() {
			System.out.println("���������ڴ� ������ ���������ڷ� �޶����� �ǰ�, ��ȯ��, method��,�Ű������� ���� �����.");			
		}
		
		@Override
		public void methodC(int i) {
			System.out.println("default method�� Override : "+i);
		}//default method�� �ʿ信 ���� Override�� �� �� �ִ�.(���ص���)
	
	public static void main(String[] args) {
		//�������̽��� ���� ��üȭ�� �� �� ����.
//		TestInter ti = new TestInter();
		TestInter ti = new UseInterface();
		System.out.println(ti);
		ti.methodA();//����Ŭ������ method�� ȣ�� �ȴ�.(�������̽��� �߻� method�� ȣ��Ǵ� ���� �ƴϴ�.)
		ti.methodB();//����Ŭ������ method�� ȣ�� �ȴ�.(�������̽��� �߻� method�� ȣ��Ǵ� ���� �ƴϴ�.)
		ti.methodC(2021); //default method�� ȣ�� 
		
	}
	
	

}//class
