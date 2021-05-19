package day0208;

/**
 *	숙제1번
 * @author SIST
 */
public class HomeWork extends Person{
	
	
	public HomeWork() {
		
	}
	
	@Override
	public String eat() {
		return getName()+"가 카페에서 아이스티를 사먹는다.";
	}
	
	@Override
	public String eat(String menu, int price) {
		return getName()+"가 친구에게"+price+"원인 음식 "+menu+"을 사주었다.";
	}
}
	
	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	

