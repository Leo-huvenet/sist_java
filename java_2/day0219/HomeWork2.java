package day0219;

import java.util.ArrayList;
import java.util.List;

/**
 *	day0222 ProcessStudent
 * @author user
 */
public class HomeWork2  {
	
	HomeWork is = new HomeWork("���μ�",25,"����� ������ ���ﵿ",'��',97);	
	HomeWork bs = new HomeWork("������",27,"����� ������ ������",'��',81);	
	HomeWork yw = new HomeWork("�ǿ���",26,"����� ���۱� �󵵵�",'��',90);	
	HomeWork dy = new HomeWork("�����",30,"��⵵ ������ ���뱸",'��',82);	
	HomeWork jw = new HomeWork("������",25,"��õ������ ���� ����",'��',88);	
	
	List<HomeWork> list = new ArrayList<HomeWork>();
	
	
		
		public List<HomeWork> getList(){
			
			list.add(is);
			list.add(bs);
			list.add(yw);
			list.add(dy);
			list.add(jw);
			
			System.out.println(list+" / "+list.size());
			
			String[] subjectArr = new String [ list.size() ];
			list.toArray(subjectArr);
			
			
			
			
		return list;
	}
		
		
	
	
//	public void printList(List<HomeWork> list) {
//		System.out.println("��ȣ\t�̸�\t����\t�¾ ��\t�ּ�\t�ڹ�����");
//		System.out.println("------------------------------------------------------");
		
//		for(int i =0; i<subjectArr.length; i++) {
//			System.out.println(subjectArr[i]);
//		}
			
	
	
	
	
	
	public static void main(String[] args) {
		
		HomeWork2 hw2 = new HomeWork2();
		
		hw2.getList();
//		hw2.printList(hw2.getList());
		
		
		
		
		
	}

}
