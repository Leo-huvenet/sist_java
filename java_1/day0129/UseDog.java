package day0129;

/**
 *	Dog Class�� ���
 *	husky Chihuahua ShihTzu
 * @author SIST
 */
public class UseDog {
	
	public static void main(String[] args) {
	//int eye, int ear, int tail, int leg, String name
	Dog  husky= new Dog(2, 2, 1, 4, "�㽺Ű");
	System.out.printf("%s�� ���� %d�� �ʹ� %d�� ������ %d�� �ٸ��� %d�� �Դϴ�.\n",husky.getName(), husky.getEye(), husky.getEar(), husky.getTail(), husky.getLeg());
	System.out.println(husky.eat("��������"));
	System.out.println(husky.run("�Ѱ�"));
	
	
	}

}
