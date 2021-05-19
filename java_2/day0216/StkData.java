package day0216;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StkData {
	private String name;
	private int age;
	
	public StkData() {
	}

	public StkData(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		new StkData();
//		new UseStringTokenizer();
		
		String names = "이학민 권예원 김다은 강인섭 송준희 김덕영 박기범";
		//STKData를 사용하여 배열로 만들고, names 문자열을 공백으로 구분하여 STKData 배열에 추가 
		StringTokenizer stk = new StringTokenizer(names);
		//1. stkData클래스를 사용하여 객체 배열을 생성 (방은 몇개? -> 토큰의 갯수 개)
		StkData[] stName = new StkData[stk.countTokens()];
		//2. 문자열 잘라서 배열에 넣는다.(토큰이 몇개나 나올지 모른다 -> while)
		int i = 0; //배열에 방에 값을 넣기 위한 인덱스 변수를 생성
		while(stk.hasMoreTokens()) { //토큰이 존재한다면
			//토큰을 얻어서 배열에 넣는다.(배열을 인덱스를 사용하여 추가한다. -> while은 index가 없다)
			
//			stName[i] = new StkData( stk.nextToken(),0); //매개변수 있는 생성자 사용
			
			stName[i] = new StkData(); //매개변수 있는 생성자 사용
			stName[i].setName(stk.nextToken());
			
				i++;
		}
		
		//3. 잘려진 문자열을 가진 배열을 출력한다.
		for(int j=0; j<stName.length; j++) {
			System.out.println(stName[j].getName());
		}
		
		
	}
	
}
