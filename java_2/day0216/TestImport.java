package day0216;

//import java.sql.Date; // 패키지가 다르고 클래스명이 같다면 둘 중 하나만 import 받을 수 있다.
import java.util.Calendar;
//import java.util.*; //java.util 패키지의 존재하는 모든 클래스를 사용. : 속도가 느려 권장하지 않음
import java.util.Date; // 특정 클래스 하나만 사용하는 import
/**
 *	외부패키지(현재클래스가 존재하는 패키지가 아닌 패키지)에 존재하는 클래스의 사용
 * @author SIST
 */
public class TestImport {

	public static void main(String[] args) {
		//같은 이름의 클래스를 사용할 때에는 둘 중하나는 import로 사용하고
		Date d = null;//java.util.Date로 사용하고 싶고
		
		//나머지는 full path를 사용한다.
		java.sql.Date d2 = null;//java.sql.Date로 사용하고 싶다.
		
		
		Calendar c = null;
		
		
		
	}

}
