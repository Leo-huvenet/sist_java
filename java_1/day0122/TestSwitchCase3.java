package day0122;

/**
 * �Էµ� ������ �ش��ϴ� �������ϱ�
 * 90~100 : A
 * 80~89 : B
 * 70~79 : C
 * 60~69 : D
 * 0~59 : F
 * @author SIST
 */
public class TestSwitchCase3 {
	
	public static final int GRADE_A_PLUS = 10; 
	public static final int GRADE_A= 9; 
	public static final int GRADE_B= 8; 
	public static final int GRADE_C= 7; 
	public static final int GRADE_D= 6; 
		
	public static void main(String[] args) {
//			int score =100;
//			char grade =' ';// \u0000
//			//������(10)�� ����Ͽ� ������ ���� �� �ִ�. 
//			//99/10 - 9
//			//98/10 - 9
//			//91/10 - 9
//			//89/10 - 8
//		switch(score/10) {
//			case GRADE_A_PLUS :
//			case GRADE_A: grade='A'; break;
//			case GRADE_B:  grade='B'; break;
//			case GRADE_C:  grade='C'; break;
//			case GRADE_D:  grade='D'; break;
//			default : grade='F';
//			}//end swhitch
//			System.out.println(score+"������ ������ "+grade);
		
		int score =100;
		char grade =64;// \u0000
		//������(10)�� ����Ͽ� ������ ���� �� �ִ�. 
		//99/10 - 9
		//98/10 - 9
		//91/10 - 9
		//89/10 - 8
		if( score >-1 && score<101) {
			
		
	switch(score/10) {
		case GRADE_D :  grade++;
		case GRADE_C :  grade++;
		case GRADE_B :  grade++;
		case GRADE_A : 
		case GRADE_A_PLUS : grade++; break;
		default : grade+=6;
		}//end swhitch
		System.out.println(score+"����"+grade+ "����");
		}else {
			System.out.println("�߸��� ����");
		}
	}

}
