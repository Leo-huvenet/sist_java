package day0201;

/**
 *	�ֹι�ȣ�� �Է¹޾Ƽ� ����üũ, -�� ��ġ üũ, �������, ����, ����, �츦 ���ϴ� �ϵ���
 *	������ Ŭ����<br>
 *	�Ű����� �ִ� �����ڸ� ����Ͽ� ��üȭ�� �� ���<br>
 *	��� ��)<br>
 *	HomeWork ��ü�� = new HomeWork("�ֹε�Ϲ�ȣ");<br>
 *	��ü��.method��(); ���� ������ ���� ���
 * @author SIST
 */
public class HomeWork {

	private String rrn;
	
	//1
	/**	�Է¹��� �ֹι�ȣ�� instance variable�� �����ϴ� ������
	 * @param rrn ������ �ֹι�ȣ
	 */
	public HomeWork(String rrn) {
		this.rrn=rrn;
	}//������
	
	/**
	 * ��ü(instance)�� ������ �ִ� ��(instance variable)�� ��ȯ�ϴ� ��
	 * @return �Էµ� �ֹι�ȣ
	 */
	public String getRrn() {
		return rrn;
	}//getter
	
	//2
	public boolean len() {
		boolean lenFlag = false;
		if(rrn.length() == 14) {
			lenFlag = true;
		}else {
			lenFlag = false;
		}
		return lenFlag;
	}
	
	//3
	/**
	 * instance variable�� �����Ǿ��ִ� �ֹι�ȣ�� -�� ��Ȯ�� ��ġ�� �����ϴ��� Ȯ�� �ϴ� ��
	 * @return -��ġ ����
	 */
	public boolean position() {
		boolean poflag = false;
		if(rrn.indexOf("-") == 6) {
			poflag =  true;
		}else {
			poflag = false;
		}
		return poflag;
	}
	
	/**
	 * �ֹι�ȣ���� �¾ �ظ� �����Ͽ� ��ȯ�ϴ� ��
	 * @return �������
	 */
	private int getYear() {
		int birth = 0;
		int tempYear = 1800;
		int ch = rrn.charAt(7)-48; //981103-1
		int yy = Integer.parseInt(rrn.substring(0,2));
		
		
		if(ch == 1 || ch == 2 || ch ==5 || ch == 6 ){
			tempYear = 1900;
		}else if(ch ==3 || ch == 4 || ch ==7 || ch == 8 ){
			tempYear = 2000;
		}
		
		birth=tempYear+yy;
		
		return birth;
	}
	
	//4 
	/**
	 * �ֹι�ȣ���� ��������� ���Ͽ� ��ȯ�ϴ� ��
	 * @return �¾��
	 */
	public String birthday() {
		int year=getYear();
		String mm = rrn.substring(2,4);
		String dd = rrn.substring(4,6);
		
		return year+"��"+ mm +"��"+dd+"��";
	}
	
	//5
	/**
	 * �ֹι�ȣ���� ���̸� ���Ͽ� ��ȯ�ϴ� ��
	 * @return ����
	 */
	public int age() {
		
		return 2021 - getYear() + 1;
	}
	
	//6
	public String gender() {
		char ch = rrn.charAt(7);
		String gender = null;
		if(ch == '1' || ch == '5' || ch =='3' || ch == '7' ){
			gender="����";
		}else if(ch =='2' || ch == '6' || ch =='4' || ch == '8' ){
			gender="����";
		}
		return gender;
	}
	
	//7
	/**
	 * �ֹι�ȣ���� �츦 ���Ͽ� ��ȯ�ϴ� ��
	 * @return ��
	 */
	public String zodiac() {
		String[] zodiac = {"������","��","��","����","��","��","ȣ����","�䳢","��","��","��","��"};
		return zodiac[getYear()%12];
	}
	
}
