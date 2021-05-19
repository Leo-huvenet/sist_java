package day0412;

public class ZipcodeVO {
	
	private String zipcode ,sido,gugun,dong,bunji;

	public ZipcodeVO() {
		
	}

	public ZipcodeVO(String zipcode, String sido, String gugun, String dong, String bunji) {
		super();
		this.zipcode = zipcode;
		this.sido = sido;
		this.gugun = gugun;
		this.dong = dong;
		this.bunji = bunji;
	}

	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * @return the sido
	 */
	public String getSido() {
		return sido;
	}

	/**
	 * @param sido the sido to set
	 */
	public void setSido(String sido) {
		this.sido = sido;
	}

	/**
	 * @return the gugun
	 */
	public String getGugun() {
		return gugun;
	}

	/**
	 * @param gugun the gugun to set
	 */
	public void setGugun(String gugun) {
		this.gugun = gugun;
	}

	/**
	 * @return the dong
	 */
	public String getDong() {
		return dong;
	}

	/**
	 * @param dong the dong to set
	 */
	public void setDong(String dong) {
		this.dong = dong;
	}

	/**
	 * @return the bunji
	 */
	public String getBunji() {
		return bunji;
	}

	/**
	 * @param bunji the bunji to set
	 */
	public void setBunji(String bunji) {
		this.bunji = bunji;
	}


	
}
