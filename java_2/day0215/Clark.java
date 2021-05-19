package day0215;

/**
 *	사람의 공통특징은 상솧ㄱ을 받아사용하고, 날기위한 기능은 구현하여 사용하는 클래스 <br>
 *	(Person을 상속받고, Fly를 구현한 자식클래스)<br>
 *	눈, 코, 입, 이름, 먹는 일은 부모클래스에서 제공하는 것을 사용하고(코드의 재 사용성),
 *	자신만의 특징을 정의하는 클래스
 * @author SIST
 */
public class Clark extends Person implements Fly{
	
	public int power;
	
	/**
	 * 클락 클래스의 기본생성자<br>
	 * 객체가 생성될 때 기본적으로 가지고있어야할 값 설정
	 * 힘레벨은 1~100까지 존재하고, 클락은 힘 레벨이 높은 상태인 80을 가지고 태어난다.
	 */
	public Clark() {
		power = 80;
	}//Clark
	
	@Override
	public String eat() {
		return getName()+"가 집에서 빵을 '와앙'하고 먹는다.";
	}
	
	@Override
	public String eat(String menu, int price) {
		return getName()+"가 레스토랑에서 "+menu+"인 음식을 "+price+"$내고 사먹었다.";
	}
	
	/**
	 * 클락의 힘을 설정하는 일. 크립토나이트가 입력되면 힘이 빠진다.
	 * @param stone 돌의 종류
	 * @return 돌을 맞은 결과
	 */
	public String power(String stone) {
		String result = stone;
		
		if(stone.equals("크립토나이트")) {
			power = 0;
			result += "힘이 빠진다. ~(_-_)~";
		}else if(stone.equals("다이아몬드")) { 
			power = 80;
			result += "감사합니다. o(^^0)(0^^)o";
		}else {
			power = 110;
			result += "(ㅡㅡ+ )( +ㅡㅡ)";				
	    
		}//end else
		
		return result;
		
	}//power

	@Override
	public String[] language() {
		//일차원 배열을 참조형 형식으로 생성하여 반환.
				String[] lang = {"영어","독일어","외계어"};
				
				return lang;
	}

	////Fly의 abstract method Override////
	@Override
	public String upwardForce() {
		return getName()+"의 양력은 6,894.73326 Pa로 추정된다.";
	}

	@Override
	public String drivingForce() {
		return getName()+"의 추진력은 1000km/h로 추정된다.";
	}
	

	
	
}//class
