package day0126;

/**
 *	method�� 4���� ����
 * @author SIST
 */
public class MethodType {
	
	/**
	 *  �������� �����Ѵ� (��ȯ�� ����, �Ű����� ���� ��)
	 */
	public void typeA() {
		System.out.println("�������� �����Ѵ�");
	}//typeA
	
	/**
	 * �������� �����Ѵ� (��ȯ�� ����, �Ű����� �ִ� ��)
	 * @param i
	 */
	public void typeB(int i) {
		System.out.println("�������� �� i = "+i);
	}//typeB
	
	/**
	 * ���� �� (��ȯ�� �ְ� �Ű����� ���� ��)
	 * @return
	 */
	public int typeC() {
		return 2021;
	}//typeC
	
	/**
	 * ���� �� (��ȯ�� �ְ�, �Ű����� �ִ� ��)
	 * @param i
	 * @return
	 */
	public int typeD(int i) {
		
		long l = i; // i*2; int * int =����� int�� �ʰ��ϴ� ���� ���ͼ� �߸��� ������ �Ҵ�
		l*=2; 
		if( l > Integer.MAX_VALUE ) 
		{//�Էµ� ���� int�� ���� �ִ������ �ʰ��Ѵٸ� long ������ int���� �ְ� ���� �Ҵ� �ϰ�
		l = Integer.MAX_VALUE	;                                 
		}
		
		return (int)l; //long�� int�� ��ȯ�Ͽ� ��ȯ
	}//typeD
	
	public static void main(String[] args) {
		//1. ��üȭ
		MethodType mt = new MethodType();
		//2. methodȣ��
			mt.typeA()	;//�������� �� ��� ȣ���ϵ� ���� ����� ���´�.
			mt.typeB(0);//�������� �� �Է°��� ���� �ٸ� ����� ���´�.
			
			int temp = mt.typeC(); //���� ��. ��� ȣ���ϵ� ������ ����� ��ȯ�ȴ�.
			System.out.println("������ : " +temp);
			
			int temp1 = mt.typeD(2147483646);
			System.out.println("������ : "+temp1);
			//typeC,D�� ���� ��ȯ�Ǳ⶧����  �� ���� ������ �־��� �� �ִ�.
		
	
	}

}
