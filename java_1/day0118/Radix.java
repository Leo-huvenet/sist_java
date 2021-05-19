package day0118;
/** 
코딩창에서 다양한 진수의 사용<br>
8진수 : 0을 붙여 사용<br>
16진수 : 0x를 붙여 사용<br>

*/

class Radix {
	public static void main(String[] args) {
		//코딩창에서 어떤 진수를 사용하더라도 2진수로 저장하고 
		int i = 10; //10진수(Decimal)
		int j =012;//8진수(Octal)
		int k=0xA;//16진수(Hex)
		//저장된 2진수를 계산하여 10진수로 출력.
		System.out.println("10진수 : " +i+", 8진수 : "+j+", 16진수 : " +k+", 합 : "+ (i + j + k));
	}//main
}//class
