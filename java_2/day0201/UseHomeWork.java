package day0201;

public class UseHomeWork {

	public static void main(String[] args) {
		
		HomeWork hw = new HomeWork("981103-1070918");	
		
		if(hw.len()){//�ֹι�ȣ�� ���ڼ��� 14������ üũ
			 if(hw.position()){
			    System.out.println("�Է��ֹι�ȣ : "+hw.getRrn());
			    System.out.println("������� : " + hw.birthday());
			    System.out.println("���� : "+ hw.age());
			    System.out.println("���� : "+ hw.gender());
			    System.out.println("�� : "+hw.zodiac());

			  }else{
			   System.out.println("\"-\"�� �������� ��ġ�� �����ϴ�.");
			   }
			}else{
			 System.out.println("��(��) �ֹι�ȣ�� ���ڼ��� �����ʽ��ϴ�.");
			}//end else

		
		
		
		}

}
