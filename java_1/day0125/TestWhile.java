package day0125;

/**
 * while<br>
 * 시작과 끝을 모를때 사용하는 반복문.<br>
 * 
 * while(조건식){<br>
 * 반복수행문장...<br>
 * }
 * 
 * @author user
 */
public class TestWhile {

	public static void main(String[] args) {
		int i = 0; // 초기값
		while (i < 10) { // 조건식
			System.out.println("안녕하세요? i = " + i);// 반복수행문장
			i++; // 증.감소식
		} // end while

		///////////////// 단을 입력받아 단이 2단에서 9단 사이일 때에만 입력받은 단으로 구구단을 출력.
		int j = Integer.parseInt(args[0]);

		if ( j > 1 && j < 10 ) {
			i=1;
			while( i < 10) {
				System.out.println(j+ " x " + i + " = " + j*i );
				i++;
			}//end while

		}//end if
		
		/////////////// while의 무한 loop //////////////////
		while( true ) {
			System.out.println("무한루프");
			break;//break가 설정되면 반복문을 빠져 나간다.
		}//end while
		System.out.println("=======");
		

	}// main

}// class
