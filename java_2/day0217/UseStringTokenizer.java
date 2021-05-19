package day0217;

import java.util.StringTokenizer;

public class UseStringTokenizer {
	

	public UseStringTokenizer() {
		String csvData = "�⺻����,����.������,���~method,OOP,instance,source code,bytecode";
		//���ڿ� �����͸� ,�� ���ع��ڿ��� ����Ͽ� ��ū�� ����
		//���� ���ڿ� ������ or ����� ������. (�ش� �Ǵ� ���� ��� �ڸ���)
		
//		StringTokenizer stk = new StringTokenizer(csvData,",");
		//�Ű����� 3���� �����ڸ� ����ϸ� ��ū�� �����ϴ� ���ڿ����� ��ū���� ����� ������ ������ �� �ִ�.
		StringTokenizer stk = new StringTokenizer(csvData,",.~��", false);
		
		while(stk.hasMoreElements()) { //��ū flag�� ���е� ��ū�� �����Ѵٸ�
			System.out.println(stk.nextToken()); //��ū�� ���, �����͸� �������� �̵���Ų��.
			
		}
			
	}

	public static void main(String[] args) {
		new UseStringTokenizer();
	}

}
