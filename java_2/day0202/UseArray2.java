package day0202;

/**
 *	행과 열로 구성되는 이차원 배열의 사용
 * @author SIST
 */
public class UseArray2 {
	
	public UseArray2() {
		//1.선언 : 데이터형[][] 배열명 = null;
		int[][] arr = null;
		//2.생성 : 배열명 = new 데이터형[행의수][열의수];
		// 모든행의 열의 개수는 같다. 모든방의 값은 초기화된다.
		arr = new int[3][4];
		
		System.out.println(arr[0]); //이차원 배열에서 행의 번호는 주소를 가지고 있다.
		
		System.out.println("행의 수 : "+ arr.length+", 열의 수 : "+ arr[0].length);
		
		//3.값 할당 : 배열명[행번호][열번호] = 값;
		//행의 번호는 주소를 가지고 있기 때문에 값은 넣을 수 없다.
		//arr[1]=10;
		arr[0][0] = 10;
		arr[1][1] = 20;
		arr[2][2] = 30;
		arr[1][3] = 40;
		
		//4. 값 사용 : 배열명[행의 번호][열의 번호]
		System.out.println(arr[0][0]+" / " +arr[0][1]);
		
		//일괄처리
		for(int i=0; i < arr.length; i++) { //행의 수
			System.out.println(i+"행 시작");
			for(int j =0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d]=%-5d",i,j,arr[i][j]);
			}
			System.out.println("\n"+i+"행 끝");
		}
		
		//String형으로 이차원 배열을 만들고, 구구단 전단(2~9)을 입력한 후 출력
		String[][] gugudan = new String[10][10];
		int row = 0;
		int col = 0;
		for(int i=2; i <10 ; i++) { //행의 수
			System.out.println(i+"단 시작");
			for(int j =1; j < 10; j++) {
				gugudan[row][col]=i+"x"+j+"="+(i*j);
				System.out.println(gugudan[row][col]+" ");
				col++;
			}
			row++;
			col=0;
			System.out.println("\n"+i+"단 끝");
		}
		
		int[][] temp = new int[10][10];//생성된 모든 방의 값은 0으로 초기화
		
		for(int i =0; i< temp.length; i++) { //행
			for(int j =0; j< temp[i].length; j++) { //열
				if(i == 0 || i == temp.length-1 || j == 0 || j == temp[i].length-1) {//처음 행, 마지막 행,
					temp[i][j] = 1;
				}
				System.out.printf("%-3d",temp[i][j]);
			}
			System.out.println();
		}
			
	
		
		
		
		
		
	}//UseArray2
	
	public static void main(String[] args) {
		new UseArray2();
	}

}
