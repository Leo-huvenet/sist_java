package day0208;

/**
 *	����1��
 * @author SIST
 */
public class HomeWork extends Person{
	
	
	public HomeWork() {
		
	}
	
	@Override
	public String eat() {
		return getName()+"�� ī�信�� ���̽�Ƽ�� ��Դ´�.";
	}
	
	@Override
	public String eat(String menu, int price) {
		return getName()+"�� ģ������"+price+"���� ���� "+menu+"�� ���־���.";
	}
}
	
	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	

