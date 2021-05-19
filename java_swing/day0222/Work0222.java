package day0222;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Work0222 {
	
	Map<String,String> bloodMap;
	
	public String bloodType(String blood) {
		String result = "�Է� : ����� ���� �ƴմϴ�.";
		//Map ���� : 
		bloodMap = new HashMap<String, String>();//16���� �� ����
		//���Ҵ�
		bloodMap.put("A", "�������Դϴ�. �׵��� ��� ���������� �������� ���� ������ ����� ���ɽ����� ������ ���� �ֽ��ϴ�. ��ü�� ������ ������Դϴ�.");
		bloodMap.put("AB", "�ո����Դϴ�. �׷��� ��ȸ�� �Ǹ��� ���� �׸��� ��Ÿ ���� � ���� ������ ���� �ո����� �ݵ����� ��ȣ�ϰ� �˴ϴ�.");
		bloodMap.put("O", "������ �ΰ��� �ڽ��� ��ǥ�� �ϰ��ִ� �Ͽ� ���Ͽ� �Ѱᰰ�� ��°� ���������� �������� ��ǥ�� �޼��ϴ� �������� �ִ�.");
		bloodMap.put("B", "��ü������ �ڱ��߽����Դϴ�. �����̳� ��Ģ, �ӹ��� ���� �Ⱦ���. ������ �����ϰ� ����� �߻� �پ�ϴ�.");
		
		//�����
		blood = blood.toUpperCase(); // �ҹ��� -> �빮��, �빮�� -> �빮��
		//Ű�� �����Ѵٸ� ���� ���
		if(bloodMap.containsKey(blood)) {//Ű�� �����Ѵٸ�
			result = bloodMap.get(blood);//Ű������ ���� ��´�.
		}
		
		return result;
	}//bloodType
	
	public void searchBlood() {
		String inputBlood = "a";
		System.out.println(inputBlood+"���� Ư¡��"+bloodType(inputBlood));
		
	}//searchBlood
	
	public void validationMap() {
		//Map �� ���Ű�� set���� �ޱ�
		if(bloodMap != null) { //��ü�� �����Ǿ�����?(heap�� �ּҸ� �Ҵ� �޾Ҵ°�?)
			Set<String> set = bloodMap.keySet();
			//Set�� ��� �˻�(Iterator ���)	
			Iterator<String> ita = set.iterator(); //set�� ������� iterator�� �Ҵ�.
			
			String key = "";
			while(ita.hasNext()) { //���� �����ϴ� ��?
				key = ita.next(); //���� ��� �����͸� �������� �̵�
				System.out.println(key+"/" +bloodMap.get(key));
			}
		}else {
			System.out.println("Map�� �����Ϸ��� Map�� ��ü�� �����Ǿ��־���մϴ�.");
			System.out.println("searchBlood()�� ȣ�� �� ��밡���մϴ�.");
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
