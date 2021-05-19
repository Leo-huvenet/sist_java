package day0127;

/**
 *	특수문자 : 문자열안에 정의하며 \로 시작하는 기능을 가진 문자
 * @author SIST
 */
public class EscapeCharacter {

	public static void main(String[] args) {
		//줄 변경 \n : windows는 \r\n 이 사용된다.
		System.out.println("Java\nOracle");
		//tab key : \t
		System.out.println("Java\tOracle");
		System.out.println("오늘은\t수요일");
		System.out.println("쌍용교육\t4강\t수업");
		System.out.println("오늘은 \"수요일\" 입니다.");
		System.out.println("오늘은 \'수요일\' 입니다.");
		System.out.println("c:\\new\\test\\temp.txt");
		System.out.println("안녕\b");
		System.out.println("안녕\f하세요?");
	}

}
