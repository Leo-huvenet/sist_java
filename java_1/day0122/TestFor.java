package day0122;
/**
 *	반복문 : 특정코드를 여러번 실행 시키는 문장<br>
 *	for : 시작과 끝을 알 때사용하는 반복문<br>
 *	문법)
 *		for(초기값; 조건식; 증.감소식) {<br>
 *			반복수행문장들<br>
 *			}
 * @author SIST
 */
public class TestFor {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println("안녕하세요?"+i);
		}//end for
		
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}//end for
		
		System.out.println();
		
		for(int i=100; i>0; i--) {
			System.out.print(i+" ");
		}//end for
		
		System.out.println();
		int count=0;
		for(int i=1; i<=100; i++) {
			if(i%2==1)
			System.out.print(i+" ");
		}//end for
		
		System.out.println();
		System.out.println("반복횟수 : "+ count);
		
		
		int j =2;
		for(int i=1; i<=9; i++) {
			System.out.println(j+" x "+i+" = " +j*i);
		}//end for
	
		System.out.println();
		
		//대문자 A~Z까지 출력
		for(char i='A'; i<='Z'; i++) {
			System.out.print(i);
		}//end for
		
		System.out.println();
		
		//'0'-48, 'A' -65, 'a'-97
		for(char i=1; i<65535; i++) {
			if((i>47 && i<58) || (i>64 && i<91) || (i>96&& i<123)){
				System.out.print(i+" ");
			}	
		}//end for
		
		System.out.println();
		
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum+=i;
		}//end for
		System.out.print("1부터 100까지의 합 : "+sum);
		
		
		
		
		
		
		
	}

}
