package day0303;

import java.util.Random;

/**
 *	���� �����߻�
 * @author user
 */
public class Usethrow {
	
	/**
	 * �߻��� ���ܴ� ��κ��� ������ ó���Ѵ�.
	 * ������ ���ܴ� �߻��� ���ܸ� �״�� ������ �ǰ�, �θ𿹿�ó�� Ŭ������ ����Ͽ� ������ �ȴ�.
	 */
	public void useThrow() throws Exception {
		System.out.println("���ܹ߻� ��");
		if(new Random().nextBoolean()) {
			//���ܸ� ������ �߻���ų���� : throw new ����ó��Ŭ����();
//		try {
			throw new Exception("���ܸ� ����");
//		}catch(Exception e) {
//			//�߻��� ���ܸ� �ٷ� try~catch�� ó���� �� �ִ�.
//			e.printStackTrace();
//		}
	}
		System.out.println("���ܹ߻� ��");
	}

	//ȣ��޼ҵ带 ���� ����
	public void callUseThrow() {
		try {
			useThrow();	
		}catch(Exception e) {//throws�� ����ó��Ŭ������ �״�� �ᵵ�ǰ�, �θ𿹿�ó�� Ŭ������ �����ص��ȴ�.
			System.err.println("ȣ���� ������ ���� ó��"+e);
		}
	}

	public static void main(String[] args) {
		Usethrow ut = new Usethrow();
		ut.callUseThrow();
	}

}
