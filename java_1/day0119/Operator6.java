package day0119;
/**
3항(조건)연산자
조건?식1:식2
*/

class Operator6{

	public static void main(String[] args) {
		int num = 1;
		//num 변수에 할당된 정수값이 양수인지 음수인지 판단하기
		System.out.println(num + "은(는)"+ (num>-1?"양수":"음수"));

		int num2=2021;
		//num2변수에 할당된 정수값이 홀수인지 짝수인지 판단하여 출력하는 코드
		System.out.println(num2 + "은(는)"+ ((num2%2==0)?"짝수":"홀수"));
	}
}
