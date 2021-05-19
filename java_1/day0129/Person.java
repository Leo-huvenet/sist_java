package day0129;

/**
 *	사람을 객체모델링(추상화)하여 공통특징을 추출한 클래스<br>
 *	명사적 : 눈, 코, 입, 이름<br>
 *	동사적 : 먹는다 - Overloading - 매개변수 타입과 갯수로 구분<br>
 *	사용)<br>
 *		클래스명 객체명 = new 생성자();<br>
 *		객체명.method명()<br>
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
	 * 생성된 사람 객체가 집에서 밥을 먹는일 구현
	 * @return 밥먹는 일
	 */
	public String eat() {
		return name+"이(가) 집에서 밥을 먹는다.";
	}
	
	/**
	 * method Overload <br>
	 * 생성된 사람 객체가 식당에서 밥을 사먹는 일 구현
	 * @param menu 사먹는 음식종류
	 * @param price 사먹는 음식가격
	 * @return 사먹는 일
	 */
	public String eat(String menu, int price) {
		return name+"이(가) 식당에서 "+menu + "인 음식을 "+price+"원 내고 먹는다.";
	}
	
	
	
}//class
