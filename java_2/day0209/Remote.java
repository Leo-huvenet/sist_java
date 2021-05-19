package day0209;

/**
 * �������� ��ü�𵨸��Ͽ� ����Ư¡�� ������ Ŭ����<br>
 * ���� : �Ŀ���ư ��ħ��ư
 * @author SIST
 */
public abstract class Remote {
	private String powerBt;
	private String sleepBt;
	private String remoteName;
	
	//constructor
	public Remote() {
		this.powerBt = "OFF";
		this.sleepBt = "OFF";
	}
	

	
	
	
	//setter
	public void setRemoteName(String remoteName) {
		this.remoteName = remoteName;
	}
	
	//getter
	public String getRemoteName() {
		return remoteName;
	}
	
	//setter
	public void setPowerBt(String powerBt) {
		this.powerBt = powerBt;
	}
		
	//getter
	public String getPowerBt() {
		return powerBt;
	}
	
	//setter
	public void setSleepBt(String sleepBt) {
		this.sleepBt = sleepBt;
	}
			
	//getter
	public String getSleepBt() {
		return sleepBt;
	}
	
	
	
	public String powerBt(String onOff) {
		String change = null;
		
		if(onOff.equals("ON")) {
			this.powerBt = "ON";
			change = "������ Ų��.";
			
		}else if(onOff.equals("OFF"))
			this.powerBt = "OFF";
			change = "������ ����.";
			
			
		return change+"���� �������� : "+this.powerBt;
	}
	
	/** ��ħ��� ON/OFF
	 * @param onOff ON/OFF ��ư
	 * @return ��ħ��带 ���� / ��ħ��带 Ų��
	 */
	public abstract String sleepBt(String onOff) ;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//class
