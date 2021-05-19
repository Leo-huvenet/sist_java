package day0202;

public class UseArray2Score {

	private void processScore() {
		 int[][] score = {
				 				{89,91,73}, 
				 				{61,70,72}, 
				 				{96,99,98}, 
				 				{79,77,80}, 
				 				{100,98,99}
				 			 };//5�� 3��
		 
		 String[] names = {"����ȣ","������","���μ�","���й�","�ڱ��"};
		
		//2���� �迭�� �౸�а�ȣ�� ������� ������ Error�� �߻��Ѵ�.
		//System.out.println(score.length+"��"+ score[0].length+"��");
		
		int java = 0;
		int oracle = 0;
		int jsp = 0;
		
		int endSum = 0; 
		double endAvg = 0.0;
		
		double javaAvg = 0.0;
		double oracleAvg = 0.0;
		double jspAvg = 0.0;
		
		
		int[] totalSum = new int[score.length]; //student1���� ���
		int[][] javaJumsu = new int[score.length][score[0].length]; //java1���� ���
		
		
		System.out.println("��ȣ\t�̸�\t�ڹ�\t����Ŭ\tJSP\t����\t���");
		System.out.println("-------------------------------------------------------");
		for(int i =0; i < score.length; i++) {//�� - ��� �л�
			
			int sum=0;
			
			java += score[i][0];
			oracle += score[i][1];
			jsp += score[i][2];
			
			javaJumsu[i][0] = score[i][0]; //java1���� ���
			
			System.out.printf("%d��\t%s\t",i+1,names[i]);
			
			for(int j =0; j < score[i].length; j++) {//�� - �л� �Ѹ��� ������ ����
				sum += score[i][j];
				
				System.out.printf("%d\t",score[i][j]);
			}//end for
			endSum +=sum;
			totalSum[i] = sum;
			endAvg =(double)sum/score[i].length;
			
			javaAvg = (double)java/score.length;
			oracleAvg = (double)oracle/score.length;
			jspAvg = (double)jsp/score.length;
			
			System.out.printf("%d\t%.2f\n",sum, endAvg);
		}//end for
		System.out.println("-------------------------------------------------------");
		System.out.printf("����\t\t%d\t%d\t%d\t%d\n",java,oracle,jsp,endSum);
		System.out.printf("���\t\t%.2f\t%.2f\t%.2f\t%.2f\n"
				,javaAvg,oracleAvg,jspAvg,(double)endSum/score.length);
		System.out.printf("1���л� [%s] \n",student1(totalSum, names));
		System.out.printf("�ڹ��� �ְ����� [%d]\n",java1(javaJumsu)); //method�� ���� ��.
		System.out.printf("�� �����ο� [%d]��, ���� ����� [%d]��\n",score.length,score[0].length);
		
		
		sort(score[0]);
	}
	
	//1���л�[%d]�� �̸� [%s]\n //method�� ���� ��.
	/**
	 * 1���л��� ��ȣ�� �̸��� ��� ��
	 * @param totalScore	�л����� ����
	 * @param names	�л��� �̸�
	 * @return	1���л��� ��ȣ�� �̸�
	 */
	public String student1 (int[] totalSum, String[] names) {
		String result = "";
	
		int topNum = 0;
		int tempScore = 0;
		
		for(int i = 0 ; i < totalSum.length; i++) {//�ְ������� ���ϱ� ���� �ݺ���
			if(tempScore < totalSum[i]) {//�ӽú����� ���� �迭�� i��° ���� ������ �۴ٸ� 
				tempScore = totalSum[i];//i��° ���� ������ �ӽú����� �����Ѵ�.
				topNum = i;
			}
		}
		
			result = (topNum+1)+"�� "+names[topNum];
		
			return result;	
	}
	
	//�ڹ��� �ְ����� [%d] //method�� ���� ��.
	public int java1(int[][] javaJumsu) {
	int max = javaJumsu[0][0];
	
	for(int i = 1; i < javaJumsu.length; i++ ) { // i ������ 0���� �����ϸ� �ڱ��ڽŵ� ���Ѵ�(�ǹ̾���)
		if(max < javaJumsu[i][0]) {
			max = javaJumsu[i][0];
		}
	}	
	return max;
	}
	
	//1�� �л��� ������ ������������ �����Ͽ� ��� // method�� ���� ��.
	public void sort(int[] score) {
		int temp = 0;
		//1. ������ �迭�� ����
		int[] tempScore = new int[score.length];
		//���� �迭���� ó������� ����������� ������ �迭�� �ִ´�.
		for(int i = 0; i < score.length; i++) {
			tempScore[i] = score[i];
		}
		//����� �迭�� ����Ͽ� ���� �۾��� ����
		for(int i =0; i < tempScore.length-1; i++) {//�չ��� ���� ����ϱ�����
			for(int j =i+1; j < tempScore.length; j++) {//�޹���� ���� ����ϱ�����
			if(tempScore[i] > tempScore[j] ) {//�� ��
				temp = tempScore[i]; 
				tempScore[i] = tempScore[j]; 
				tempScore[j] = temp; 
				} 
			}	
		}
		System.out.println("-------------------------------------------------------");
		System.out.print("1�� �л��� ����(��������)");
		//����� �迭�� ���ĵ����͸� ���
		for(int value : tempScore) {
			System.out.println();
			System.out.printf("%-5d",value);
		}
	}

	public static void main(String[] args) {
		//��üȭ
		UseArray2Score uas = new UseArray2Score();
		uas.processScore();
		
	}//main
	
}//class
