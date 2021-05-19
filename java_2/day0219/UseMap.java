package day0219;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map Ű�� ���� ������ �̷���� �����͸� ����� �� <br>
 * Hashtable, HashMap ���� Ŭ����<br>
 * @author SIST
 */
public class UseMap {

	public void useHashtable() {
		//1.����
		Map<String, String> map = new Hashtable<String, String>(); //11�� �� ����
		//2. ��  �Ҵ�) ���� ������� �Էµ��� �ʴ´�.
		//Ű�� �����ϸ� ���� �ߺ������ϴ�.
		//���� Ű�� �ԷµǸ�, ������ Ű�� ���� ���������.
		map.put("�ڹ�", "�Ϻ��� ��ü������");
		map.put("����Ŭ", "��뷮 ������ ���̽�");
		map.put("JDBC", "�ڹٿ��� DBMS�� �����ϱ� ���� ���");
		map.put("HTML", "������������ ������ ���");
		map.put("���̽�", "�Ϻ��� ��ü������"); //���� �ߺ� ����
		map.put("HTML", "Tim berners LEE�� ���� ���");//���� Ű�� �Է��Ǹ� ������ Ű�� ���� ����.
		
		System.out.println(map+"/"+map.size());
		
		//3. �� ��� : Ű�� ����Ͽ� Ű�� �ش��ϴ� ���� ��´�.
		String value = map.get("�ڹ�");
		System.out.println(value);
		
		//4. Ű�� �����ϴ� ��?
		boolean flag = map.containsKey("HTML");
		System.out.println(flag);
		
		//5. ������
		//Ű�� ����Ͽ� �� ����.
		map.remove("�ڹ�");
		//��� entry�� ����
//		map.clear();
		System.out.println(map+"/"+map.size());
		
		//6. ��� Ű �ޱ�
		Set<String> set = map.keySet();
		//lterator�� ����Ͽ� set�� ���.
		Iterator<String> ita = set.iterator(); 
		while(ita.hasNext()) {
//			System.out.println(ita.next()); 
			System.out.println(map.get(ita.next())); //��� entry�� ���� ���� �� �ִ�.
		}
		
		
		
	}//useHashtable
	
	public void useHashmap() {
		//1.����
				Map<String, String> map = new Hashtable<String, String>(); //16�� �� ����
				//2. ��  �Ҵ�) ���� ������� �Էµ��� �ʴ´�.
				//Ű�� �����ϸ� ���� �ߺ������ϴ�.
				//���� Ű�� �ԷµǸ�, ������ Ű�� ���� ���������.
				map.put("�ڹ�", "�Ϻ��� ��ü������");
				map.put("����Ŭ", "��뷮 ������ ���̽�");
				map.put("JDBC", "�ڹٿ��� DBMS�� �����ϱ� ���� ���");
				map.put("HTML", "������������ ������ ���");
				map.put("���̽�", "�Ϻ��� ��ü������"); //���� �ߺ� ����
				map.put("HTML", "Tim berners LEE�� ���� ���");//���� Ű�� �Է��Ǹ� ������ Ű�� ���� ����.
				
				System.out.println(map+"/"+map.size());
				
				//3. �� ��� : Ű�� ����Ͽ� Ű�� �ش��ϴ� ���� ��´�.
				String value = map.get("�ڹ�");
				System.out.println(value);
				
				//4. Ű�� �����ϴ� ��?
				boolean flag = map.containsKey("HTML");
				System.out.println(flag);
				
				//5. ������
				//Ű�� ����Ͽ� �� ����.
				map.remove("�ڹ�");
				//��� entry�� ����
//				map.clear();
				System.out.println(map+"/"+map.size());
				
				//6. ��� Ű �ޱ�
				Set<String> set = map.keySet();
				//lterator�� ����Ͽ� set�� ���.
				Iterator<String> ita = set.iterator(); 
				while(ita.hasNext()) {
//					System.out.println(ita.next()); 
					System.out.println(map.get(ita.next())); //��� entry�� ���� ���� �� �ִ�.
				}
		
		
	}//useHashmap
	
	
	
	
	public static void main(String[] args) {
		UseMap um = new UseMap();
		um.useHashtable();
		System.out.println("--------------------");
		um.useHashmap();
	}

}
