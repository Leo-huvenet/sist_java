package day0216;

import java.util.StringTokenizer;

/**
 *	���ڿ��� ª�� �� ����� �����ϴ� StringTokenizer�� ���.
 * @author SIST
 */
public class UseStringTokenizer {
	
	public UseStringTokenizer() {
		String data = "�ڹ� ����Ŭ �ӳɳ� JDBC HTML";
		
		//���ڿ��� �������� �����Ͽ� �ڸ� �� �ִ� ��ü ����.
		StringTokenizer stk = new StringTokenizer(data);
		
		
		
		System.out.println("��ū�� �� : "+stk.countTokens());
//		System.out.println("��ū : "+stk.nextToken());
//		System.out.println("��ū : "+stk.nextToken());
//		System.out.println("��ū : "+stk.nextToken());
//		System.out.println("��ū : "+stk.nextToken());
//		System.out.println("��ū : "+stk.nextToken());
//		System.out.println("��ū����?"+stk.hasMoreTokens());
		
		String token = "";
		while(stk.hasMoreTokens()) {//��ū�� �����ϴ� ��?
			token = stk.nextToken();
			System.out.println(token);
		}//end while
		
		System.out.println("---------�����ʹ� �� �� �������� �ڷ� ���ư��� �ʽ��ϴ�-----------");
		
		//�����ʹ� �� �� �������� �ٽ� ���� �ʴ´�.
		//�ٽ� �ݺ���Ű�� �ʹٸ� ��ü�� ���� �����Ͽ� �����͸� ������ �̵���Ų��.
		stk = new StringTokenizer(data); 
		while(stk.hasMoreTokens()) {//��ū�� �����ϴ� ��?
			token = stk.nextToken();
			System.out.println(token);
		}//end while
	}

	public static void main(String[] args) {
		
		new UseStringTokenizer();
	}

}
