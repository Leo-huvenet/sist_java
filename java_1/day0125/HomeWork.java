package day0125;

public class HomeWork {

	public static void main(String[] args) {
		
		// 1번
		int i = 2;
		int j = 1;
		
		while(i>1 && i<10) {
			while(j>0 && j<10) {
				
				System.out.println(i+"x"+j+"="+i*j);
				j++;
			}
			j = 1;
			i++;
		}
	
		// 2번
		int sum = 1;
		int temp = 0;
		while(sum>0 && sum <101) {
				temp += sum;	
				sum++;		 
		}
		System.out.println("1부터 100까지의 합 : "+temp);
		
		// 3번
		sum=0;
		temp=0;
		do{
			if(sum%2 == 0) temp += sum;
			sum++;
			if(sum == 50) break;
		}while(sum>0 && sum <101);
		System.out.println("1부터 49까지의 짝수의 합 : "+temp);
		
		// 4번
		for(int a=0; a<5; a++) {
			for(int b=0; b<5; b++) {
				if((a==1 || a==2 || a==3)  && (b ==1 || b==2 || b==3)) {
				System.out.print(0+" ");
				}else {
				System.out.print(1+" ");
				}
			}
			System.out.println();
		}
		
	}

}
