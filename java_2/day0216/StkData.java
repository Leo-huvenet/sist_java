package day0216;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StkData {
	private String name;
	private int age;
	
	public StkData() {
	}

	public StkData(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		new StkData();
//		new UseStringTokenizer();
		
		String names = "���й� �ǿ��� ����� ���μ� ������ ����� �ڱ��";
		//STKData�� ����Ͽ� �迭�� �����, names ���ڿ��� �������� �����Ͽ� STKData �迭�� �߰� 
		StringTokenizer stk = new StringTokenizer(names);
		//1. stkDataŬ������ ����Ͽ� ��ü �迭�� ���� (���� �? -> ��ū�� ���� ��)
		StkData[] stName = new StkData[stk.countTokens()];
		//2. ���ڿ� �߶� �迭�� �ִ´�.(��ū�� ��� ������ �𸥴� -> while)
		int i = 0; //�迭�� �濡 ���� �ֱ� ���� �ε��� ������ ����
		while(stk.hasMoreTokens()) { //��ū�� �����Ѵٸ�
			//��ū�� �� �迭�� �ִ´�.(�迭�� �ε����� ����Ͽ� �߰��Ѵ�. -> while�� index�� ����)
			
//			stName[i] = new StkData( stk.nextToken(),0); //�Ű����� �ִ� ������ ���
			
			stName[i] = new StkData(); //�Ű����� �ִ� ������ ���
			stName[i].setName(stk.nextToken());
			
				i++;
		}
		
		//3. �߷��� ���ڿ��� ���� �迭�� ����Ѵ�.
		for(int j=0; j<stName.length; j++) {
			System.out.println(stName[j].getName());
		}
		
		
	}
	
}
