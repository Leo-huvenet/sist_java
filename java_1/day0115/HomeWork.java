package day0115;
/**
01/15 유경우 숙제
*/
class HomeWork{
	public static void main(String[] args) 	{
	int years = 2021;
	int month = 1;
	int date = 15;

	char initials1 = 'A';
	char initials2 = 'B';
	char initials3 = 'C';

	float left_sight =12.1f;
	float right_sight =13.1f; 

	boolean basic = false; 

	System.out.println("오늘은"+years+"년"+month+"월"+date+"일 입니다.");
	System.out.println("내이름의 이니셜은"+initials1+initials2+initials3+"입니다.");
	System.out.println("왼눈시력"+left_sight+" 오른눈 시력"+right_sight+"양안시력 "+(left_sight+right_sight)+"입니다.");
	System.out.println("기본형 데이터형인 boolean형은 기본 값이"+basic+"로 설정됩니다.");
	}
}
