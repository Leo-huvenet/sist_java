package day0222;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Work0222 {
	
	Map<String,String> bloodMap;
	
	public String bloodType(String blood) {
		String result = "입력 : 사람의 것이 아닙니다.";
		//Map 생성 : 
		bloodMap = new HashMap<String, String>();//16개의 행 생성
		//값할당
		bloodMap.put("A", "내향적입니다. 그들이 비록 외향적으로 보일지라도 실제 내면의 모습은 조심스럽고 세심한 면이 있습니다. 대체로 생각은 비관적입니다.");
		bloodMap.put("AB", "합리적입니다. 그래서 사회의 의리나 인정 그리고 기타 제도 등에 대해 관심이 적고 합리적인 반듯함을 선호하게 됩니다.");
		bloodMap.put("O", "따스한 인간성 자신이 목표로 하고있는 일에 대하여 한결같은 노력과 전문가적인 강점으로 목표를 달성하는 추진력이 있다.");
		bloodMap.put("B", "대체적으로 자기중심적입니다. 규율이나 규칙, 속박을 극히 싫어함. 생각이 유연하고 기발한 발상에 뛰어납니다.");
		
		//값얻기
		blood = blood.toUpperCase(); // 소문자 -> 대문자, 대문자 -> 대문자
		//키가 존재한다면 값을 얻기
		if(bloodMap.containsKey(blood)) {//키가 존재한다면
			result = bloodMap.get(blood);//키에대한 값을 얻는다.
		}
		
		return result;
	}//bloodType
	
	public void searchBlood() {
		String inputBlood = "a";
		System.out.println(inputBlood+"형의 특징은"+bloodType(inputBlood));
		
	}//searchBlood
	
	public void validationMap() {
		//Map 의 모든키를 set으로 받기
		if(bloodMap != null) { //객체가 생성되었는지?(heap의 주소를 할당 받았는가?)
			Set<String> set = bloodMap.keySet();
			//Set을 사용 검색(Iterator 사용)	
			Iterator<String> ita = set.iterator(); //set의 제어권을 iterator로 할당.
			
			String key = "";
			while(ita.hasNext()) { //값이 존재하는 지?
				key = ita.next(); //값을 얻고 포인터를 다음으로 이동
				System.out.println(key+"/" +bloodMap.get(key));
			}
		}else {
			System.out.println("Map을 검증하려면 Map의 객체가 생성되어있어야합니다.");
			System.out.println("searchBlood()를 호출 후 사용가능합니다.");
		}
	}
	
	public char changeChar(char ch) {
		char temp =ch;
		if(ch > 64 && ch < 91) {
			temp+=32;
		}else if(ch > 96 && ch < 123) {
			temp-=32;
		}
		return temp;
		
	}

	public static void main(String[] args) {
		Work0222 work = new Work0222();
		work.searchBlood();
		work.validationMap();
		System.out.println(work.changeChar('a'));
	}

}
