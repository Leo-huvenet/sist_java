package day0118;
/**
2. class를 별도로 생성
  API에서 기본형 데이터형에 대응되는 클래스(Wrapper class)를 찾고 
  최고 값과 최소 값을 저장하는 상수를 확인한 후 상수가 존재한다면 
  아래와 같이 출력.

  데이터형명 최소값 xx 최대값 xx 

  ex) byte 형의 최소값 -128 최대 값 127
*/
class HomeWork2{
	
	public static void main(String[] args) {
	
	System.out.println("Byte 형의 최소값 "+Byte.MIN_VALUE+" 최대값 "+Byte.MAX_VALUE);
	System.out.println("Short 형의 최소값 "+Short.MIN_VALUE+" 최대값 "+Short.MAX_VALUE);
	System.out.println("Int 형의 최소값 "+Integer.MIN_VALUE+" 최대값 "+Integer.MAX_VALUE);
	System.out.println("Long 형의 최소값 "+Long.MIN_VALUE+" 최대값 "+Long.MAX_VALUE);
	System.out.println("Float 형의 최소값 "+Float.MIN_VALUE+" 최대값 "+Float.MAX_VALUE);
	System.out.println("Double 형의 최소값 "+Double.MIN_VALUE+" 최대값 "+Double.MAX_VALUE);
	System.out.println("Char 형의 최소값 "+(int)Character.MIN_VALUE+" 최대값 "+(int)Character.MAX_VALUE);
	//문자형 : char 최소값 \u0000 - 0 최대값 : \uFFFF - 65535
	//int로 캐스팅하여 최소값 최대값을 나타냄


	

	}
}
