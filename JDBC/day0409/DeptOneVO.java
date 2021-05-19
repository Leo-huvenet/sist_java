package day0409;

public class DeptOneVO {
	private String dname, loc;
	
	public DeptOneVO() {
		
	}

	public DeptOneVO(String dname, String loc) {
		this.dname = dname;
		this.loc = loc;
	}

	/**
	 * @return the dname
	 */
	public String getDname() {
		return dname;
	}

	/**
	 * @param dname the dname to set
	 */
	public void setDname(String dname) {
		this.dname = dname;
	}

	/**
	 * @return the loc
	 */
	public String getLoc() {
		return loc;
	}

	/**
	 * @param loc the loc to set
	 */
	public void setLoc(String loc) {
		this.loc = loc;
	}

	
}
