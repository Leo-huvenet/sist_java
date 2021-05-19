package day0121;

/**
 *	else if, 다중 if<br>
 *	연관된 여러 조건을 비교할 때 사용<br>
 *	문법) <br>
 *	if(조건식){<br>
 *		조건에 맞을 때 수행할 문장들 <br>
 *	}else if(조건식) <br>
 *		조건에 맞을 때 수행할 문장들 <br>
 *		.<br>
 *		.<br>
 *	}else{ <br>
 *		모든 조건에 맞지 않을 때 수행할 문장들 <br>
 *	}		
 * @author SIST
 */
public class TestElseIf {

	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		
		System.out.println("입력점수 ["+ score + "]점 입니다.");
		if(score < 0) {
			System.out.println("0점보다 작아서 실패");
		}else if(score > 100) {
			System.out.println("100점보다 커서 실패.");
		}else {
			System.out.println("입력성공.");
		}//end if

		System.out.println("-------------------------------------------");
		//// 점수를 입력받아 점수판정
		//0~39까지는 - 과락
		//40~59까지는 - 다른점수 확인
		//60~100까지는 - 합격
		
		System.out.println("입력점수 ["+ score + "]점 입니다.");
		if(score>=0 && score<=39) {
			System.out.println("과락");
		}else if(score <=59) {//굳이 시작범위를 쓰지 않아도 된다(위 조건(if)에서 기술 되어있다)
			System.out.println("다른점수 확인");
		}else if(score <=100) {
			System.out.println("합격");
		}//end if
		
		//문제 args[1]
		//현병호나 이학민 이라면 "A강의장 학생"
		//곽범수나 박기범 이라면 "B강의장 학생"
		//권예원이나 정은아 이라면 "C강의장 학생"
		//그렇지 않다면 "D강의장 학생" 출력
		
		//equals는 문자열을 비교해준다(반환 값은 boolean)
		//equals는 String의 값을 비교
		//==는 String의 주소값을 비교
		
		if(args[1].equals("현병호") || args[1].equals("이학민")) {
			System.out.println("A강의장학생");
		}else if(args[1].equals("곽범수") || args[1].equals("박기범")) {
			System.out.println("B강의장학생");
		}else if(args[1].equals("권예원") || args[1].equals("정은아")) {
			System.out.println("C강의장학생");
		}else {
			System.out.println("D강의장학생");
		}//end if	
	}
}
