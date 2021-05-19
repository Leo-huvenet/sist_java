package day0209;

/**
 *	Remote 자식클래스 AirconRemote
 *	AirconRemote의 개인특징 : 온도설정버튼(온도는 18~30도 설정가능)
 * @author SIST
 */
public class AirconRemote extends Remote{

	private int temperatureBt;
	
	
		public AirconRemote() {
			temperatureBt = 24; 
		}
		
	//setter
			public void setTemperatureBt(int temperatureBt) {
				this.temperatureBt = temperatureBt;
			}
				
	//getter
			public int getTemperatureBt() {
				return temperatureBt;
			}
		
		public String temp(int temperatureBt) {
			String input = ""; 
			
			if(temperatureBt>17 && temperatureBt<31) {
				this.temperatureBt = temperatureBt;
				input = temperatureBt+"도로 전환합니다.";
				
			}else {
				input = "더이상 상승/하강할 수 없습니다.";
				
			}
			return input;
		}

		@Override
		public String sleepBt(String onOff) {
				String change = null;
				
				if(onOff.equals("ON")) {
					this.temperatureBt = 25;
					change = "취침모드가 작동됩니다.\n25도로 전환됩니다.";
				}else if(onOff.equals("OFF"))
					change = "취침모드가 종료됩니다.";
					
				return change;
		}

}
