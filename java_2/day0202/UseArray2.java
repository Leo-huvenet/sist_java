package day0202;

/**
 *	��� ���� �����Ǵ� ������ �迭�� ���
 * @author SIST
 */
public class UseArray2 {
	
	public UseArray2() {
		//1.���� : ��������[][] �迭�� = null;
		int[][] arr = null;
		//2.���� : �迭�� = new ��������[���Ǽ�][���Ǽ�];
		// ������� ���� ������ ����. ������ ���� �ʱ�ȭ�ȴ�.
		arr = new int[3][4];
		
		System.out.println(arr[0]); //������ �迭���� ���� ��ȣ�� �ּҸ� ������ �ִ�.
		
		System.out.println("���� �� : "+ arr.length+", ���� �� : "+ arr[0].length);
		
		//3.�� �Ҵ� : �迭��[���ȣ][����ȣ] = ��;
		//���� ��ȣ�� �ּҸ� ������ �ֱ� ������ ���� ���� �� ����.
		//arr[1]=10;
		arr[0][0] = 10;
		arr[1][1] = 20;
		arr[2][2] = 30;
		arr[1][3] = 40;
		
		//4. �� ��� : �迭��[���� ��ȣ][���� ��ȣ]
		System.out.println(arr[0][0]+" / " +arr[0][1]);
		
		//�ϰ�ó��
		for(int i=0; i < arr.length; i++) { //���� ��
			System.out.println(i+"�� ����");
			for(int j =0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d]=%-5d",i,j,arr[i][j]);
			}
			System.out.println("\n"+i+"�� ��");
		}
		
		//String������ ������ �迭�� �����, ������ ����(2~9)�� �Է��� �� ���
		String[][] gugudan = new String[10][10];
		int row = 0;
		int col = 0;
		for(int i=2; i <10 ; i++) { //���� ��
			System.out.println(i+"�� ����");
			for(int j =1; j < 10; j++) {
				gugudan[row][col]=i+"x"+j+"="+(i*j);
				System.out.println(gugudan[row][col]+" ");
				col++;
			}
			row++;
			col=0;
			System.out.println("\n"+i+"�� ��");
		}
		
		int[][] temp = new int[10][10];//������ ��� ���� ���� 0���� �ʱ�ȭ
		
		for(int i =0; i< temp.length; i++) { //��
			for(int j =0; j< temp[i].length; j++) { //��
				if(i == 0 || i == temp.length-1 || j == 0 || j == temp[i].length-1) {//ó�� ��, ������ ��,
					temp[i][j] = 1;
				}
				System.out.printf("%-3d",temp[i][j]);
			}
			System.out.println();
		}
			
	
		
		
		
		
		
	}//UseArray2
	
	public static void main(String[] args) {
		new UseArray2();
	}

}
