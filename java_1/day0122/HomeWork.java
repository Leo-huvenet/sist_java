package day0122;

public class HomeWork {
	public static final int BUS = 1200;
	public static final int SUBWAY = 1300;
	public static final int TAXI = 3800;
	
	public static void main(String[] args) {
//����1
		int distance = Integer.parseInt(args[1]);
	//	int Fee = 0;
	//	int OverFee = 0;
		
		if(0<=distance && 10>=distance) 
		{
			
		}else if(10<distance) {
			
		}
		
		
		if(args[0].equals("����") ) {
	//		System.out.println("�Է±������"+args[0]+"�̰�, �⺻���"++"���Դϴ�.\n �̵��Ÿ�"++"���̰�,�� ����� "++"�� �Դϴ�.");
		}else if(args[0].equals("����ö")) {
			System.out.println("�Է±������"+args[0]+"�̰�, �����"+SUBWAY+"���Դϴ�.\n �պ����"+(SUBWAY*2)+"���̰�, �Ѵ� 20�� ������� �ϸ�"+(SUBWAY*2*20)+"�� �Դϴ�.");
		}else if(args[0].equals("�ý�")) {
			System.out.println("�Է±������"+args[0]+"�̰�, �����"+TAXI+"���Դϴ�.\n �պ����"+(TAXI*2)+"���̰�, �Ѵ� 20�� ������� �ϸ�"+(TAXI*2*20)+"�� �Դϴ�.");
		}else {
			System.out.println("�Է��Ͻ� ��������� ���߱����� �ƴմϴ�.");
		}//end if	

//����2
		for(int i = 1; i<=100; i++) {
			if(i%3==0) {
				System.out.print("¦");
			}else {
				System.out.print(i);
			}
		}
		
	}//main

}//class
