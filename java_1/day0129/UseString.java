package day0129;

/**
 *	���ڿ�(String)�� �ּҸ� �����ϰ� ����� �� �ִ� java.lang.String Ŭ������ ���
 *	���ڿ�(String) �񱳴� (equals() : ��ü���� �ּҰ� ������ ��)�� �̿��� ���Ѵ�.
 * @author SIST
 */
public class UseString {

	public static void main(String[] args) {
		//�⺻�� ������ ��� (new�� ������� �ʰ� java.lang.String Ŭ������ ���)
		//���ڿ� ����ҿ� ���� ���ڿ��� �ϳ��� �����ǰ� ����Ѵ�.
		String str = "AbcdEf";
		System.out.println(str);
		System.out.println("�⺻������ ==�� " +(str == "AbcdEf")); // str�ּҿ� "AbcdEf" �����ּҰ� ����? true
		System.out.println("�⺻�� ���� equals�� "+ str.equals("AbcdEf"));
		//������ ������ ��� (new�� ����Ͽ� java.lang.String Ŭ������ ���)
		String str1 = new String("AbcdEf");
		System.out.println(str1);
		System.out.println("���������� ==�� " +(str1 == "AbcdEf")); // str1�ּҿ� "AbcdEf" �����ּҰ� ����?
		System.out.println("������ ���� equals�� "+ str1.equals("AbcdEf"));
		//str1�� �ּҴ� heap�� �ּҸ� ������ ������ "AbcdEf"�� �ּҴ� �ٸ���
		
		//���ڿ�(String) �񱳴� (equals() : ��ü���� �ּҰ� ������ ��)�� �̿��� ���Ѵ�.
		
		
		
	}

}
