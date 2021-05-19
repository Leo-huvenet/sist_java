package day0209;

/**
 * Remote을 사용하는 클래스
 * @author SIST
 */
public class UseRemote {

	public static void main(String[] args) {
		System.out.println("--------------------------TvRemote-------------------------------");	
		TvRemote tr = new TvRemote();
		tr.setRemoteName("TV리모컨");
		System.out.println("리모컨이름 : "+tr.getRemoteName());
		System.out.println();
		
		//숫자버튼
		System.out.println(tr.butten(2));
		System.out.println();
		
		//채널위아래변경버튼
		System.out.println("기본채널 : "+tr.getChannelBt()+"번");
		System.out.println(tr.channel("UP"));
		System.out.println(tr.channel("DOWN"));
		System.out.println(tr.channel("DOWN"));
		System.out.println(tr.channel("DOWN"));
		System.out.println();
		
		//전원버튼
		System.out.println(tr.getRemoteName()+"의 전원상태 : "+tr.getPowerBt());
		System.out.println(tr.powerBt("ON"));
		System.out.println(tr.getRemoteName()+"의 전원상태 : "+tr.getPowerBt());
		System.out.println(tr.powerBt("OFF"));
		System.out.println(tr.getRemoteName()+"의 전원상태 : "+tr.getPowerBt());
		System.out.println(tr.powerBt("ON"));
		System.out.println();
		
		//취침버튼
		System.out.println(tr.sleepBt("ON"));
		System.out.println(tr.sleepBt("OFF"));
		
		System.out.println("-----------------------AirconRemote-----------------------------");
		AirconRemote ar = new AirconRemote();
		ar.setRemoteName("에어컨리모컨");
		System.out.println("리모컨이름 : "+ar.getRemoteName());
		System.out.println();
		
		//전원버튼
		System.out.println(ar.getRemoteName()+"의 전원상태 : "+ar.getPowerBt());
		System.out.println(ar.powerBt("ON"));
		System.out.println(ar.getRemoteName()+"의 전원상태 : "+ar.getPowerBt());
		System.out.println(ar.powerBt("OFF"));
		System.out.println(ar.getRemoteName()+"의 전원상태 : "+ar.getPowerBt());
		System.out.println();
		
		//취침버튼
		System.out.println(ar.sleepBt("ON"));
		System.out.println("현재 에어컨온도 : "+ar.getTemperatureBt());
		System.out.println(ar.sleepBt("OFF"));
		System.out.println();
		
		//온도조절버튼
		System.out.println(ar.temp(20));
		System.out.println("현재 에어컨온도 : "+ar.getTemperatureBt());
		System.out.println(ar.temp(17));
		
		
		
		
		
		
	}

}
