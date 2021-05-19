package day0219;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map 키와 값의 쌍으로 이루어진 데이터를 사용할 때 <br>
 * Hashtable, HashMap 구현 클래스<br>
 * @author SIST
 */
public class UseMap {

	public void useHashtable() {
		//1.생성
		Map<String, String> map = new Hashtable<String, String>(); //11개 행 생성
		//2. 값  할당) 값은 순서대로 입력되지 않는다.
		//키는 유일하며 값은 중복가능하다.
		//같은 키가 입력되면, 기존의 키에 값이 덮어써진다.
		map.put("자바", "완벽한 객체지향언어");
		map.put("오라클", "대용량 데이터 베이스");
		map.put("JDBC", "자바에서 DBMS을 연동하기 위한 기술");
		map.put("HTML", "웹페이지에서 구조를 담당");
		map.put("파이썬", "완벽한 객체지향언어"); //값은 중복 가능
		map.put("HTML", "Tim berners LEE가 만든 언어");//같은 키가 입려되면 기존의 키에 덮어 쓴다.
		
		System.out.println(map+"/"+map.size());
		
		//3. 값 얻기 : 키를 사용하여 키에 해당하는 값을 얻는다.
		String value = map.get("자바");
		System.out.println(value);
		
		//4. 키가 존재하는 지?
		boolean flag = map.containsKey("HTML");
		System.out.println(flag);
		
		//5. 값삭제
		//키를 사용하여 값 삭제.
		map.remove("자바");
		//모든 entry를 삭제
//		map.clear();
		System.out.println(map+"/"+map.size());
		
		//6. 모든 키 받기
		Set<String> set = map.keySet();
		//lterator를 사용하여 set을 출력.
		Iterator<String> ita = set.iterator(); 
		while(ita.hasNext()) {
//			System.out.println(ita.next()); 
			System.out.println(map.get(ita.next())); //모든 entry의 값을 얻을 수 있다.
		}
		
		
		
	}//useHashtable
	
	public void useHashmap() {
		//1.생성
				Map<String, String> map = new Hashtable<String, String>(); //16개 행 생성
				//2. 값  할당) 값은 순서대로 입력되지 않는다.
				//키는 유일하며 값은 중복가능하다.
				//같은 키가 입력되면, 기존의 키에 값이 덮어써진다.
				map.put("자바", "완벽한 객체지향언어");
				map.put("오라클", "대용량 데이터 베이스");
				map.put("JDBC", "자바에서 DBMS을 연동하기 위한 기술");
				map.put("HTML", "웹페이지에서 구조를 담당");
				map.put("파이썬", "완벽한 객체지향언어"); //값은 중복 가능
				map.put("HTML", "Tim berners LEE가 만든 언어");//같은 키가 입려되면 기존의 키에 덮어 쓴다.
				
				System.out.println(map+"/"+map.size());
				
				//3. 값 얻기 : 키를 사용하여 키에 해당하는 값을 얻는다.
				String value = map.get("자바");
				System.out.println(value);
				
				//4. 키가 존재하는 지?
				boolean flag = map.containsKey("HTML");
				System.out.println(flag);
				
				//5. 값삭제
				//키를 사용하여 값 삭제.
				map.remove("자바");
				//모든 entry를 삭제
//				map.clear();
				System.out.println(map+"/"+map.size());
				
				//6. 모든 키 받기
				Set<String> set = map.keySet();
				//lterator를 사용하여 set을 출력.
				Iterator<String> ita = set.iterator(); 
				while(ita.hasNext()) {
//					System.out.println(ita.next()); 
					System.out.println(map.get(ita.next())); //모든 entry의 값을 얻을 수 있다.
				}
		
		
	}//useHashmap
	
	
	
	
	public static void main(String[] args) {
		UseMap um = new UseMap();
		um.useHashtable();
		System.out.println("--------------------");
		um.useHashmap();
	}

}
