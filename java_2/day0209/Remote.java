package day0209;

/**
 * 리모컨을 객체모델링하여 공통특징을 추출한 클래스<br>
 * 공통 : 파워버튼 취침버튼
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
			change = "전원을 킨다.";
			
		}else if(onOff.equals("OFF"))
			this.powerBt = "OFF";
			change = "전원을 끈다.";
			
			
		return change+"현재 전원상태 : "+this.powerBt;
	}
	
	/** 취침모드 ON/OFF
	 * @param onOff ON/OFF 버튼
	 * @return 취침모드를 끈다 / 취침모드를 킨다
	 */
	public abstract String sleepBt(String onOff) ;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//class
