package day0218;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * java.util.List의 사용<br>
 * 일차원 배열처럼 생성. 가변길이형(데이터를 추가하면 길이가 늘어나고, 데이터를 삭제하면 길이가 줄어든다)
 * 모든 데이터형이 저장할 수 있으나, Generic을 사용하면 입력데이터형의 제한을 설정할 수 있다.
 * 검색의 기능이 있으며, 중복데이터를 저장할 수 있다(중요!!!!!!!!!!!!!!!!)
 * 추가된 데이터는 가장 뒤에 붙는다.
 * 	기존의 데이터사이에 데이터를 추가할 때에는 LinkedList를 사용하는 것이 좋다.
 * @author SIST
 */
public class UseList {
	
	/**
	 * MultiThread에서 동시접근 가능
	 */
	public void useArrayList() {
		//1.생성
		List<String> list = new ArrayList<String>();
		//2.크기 : size(); 방에 값이 있는 것만 갯수에 포함시킨다.
		System.out.println("방의 갯수 : "+list.size());
		//3.값할당 : 값은 뒤로 추가된다. 중복값을 저장할 수 있다.
		list.add("자바");
		list.add("오라클");
		list.add("JDBC");
		list.add("HTML");
		list.add("오라클"); //중복값 저장가능.
		list.add("CSS");
		list.add("JavaScript");
		System.out.println(list+" / "+list.size());// 객체를 출력하면 주소가 나와야 하는데 값이 나온 이유는
		// 자식클래스에서 Object 클래스의 toString()를 주소가아닌 값을 출력할 수 있도록 Override 했기 때문에.
		
		//3.배열로 복사
		//Generic과 동일한 데이터형, 리스트의 크기대로 배열을 생성한다.
		String[] subjectArr = new String [ list.size() ];
		//리스트의 값을 배열로 보낸다.
		list.toArray(subjectArr);
		
		//4. 값 삭제 : 방의 크기가 줄어든다(2가지)
		// 인덱스로 삭제
		list.remove(3);
		//방의 값과 같은 객체를 넣어 삭제 : 가장 먼저 일치하는 방의 값 하나만 삭제한다.
		list.remove("오라클");
		System.out.println(list+" / "+list.size()); 
		
		//5.일괄처리 : list는 인덱스를 사용할 수 있고, 검색의 기능이 있으므로 일괄처리를 할 수 있다.
//		String temp = "";
//		for(int i=0; i<list.size(); i++) {
//			temp = list.get(i); //리스트 i번째 방의 값을 가져와서 temp할당
//			System.out.println(temp);
//		}
		
		//개선된 for
		for(String temp : list) {
			System.out.println(temp);
		}
		System.out.println("-------------복사된 값 출력---------------");
		for(String temp : subjectArr) {
			System.out.printf("%s\t", temp);
		}
		System.out.println("\n");
	}//useArrayList
	
	/**
	 * MultiThread에서 동시접근 불가능
	 */
	public void useVector() {
		//1.생성
				List<String> list = new Vector<String>();
				//2.크기 : size(); 방에 값이 있는 것만 갯수에 포함시킨다.
				System.out.println("방의 갯수 : "+list.size());
				//3.값할당 : 값은 뒤로 추가된다. 중복값을 저장할 수 있다.
				list.add("자바");
				list.add("오라클");
				list.add("JDBC");
				list.add("HTML");
				list.add("오라클"); //중복값 저장가능.
				list.add("CSS");
				list.add("JavaScript");
				System.out.println(list+" / "+list.size());// 객체를 출력하면 주소가 나와야 하는데 값이 나온 이유는
				// 자식클래스에서 Object 클래스의 toString()를 주소가아닌 값을 출력할 수 있도록 Override 했기 때문에.
				
				//3.배열로 복사
				//Generic과 동일한 데이터형, 리스트의 크기대로 배열을 생성한다.
				String[] subjectArr = new String [ list.size() ];
				//리스트의 값을 배열로 보낸다.
				list.toArray(subjectArr);
				
				//4. 값 삭제 : 방의 크기가 줄어든다(2가지)
				// 인덱스로 삭제
				list.remove(3);
				//방의 값과 같은 객체를 넣어 삭제 : 가장 먼저 일치하는 방의 값 하나만 삭제한다.
				list.remove("오라클");
				System.out.println(list+" / "+list.size()); 
				
				//5.일괄처리 : list는 인덱스를 사용할 수 있고, 검색의 기능이 있으므로 일괄처리를 할 수 있다.
//				String temp = "";
//				for(int i=0; i<list.size(); i++) {
//					temp = list.get(i); //리스트 i번째 방의 값을 가져와서 temp할당
//					System.out.println(temp);
//				}
				
				//개선된 for
				for(String temp : list) {
					System.out.println(temp);
				}
				System.out.println("-------------복사된 값 출력---------------");
				for(String temp : subjectArr) {
					System.out.printf("%s\t", temp);
				}
				System.out.println("\n");
	}//useVector
	
	/**
	 * 값이 추가될 때 기존의 데이터 사이에 값이 추가되는 일이 많을 때.
	 */
	public void useLinkedList() {//기존의 데이터사이에 데이터를 추가할 때에는 LinkedList를 사용하는 것이 좋다.
		//1.생성
		List<String> list = new LinkedList<String>();
		//2.크기 : size(); 방에 값이 있는 것만 갯수에 포함시킨다.
		System.out.println("방의 갯수 : "+list.size());
		//3.값할당 : 값은 뒤로 추가된다. 중복값을 저장할 수 있다.
		list.add("자바"); //0
		list.add("오라클"); //1
		list.add("JDBC"); //2
		list.add(0,"HTML"); //3 //0번째 인덱스에 HTML 을 넣겠어
		list.add("오라클"); //4 중복값 저장가능.
		list.add("CSS"); //5 
		list.add("JavaScript"); //6
		System.out.println(list+" / "+list.size());// 객체를 출력하면 주소가 나와야 하는데 값이 나온 이유는
		// 자식클래스에서 Object 클래스의 toString()를 주소가아닌 값을 출력할 수 있도록 Override 했기 때문에.
		
		//3.배열로 복사
		//Generic과 동일한 데이터형, 리스트의 크기대로 배열을 생성한다.
		String[] subjectArr = new String [ list.size() ];
		//리스트의 값을 배열로 보낸다.
		list.toArray(subjectArr);
		
		//4. 값 삭제 : 방의 크기가 줄어든다(2가지)
		// 인덱스로 삭제
		list.remove(3);
		//방의 값과 같은 객체를 넣어 삭제 : 가장 먼저 일치하는 방의 값 하나만 삭제한다.
		list.remove("오라클");
		System.out.println(list+" / "+list.size()); 
		
		//5.일괄처리 : list는 인덱스를 사용할 수 있고, 검색의 기능이 있으므로 일괄처리를 할 수 있다.
//		String temp = "";
//		for(int i=0; i<list.size(); i++) {
//			temp = list.get(i); //리스트 i번째 방의 값을 가져와서 temp할당
//			System.out.println(temp);
//		}
		
		//개선된 for
		for(String temp : list) {
			System.out.println(temp);
		}
		System.out.println("-------------복사된 값 출력---------------");
		for(String temp : subjectArr) {
			System.out.printf("%s\t", temp);
		}
		System.out.println("\n");
		
	}//useLinkedList

	
	public static void main(String[] args) {
		UseList ul = new UseList();
		System.out.println("---------------ArrayList-----------------");
		ul.useArrayList();
		System.out.println("------------------Vector-----------------");
		ul.useVector();
		System.out.println("--------------LinkedList-----------------");
		ul.useLinkedList();
	}

}
