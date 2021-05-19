package day0126;

/**
 *	method�ۼ� ����<br>
 *	- method�� ���� �� instance variable�� ����Ͽ� ��ó���� �ϴ� ���
 *		=> instance method<br>
 *
 *	- method�� ���� �� instance variable�� ������� �ʰ� ��ó�� �ϴ� ���
 *		=> static method
 *
 * @author SIST
 */
public class UseMethod {
	int i; //instance variable
	
	/**
	 * instance method
	 */
	public void instanceMethod() {
	System.out.println("instance method : i �� ��� "+ i);
	}//instanceMethod
	
	/**
	 * static method
	 */
	public static void staticMethod() {
		System.out.println(" staitc method : i ���Ұ�");
	}//staitcMethod
	
	public static void main(String[] args) {
		//instance method ȣ��.
//		instanceMethod();// ���� ȣ�� �Ұ�
		//1. ��üȭ : Ŭ������.��ü�� = new Ŭ������();
		UseMethod um = new UseMethod();
		
		//2. instance method ȣ��
		um.instanceMethod();
		
	  /*um.staticMethod(); //static method�� Ư�� ��ü�� ���� �޼ҵ尡 �ƴϹǷ� 
	  	��ü��.method���� �������� ������� �ʴ´�*/
		
		//static method ȣ�� : ��üȭ ���� Ŭ������.method������ ȣ��
		UseMethod.staticMethod();
		
		
		
	}//main
}//class
