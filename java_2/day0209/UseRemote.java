package day0209;

/**
 * Remote�� ����ϴ� Ŭ����
 * @author SIST
 */
public class UseRemote {

	public static void main(String[] args) {
		System.out.println("--------------------------TvRemote-------------------------------");	
		TvRemote tr = new TvRemote();
		tr.setRemoteName("TV������");
		System.out.println("�������̸� : "+tr.getRemoteName());
		System.out.println();
		
		//���ڹ�ư
		System.out.println(tr.butten(2));
		System.out.println();
		
		//ä�����Ʒ������ư
		System.out.println("�⺻ä�� : "+tr.getChannelBt()+"��");
		System.out.println(tr.channel("UP"));
		System.out.println(tr.channel("DOWN"));
		System.out.println(tr.channel("DOWN"));
		System.out.println(tr.channel("DOWN"));
		System.out.println();
		
		//������ư
		System.out.println(tr.getRemoteName()+"�� �������� : "+tr.getPowerBt());
		System.out.println(tr.powerBt("ON"));
		System.out.println(tr.getRemoteName()+"�� �������� : "+tr.getPowerBt());
		System.out.println(tr.powerBt("OFF"));
		System.out.println(tr.getRemoteName()+"�� �������� : "+tr.getPowerBt());
		System.out.println(tr.powerBt("ON"));
		System.out.println();
		
		//��ħ��ư
		System.out.println(tr.sleepBt("ON"));
		System.out.println(tr.sleepBt("OFF"));
		
		System.out.println("-----------------------AirconRemote-----------------------------");
		AirconRemote ar = new AirconRemote();
		ar.setRemoteName("������������");
		System.out.println("�������̸� : "+ar.getRemoteName());
		System.out.println();
		
		//������ư
		System.out.println(ar.getRemoteName()+"�� �������� : "+ar.getPowerBt());
		System.out.println(ar.powerBt("ON"));
		System.out.println(ar.getRemoteName()+"�� �������� : "+ar.getPowerBt());
		System.out.println(ar.powerBt("OFF"));
		System.out.println(ar.getRemoteName()+"�� �������� : "+ar.getPowerBt());
		System.out.println();
		
		//��ħ��ư
		System.out.println(ar.sleepBt("ON"));
		System.out.println("���� �������µ� : "+ar.getTemperatureBt());
		System.out.println(ar.sleepBt("OFF"));
		System.out.println();
		
		//�µ�������ư
		System.out.println(ar.temp(20));
		System.out.println("���� �������µ� : "+ar.getTemperatureBt());
		System.out.println(ar.temp(17));
		
		
		
		
		
		
	}

}
