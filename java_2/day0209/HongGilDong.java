package day0209;

/**
 *	����� ����Ư¡�� ����ϴ� Ŭ���� (Person�� ��ӹ޴� �ڽ�Ŭ����)<br>
 *	��, ��, ��, �̸�, �Դ� ���� �θ�Ŭ�������� �����ϴ� ���� ����ϰ�(�ڵ��� �� ��뼺),
 *	�ڽŸ��� Ư¡�� �����ϴ� Ŭ����
 * @author SIST
 */

public class HongGilDong extends Person {
	
	private int level;

	/**
	 * ȫ�浿 Ŭ������ �⺻������<br>
	 * ��ü�� ������ �� �⺻������ �������־���� �� ����
	 * �ο򷹺��� 1~10���� �����ϰ�, ȫ�浿�� �ο� ������ ���� ������ 6�� ������ �¾��.
	 */
	public HongGilDong() {
		level = 6;
	}//HongGilDong
	@Override
	public String eat() {
		return getName()+"���� ������ ���� �ӳɳ� �Դ´�. ";
	}

	/**
	 *	�θ�Ŭ������ �����ϴ� ����� �ڽ�Ŭ�������� ���� ���� ��, �ڽ�Ŭ������ ��Ȳ�� �µ��� 
	 *	method�� �������Ѵ�.
	 */
	@Override
	public String eat(String menu, int price) {
		//�ڽ� Ŭ������ name������ private ���������ڸ� ������ �־, �ڽ�Ŭ���������� ���� ����� �� ����.
		//���� �ڽ� Ŭ������ �θ�Ŭ������ private �ڿ��� ����ϱ� ���� getter method�� ����Ѵ�.
		return getName()+"�� �ָ����� "+menu+"�� ������ "+price+"�� ���� ��Դ´�.";
	}
	

	
	/**
	 * �ڽ�Ŭ������ �ڽŸ��� Ư¡. �ο�� ��
	 * @param yourLevel ������ ����
	 * @return �ڽ��� ����
	 */
	public String fight(int yourLevel) {
		String result = "";//empty 
		
		if(level < yourLevel) { //������ ������ ���� ��� : ����
			result =yourLevel+"���� ����. Orz";
			level--; //��������
			if(level < 1) {
				level=1;
			}//end if
			
		}else if(level > yourLevel) { //������ ������ ���� ��� : �̱��
			result =yourLevel+"���� �̰��. s('.^)V";		
			level++;//��������
			if(level > 10) {
				level=10;
			}//end if
		}else {//���� ���
			result =yourLevel+"���� ����. (�Ѥ�+)";	
			//������ ��ȭ�� ����.
			
	    
		}//end else
		
		return result;
	}
	
	public int getLevel() {
//		System.out.println("method�� ȣ���ϴ� ��ü�� heap �ּ� : " +this);
//		super : �θ�Ŭ������ �ν��Ͻ��ּҸ� ����� �� �ִ� Ű����.
//		����)
//		�θ�Ŭ������ �⺻ ������ ȣ�� : super();
//		�θ�Ŭ������ �Ű����� �ִ� ������ ȣ�� : super(��,,,);
//		System.out.println("method�� ȣ���ϴ� ��ü�� �θ� heap �ּ� : " +super); //super�� ����� �� ����.
		return level;
	}
	
	/**
	 * ȫ�浿�� �ѱ���� ���־ ������ �� �ִ�.
	 */
	@Override
	public String[] language() {
		//������ �迭�� ������ �������� �����Ͽ� ��ȯ.
		String[] useLanguage = new String[2];
		useLanguage[0] ="�ѱ���";
		useLanguage[1] ="���־�";
		return useLanguage;
	}
	
}
