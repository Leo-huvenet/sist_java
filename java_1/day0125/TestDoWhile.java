package day0125;



/**
 * do~while<br>
 * 시작과 끝을 모를때 사용하는 반복문.<br>
 *  최소 1번 수행, 최대 조건까지 수행.<br>
 *  do{<br>
 * 		반복수행 문장;<br>
 *  }while( 조건식 );
 * @author user
 */
public class TestDoWhile {

	public static void main(String[] args) {

		int i=100; //초기값
		do {
			System.out.println("안녕하세요?");//반복수행 문장.
			i++; //증.감소식
		}while( i < 10 );//조건식.
		
		////// 메뉴를 제공.
//		boolean exitFlag=false;
//		do {
//			String menu=JOptionPane.showInputDialog("메뉴선택\n1.입력  2.출력  3. 저장  4.종료");
//			
//			if(menu.equals("4")) {
//				exitFlag=true;
//			}//end if
//			
//		}while( !exitFlag );
		
		// 무한 loop
		do {
			System.out.println("무한루프");
			break;// do~while 탈출.
		}while( true );
		
		System.out.println("----------------");
		
	}//main

}//class
