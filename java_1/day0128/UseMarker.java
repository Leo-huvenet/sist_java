package day0128;

/**
 * ��ī�� Ŭ������ ��ü�� �����Ͽ� ����ϴ� Ŭ����
 * @author SIST
 */
public class UseMarker {

	public static void main(String[] args) {
		//1. ��üȭ : Marker class�� �����Ͽ� black�̶�� ��ü�� �Ҵ�.
		Marker black = new Marker();
//		black.setBody(1);
//		black.setCap(1);
//		black.setColor("������");
		System.out.println(black);
		//������ ���������ڰ� public�϶����� Ŭ���� �ܺο��� �����Ӱ� ���� ������ �� �ִ�.
		//���� ���� �Է������� �����ϱ� ��ƴ� - public�� �������� �ʴ´�.
		//therefore...get,get method �̿�
		System.out.println("��ī�濡 ������ ��, �Ѳ� : "+black.getCap()+" , ��ü : "+
		black.getBody()+", �� : "+black.getColor());
		
		//2. ������ ��ü ���x
		black.setColor("�����"); //3�� �̿ܿ��� ���������� ������ ����
		
		System.out.println(black.write("�ȳ��ϼ���?"));//������ ��ī�� ���
		
		System.out.println("------------------------------------------------");
		//��������ī�����
		Marker red = new Marker("������",1,12); //������, �Ѳ�1, ��ü12 ��ī�� ����
		System.out.println(red.getCap()+" / "+red.getBody());
		System.out.println(red.write("Hello"));
		
		
		
	}//main

}
