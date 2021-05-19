package day0201;

/**
 *	주민번호를 입력받아서 길이체크, -의 위치 체크, 생년월일, 성별, 나이, 띠를 구하는 일들을
 *	구한한 클래스<br>
 *	매개변수 있는 생성자를 사용하여 객체화한 후 사용<br>
 *	사용 예)<br>
 *	HomeWork 객체명 = new HomeWork("주민등록번호");<br>
 *	객체명.method명(); 으로 구현된 일을 사용
 * @author SIST
 */
public class HomeWork {

	private String rrn;
	
	//1
	/**	입력받은 주민번호를 instance variable에 설정하는 생성자
	 * @param rrn 설정할 주민번호
	 */
	public HomeWork(String rrn) {
		this.rrn=rrn;
	}//생성자
	
	/**
	 * 객체(instance)가 가지고 있는 값(instance variable)을 반환하는 일
	 * @return 입력된 주민번호
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
	 * instance variable에 설정되어있는 주민번호에 -이 정확한 위치에 존재하는지 확인 하는 일
	 * @return -위치 가부
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
	 * 주민번호에서 태어난 해를 연산하여 반환하는 일
	 * @return 생년월일
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
	 * 주민번호에서 생년월일을 구하여 반환하는 일
	 * @return 태어난해
	 */
	public String birthday() {
		int year=getYear();
		String mm = rrn.substring(2,4);
		String dd = rrn.substring(4,6);
		
		return year+"년"+ mm +"월"+dd+"일";
	}
	
	//5
	/**
	 * 주민번호에서 나이를 구하여 반환하는 일
	 * @return 나이
	 */
	public int age() {
		
		return 2021 - getYear() + 1;
	}
	
	//6
	public String gender() {
		char ch = rrn.charAt(7);
		String gender = null;
		if(ch == '1' || ch == '5' || ch =='3' || ch == '7' ){
			gender="남성";
		}else if(ch =='2' || ch == '6' || ch =='4' || ch == '8' ){
			gender="여성";
		}
		return gender;
	}
	
	//7
	/**
	 * 주민번호에서 띠를 구하여 반환하는 일
	 * @return 띠
	 */
	public String zodiac() {
		String[] zodiac = {"원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양"};
		return zodiac[getYear()%12];
	}
	
}
