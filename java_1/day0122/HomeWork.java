package day0122;

public class HomeWork {
	public static final int BUS = 1200;
	public static final int SUBWAY = 1300;
	public static final int TAXI = 3800;
	
	public static void main(String[] args) {
//숙제1
		int distance = Integer.parseInt(args[1]);
	//	int Fee = 0;
	//	int OverFee = 0;
		
		if(0<=distance && 10>=distance) 
		{
			
		}else if(10<distance) {
			
		}
		
		
		if(args[0].equals("버스") ) {
	//		System.out.println("입력교통수단"+args[0]+"이고, 기본요금"++"원입니다.\n 이동거리"++"원이고,총 요금은 "++"원 입니다.");
		}else if(args[0].equals("지하철")) {
			System.out.println("입력교통수단"+args[0]+"이고, 편도요금"+SUBWAY+"원입니다.\n 왕복요금"+(SUBWAY*2)+"원이고, 한달 20일 출퇴근을 하면"+(SUBWAY*2*20)+"원 입니다.");
		}else if(args[0].equals("택시")) {
			System.out.println("입력교통수단"+args[0]+"이고, 편도요금"+TAXI+"원입니다.\n 왕복요금"+(TAXI*2)+"원이고, 한달 20일 출퇴근을 하면"+(TAXI*2*20)+"원 입니다.");
		}else {
			System.out.println("입력하신 교통수단은 대중교통이 아닙니다.");
		}//end if	

//숙제2
		for(int i = 1; i<=100; i++) {
			if(i%3==0) {
				System.out.print("짝");
			}else {
				System.out.print(i);
			}
		}
		
	}//main

}//class
