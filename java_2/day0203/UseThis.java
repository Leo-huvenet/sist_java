package day0203;

/**
 * this Ű���带 method �������� ���<br>
 * this(��,,,)<br>
 * �������� ù��° �ٿ����� ���<br>
 *  Ŭ�������� �ٸ� ������ ȣ�� ��
 * @author SIST
 */
public class UseThis {

	public UseThis() {
		this(100);
		System.out.println("�⺻������(Default Constructor )");
	}
	public UseThis(int i) {
		
		System.out.println("Overload�� ������ "+ i);
	}
	
	public static void main(String[] args) {
		new UseThis();
	}//main

}
