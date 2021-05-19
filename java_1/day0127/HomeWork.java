package day0127;

public class HomeWork {

	//1 가변 값
	
	//2
	public int number1(int i){
		int temp = 0;
		if(i>10) {
			for(int j = 1; j == i ; j++){
				if(j%3==0){
					temp += j;
				}
			}
		}else {
			System.out.println("10보다 큰 값을 입력해주세요.");
		}
		return temp;
	}
	
	//3
	public int age(int i) {
		int a = 2021-i+1;
		System.out.println(a+"년");
		return a;
	}
	
	//4
	public void gugudan() {
		System.out.println();
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.printf("%d X %d = %d\t",i,j,i*j);
			}
			System.out.println();
		}
	}
	
	//5
	public void gugudan(int num) {
		System.out.println(num+"단");
		for(int j=1; j<10; j++) {
			
			System.out.printf("%d X %d = %d\n",num,j,num*j);
		}
	}
	
	public static void main(String[] args) {
		HomeWork hw = new HomeWork();
		
		int temp1 = hw.number1(12);
		System.out.println(temp1);
		
		hw.age(24);
		
		hw.gugudan();
		hw.gugudan(3);
		
		
	}

}
