package day0216;

/**
 *	�� ���ڿ��� �ٷ� �� ����ϴ� Ŭ����
 * StringBuffer, StringBuilder�� ���.
 * @author SIST
 */
public class UseStringBuilder {
	
	public void useStringBuffer() {
		//1. ����
		StringBuffer sb = new StringBuffer();
		//2. ���
		//�� �߰� append()
		sb.append("�ȳ�.");//���ڿ� �߰�
		sb.append(2021);//���� �߰�
		sb.append("��");//���ڿ� �߰�
		sb.append("A");//���� �߰�
		sb.append(2.16);//�Ǽ� �߰�
		sb.append(true);//boolean���� �߰�
		
		// �� ���� insert(�߰��� ��ġ �ε���, ��)
		//�ȳ�.2021��A2  .   1   6   t   r   u  e
		//0 1 2345678 910 11 12 13 14 15 16
		
		//.�� ��ġ�� '��' ���ڿ� �� �߰�
		sb.insert(10, "��");
		sb.insert(14, '��');
		
		//���� "2021��"�� ����
		sb.delete(3,8);
		//���ڿ� ������
		sb.reverse();
		sb.reverse();
		
		
		System.out.println(sb);
		
	}
	
	public void useStringBuilder() {
		//1. ����
		StringBuilder sb = new StringBuilder();
		//2. ���
		//�� �߰� append()
		sb.append("�ȳ�.");//���ڿ� �߰�
		sb.append(2021);//���� �߰�
		sb.append("��");//���ڿ� �߰�
		sb.append("A");//���� �߰�
		sb.append(2.16);//�Ǽ� �߰�
		sb.append(true);//boolean���� �߰�
		
		// �� ���� insert(�߰��� ��ġ �ε���, ��)
		//�ȳ�.2021��A2  .   1   6   t   r   u  e
		//0 1 2345678 910 11 12 13 14 15 16
		
		//.�� ��ġ�� '��' ���ڿ� �� �߰�
		sb.insert(10, "��");
		sb.insert(14, '��');
		sb.insert(14, '��');
		
		
		//���� "2021��"�� ����
		sb.delete(3,8);
		//���ڿ� ������
		sb.reverse();
		sb.reverse();
		
		
		System.out.println(sb);	
	
	}
	
	
	
	public static void main(String[] args) {

		UseStringBuilder usb = new UseStringBuilder();
		usb.useStringBuffer();
		System.out.println("------------------------------");
		usb.useStringBuilder();
		System.out.println("------------------------------");

		
		
		String file1 = "c:/dev/test.txt.doc";
		String file2 = "c:/work/test/day0216/Test.java";
		
		//StringBuilder�� ����Ͽ� "c:/dev/test.txt.doc"-> "c:/dev/test.txt.temp.doc" ����
		StringBuilder sbFile1 = new StringBuilder(file1);
		sbFile1.insert(sbFile1.lastIndexOf("."),".temp");
		System.out.println(sbFile1);
		
		//StringBuilder�� ����Ͽ� "c:/work/test/day0216/Test.java"-> 
		//"c:/work/day0216/Test.java" ���� �����Ͽ� ����غ�����.
		
		StringBuilder sbFile2 = new StringBuilder(file2);
		sbFile2.delete(7, 12);
		System.out.println(sbFile2);
		
		
		
		
		
		
		
		
	}//main

}
