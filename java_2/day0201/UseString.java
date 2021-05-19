package day0201;

/**
 *	java.lang.String class ���
 * @author SIST
 */
public class UseString {

	public static void main(String[] args) {
		//�⺻�� ������ ���. new�� ������� �ʰ� ���ڿ� �����(String literal)�� �ּҸ� ��� ���
		String str = "AbcdEf";
		//������ ������ ���. new�� ����Ͽ� ���ڿ� �����(String literal)�� �ּҸ� ��� ���
		String str1 = new String("dtg9811@naver.com");
		
		System.out.println(str+"�� ����"+ str.length());
		System.out.println(str1+"�� ����"+ str1.length());
		
		System.out.println(str+"�� ��� �빮�ڷ� : "+ str.toUpperCase());
		System.out.println(str+"�� ��� �ҹ��ڷ� : "+ str.toLowerCase());
		
		System.out.println(str+"���� 'c'�� �ε��� : "+ str.indexOf("c"));
		System.out.println(str+"���� \"dEc\"�� �ε��� : "+ str.indexOf("dEf"));
		System.out.println(str+"���� \"z\"�� �ε��� : "+ str.indexOf("z"));
		System.out.println(str+"���� \"def\"�� �ε��� : "+ str.indexOf("def"));
		//�ε����� ������ -1���
		
		str = "AbcdAbcdAbcd";
		System.out.println("indexOf -> 'c' : "+str.indexOf("c"));
		System.out.println("lastIndexOf -> 'c' : "+str.lastIndexOf("c"));
		
		str="test@tset.com"; //testtest.com, test@testcom
		//str�� ����ִ� email �ּҰ� ��ȿ�ϴٸ� "��ȿ" �׷��� �ʴٸ� "��ȿ"�� ����ϴ� �ڵ� �ۼ�
		//indexOf�� ����غ�����
		//System.out.println(str.indexOf("@")+" "+str.indexOf("."));
		if(str.indexOf("@")!= -1 && str.indexOf(".")!= -1) {
			System.out.println("��ȿ");
		}else {
			System.out.println("��ȿ");
		}
	
		System.out.println(str.charAt(4)); //@
		System.out.println(str.charAt(9)); //.
		
		str="AbcdefG";
		System.out.println(str.substring(1,4));//bcd
		System.out.println(str.substring(5,7));//fG
		
		System.out.println(str.substring(1));//bcdefG
		//���ڿ� 1������ ���
		
//		String str1 = new String("dtg9811@naver.com");
		
		
		//str1���� �̸����ּҸ� ���
		//System.out.println(str1.substring(0,7));
		System.out.println(str1.substring(0,str1.indexOf("@")));
		//str1���� �������ּҸ� ���
		//System.out.println(str1.substring(8));
		System.out.println(str1.substring(str1.indexOf("@")+1));

		str="ABC";
		str1 = "DEF";
		System.out.println(str.concat(str1)); //���1
		System.out.println(str+"DEF"); // ���2
		
		str=" A BC   ";
		System.out.println("["+str+"]["+str.trim()+"]");
		//�յڰ�������(�߰��� ���ŵ��� �ʴ´�)
		
		str = "Abcdef";
		String key="A";
		System.out.println(str+"��"+key+"�� ���۵Ǿ��°�?"+str.startsWith(key));
		
		key="ef";
		System.out.println(str+"��"+key+"�� �����°�?"+str.endsWith(key));
		
		key="Abc";
		System.out.println(str+"��"+key+"�� �����ϰ� �ִ°�?"+str.contains(key));
		
		System.out.println(str+"���� cd�� KKK�� ġȯ "+str.replaceAll("cd","KKK"));
		
		int i =2021;
		str =String.valueOf(i);
		System.out.println(str);
		
		//initCap method�� �ϼ��ϰ�, �Ʒ� name ������ initCap method�� �Ű������� �Ҵ��� �� 
		//�빮�ڷ� ����� ���ڿ��� ��� ���
		
		String name="sissssTt";
		
		UseString us = new UseString(); 
		System.out.println(us.initCap(name));
		
	}

	/**
	 * �Ű������� �ԷµǴ� ���ڿ��� ù���ڸ� �빮�ڷ� �����Ͽ� ��ȯ�ϴ� ��
	 * @param str ù���ڸ� �빮�ڷ� �����ؾ��ϴ� ��
	 * @return ù���ڸ� �빮�ڷ� ����� ���ڿ�
	 */
	public String initCap(String str) {
		if(!str.isEmpty()) {
			int startIdx=1;

			//method chain
			//method�� ��ȯ�� �ִٸ� .�� ����Ͽ� method�� ��� �����Ͽ� ȣ�� �� �� �ִ�.
			//���� �������� �� method�� ��ȯ ���̵ȴ�.
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
