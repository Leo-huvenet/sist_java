package day0217;

import java.text.DecimalFormat;

/**
 *	��������
 * @author SIST
 */
public class UseDecimalFormat {

	public UseDecimalFormat() {
	int i =1_000_000; //JDK 1.7�������� �����Ǵ� ��� _�� ���ֻ���� �ڸ����� ������ �� �ִ�.
	// _�� ������� �ʴ´�.
	System.out.println(i);
	
	DecimalFormat df = new DecimalFormat("0,000,000"); //�ڸ����� ���� ����� ��
	DecimalFormat df1 = new DecimalFormat("#,###,###");// �����Ͱ� �����ϴ� �ͱ����� ����� ��
	
	System.out.println(df.format(2021));
	System.out.println(df1.format(2021));
	
	DecimalFormat df2 = new DecimalFormat("#,###"); //�ڸ����� �ʰ��ϴ� ���ڰ� ������ 3�ڸ����� ,�� �־��ش�.
	System.out.println(df2.format(20212021));
	
	//�Ǽ��� �ڸ����� ��������
	DecimalFormat df3 = new DecimalFormat("#,###.00"); 
	System.out.println(df3.format(2021.2021));
	
	}
	

	public static void main(String[] args) {
		new UseDecimalFormat();
		
		
	}

}
