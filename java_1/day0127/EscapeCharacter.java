package day0127;

/**
 *	Ư������ : ���ڿ��ȿ� �����ϸ� \�� �����ϴ� ����� ���� ����
 * @author SIST
 */
public class EscapeCharacter {

	public static void main(String[] args) {
		//�� ���� \n : windows�� \r\n �� ���ȴ�.
		System.out.println("Java\nOracle");
		//tab key : \t
		System.out.println("Java\tOracle");
		System.out.println("������\t������");
		System.out.println("�ֿ뱳��\t4��\t����");
		System.out.println("������ \"������\" �Դϴ�.");
		System.out.println("������ \'������\' �Դϴ�.");
		System.out.println("c:\\new\\test\\temp.txt");
		System.out.println("�ȳ�\b");
		System.out.println("�ȳ�\f�ϼ���?");
	}

}
