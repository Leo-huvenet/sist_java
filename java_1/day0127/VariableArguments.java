package day0127;

/**
 *	�ϳ��� �Ű������� �������� ���� �־ ����ϴ� VariableArguments
 * @author SIST
 */
public class VariableArguments {

	public void year(int ... a) {
		//V.A�� method �ȿ��� �迭�� ó���Ǹ�,�Ű������� �� ���� ��밡���ϴ�.
		for(int i =0; i <a.length; i++) {
			System.out.println(a[i]);
		}
	}//year
	
	//�Ű������� ������ ���� �� �� V.A�� ���� ���������� ���� �� �ִ�.
	public void temp(int i , int a, char ... c) {
		
	}
	
	public static void main(String[] args) {
		VariableArguments va = new VariableArguments();
		va.year();//year(), year(1), year(1,2,3) method�� �Է°��� ������ ���� �� �ִ�.
		
		
		
	}//main

}//class
