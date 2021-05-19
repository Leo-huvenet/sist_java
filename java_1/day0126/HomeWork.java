package day0126;

public class HomeWork {

	//자신의 이름을 출력하는 일을 하는 method
	public void name() {
		System.out.println("유경우");
	}
	//자신의 이름 이니셜 첫 글자만 반환하는 method
	public void lastname(String i) {
		System.out.println(i.charAt(0));
	}

	//점수를 입력 받아 점수의 판정을 출력하는 method
		/*점수는 0~100점 사이라면 판정을 내린다
		그렇지 않으면 "잘못된 점수"를 출력한다
		판정 0~39 -과락, 40~59 -다른 과목 참조, 60~100 -합격 */
	public void jumsu(int i) {
		if(60<=i && 100>=i) {
			System.out.println("합격");
		}else if(40<=i) {
			System.out.println("다른 과목 참조");	
		}else if(0<=i) {
			System.out.println("과락");
		}else {
			System.out.println("잘못된 점수");
		}
	}
	
	//문자를 입력받아 해당 문자가 "대문자","소문자","숫자"인지를 판단하여 출력하는 method
	public void unicode(char i) {
		if(i>=48 && i<=57) {
			System.out.println("숫자");
		}else if(i>=65 && i<=90) {
			System.out.println("대문자");
		}else if(i>=97 && i<=122) {
			System.out.println("소문자");
		}
	}
	//태어난 해를 입력받아 나이를 반환하는 method
	//나이를 구하는 식 : 올해 - 태어난해 +1
	public int age(int i) {
		int a = 2021-i+1;
		return a;
	}
	
	//두 개의 수를 입력 받아 둘 중 큰 수를 반환하는 method
	public long max(long a, long b) {
		long max = 0;
		if(a<b) {
			max = b;
		}else if(a>b) {
			max = a;
		}
		return max;
	}
	
	public static void main(String[] args) {
	//객체생성
	HomeWork hw = new HomeWork();
	//메소드선언
	hw.name();
	hw.lastname("유경우");
	hw.jumsu(33);
	hw.unicode('c');
	
	long temp = hw.age(1998);
	System.out.println(temp);
	
	
	temp = hw.max(8l, 7l);
	System.out.println(temp);
	
	}//main

}//class
