package day0129;

/**
 *	����� ��ü�𵨸�(�߻�ȭ)�Ͽ� ����Ư¡�� ������ Ŭ����<br>
 *	����� : ��, ��, ��, �̸�<br>
 *	������ : �Դ´� - Overloading - �Ű����� Ÿ�԰� ������ ����<br>
 *	���)<br>
 *		Ŭ������ ��ü�� = new ������();<br>
 *		��ü��.method��()<br>
 * @author SIST
 */
public class Person {
	private int eye;
	private int nose;
	private int mouth;
	private String name;
	
	public Person() {
		this(2,1,1);
//		eye=2;
//		nose=1;
//		mouth=1;
	}
	public Person(int eye, int nose, int mouth) {
		this.eye = eye;
		this.nose = nose;
		this.mouth = mouth;
	}
	

	//���� �����ϴ� method : setter method - ������
	public void setEye(int eye) {
		this.eye = eye;
	}
	
	public void setNose(int nose) {
		this.nose = nose;
	}
	
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//���� ��� method : getter method - ������
	
	public int getEye() {
		return eye;
	}
	
	public int getNose() {
		return nose;
	}
	
	public int getMouth() {
		return mouth;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	/**
	 * ������ ��� ��ü�� ������ ���� �Դ��� ����
	 * @return ��Դ� ��
	 */
	public String eat() {
		return name+"��(��) ������ ���� �Դ´�.";
	}
	
	/**
	 * method Overload <br>
	 * ������ ��� ��ü�� �Ĵ翡�� ���� ��Դ� �� ����
	 * @param menu ��Դ� ��������
	 * @param price ��Դ� ���İ���
	 * @return ��Դ� ��
	 */
	public String eat(String menu, int price) {
		return name+"��(��) �Ĵ翡�� "+menu + "�� ������ "+price+"�� ���� �Դ´�.";
	}
	
	
	
}//class
