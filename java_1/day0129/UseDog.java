package day0129;

/**
 *	Dog Class의 사용
 *	husky Chihuahua ShihTzu
 * @author SIST
 */
public class UseDog {
	
	public static void main(String[] args) {
	//int eye, int ear, int tail, int leg, String name
	Dog  husky= new Dog(2, 2, 1, 4, "허스키");
	System.out.printf("%s의 눈은 %d개 귀는 %d개 꼬리는 %d개 다리는 %d개 입니다.\n",husky.getName(), husky.getEye(), husky.getEar(), husky.getTail(), husky.getLeg());
	System.out.println(husky.eat("강아지껌"));
	System.out.println(husky.run("한강"));
	
	
	}

}
