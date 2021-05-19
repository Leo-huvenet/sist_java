package day0119;


class HomeWork{

	public static void main(String[] args) {
		// 1번문제
		int variable = 20;
		System.out.println("~"+variable+"값은 : "+(~variable+1));

		/* 2번문제

		결과 
		31
		temp1 = 11 / temp2 = 19

		temp2는 후위연산으로 값을 먼저 출력하고 감소연산을 진행하기 때문에 첫번째 메소드에서는 20 그대로 출력되어 temp1과 더해진다*/

		//3번문제 
		int temp3 = 0;
		temp3 = Integer.MAX_VALUE<<4;
		System.out.println("temp3 값 : "+temp3);
		//2147483647  

		//4번문제
		System.out.println("Integer의 하위 2Byte 값 : "+(Integer.MAX_VALUE & 65535));

		
	}
}
