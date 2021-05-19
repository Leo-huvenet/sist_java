package day0118;
class HomeWork{
//1번문제	
	public static final int YONGDON = 10000;

	public static void main(String[] args) {

		int traffic = 3000;
		int lunch = 4000;

		System.out.println("하루 용돈"+YONGDON+"원 교통비"+traffic+"원 왕복차비"+(traffic/2)+"원 점심값"+lunch+"원 남은용돈"+(YONGDON-(traffic+lunch))+"원 입니다.");
		
	}
}
