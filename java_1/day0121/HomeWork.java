package day0121;

public class HomeWork {
	public static final int BUS = 1200;
	public static final int SUBWAY = 1300;
	public static final int TAXI = 3800;
	
	public static void main(String[] args) {
		
		//문제1
		int year = Integer.parseInt(args[0]);
		
		if(year%12==0) {
			System.out.println(year+"년생 원숭이 띠");
		}else if(year%12==1) {
			System.out.println(year+"년생 닭 띠");
		}else if(year%12==2) {
			System.out.println(year+"년생 개 띠");
		}else if(year%12==3) {
			System.out.println(year+"년생 돼지 띠");
		}else if(year%12==4) {
			System.out.println(year+"년생 쥐 띠");
		}else if(year%12==5) {
			System.out.println(year+"년생 소 띠");
		}else if(year%12==6) {
			System.out.println(year+"년생 호랑이 띠");
		}else if(year%12==7) {
			System.out.println(year+"년생 토끼 띠");
		}else if(year%12==8) {
			System.out.println(year+"년생 용 띠");
		}else if(year%12==9) {
			System.out.println(year+"년생 뱀 띠");
		}else if(year%12==10) {
			System.out.println(year+"년생 말 띠");
		}else if(year%12==11) {
			System.out.println(year+"년생 양 띠");
		}
		
		//문제2
		if(args[1].equals("버스") ) {
			System.out.println("입력교통수단"+args[1]+"이고, 편도요금"+BUS+"원입니다.\n 왕복요금"+(BUS*2)+"원이고, 한달 20일 출퇴근을 하면"+(BUS*2*20)+"원 입니다.");
		}else if(args[1].equals("지하철")) {
			System.out.println("입력교통수단"+args[1]+"이고, 편도요금"+SUBWAY+"원입니다.\n 왕복요금"+(SUBWAY*2)+"원이고, 한달 20일 출퇴근을 하면"+(SUBWAY*2*20)+"원 입니다.");
		}else if(args[1].equals("택시")) {
			System.out.println("입력교통수단"+args[1]+"이고, 편도요금"+TAXI+"원입니다.\n 왕복요금"+(TAXI*2)+"원이고, 한달 20일 출퇴근을 하면"+(TAXI*2*20)+"원 입니다.");
		}else {
			System.out.println("입력하신 교통수단은 대중교통이 아닙니다.");
		}//end if	

	}

}
