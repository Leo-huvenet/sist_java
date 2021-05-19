package day0215;

/**
 *	Fly interface를 구현한 클래스 작성. FlyImpl은 Fly 이다(is a 관계, 객체다형성)
 * @author SIST
 */
public class FlyImpl implements Fly{

	@Override
	public String upwardForce() {
		return "앙력";
	}//upwardForce

	@Override
	public String drivingForce() {
		return "추친력";
	}//drivingForce

}
