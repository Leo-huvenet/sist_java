package day0126.sub;

import day0126.UseAccessModifier;

/**
 *	�ٸ� ��Ű���� �ٸ� Ŭ������ ��ӹް� �θ�Ŭ������ �����ϴ� instance variable�� ���<br>
 *	�θ�Ŭ����( UseAccessModifier ), �ڽ�Ŭ���� ( UseInstanceValue2 )<br>
 *	��Ӱ����϶����� �ڽ�Ŭ������ ��üȭ�� �ؾ� �θ�Ŭ������ ������ method �� ��� �� ����� �� �ִ�.<br>
 * @author SIST
 */
public class UseInstanceValue2 extends UseAccessModifier{

	public static void main(String[] args) {
		//1.�ڽİ�üȭ (Ŭ������ ��ü�� = new Ŭ������(); )
		UseInstanceValue2 uiv = new UseInstanceValue2();
		//�θ�Ŭ������ public, protected, default ���� �����ڴ� ���� ��Ű���� �ٸ� Ŭ�������� ��밡��
		//2. �������
		System.out.println("public : a "+ uiv.a);
		System.out.println("protected : b "+ uiv.b);
	//	System.out.println("default : c "+ uiv.c);
	//	System.out.println("private : d "+ uiv.d);
	}

}
