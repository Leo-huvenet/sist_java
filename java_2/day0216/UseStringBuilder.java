package day0216;

/**
 *	긴 문자열을 다룰 때 사용하는 클래스
 * StringBuffer, StringBuilder의 사용.
 * @author SIST
 */
public class UseStringBuilder {
	
	public void useStringBuffer() {
		//1. 생성
		StringBuffer sb = new StringBuffer();
		//2. 사용
		//값 추가 append()
		sb.append("안녕.");//문자열 추가
		sb.append(2021);//정수 추가
		sb.append("년");//문자열 추가
		sb.append("A");//문자 추가
		sb.append(2.16);//실수 추가
		sb.append(true);//boolean형도 추가
		
		// 값 삽입 insert(추가할 위치 인덱스, 값)
		//안녕.2021년A2  .   1   6   t   r   u  e
		//0 1 2345678 910 11 12 13 14 15 16
		
		//.의 위치에 '월' 문자열 을 추가
		sb.insert(10, "월");
		sb.insert(14, '일');
		
		//삭제 "2021년"을 삭제
		sb.delete(3,8);
		//문자열 뒤집기
		sb.reverse();
		sb.reverse();
		
		
		System.out.println(sb);
		
	}
	
	public void useStringBuilder() {
		//1. 생성
		StringBuilder sb = new StringBuilder();
		//2. 사용
		//값 추가 append()
		sb.append("안녕.");//문자열 추가
		sb.append(2021);//정수 추가
		sb.append("년");//문자열 추가
		sb.append("A");//문자 추가
		sb.append(2.16);//실수 추가
		sb.append(true);//boolean형도 추가
		
		// 값 삽입 insert(추가할 위치 인덱스, 값)
		//안녕.2021년A2  .   1   6   t   r   u  e
		//0 1 2345678 910 11 12 13 14 15 16
		
		//.의 위치에 '월' 문자열 을 추가
		sb.insert(10, "월");
		sb.insert(14, '일');
		sb.insert(14, '일');
		
		
		//삭제 "2021년"을 삭제
		sb.delete(3,8);
		//문자열 뒤집기
		sb.reverse();
		sb.reverse();
		
		
		System.out.println(sb);	
	
	}
	
	
	
	public static void main(String[] args) {

		UseStringBuilder usb = new UseStringBuilder();
		usb.useStringBuffer();
		System.out.println("------------------------------");
		usb.useStringBuilder();
		System.out.println("------------------------------");

		
		
		String file1 = "c:/dev/test.txt.doc";
		String file2 = "c:/work/test/day0216/Test.java";
		
		//StringBuilder를 사용하여 "c:/dev/test.txt.doc"-> "c:/dev/test.txt.temp.doc" 으로
		StringBuilder sbFile1 = new StringBuilder(file1);
		sbFile1.insert(sbFile1.lastIndexOf("."),".temp");
		System.out.println(sbFile1);
		
		//StringBuilder를 사용하여 "c:/work/test/day0216/Test.java"-> 
		//"c:/work/day0216/Test.java" 으로 변경하여 출력해보세요.
		
		StringBuilder sbFile2 = new StringBuilder(file2);
		sbFile2.delete(7, 12);
		System.out.println(sbFile2);
		
		
		
		
		
		
		
		
	}//main

}
