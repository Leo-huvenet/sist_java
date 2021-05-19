package day0201;

/**
 *	java.lang.String class 사용
 * @author SIST
 */
public class UseString {

	public static void main(String[] args) {
		//기본형 형식의 사용. new를 사용하지 않고 문자열 저장소(String literal)의 주소를 담는 방식
		String str = "AbcdEf";
		//참조형 형식의 사용. new를 사용하여 문자열 저장소(String literal)의 주소를 담는 방식
		String str1 = new String("dtg9811@naver.com");
		
		System.out.println(str+"의 길이"+ str.length());
		System.out.println(str1+"의 길이"+ str1.length());
		
		System.out.println(str+"을 모두 대문자로 : "+ str.toUpperCase());
		System.out.println(str+"을 모두 소문자로 : "+ str.toLowerCase());
		
		System.out.println(str+"에서 'c'의 인덱스 : "+ str.indexOf("c"));
		System.out.println(str+"에서 \"dEc\"의 인덱스 : "+ str.indexOf("dEf"));
		System.out.println(str+"에서 \"z\"의 인덱스 : "+ str.indexOf("z"));
		System.out.println(str+"에서 \"def\"의 인덱스 : "+ str.indexOf("def"));
		//인덱스가 없으면 -1출력
		
		str = "AbcdAbcdAbcd";
		System.out.println("indexOf -> 'c' : "+str.indexOf("c"));
		System.out.println("lastIndexOf -> 'c' : "+str.lastIndexOf("c"));
		
		str="test@tset.com"; //testtest.com, test@testcom
		//str에 들어있는 email 주소가 유효하다면 "유효" 그렇지 않다면 "무효"를 출력하는 코드 작성
		//indexOf를 사용해보세요
		//System.out.println(str.indexOf("@")+" "+str.indexOf("."));
		if(str.indexOf("@")!= -1 && str.indexOf(".")!= -1) {
			System.out.println("유효");
		}else {
			System.out.println("무효");
		}
	
		System.out.println(str.charAt(4)); //@
		System.out.println(str.charAt(9)); //.
		
		str="AbcdefG";
		System.out.println(str.substring(1,4));//bcd
		System.out.println(str.substring(5,7));//fG
		
		System.out.println(str.substring(1));//bcdefG
		//문자열 1번부터 출력
		
//		String str1 = new String("dtg9811@naver.com");
		
		
		//str1에서 이메일주소만 출력
		//System.out.println(str1.substring(0,7));
		System.out.println(str1.substring(0,str1.indexOf("@")));
		//str1에서 도메인주소만 출력
		//System.out.println(str1.substring(8));
		System.out.println(str1.substring(str1.indexOf("@")+1));

		str="ABC";
		str1 = "DEF";
		System.out.println(str.concat(str1)); //방법1
		System.out.println(str+"DEF"); // 방법2
		
		str=" A BC   ";
		System.out.println("["+str+"]["+str.trim()+"]");
		//앞뒤공백제거(중간은 제거되지 않는다)
		
		str = "Abcdef";
		String key="A";
		System.out.println(str+"은"+key+"로 시작되었는가?"+str.startsWith(key));
		
		key="ef";
		System.out.println(str+"은"+key+"로 끝났는가?"+str.endsWith(key));
		
		key="Abc";
		System.out.println(str+"은"+key+"를 포함하고 있는가?"+str.contains(key));
		
		System.out.println(str+"에서 cd를 KKK로 치환 "+str.replaceAll("cd","KKK"));
		
		int i =2021;
		str =String.valueOf(i);
		System.out.println(str);
		
		//initCap method를 완성하고, 아래 name 변수를 initCap method의 매개변수에 할당한 후 
		//대문자로 변경된 문자열을 얻어 출력
		
		String name="sissssTt";
		
		UseString us = new UseString(); 
		System.out.println(us.initCap(name));
		
	}

	/**
	 * 매개변수로 입력되는 문자열의 첫글자만 대문자로 변경하여 반환하는 일
	 * @param str 첫글자를 대문자로 변경해야하는 일
	 * @return 첫글자만 대문자로 변경된 문자열
	 */
	public String initCap(String str) {
		if(!str.isEmpty()) {
			int startIdx=1;

			//method chain
			//method가 반환형 있다면 .을 사용하여 method를 계속 연결하여 호출 할 수 있다.
			//가장 마지막에 쓴 method가 반환 값이된다.
			String firstChar = str.substring(0,startIdx).toUpperCase();
			String seconStr="";
			if(str.length() > 1) {
			seconStr=str.substring(startIdx).toLowerCase();
		}
		str=firstChar.concat(seconStr);
		}
	return str;
	}
	 
}
