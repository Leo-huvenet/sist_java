package day0129;

/**
 *	����� : �㽺Ű ġ�Ϳ� ����
 *	�߻�ȭ : 
 *	��
 *	- ������� Ư¡ : �� �� ���� �ٸ� �̸�
 *	- �������� Ư¡ : �޸��� �Դ´�
 * @author SIST
 */
public class Dog {

	private int eye;
	private int ear;
	private int tail;
	private int leg;
	private String name;

	
	public Dog(int eye, int ear, int tail, int leg, String name) {
		this.eye = eye;
		this.ear = ear;
		this.tail = tail;
		this.leg = leg;
		this.name = name;	
		
		
	}
	
	public int getEye() {
		return eye;
	}

	public void setEye(int eye) {
		this.eye = eye;
	}

	public int getEar() {
		return ear;
	}

	public void setEar(int ear) {
		this.ear = ear;
	}

	public int getTail() {
		return tail;
	}

	public void setTail(int tail) {
		this.tail = tail;
	}

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	//--------------------------------------------------------------------
	public String run(String place) {
		return name+"�� ���ΰ� �Բ� "+place+"��(��) ��å�ϰ��ֽ��ϴ�. ";
	}
	
	public String eat(String snek) {
		return name+"�� ��������"+snek+"��(��) �԰��ֽ��ϴ�.";
	}
	
	
	
	
	
	
	
}
