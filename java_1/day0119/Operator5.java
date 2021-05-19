package day0119;
/**
논리 연산자 <br>
- 일반 논리<br>
	&&(AND), ||(OR)<br>
- 비트논리
*/

class  Operator5{
	public static void main(String[] args) {
	boolean flag1 = true, flag2 = false, flag3 = true, flag4 = false;

	System.out.println("---&&---");
	System.out.println(flag1+" && "+ flag3 +" = "+ (flag1 && flag3));
	System.out.println(flag1+" && "+ flag2 +" = "+ (flag1 && flag2));
	System.out.println(flag2+" && "+ flag1 +" = "+ (flag2 && flag1));
	System.out.println(flag2+" && "+ flag4 +" = "+ (flag2 && flag4));
	
	System.out.println("---||---");
	System.out.println(flag1+" || "+ flag3 +" = "+ (flag1 || flag3));
	System.out.println(flag1+" || "+ flag2 +" = "+ (flag1 || flag2));
	System.out.println(flag2+" || "+ flag1 +" = "+ (flag2 || flag1));
	System.out.println(flag2+" || "+ flag4 +" = "+ (flag2 || flag4));

	//&&는 전항이 거짓이면 후항을 계산하지 않는다.
	flag1=false; //false로 초기화
	flag2=false;
	flag3=false;

		flag3 = (flag1=3<2) && (flag2=5<6);
		//결과를보면 flag2의 값이 true임에도 전항이 false이기 때문에 후항도 false나옴을 알 수 있다.
		System.out.println("flag1 : " + flag1 + ", flag2 : "+flag2 +", flag3 : " +flag3);

		int score = 99;
		//위의 score변수 할당된 값이 0~100 사이라면 true를 그렇지 않다면 false 출력

		System.out.println(0<= score && score <= 100);
		
		System.out.println("--------------비트논리연산--------------");

		int i = 25;// 0001 1001
		int j = 13;// 0000 1101
		System.out.println(i+ " & " +j+" = "+(i&j));//0000 1001 = 9

		i = 37;// 0010 0101
		j = 7;//   0000 0111
		System.out.println(i+ " | " +j+" = "+(i|j));//0010 0111 = 39

		i = 17;// 0001 0001
		j = 12;// 0000 1100
		System.out.println(i+ " ^ " +j+" = "+(i^j));//0001 1101 = 29


	}
}
