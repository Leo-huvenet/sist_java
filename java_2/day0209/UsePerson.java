package day0209;

/**
 *	Person Ŭ������ ��ӹ޾� ����ϴ� �ڽ�Ŭ����
 * @author SIST
 */
public class UsePerson {

	public static void main(String[] args) {
		//�ڽ�Ŭ������ �����Ǹ�, �θ�Ŭ�������� �����ȴ�.
		System.out.println("--------------------------HongGilDong-------------------------------");
		HongGilDong hgd = new HongGilDong();
		//�ڽ�Ŭ������ �������� �ʴ� �ڿ��� �ڽ�Ŭ������ ��ü������ ����� �� �ִ� - �ڵ��� ���� 
		System.out.println(hgd.getEye()+"/"+hgd.getMouth()+"/"+hgd.getNose()+"/"+hgd.getName());
		hgd.setName("ȫ�浿");
		System.out.println(hgd.getEye()+"/"+hgd.getMouth()+"/"+hgd.getNose()+"/"+hgd.getName());
		
		System.out.println(hgd.eat()); //�ڵ��� ����
		System.out.println(hgd.eat("�߲��� ����",3)); //Override
		// �ڽ��� ���� �ڽŸ��� Ư¡ ( Ŭ������ ���� ȫ�浿���� ���� Ư¡)
		System.out.println(hgd.fight(5));//�̱�� ��� // 6->7
		System.out.println(hgd.fight(6));//�̱�� ��� // 7->8
		System.out.println(hgd.fight(9));//���� ��� // 8 -> 7
		System.out.println(hgd.fight(7));//���� ��� // 7�� ���� 
		
		//ȫ�浿�� ���� ������ ���(getter �޼ҵ带 ���)
		System.out.println(hgd.getName()+"�� ���� ���� "+ hgd.getLevel());
		
		System.out.println("---------------------------Clark------------------------------------");
		Clark superman = new Clark();
		System.out.println(superman.getEye()+"/"+superman.getMouth()+"/"+superman.getNose()+"/"+superman.getName()); //�ڵ��� ����
		superman.setName("Ŭ�� ��Ʈ"); //�ڵ��� ����
		System.out.println(superman.getEye()+"/"+superman.getMouth()+"/"+superman.getNose()+"/"+superman.getName()); //�ڵ��� ����
		System.out.println(superman.eat()); //Override
		System.out.println(superman.eat("������ũ", 20));//Override
		
		System.out.println(superman.power("¯��")); //������
		System.out.println(superman.power("���̾Ƹ��")); //��
		System.out.println(superman.power("ũ���䳪��Ʈ")); //������
		
		//instance variable�� ���� �����ڰ� public �̱⶧���� getter method�� ������� �ʰ� 
		//���� ������ �� �ִ�.
		System.out.println(superman.getName()+"�� ���� ���� "+ superman.power);
		
		System.out.println("---------------------------My------------------------------------");
		HomeWork my = new HomeWork();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("---------------------------���------------------------------------");
		String[] hongLang=hgd.language();
		String[] clarkLang=superman.language();
		String[] myLang=my.language();		
		
		System.out.println(hgd.getName()+"�� ������ �� �ִ� ����");
		for(int i=0; i <hongLang.length; i++) {
			System.out.println(hongLang[i]);
		}
		
		System.out.println(superman.getName()+"�� ������ �� �ִ� ����");
		for(String lang : clarkLang) {
			System.out.println(lang);
		}
		
		System.out.println(superman.getName()+"�� ������ �� �ִ� ����");
		for(String lang : myLang) {
			System.out.println(lang);
		}	
		
		
		
		
		
		
		
		
		
		
	}//main

}//class
