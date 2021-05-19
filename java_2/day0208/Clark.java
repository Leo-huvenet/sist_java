package day0208;

/**
 *	����� ����Ư¡�� ����ϴ� Ŭ���� (Person�� ��ӹ޴� �ڽ�Ŭ����)<br>
 *	��, ��, ��, �̸�, �Դ� ���� �θ�Ŭ�������� �����ϴ� ���� ����ϰ�(�ڵ��� �� ��뼺),
 *	�ڽŸ��� Ư¡�� �����ϴ� Ŭ����
 * @author SIST
 */
public class Clark extends Person {
	
	public int power;
	
	/**
	 * Ŭ�� Ŭ������ �⺻������<br>
	 * ��ü�� ������ �� �⺻������ �������־���� �� ����
	 * �������� 1~100���� �����ϰ�, Ŭ���� �� ������ ���� ������ 80�� ������ �¾��.
	 */
	public Clark() {
		power = 80;
	}//Clark
	
	@Override
	public String eat() {
		return getName()+"�� ������ ���� '�;�'�ϰ� �Դ´�.";
	}
	
	@Override
	public String eat(String menu, int price) {
		return getName()+"�� ����������� "+menu+"�� ������ "+price+"$���� ��Ծ���.";
	}
	
	/**
	 * Ŭ���� ���� �����ϴ� ��. ũ���䳪��Ʈ�� �ԷµǸ� ���� ������.
	 * @param stone ���� ����
	 * @return ���� ���� ���
	 */
	public String power(String stone) {
		String result = stone;
		
		if(stone.equals("ũ���䳪��Ʈ")) {
			power = 0;
			result += "���� ������. ~(_-_)~";
		}else if(stone.equals("���̾Ƹ��")) { 
			power = 80;
			result += "�����մϴ�. o(^^0)(0^^)o";
		}else {
			power = 110;
			result += "(�Ѥ�+ )( +�Ѥ�)";				
	    
		}//end else
		
		return result;
		
	}//power
	

	
	
}//class
