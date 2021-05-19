package day0219;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 검색의 기능이 없으며, 중복데이터를 저장하지 않는 Set의 사용<br>
 * 순서가 없으며 유일한 값을 저장하고 사용해야할 때 사용.
 * @param args
 */
public class UseSet {
	
	public UseSet() {
		//1. 생성
		Set<String> set = new HashSet<String>();
		//2. 값할당 : 값은 순서대로 입력되지 않는다(순서가 없다)
		set.add("1.Java");
		set.add("2.Oracle");
		set.add("3.JDBC");
		set.add("4.HTML");
		set.add("5.CSS");
		set.add("6.JavaScript");
		set.add("7.Servlet");
		set.add("2.Oracle"); //중복값은 입력되지 않는다.
		
		//배열로 복사
		//set의 크기로 배열을 생성.
		String[] copyArr = new String [ set.size() ];
		//set의 내용을 배열로 복사.
		set.toArray(copyArr);
		
		//3. 값 삭제
		set.remove("6.JavaScript");
		//모든방 값 삭제
//		set.clear();
		System.out.println(set+"/"+set.size());
		//4. 검색 => 검색의 기능이 없다. 그러므로 Iterator를 사용.
		Iterator<String> ita = set.iterator(); //set을 검색할 수 있게 set의 제어권을 받는다.
		
		while(ita.hasNext()) {//제어권을 받은 set객체의 Element 가 존재하는지? true | false
			System.out.println(ita.next());//값을 얻고 포인터를 다음으로 이동
		}
	
		System.out.println("----------------------------------");
		//set은 검색의 기능이 없어 기존의 for문으로는 출력이 불가능
		//개선된 for문으로 출력이 가능
		for(String value : set) {
			System.out.println(value);
		}
		System.out.println("----------------------------------");
		for(String value : copyArr) {//set을 복사한 배열을 출력하기
			System.out.println(value);//set.remove("6.JavaScript"); 를 하였지만 복사한 배열은 지워지지않는다.
		}
		
		
	}//UseSet


	public static void main(String[] args) {
		new UseSet();
	}//main
}
