package day0202;

public class UseArrayScore {
	
	public void score() {
			//1. 6명의 학생점수를 저장한 배열을 선언
			int[] studentScore = {84, 72, 99, 95, 60, 63};
			int sum = 0;
			
			System.out.println("번호\t점수");
			System.out.println("------------");
			
			for(int i = 0; i < studentScore.length; i++) {
				System.out.printf("%d\t%d\n", i+1, studentScore[i]);
				sum += studentScore[i];
			}
			System.out.println("------------");
			System.out.printf("응시인원[%d]명\n",studentScore.length);
			System.out.printf("총점[%d]점\n",sum);
			System.out.printf("평균[%.2f]점\n",(double)sum/studentScore.length);
	}
	
	public void familyName() {
		String[] name = {"강인섭","곽범수","김다은","강현우","김덕영","이상철","이예림","이하늘"
				,"정은아","이학민"};
		for(int i=0; i< name.length; i++) {
			if(name[i].startsWith("이")) {
				System.out.println(name[i]);
			}
			
			
		
		}//end for
		
	}//familyName
	
	public static void main(String[] args) {
		UseArrayScore uas = new UseArrayScore();
		uas.score();
		System.out.println("--------------------------");
		uas.familyName();
	}

}
