package day0216;

/**
 *	��������� ������������ ���� Ŭ������ ���
 * @author SIST
 */
public class UseStudentVO {

//	private int regiNum;//�й�
//	private String name;//�̸�
//	private int age;//����
//	private double height;//Ű
	public static void main(String[] args) {
		//1�� 1, �̸� : ���ϴ�, ���� : 20��, Ű : 185.8 (��� �����͸� �˰� �ִ� ��Ȳ => �Ű����� �ִ� ������)
		StudentVO lhn = new StudentVO(1,"���ϴ�",20,185.8);
		//��ȣ : 2, �̸� : �ڱ�� ( ��� �����͸� ���� ���ϴ� ��Ȳ => �⺻ ������) - setter method ���
		StudentVO pkb = new StudentVO();
		pkb.setName("�ڱ��");
		
		System.out.println(lhn.toString());
		System.out.println(pkb);
		
		//�����л��� ������ �����ϰ� ó��. ��������� ������������ �迭�� ����
		//1,���ϴ�,20,185.8  2,�ڱ��,25,170.3  3,���μ�,26,178,7
		
		//1.���� ��������[] �迭�� = null;
		StudentVO[] stuArr = null;
		//1.���� 
		stuArr = new StudentVO[3];
		//1.���Ҵ� 
		stuArr[0] = lhn;
		stuArr[1] = pkb;
		//stuArr[1]�� �ּҿ� pkb�� �ּҴ� ����.
		//stuArr[1]�� ����Ͽ� ���� 25����
		stuArr[1].setAge(25);
		//pkb�� ����Ͽ� Ű 170.3 ����
		pkb.setHeight(170.3);
		
		stuArr[2] = new StudentVO(3,"���μ�",26,178.8);
		
		//1.�����(�ϰ�ó��) 
		for(int i =0 ; i<stuArr.length; i++){
			System.out.printf("��ȣ : %d, �̸� : %s, ���� : %d, Ű : %.1f\n",stuArr[i].getRegiNum(),stuArr[i].getName(),stuArr[i].getAge(),stuArr[i].getHeight());
		}
		
	}
		
}


