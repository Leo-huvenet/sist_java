package day0222;

import java.util.Hashtable;
import java.util.Map;



/**
 * map을 이용 (Work0222가 강사님이 풀어주신 숙제)
 * @author user
 *
 */
public class HomeWork {
	
	//문제1
	public String useMap(String bloodType) {
		
		Map<String, String> map = new Hashtable<String, String>();
		map.put("A형", "내향적입니다. 그들이 비록 외향적으로 보일지라도 실제 내면의 모습은 조심스럽고 세심한 면이 있습니다. 대체로 생각은 비관적입니다.");
		map.put("AB형", "합리적입니다. 그래서 사회의 의리나 인정 그리고 기타 제도 등에 대해 관심이 적고 합리적인 반듯함을 선호하게 됩니다.");
		map.put("O형", "따스한 인간성 자신이 목표로 하고있는 일에 대하여 한결같은 노력과 전문가적인 강점으로 목표를 달성하는 추진력이 있다.");
		map.put("B형", "대체적으로 자기중심적입니다. 규율이나 규칙, 속박을 극히 싫어함. 생각이 유연하고 기발한 발상에 뛰어납니다.");
		
		if(bloodType == "a" || bloodType == "A") {
			System.out.println(bloodType = map.get("A형"));
		}else if(bloodType == "ab" || bloodType == "AB") {
			System.out.println(bloodType = map.get("AB형"));
		}else if(bloodType == "o" || bloodType == "O") {
			System.out.println(bloodType = map.get("O형"));
		}else if(bloodType == "b" || bloodType == "B") {
			System.out.println(bloodType = map.get("B형"));
		}else {
			System.out.println("잘못된 입력입니다 혈액형을 다시 입력해주세요.");
		}
		return bloodType;
	}
	
	//문제2
	public void re(char text) {
		
		
		int output =0;
		
		if(((int)text >= 65) && ((int)text <= 90)) {
			output += (int)(text+32);
		}else if(((int)text >= 97) && ((int)text <= 122)) {
			output += (int)(text-32);
		}else {
			output = (int)text;
		}
		
		System.out.println("변환 : "+(char)output);
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	 HomeWork hw = new HomeWork();
	 hw.useMap("a");
	 System.out.println("");
	 hw.re('a');
	}

}
