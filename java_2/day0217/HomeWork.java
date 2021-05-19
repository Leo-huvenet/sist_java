package day0217;



/**
 *	�ӽú�й�ȣ 8�ڸ��� �����Ͽ� ��ȯ<br>
 *	�ζǹ�ȣ 6�ڸ��� �����Ͽ� ��ȯ
 * @author SIST
 */
public class HomeWork {
	//����1	
	public static final int upperCase = 0;
	public static final int lowerCase = 1;
	public static final int decimal = 2;
	/**
	 * �ӽú�й�ȣ 8�ڸ��� �����Ͽ� ��ȯ�ϴ� ��<br>
	 * ��й�ȣ�� �ߺ����ڰ� ���� �� ������, ����, �빮��, �ҹ��ڷ� �����ȴ�.
	 * 
	 * @return ������ �ӽú��
	 */
	public char[] createPassword() {
		char[] tempPass = new char[8];
		int flag = 0; //� ���ڸ� ���� ������ ����
		
		for(int i=0; i < tempPass.length; i++) {
			flag=(int)(Math.random()*3);
			
			switch(flag) {
			case upperCase:
				tempPass[i]=(char)((Math.random()*26)+65);
				break;
			case lowerCase:
				tempPass[i]=(char)((Math.random()*26)+97);
				break;
			case decimal:
				tempPass[i]=(char)((Math.random()*26)+48);
				break;
			}
		}
		return tempPass;
	}//createPassword
	
	public char[] createPassword1() {
		char[] tempPass = new char[8];
		char[] password = {
				'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
				'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
				'0','1','2','3','4','5','6','7','8','9'
				};
		
		for(int i=0; i<tempPass.length; i++) {
			tempPass[i] = password[(int)(Math.random()*password.length)];
		}
		return tempPass;
	}//createPassword1
	
	public char[] createPassword2() {
		char[] tempPass = new char[8];
		String passwordSet = "21435768qweartyuijasdzxfgklm;'.45l;AHTTRQQEWDFGCBH";
		
		for(int i =0; i < tempPass.length; i++) {
			tempPass[i] = passwordSet.charAt((int)(Math.random()*passwordSet.length()));
		}
		return tempPass;
	}//createPassword2
	
	public void printPass(char[] tempPass) {
		System.out.println(tempPass); //char�迭�� ���ڿ��� ��޵Ǳ� ������ �׳� ���ȴ�.(for�� �ȵ�������)
	}


//����2
	//���� �Ѱ�
	public void lotto() 
	{
		int[] lottoArr = new int[6];
		
		for(int i = 0; i<lottoArr.length; i++)
		{
		lottoArr[i] = (int)(Math.random()*45)+1;
		}
		System.out.println("�ζ� ������ȣ 6�ڸ�");
		for(int i = 0; i<lottoArr.length; i++) 
		{
		System.out.println(lottoArr[i]);
		}
	}
	
	public void lottoPrint() 
	{ 
		this.lotto();
	}
	////////////////////////////////////////////////////////
	/**
	 * �ζǹ�ȣ �̱�.(�ߺ�����)
	 * 1~45���� �� �� �ϳ��� 6��Ʈ�� �̷� ��
	 * @return �ζ� 6�ڸ�
	 */
	public int[] createLotto() {
		int[] tempLotto = new int[6];
		
		for(int i =0; i<tempLotto.length; i++) {//1~45���� ������ ��ȣ�� �����ϱ� ���� for
			tempLotto[i] = (int)(Math.random()*45)+1;
			//�ߺ����� : ������ ���� �����濡 �����ϴ� ���� ������ ��. (������ ����� �ݺ�)
			for(int j = 0; j<i; j++) {//�������� ���� ���ϱ� ���� for
				if(tempLotto[i] == tempLotto[j]) { //�߻��� ���� ���� ���� �����濡 �����ϴ� ��?
					//������� ���� �ٽ� �����Ͽ� ��
					//�ε����� ������� �ε����� ����
					i--;
					break;// �ٽ� ���� �����ϵ��� ���� for(�񱳿� for)�� ����������.
				}
			}
		}
		
		return tempLotto;
	}//lotto1
	
	public void printLotto(int[] tempLotto) {
		int temp = 0;
		for(int i=0; i< tempLotto.length-1; i++) {
			for(int j=i+1; j< tempLotto.length-1; j++) {
				if(tempLotto[i] > tempLotto[j]) {//�������� ����
					temp = tempLotto[i];
					tempLotto[i] = tempLotto[j];
					tempLotto[j] = temp;
				}
			}
		}
		for(int value : tempLotto) {
			System.out.printf("%-3d",value);
		}
	}

	public static void main(String[] args) {
		HomeWork hw = new HomeWork();
		
		char[] temp = hw.createPassword2();
		hw.printPass(temp);
		
		System.out.println("------------------------------");
		hw.printLotto(hw.createLotto());
		//hw.lottoPrint();
		
		

		
	}

}