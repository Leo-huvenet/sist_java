package day0202;

public class UseArray2Score {

	private void processScore() {
		 int[][] score = {
				 				{89,91,73}, 
				 				{61,70,72}, 
				 				{96,99,98}, 
				 				{79,77,80}, 
				 				{100,98,99}
				 			 };//5행 3열
		 
		 String[] names = {"현병호","송준희","강인섭","이학민","박기범"};
		
		//2차원 배열은 행구분괄호를 사용하지 않으면 Error가 발생한다.
		//System.out.println(score.length+"행"+ score[0].length+"열");
		
		int java = 0;
		int oracle = 0;
		int jsp = 0;
		
		int endSum = 0; 
		double endAvg = 0.0;
		
		double javaAvg = 0.0;
		double oracleAvg = 0.0;
		double jspAvg = 0.0;
		
		
		int[] totalSum = new int[score.length]; //student1에서 사용
		int[][] javaJumsu = new int[score.length][score[0].length]; //java1에서 사용
		
		
		System.out.println("번호\t이름\t자바\t오라클\tJSP\t총점\t평균");
		System.out.println("-------------------------------------------------------");
		for(int i =0; i < score.length; i++) {//행 - 모든 학생
			
			int sum=0;
			
			java += score[i][0];
			oracle += score[i][1];
			jsp += score[i][2];
			
			javaJumsu[i][0] = score[i][0]; //java1에서 사용
			
			System.out.printf("%d번\t%s\t",i+1,names[i]);
			
			for(int j =0; j < score[i].length; j++) {//열 - 학생 한명의 모든과목 점수
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
		System.out.printf("총점\t\t%d\t%d\t%d\t%d\n",java,oracle,jsp,endSum);
		System.out.printf("평균\t\t%.2f\t%.2f\t%.2f\t%.2f\n"
				,javaAvg,oracleAvg,jspAvg,(double)endSum/score.length);
		System.out.printf("1등학생 [%s] \n",student1(totalSum, names));
		System.out.printf("자바의 최고점수 [%d]\n",java1(javaJumsu)); //method로 만들 것.
		System.out.printf("총 응시인원 [%d]명, 시험 과목수 [%d]개\n",score.length,score[0].length);
		
		
		sort(score[0]);
	}
	
	//1등학생[%d]번 이름 [%s]\n //method로 만들 것.
	/**
	 * 1등학생의 번호와 이름을 얻는 일
	 * @param totalScore	학생들의 총점
	 * @param names	학생의 이름
	 * @return	1등학생의 번호와 이름
	 */
	public String student1 (int[] totalSum, String[] names) {
		String result = "";
	
		int topNum = 0;
		int tempScore = 0;
		
		for(int i = 0 ; i < totalSum.length; i++) {//최고점수를 구하기 위한 반복문
			if(tempScore < totalSum[i]) {//임시변수의 값이 배열의 i번째 방의 값보다 작다면 
				tempScore = totalSum[i];//i번째 방의 값으로 임시변수를 변경한다.
				topNum = i;
			}
		}
		
			result = (topNum+1)+"번 "+names[topNum];
		
			return result;	
	}
	
	//자바의 최고점수 [%d] //method로 만들 것.
	public int java1(int[][] javaJumsu) {
	int max = javaJumsu[0][0];
	
	for(int i = 1; i < javaJumsu.length; i++ ) { // i 시작을 0으로 시작하면 자기자신도 비교한다(의미없음)
		if(max < javaJumsu[i][0]) {
			max = javaJumsu[i][0];
		}
	}	
	return max;
	}
	
	//1번 학생의 점수를 오름차순으로 정렬하여 출력 // method로 만들 것.
	public void sort(int[] score) {
		int temp = 0;
		//1. 복사할 배열을 생성
		int[] tempScore = new int[score.length];
		//원본 배열에서 처음방부터 마지막방까지 복사할 배열에 넣는다.
		for(int i = 0; i < score.length; i++) {
			tempScore[i] = score[i];
		}
		//복사된 배열을 사용하여 정렬 작업을 수행
		for(int i =0; i < tempScore.length-1; i++) {//앞방의 값을 사용하기위한
			for(int j =i+1; j < tempScore.length; j++) {//뒷방들의 값을 사용하기위한
			if(tempScore[i] > tempScore[j] ) {//값 비교
				temp = tempScore[i]; 
				tempScore[i] = tempScore[j]; 
				tempScore[j] = temp; 
				} 
			}	
		}
		System.out.println("-------------------------------------------------------");
		System.out.print("1번 학생의 점수(오름차순)");
		//복사된 배열의 정렬데이터를 출력
		for(int value : tempScore) {
			System.out.println();
			System.out.printf("%-5d",value);
		}
	}

	public static void main(String[] args) {
		//객체화
		UseArray2Score uas = new UseArray2Score();
		uas.processScore();
		
	}//main
	
}//class
