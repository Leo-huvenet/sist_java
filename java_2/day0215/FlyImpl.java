package day0215;

/**
 *	Fly interface�� ������ Ŭ���� �ۼ�. FlyImpl�� Fly �̴�(is a ����, ��ü������)
 * @author SIST
 */
public class FlyImpl implements Fly{

	@Override
	public String upwardForce() {
		return "�ӷ�";
	}//upwardForce

	@Override
	public String drivingForce() {
		return "��ģ��";
	}//drivingForce

}
