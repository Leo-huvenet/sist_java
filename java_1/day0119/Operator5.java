package day0119;
/**
�� ������ <br>
- �Ϲ� ��<br>
	&&(AND), ||(OR)<br>
- ��Ʈ��
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

	//&&�� ������ �����̸� ������ ������� �ʴ´�.
	flag1=false; //false�� �ʱ�ȭ
	flag2=false;
	flag3=false;

		flag3 = (flag1=3<2) && (flag2=5<6);
		//��������� flag2�� ���� true�ӿ��� ������ false�̱� ������ ���׵� false������ �� �� �ִ�.
		System.out.println("flag1 : " + flag1 + ", flag2 : "+flag2 +", flag3 : " +flag3);

		int score = 99;
		//���� score���� �Ҵ�� ���� 0~100 ���̶�� true�� �׷��� �ʴٸ� false ���

		System.out.println(0<= score && score <= 100);
		
		System.out.println("--------------��Ʈ������--------------");

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
