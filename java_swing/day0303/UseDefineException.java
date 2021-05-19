package day0303;

import java.util.Random;

public class UseDefineException {
	
	/**
	 * 담배를 피우는 것을 적발 일을 수행
	 * @return
	 */
	public String kibum() throws TobaccoException{
	//public String kibum() throws Exception{ // kibum을 사용하면 예외가 발생하는데 어떤 예외인지 알 수 없다.
		String result="";
	
		String[] stuGrade= {"초딩","중딩","고딩"};
		
		String temp = stuGrade[ new Random().nextInt(stuGrade.length)]; //랜덤 
		if(temp.equals("초딩")) { //흡연자가 초딩이라면 예외를 발생
			
			//throw new Exception(temp+"님 금연 좀!!");//어떤 예외가 발생했는지 알기 어렵다.
			throw new TobaccoException("님 금연 좀!!");
		}//end if
		
		result = temp+"님이 흡연 중 모른척 지나간다.(-- )( --)";
		
		return result;
	}
	
	public static void main(String[] args) {
		UseDefineException ude = new UseDefineException();
		
		try {
		System.out.println(ude.kibum()); //기범을 사용하면 문제(예외)가 발생한다.
		}catch(TobaccoException e) {//발생된 예외를 명확하게 정의하여 처리할 수 있다.
			e.printStackTrace();//발생한 문제를 출력
		}
	}

}
