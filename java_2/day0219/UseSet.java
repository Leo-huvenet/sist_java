package day0219;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * �˻��� ����� ������, �ߺ������͸� �������� �ʴ� Set�� ���<br>
 * ������ ������ ������ ���� �����ϰ� ����ؾ��� �� ���.
 * @param args
 */
public class UseSet {
	
	public UseSet() {
		//1. ����
		Set<String> set = new HashSet<String>();
		//2. ���Ҵ� : ���� ������� �Էµ��� �ʴ´�(������ ����)
		set.add("1.Java");
		set.add("2.Oracle");
		set.add("3.JDBC");
		set.add("4.HTML");
		set.add("5.CSS");
		set.add("6.JavaScript");
		set.add("7.Servlet");
		set.add("2.Oracle"); //�ߺ����� �Էµ��� �ʴ´�.
		
		//�迭�� ����
		//set�� ũ��� �迭�� ����.
		String[] copyArr = new String [ set.size() ];
		//set�� ������ �迭�� ����.
		set.toArray(copyArr);
		
		//3. �� ����
		set.remove("6.JavaScript");
		//���� �� ����
//		set.clear();
		System.out.println(set+"/"+set.size());
		//4. �˻� => �˻��� ����� ����. �׷��Ƿ� Iterator�� ���.
		Iterator<String> ita = set.iterator(); //set�� �˻��� �� �ְ� set�� ������� �޴´�.
		
		while(ita.hasNext()) {//������� ���� set��ü�� Element �� �����ϴ���? true | false
			System.out.println(ita.next());//���� ��� �����͸� �������� �̵�
		}
	
		System.out.println("----------------------------------");
		//set�� �˻��� ����� ���� ������ for�����δ� ����� �Ұ���
		//������ for������ ����� ����
		for(String value : set) {
			System.out.println(value);
		}
		System.out.println("----------------------------------");
		for(String value : copyArr) {//set�� ������ �迭�� ����ϱ�
			System.out.println(value);//set.remove("6.JavaScript"); �� �Ͽ����� ������ �迭�� ���������ʴ´�.
		}
		
		
	}//UseSet


	public static void main(String[] args) {
		new UseSet();
	}//main
}
