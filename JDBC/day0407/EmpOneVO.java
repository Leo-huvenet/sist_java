package day0407;

import java.sql.Date;

public class EmpOneVO {
	private String ename;
	private int deptno;
	private String job;
	private Date hiredate;//조회할 때 Oracle의 date형을 저장하기 위해 java.sql.Date클래스를사용
	
	public EmpOneVO() {
	}

	public EmpOneVO(String ename, int deptno, String job, Date hiredate) {
		this.ename = ename;
		this.deptno = deptno;
		this.job = job;
		this.hiredate = hiredate;
	}

	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}

	/**
	 * @param ename the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
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
	 * @return the job
	 */
	public String getJob() {
		return job;
	}

	/**
	 * @param job the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}

	/**
	 * @return the hiredate
	 */
	public Date getHiredate() {
		return hiredate;
	}

	/**
	 * @param hiredate the hiredate to set
	 */
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}


	
	
}
