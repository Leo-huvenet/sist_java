package day0409;

public class DeptVO {
	private int deptno;
	private String dname, loc;
	
	
	public DeptVO() {
		
	}

	public DeptVO(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}



	/**
	 * @return the deptno
	 */
	public int getDeptno() {
		return deptno;
	}



	/**
	 * @param deptno the deptno to set
	 */
	public void setDeptno(int deptno) {
		this.deptno = deptno;
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
