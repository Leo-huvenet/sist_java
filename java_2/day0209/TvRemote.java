package day0209;

/**
 *	Remote �ڽ�Ŭ���� TvRemote
 *	TvRemote�� ����Ư¡ : ä�κ����ư(0~999 ����), ���ڹ�ư(0~9 �Է°���)
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
		 bt = numberBt+"���� �ԷµǾ����ϴ�.";
		
		return bt ;	
		}
		
	
	

	public String channel(String channelBt) {
		
		String change = null;
		

		if(channelBt.equals("UP")) {
			change = "ä���� �ø��ϴ�.";
			++this.channelBt;
		}else if(channelBt.equals("DOWN")) {
			change = "ä���� �����ϴ�.";
			--this.channelBt;
		}
		return change+"����ä�� : "+this.channelBt+"��";
	}

	
	@Override
	public String sleepBt(String onOff) {
			String change = null;
			
			if(onOff.equals("ON")) {
				super.powerBt("OFF");
				change = "��ħ��尡 �۵��˴ϴ�.\n 1�ð��ڿ� �ڵ�����";
				
			}else if(onOff.equals("OFF"))
				change = "��ħ��尡 ����˴ϴ�.";
				
			return change;
	}
		
}//class
	

