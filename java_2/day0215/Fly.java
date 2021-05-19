package day0215;

/**
 *	날기위한 작업의 목록을 정의한 인터페이스<br>
 *	날기위한 작업은 양력과 추친력이 필요하다.
 * @author SIST
 */
public interface Fly {
	
	//abstract은 쓰지않아도 된다(생략해도 같은의미)
	public String upwardForce();
	
	public abstract String drivingForce();
}
