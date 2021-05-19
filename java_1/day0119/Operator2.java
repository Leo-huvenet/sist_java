package day0119;
/**
산술 연산자
+, -, *, /, %
*/
class Operator2{
	public static void main(String[] args){
		int i = 2021;
		System.out.println(i+"를(을) 2로 나눈 나머지 값 : "+i%2);

		int birth = 1998;
		System.out.println(birth+ "년생의 숫자"+birth%12);//0~11
	}
}
