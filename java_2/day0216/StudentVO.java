package day0216;

/**
 * 사용자 정의 자료형<br>
 *	자바에서 제공하는 데이터형을 조합하여 복합적인 정보를 저장할 목적으로 만드는 클래스.<br>
 *	VO(Value Object)<br>
 *
 *	학생의 정보는 학번,이름,나이,키 로 구성된다.
 * @author SIST
 */
public class StudentVO {//int String int double로 이루어진 사용자정의 데이터 형 StudentVO 이다.
	private int regiNum;//학번
	private String name;//이름
	private int age;//나이
	private double height;//키
	
	/**
	 * 학생의 모든 정보를 알지 못할 때 사용하는 생성자
	 * 개별정보를 setter method를 사용하여 입력한다.
	 */
	public StudentVO() {
		
	}
	
	/**
	 * 학생의 모든 정보를 알 때 사용하는 생성자
	 * @param regiNum
	 * @param name
	 * @param age
	 * @param height
	 */
	public StudentVO(int regiNum, String name,  int age, double height) {
		this.regiNum = regiNum;
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public int getRegiNum() {
		return regiNum;
	}

	public void setRegiNum(int regiNum) {
		this.regiNum = regiNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "StudentVO [regiNum=" + regiNum + ", name=" + name + ", age=" + age + ", height=" + height + "]";
	}
}//class
