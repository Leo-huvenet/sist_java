package day0118;
/**
강제 형변환<br>
값을 해당 행에서만 일시적으로 다른 값으로 변경해야할 때 사용<br>
(변환할데이터형)값
*/
class Casting {
	public static void main(String[] args) {

		char c='A';
		int unicode=(int)c;
		System.out.println(c+"의 Unicode값 "+unicode);

		float f = (float)2021.01;//실수 literal을 그대로 두고 할당할 때 값을 float으로 변경
		System.out.println(f);

		int i = (int)f;//실수변수가 정수변수로 할당될 수 없다. (int)를 넣어줘야함
		System.out.println("강제형변환 된 값 : "+i+", 원본 값 : "+f);

		double d =1.11111111111111;
		f=(float)d; //값손실
		System.out.println(f);

		///casting error 예시///

		/*
		String s = "2021" ;
		int temp=(int)s; //주소를 값으로 변경할 수 없다(참조형에서 기본형으로 변경 못 한다)
		System.out.println(s);
		*/
		 
		/*
		boolean b=false;
		int tenp =b; //boolean은 다른 형으로 변경할 수 없다.
		System.out.println(b);
		*/

		byte num1=10;
		byte num2=20;
		byte result=(byte) (num1+num2);

		System.out.println(num1+"+"+num2+"="+result);

	}//main
}//class
