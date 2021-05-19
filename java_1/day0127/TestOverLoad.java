package day0127;

/**
 *	Ŭ�������� ���� �̸��� method�� ������ ����� �ִ� Overload ���<br>
 *	��Ģ) ����������, ��ȯ���� �޶� �ǰ�,
 *				method���� ���ƾ��ϰ�
 *				�Ű������� ���� �Ǵ� Ÿ���� �ݵ�� �޶�� �Ѵ�.
 * @author SIST
 */
public class TestOverLoad {
	
	public void printStar() {
		System.out.println("��");
	}//printStar
	
	/**
	 * �Է¹��� ����� ���� ����ϴ� ��
	 * method Overload(Overloading)
	 * @param count ����� ���� ����
	 */
	public void printStar(int count) {
		for(int i=0; i< count; i++) {
			for(int j=0; j< i+1; j++) {
				System.out.print("��");
			}//end for
			System.out.println();
		}//end for
	}//printStar
	
	
	public static void main(String[] args) {
		TestOverLoad to = new TestOverLoad();
		to.printStar(); //���� ��(��ȯ��x �Ű�����x)
		to.printStar(4);//���� ��(��ȯ��x �Ű�����o)
		
	}

}
