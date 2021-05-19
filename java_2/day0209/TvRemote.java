package day0209;

/**
 *	Remote 자식클래스 TvRemote
 *	TvRemote의 개인특징 : 채널변경버튼(0~999 존재), 숫자버튼(0~9 입력가능)
 *	
 * @author SIST
 */
public class TvRemote extends Remote{
	
	private int channelBt;
	
	public TvRemote() {
		this.channelBt = 11;
	}
	
	//setter
		public void setChannelBt(int channelBt) {
			this.channelBt = channelBt;
		}
		
	//getter
		public int getChannelBt() {
			return channelBt;
		}
		
	
	public String butten(int numberBt) {
		String bt = "";
		if(numberBt>-1 && numberBt<11)
		 bt = numberBt+"번이 입력되었습니다.";
		
		return bt ;	
		}
		
	
	

	public String channel(String channelBt) {
		
		String change = null;
		

		if(channelBt.equals("UP")) {
			change = "채널을 올립니다.";
			++this.channelBt;
		}else if(channelBt.equals("DOWN")) {
			change = "채널을 내립니다.";
			--this.channelBt;
		}
		return change+"현재채널 : "+this.channelBt+"번";
	}

	
	@Override
	public String sleepBt(String onOff) {
			String change = null;
			
			if(onOff.equals("ON")) {
				super.powerBt("OFF");
				change = "취침모드가 작동됩니다.\n 1시간뒤에 자동종료";
				
			}else if(onOff.equals("OFF"))
				change = "취침모드가 종료됩니다.";
				
			return change;
	}
		
}//class
	

