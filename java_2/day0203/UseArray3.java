package day0203;

/**
 *	삼차원 배열의 사용(면,행,열)
 * @author SIST
 */
public class UseArray3 {
	public UseArray3() {
		//1.선언 : 데이터명[][][] 배열명 = null;
		int[][][] arr = null;
		
		//2.생성 : 배열명 = new 데이터형[면][행][열];
		arr = new int[3][2][4];
		
		System.out.println("면의 수 : "+ arr.length);
		System.out.println("행의 수 : "+ arr[0].length);
		System.out.println("열의 수 : "+ arr[0][0].length);
		
		//3.값할당 : 배열명[면][행][열] = 값;
		arr[0][0][0] = 100;
		arr[2][1][3] = 100;
		//4.값사용 : 배열명[면][행][열]
		System.out.println(arr[0][0][0]+" / "+arr[0][0][1]);
		
		//모든 방의 값 출력
		for(int i = 0 ; i < arr.length; i++) {
			System.out.println(i+"면 시작");
			for(int j = 0 ; j < arr[i].length; j++) {
				System.out.println(j+"행 시작");
				for(int k = 0 ; k < arr[i][j].length; k++) {
					System.out.printf("arr[%d][%d][%d] = %d\t",i,j,k,arr[i][j][k]);
				}
				System.out.println("\n"+j+"행 시작");
			}
			System.out.println(i+"면 끝");
		}
	}
	public void useArray3() {
		//기본형 형식의 사용 
		int[][][] arr= {{{1,2},{3,4},{5,6}},{{7,8},{9,10},{11,12}}};
		System.out.println(arr.length+" / "+arr[0].length+" / "+ arr[0][0].length);
		
		System.out.println("--------------------------------");
		for(int i = 0 ; i < arr.length; i++) {
			System.out.println(i+"면 시작");
			for(int j = 0 ; j < arr[i].length; j++) {
				System.out.println(j+"행 시작");
				for(int k = 0 ; k < arr[i][j].length; k++) {
					System.out.printf("arr[%d][%d][%d] = %d\t",i,j,k,arr[i][j][k]);
				}
				System.out.println("\n"+j+"행 시작");
			}
			System.out.println(i+"면 끝");
		}
	}
	//모든 방의 값을 출력
	
	
	
	public static void main(String[] args) {
	new UseArray3().useArray3();
	}

}
