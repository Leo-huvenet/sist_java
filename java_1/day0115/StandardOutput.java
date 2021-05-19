package day0115;
//1. 소스코드 작성.

class StandardOutput{
	//java application
	public static void main(String[] args){

	//print method는 출력 후 줄 변경을 하지 않는다.
	//System.out.print("안녕");
	//System.out.print("자바");

	//println method는 출력 후 줄 변경을 한다.
	//System.out.println("안녕");
	//System.out.println("자바");

	System.out.println(2021); //정수상수
	System.out.println(2021.0115); //실수상수
	System.out.println("A"); //문자상수
	System.out.println("안녕하세요?"); //문자열 상수

	System.out.println(1+15); //연산식 => 연산의 결과만 출력한다.

	System.out.print("1+15="+(1+15)); //문자열에 +기호를 사용하면 붙여라라는 의미.

	}//main

}//class

//2. 저장 : StandardOutput.java

//3. 컴파일. javac 옵션 소스파일.java ( 한글문제로 컴파일이 안되면 옵션에 -encoding UTF-8 입력)

//4. 실행. java 옵션 byyecode명