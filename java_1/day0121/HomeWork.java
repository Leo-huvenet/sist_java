package day0121;

public class HomeWork {
	public static final int BUS = 1200;
	public static final int SUBWAY = 1300;
	public static final int TAXI = 3800;
	
	public static void main(String[] args) {
		
		//����1
		int year = Integer.parseInt(args[0]);
		
		if(year%12==0) {
			System.out.println(year+"��� ������ ��");
		}else if(year%12==1) {
			System.out.println(year+"��� �� ��");
		}else if(year%12==2) {
			System.out.println(year+"��� �� ��");
		}else if(year%12==3) {
			System.out.println(year+"��� ���� ��");
		}else if(year%12==4) {
			System.out.println(year+"��� �� ��");
		}else if(year%12==5) {
			System.out.println(year+"��� �� ��");
		}else if(year%12==6) {
			System.out.println(year+"��� ȣ���� ��");
		}else if(year%12==7) {
			System.out.println(year+"��� �䳢 ��");
		}else if(year%12==8) {
			System.out.println(year+"��� �� ��");
		}else if(year%12==9) {
			System.out.println(year+"��� �� ��");
		}else if(year%12==10) {
			System.out.println(year+"��� �� ��");
		}else if(year%12==11) {
			System.out.println(year+"��� �� ��");
		}
		
		//����2
		if(args[1].equals("����") ) {
			System.out.println("�Է±������"+args[1]+"�̰�, �����"+BUS+"���Դϴ�.\n �պ����"+(BUS*2)+"���̰�, �Ѵ� 20�� ������� �ϸ�"+(BUS*2*20)+"�� �Դϴ�.");
		}else if(args[1].equals("����ö")) {
			System.out.println("�Է±������"+args[1]+"�̰�, �����"+SUBWAY+"���Դϴ�.\n �պ����"+(SUBWAY*2)+"���̰�, �Ѵ� 20�� ������� �ϸ�"+(SUBWAY*2*20)+"�� �Դϴ�.");
		}else if(args[1].equals("�ý�")) {
			System.out.println("�Է±������"+args[1]+"�̰�, �����"+TAXI+"���Դϴ�.\n �պ����"+(TAXI*2)+"���̰�, �Ѵ� 20�� ������� �ϸ�"+(TAXI*2*20)+"�� �Դϴ�.");
		}else {
			System.out.println("�Է��Ͻ� ��������� ���߱����� �ƴմϴ�.");
		}//end if	

	}

}
