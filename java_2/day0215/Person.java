package day0215;

/**
 *	사람을 객체모델링(추상화)하여 공통특징을 추출한 클래스로 직접 객체화하는 것보다, 자식클래스를
 *	만들어 상속을 해주는 목적으로 설계된 클래스<br>
 *	명사적 : 눈, 코, 입, 이름<br>
 *	동사적 : 먹는다 - Overloading - 매개변수 타입과 갯수로 구분<br>
 *	사용)<br>
 *		클래스명 객체명 = new 생성자();<br>
 *		객체명.method명()<br>
 * @author SIST
 */
/**
 * @author SIST
 *
 */
/**
 * @author SIST
 *
 */
public abstract class Person {
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
	

	//값을 설정하는 method : setter method - 가변일
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
	
	//값을 얻는 method : getter method - 고정값
	
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
	 * 생성된 사람 객체가 집에서 음식을 먹는일 구현하도록을 강제성을 부여하는 method
	 * @return 집에서 음식을 먹는 일.
	 */
	public abstract String eat();
	
	/**
	 * method Overload <br>
	 * 생성된 사람 객체가 식당에서 음식을 사먹는 일을 구현하도록 강제성을 부여하는 method.
	 * @param menu 사먹는 음식종류
	 * @param price 음식가격
	 * @return 사먹는 일
	 */
	public abstract String eat(String menu, int price) ;
	
	
	/**
	 *	생성된 사람 객체가 구사하는 언어를 구현하도록 강제성을 부여하는 method. 
	 * @return	구사할 수 있는 언어들
	 */
	public abstract String[] language();
	
	
	
}//class
