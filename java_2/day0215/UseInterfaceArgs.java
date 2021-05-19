package day0215;

public class UseInterfaceArgs {

	public void useFly(Fly fly) { //inserface를 매개변수로 정의
		System.out.println(fly.drivingForce());
		System.out.println(fly.upwardForce());
	}
	
	
	
	public static void main(String[] args) {
		//useFly method 호출(interface를 객체로 생성 => 구현클래스로 가능)
		//1. 인터페이스를 구현한 클래스를 생성(불러온다)
		FlyImpl fly = new FlyImpl(); 
		//fly는 인터페이스이기 때문에 객체를 생성할 수 없다. 그러므로 fly를 구현하고 오버라이딩한 클래스를 이용해 객체를 생성해서 불러온다.
		//2. 인스턴스method를 호출하기위해 객체생성
		UseInterfaceArgs uia = new UseInterfaceArgs();
		//3. method를 호출하고 Fly를 구현한 객체를 arguments로 할당.
		uia.useFly(fly);
		
	}
}
