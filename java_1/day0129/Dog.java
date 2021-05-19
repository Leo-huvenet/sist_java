package day0129;

/**
 *	대상선정 : 허스키 치와와 시츄
 *	추상화 : 
 *	개
 *	- 명사적인 특징 : 눈 귀 꼬리 다리 이름
 *	- 동사적인 특징 : 달린다 먹는다
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
		return name+"가 주인과 함께 "+place+"을(를) 산책하고있습니다. ";
	}
	
	public String eat(String snek) {
		return name+"가 간식으로"+snek+"을(를) 먹고있습니다.";
	}
	
	
	
	
	
	
	
}
