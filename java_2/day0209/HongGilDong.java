package day0209;

/**
 *	사람의 공통특징을 사용하는 클래스 (Person을 상속받는 자식클래스)<br>
 *	눈, 코, 입, 이름, 먹는 일은 부모클래스에서 제공하는 것을 사용하고(코드의 재 사용성),
 *	자신만의 특징을 정의하는 클래스
 * @author SIST
 */

public class HongGilDong extends Person {
	
	private int level;

	/**
	 * 홍길동 클래스의 기본생성자<br>
	 * 객체가 생성될 때 기본적으로 가지고있어야할 값 설정
	 * 싸움레벨은 1~10까지 존재하고, 홍길동은 싸움 레벨이 높은 상태인 6을 가지고 태어난다.
	 */
	public HongGilDong() {
		level = 6;
	}//HongGilDong
	@Override
	public String eat() {
		return getName()+"에서 집에서 밥을 앙냥냥 먹는다. ";
	}

	/**
	 *	부모클래스가 제공하는 기능이 자식클래스에서 맞지 않을 때, 자식클래스의 상황과 맞도록 
	 *	method를 재정의한다.
	 */
	@Override
	public String eat(String menu, int price) {
		//자식 클래스의 name변수가 private 접근지정자를 가지고 있어서, 자식클래스에서는 직접 사용할 수 없다.
		//따라서 자식 클래스에 부모클래스의 private 자원을 사용하기 위해 getter method를 사용한다.
		return getName()+"이 주막에서 "+menu+"인 음식을 "+price+"냥 내고 사먹는다.";
	}
	

	
	/**
	 * 자식클래스의 자신만의 특징. 싸우는 일
	 * @param yourLevel 상대방의 레벨
	 * @return 자신의 레벨
	 */
	public String fight(int yourLevel) {
		String result = "";//empty 
		
		if(level < yourLevel) { //상대방의 레벨이 높은 경우 : 진다
			result =yourLevel+"에게 졌다. Orz";
			level--; //레벨감소
			if(level < 1) {
				level=1;
			}//end if
			
		}else if(level > yourLevel) { //상대방의 레벨이 낮은 경우 : 이긴다
			result =yourLevel+"에게 이겼다. s('.^)V";		
			level++;//레벨증가
			if(level > 10) {
				level=10;
			}//end if
		}else {//비기는 경우
			result =yourLevel+"에게 비겼다. (ㅡㅡ+)";	
			//레벨의 변화가 없다.
			
	    
		}//end else
		
		return result;
	}
	
	public int getLevel() {
//		System.out.println("method를 호출하는 객체의 heap 주소 : " +this);
//		super : 부모클래스의 인스턴스주소를 사용할 수 있는 키워드.
//		문법)
//		부모클래스의 기본 생성자 호출 : super();
//		부모클래스의 매개변수 있는 생성자 호출 : super(값,,,);
//		System.out.println("method를 호출하는 객체의 부모 heap 주소 : " +super); //super는 출력할 수 없다.
		return level;
	}
	
	/**
	 * 홍길동은 한국어와 만주어를 구현할 수 있다.
	 */
	@Override
	public String[] language() {
		//일차원 배열을 참조형 형식으로 생성하여 반환.
		String[] useLanguage = new String[2];
		useLanguage[0] ="한국어";
		useLanguage[1] ="만주어";
		return useLanguage;
	}
	
}
