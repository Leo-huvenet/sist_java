package day0209;

/**
 *	Remote �ڽ�Ŭ���� AirconRemote
 *	AirconRemote�� ����Ư¡ : �µ�������ư(�µ��� 18~30�� ��������)
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
				input = temperatureBt+"���� ��ȯ�մϴ�.";
				
			}else {
				input = "���̻� ���/�ϰ��� �� �����ϴ�.";
				
			}
			return input;
		}

		@Override
		public String sleepBt(String onOff) {
				String change = null;
				
				if(onOff.equals("ON")) {
					this.temperatureBt = 25;
					change = "��ħ��尡 �۵��˴ϴ�.\n25���� ��ȯ�˴ϴ�.";
				}else if(onOff.equals("OFF"))
					change = "��ħ��尡 ����˴ϴ�.";
					
				return change;
		}

}
