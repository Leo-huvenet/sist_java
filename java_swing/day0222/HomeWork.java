package day0222;

import java.util.Hashtable;
import java.util.Map;



/**
 * map�� �̿� (Work0222�� ������� Ǯ���ֽ� ����)
 * @author user
 *
 */
public class HomeWork {
	
	//����1
	public String useMap(String bloodType) {
		
		Map<String, String> map = new Hashtable<String, String>();
		map.put("A��", "�������Դϴ�. �׵��� ��� ���������� �������� ���� ������ ����� ���ɽ����� ������ ���� �ֽ��ϴ�. ��ü�� ������ ������Դϴ�.");
		map.put("AB��", "�ո����Դϴ�. �׷��� ��ȸ�� �Ǹ��� ���� �׸��� ��Ÿ ���� � ���� ������ ���� �ո����� �ݵ����� ��ȣ�ϰ� �˴ϴ�.");
		map.put("O��", "������ �ΰ��� �ڽ��� ��ǥ�� �ϰ��ִ� �Ͽ� ���Ͽ� �Ѱᰰ�� ��°� ���������� �������� ��ǥ�� �޼��ϴ� �������� �ִ�.");
		map.put("B��", "��ü������ �ڱ��߽����Դϴ�. �����̳� ��Ģ, �ӹ��� ���� �Ⱦ���. ������ �����ϰ� ����� �߻� �پ�ϴ�.");
		
		if(bloodType == "a" || bloodType == "A") {
			System.out.println(bloodType = map.get("A��"));
		}else if(bloodType == "ab" || bloodType == "AB") {
			System.out.println(bloodType = map.get("AB��"));
		}else if(bloodType == "o" || bloodType == "O") {
			System.out.println(bloodType = map.get("O��"));
		}else if(bloodType == "b" || bloodType == "B") {
			System.out.println(bloodType = map.get("B��"));
		}else {
			System.out.println("�߸��� �Է��Դϴ� �������� �ٽ� �Է����ּ���.");
		}
		return bloodType;
	}
	
	//����2
	public void re(char text) {
		
		
		int output =0;
		
		if(((int)text >= 65) && ((int)text <= 90)) {
			output += (int)(text+32);
		}else if(((int)text >= 97) && ((int)text <= 122)) {
			output += (int)(text-32);
		}else {
			output = (int)text;
		}
		
		System.out.println("��ȯ : "+(char)output);
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	 HomeWork hw = new HomeWork();
	 hw.useMap("a");
	 System.out.println("");
	 hw.re('a');
	}

}
