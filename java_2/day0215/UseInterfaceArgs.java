package day0215;

public class UseInterfaceArgs {

	public void useFly(Fly fly) { //inserface�� �Ű������� ����
		System.out.println(fly.drivingForce());
		System.out.println(fly.upwardForce());
	}
	
	
	
	public static void main(String[] args) {
		//useFly method ȣ��(interface�� ��ü�� ���� => ����Ŭ������ ����)
		//1. �������̽��� ������ Ŭ������ ����(�ҷ��´�)
		FlyImpl fly = new FlyImpl(); 
		//fly�� �������̽��̱� ������ ��ü�� ������ �� ����. �׷��Ƿ� fly�� �����ϰ� �������̵��� Ŭ������ �̿��� ��ü�� �����ؼ� �ҷ��´�.
		//2. �ν��Ͻ�method�� ȣ���ϱ����� ��ü����
		UseInterfaceArgs uia = new UseInterfaceArgs();
		//3. method�� ȣ���ϰ� Fly�� ������ ��ü�� arguments�� �Ҵ�.
		uia.useFly(fly);
		
	}
}
