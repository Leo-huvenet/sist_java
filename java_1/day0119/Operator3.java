package day0119;
/**
쉬프트연산자
<<,>>,>>>
*/
class Operator3{
	public static void main(String[] args) {
		int i = 6;
		System.out.println(i+ " << 3 = "+(i << 3)); //48
		i = 39;
		System.out.println(i+ " >> 2 = "+(i >> 2)); //9
		i = 45;
		System.out.println(i+ " >>> 3 = "+(i >>> 3)); //5
		i = 1;
		System.out.println(i+ " 를 << 31 = "+(i << 31));

		i = -1; //다시 -1로 되돌아온다
		System.out.println(i+ " 를 >> 100 = "+(i >> 100));
		System.out.println(i+ " 를 >>> 1 = "+(i >>> 1)); //양수의 최고값이 나온다


	}
}
