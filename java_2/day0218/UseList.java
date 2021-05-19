package day0218;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * java.util.List�� ���<br>
 * ������ �迭ó�� ����. ����������(�����͸� �߰��ϸ� ���̰� �þ��, �����͸� �����ϸ� ���̰� �پ���)
 * ��� ���������� ������ �� ������, Generic�� ����ϸ� �Էµ��������� ������ ������ �� �ִ�.
 * �˻��� ����� ������, �ߺ������͸� ������ �� �ִ�(�߿�!!!!!!!!!!!!!!!!)
 * �߰��� �����ʹ� ���� �ڿ� �ٴ´�.
 * 	������ �����ͻ��̿� �����͸� �߰��� ������ LinkedList�� ����ϴ� ���� ����.
 * @author SIST
 */
public class UseList {
	
	/**
	 * MultiThread���� �������� ����
	 */
	public void useArrayList() {
		//1.����
		List<String> list = new ArrayList<String>();
		//2.ũ�� : size(); �濡 ���� �ִ� �͸� ������ ���Խ�Ų��.
		System.out.println("���� ���� : "+list.size());
		//3.���Ҵ� : ���� �ڷ� �߰��ȴ�. �ߺ����� ������ �� �ִ�.
		list.add("�ڹ�");
		list.add("����Ŭ");
		list.add("JDBC");
		list.add("HTML");
		list.add("����Ŭ"); //�ߺ��� ���尡��.
		list.add("CSS");
		list.add("JavaScript");
		System.out.println(list+" / "+list.size());// ��ü�� ����ϸ� �ּҰ� ���;� �ϴµ� ���� ���� ������
		// �ڽ�Ŭ�������� Object Ŭ������ toString()�� �ּҰ��ƴ� ���� ����� �� �ֵ��� Override �߱� ������.
		
		//3.�迭�� ����
		//Generic�� ������ ��������, ����Ʈ�� ũ���� �迭�� �����Ѵ�.
		String[] subjectArr = new String [ list.size() ];
		//����Ʈ�� ���� �迭�� ������.
		list.toArray(subjectArr);
		
		//4. �� ���� : ���� ũ�Ⱑ �پ���(2����)
		// �ε����� ����
		list.remove(3);
		//���� ���� ���� ��ü�� �־� ���� : ���� ���� ��ġ�ϴ� ���� �� �ϳ��� �����Ѵ�.
		list.remove("����Ŭ");
		System.out.println(list+" / "+list.size()); 
		
		//5.�ϰ�ó�� : list�� �ε����� ����� �� �ְ�, �˻��� ����� �����Ƿ� �ϰ�ó���� �� �� �ִ�.
//		String temp = "";
//		for(int i=0; i<list.size(); i++) {
//			temp = list.get(i); //����Ʈ i��° ���� ���� �����ͼ� temp�Ҵ�
//			System.out.println(temp);
//		}
		
		//������ for
		for(String temp : list) {
			System.out.println(temp);
		}
		System.out.println("-------------����� �� ���---------------");
		for(String temp : subjectArr) {
			System.out.printf("%s\t", temp);
		}
		System.out.println("\n");
	}//useArrayList
	
	/**
	 * MultiThread���� �������� �Ұ���
	 */
	public void useVector() {
		//1.����
				List<String> list = new Vector<String>();
				//2.ũ�� : size(); �濡 ���� �ִ� �͸� ������ ���Խ�Ų��.
				System.out.println("���� ���� : "+list.size());
				//3.���Ҵ� : ���� �ڷ� �߰��ȴ�. �ߺ����� ������ �� �ִ�.
				list.add("�ڹ�");
				list.add("����Ŭ");
				list.add("JDBC");
				list.add("HTML");
				list.add("����Ŭ"); //�ߺ��� ���尡��.
				list.add("CSS");
				list.add("JavaScript");
				System.out.println(list+" / "+list.size());// ��ü�� ����ϸ� �ּҰ� ���;� �ϴµ� ���� ���� ������
				// �ڽ�Ŭ�������� Object Ŭ������ toString()�� �ּҰ��ƴ� ���� ����� �� �ֵ��� Override �߱� ������.
				
				//3.�迭�� ����
				//Generic�� ������ ��������, ����Ʈ�� ũ���� �迭�� �����Ѵ�.
				String[] subjectArr = new String [ list.size() ];
				//����Ʈ�� ���� �迭�� ������.
				list.toArray(subjectArr);
				
				//4. �� ���� : ���� ũ�Ⱑ �پ���(2����)
				// �ε����� ����
				list.remove(3);
				//���� ���� ���� ��ü�� �־� ���� : ���� ���� ��ġ�ϴ� ���� �� �ϳ��� �����Ѵ�.
				list.remove("����Ŭ");
				System.out.println(list+" / "+list.size()); 
				
				//5.�ϰ�ó�� : list�� �ε����� ����� �� �ְ�, �˻��� ����� �����Ƿ� �ϰ�ó���� �� �� �ִ�.
//				String temp = "";
//				for(int i=0; i<list.size(); i++) {
//					temp = list.get(i); //����Ʈ i��° ���� ���� �����ͼ� temp�Ҵ�
//					System.out.println(temp);
//				}
				
				//������ for
				for(String temp : list) {
					System.out.println(temp);
				}
				System.out.println("-------------����� �� ���---------------");
				for(String temp : subjectArr) {
					System.out.printf("%s\t", temp);
				}
				System.out.println("\n");
	}//useVector
	
	/**
	 * ���� �߰��� �� ������ ������ ���̿� ���� �߰��Ǵ� ���� ���� ��.
	 */
	public void useLinkedList() {//������ �����ͻ��̿� �����͸� �߰��� ������ LinkedList�� ����ϴ� ���� ����.
		//1.����
		List<String> list = new LinkedList<String>();
		//2.ũ�� : size(); �濡 ���� �ִ� �͸� ������ ���Խ�Ų��.
		System.out.println("���� ���� : "+list.size());
		//3.���Ҵ� : ���� �ڷ� �߰��ȴ�. �ߺ����� ������ �� �ִ�.
		list.add("�ڹ�"); //0
		list.add("����Ŭ"); //1
		list.add("JDBC"); //2
		list.add(0,"HTML"); //3 //0��° �ε����� HTML �� �ְھ�
		list.add("����Ŭ"); //4 �ߺ��� ���尡��.
		list.add("CSS"); //5 
		list.add("JavaScript"); //6
		System.out.println(list+" / "+list.size());// ��ü�� ����ϸ� �ּҰ� ���;� �ϴµ� ���� ���� ������
		// �ڽ�Ŭ�������� Object Ŭ������ toString()�� �ּҰ��ƴ� ���� ����� �� �ֵ��� Override �߱� ������.
		
		//3.�迭�� ����
		//Generic�� ������ ��������, ����Ʈ�� ũ���� �迭�� �����Ѵ�.
		String[] subjectArr = new String [ list.size() ];
		//����Ʈ�� ���� �迭�� ������.
		list.toArray(subjectArr);
		
		//4. �� ���� : ���� ũ�Ⱑ �پ���(2����)
		// �ε����� ����
		list.remove(3);
		//���� ���� ���� ��ü�� �־� ���� : ���� ���� ��ġ�ϴ� ���� �� �ϳ��� �����Ѵ�.
		list.remove("����Ŭ");
		System.out.println(list+" / "+list.size()); 
		
		//5.�ϰ�ó�� : list�� �ε����� ����� �� �ְ�, �˻��� ����� �����Ƿ� �ϰ�ó���� �� �� �ִ�.
//		String temp = "";
//		for(int i=0; i<list.size(); i++) {
//			temp = list.get(i); //����Ʈ i��° ���� ���� �����ͼ� temp�Ҵ�
//			System.out.println(temp);
//		}
		
		//������ for
		for(String temp : list) {
			System.out.println(temp);
		}
		System.out.println("-------------����� �� ���---------------");
		for(String temp : subjectArr) {
			System.out.printf("%s\t", temp);
		}
		System.out.println("\n");
		
	}//useLinkedList

	
	public static void main(String[] args) {
		UseList ul = new UseList();
		System.out.println("---------------ArrayList-----------------");
		ul.useArrayList();
		System.out.println("------------------Vector-----------------");
		ul.useVector();
		System.out.println("--------------LinkedList-----------------");
		ul.useLinkedList();
	}

}
