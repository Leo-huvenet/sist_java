package day0201;

public class UseHomeWork {

	public static void main(String[] args) {
		
		HomeWork hw = new HomeWork("981103-1070918");	
		
		if(hw.len()){//주민번호의 글자수가 14자인지 체크
			 if(hw.position()){
			    System.out.println("입력주민번호 : "+hw.getRrn());
			    System.out.println("생년월일 : " + hw.birthday());
			    System.out.println("나이 : "+ hw.age());
			    System.out.println("성별 : "+ hw.gender());
			    System.out.println("띠 : "+hw.zodiac());

			  }else{
			   System.out.println("\"-\"이 정상적인 위치에 없습니다.");
			   }
			}else{
			 System.out.println("은(는) 주민번호의 글자수가 맞지않습니다.");
			}//end else

		
		
		
		}

}
