package day0118;
/**
기본형 데이터형의 사용.
기본형 데이터형을 사용하여 선언한 변수는 상수 값을 저장한다.
*/

class PrimitiveType 
{
	public static void main(String[] args) 
	{
	//정수형
	byte a =10;
	short b = 20;
	int c = 30;
	long d = 40;
	long e = 3000000000L;// 형명시 L 또는 l 을 붙여준다.
	// 정수 literal의 크기는 4byte이므로 int의 범위를 초과하는 상수 값을 기술할 수 없다.
	System.out.println("byte : " +a+", short : " +b+", int : " +c+", long : " +d+ "," + e);
	
	//문자형
	char f=65; // 코드값 입력
	char g='0';
	char h='가';
	//char를 출력하면 코드값에 대한 문자를 출력
	System.out.println("char : "+f+", "+g+", "+h);

	float i = 3.14f; //혁명시 필수 F,f
	double j = 3.14; //혁명시 생략가능
	double k = 3.14D;

	System.out.println("float : "+i+" , double : "+j+", "+k);

	//불린형(논리형)
	boolean l = true;
	boolean m = false;
	System.out.println("boolean : "+l+", "+m);

	

	}//main
}//class
