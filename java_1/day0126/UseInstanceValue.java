package day0126;

/**
 *	�ٸ� Ŭ������ �����ϴ� instance variable�� ���
 * @author SIST
 */
public class UseInstanceValue {

	public static void main(String[] args) {
		//1.��üȭ (Ŭ������ ��ü�� = new Ŭ������();
		UseAccessModifier uam = new UseAccessModifier();
		//public, protected, default ���� �����ڴ� ���� ��Ű���� �ٸ� Ŭ�������� ��밡��
		
		//2. �������
		System.out.println("public : a "+ uam.a);
		System.out.println("protected : b "+ uam.b);
		System.out.println("default : c "+ uam.c);
	//	System.out.println("private : d "+ uam.d);
	}

}
