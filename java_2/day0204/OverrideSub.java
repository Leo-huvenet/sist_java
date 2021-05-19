package day0204;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *	Method Override( Overriding ) ����
 *	Override : �θ�Ŭ������ method�� �ڽ�Ŭ������ ��Ȳ�� ���� �ʴ´ٸ�, 
 *	�ڽ�Ŭ�������� �θ�Ŭ������ method�� ������ method�� �����Ͽ� ����ϴ� ��
 *
 * @author SIST
 */
public class OverrideSub extends OverrideSuper{
	
	public String toString() {//�θ𿡼� �����ϴ� ����� �ڽİ� ���� �ʴ´ٸ� �ڽ�Ŭ�������� method�� ������
		return "�ּҰ� �Ⱦ��!!!";
	}//toString
	
//	public String superMethod() { //��ȯ���� �ٸ��� Override ��Ģ�� ����ǹǷ� Error�߻�
//		System.out.println("�ڽ�Ŭ�������� ��ȯ!!!");
//		return "";
//	}//supermethod

//	public void superMethod(int i) { //�Ű������� �����ϸ� methodȣ���� �ٸ��� �Ǳ� ������ Override�� �������� �ʴ´�.
//		System.out.println("�ڽ�Ŭ�������� ��ȯ!!!");
//	}//supermethod
	
	public void superMethod1() { //Override �� method���� ���������ڴ� ������ ���� �����ڷ� ���� ����
		//�θ� : protected - > �ڽ� : public
		System.out.println("�ڽ�Ŭ�������� ��ȯ!!!");
	}//protected void superMethod1()
		
		/**
		 * ����õ�޼ҵ� : ����ֵ��� �󶼿� �޶�...
		 */
		@Deprecated
		public void test() {
			System.out.println("HDD"); //Hard Disk Drive ->�Ĵ���
		}
		
	//	@SuppressWarnings("unused")//method�� ��ü ����
		@SuppressWarnings("unused")
		public void temp() {
			
		//	@SuppressWarnings("rawtypes")//�ٷ� �Ʒ����� �ڵ常 ����
			int i =0;
			int j =0;
			
			@SuppressWarnings("rawtypes")
			List list = new ArrayList();
		}
	
	
	public static void main(String[] args) {
		OverrideSub os = new OverrideSub();
		System.out.println("----------------------Object class�� toSting() Overide------------------------");
		System.out.println(os.toString()); // Object Ŭ�������� �����ϴ� toString()�� ȣ�� =>�ּ�
		//System.out.println() �� instance�� �־� ����ϸ� �׾ȿ��� toString()�� ȣ��Ǿ� �ּҰ� ���
		System.out.println(os);
	
		os.superMethod();
		os.superMethod1();
		System.out.println("--------------------------------------------------------");
		
		Date date = new Date();
		System.out.println(date);
	//	System.out.println(date.getYear());
		
		os.test();
		
	}//main
	

}
