package day0407;

import java.sql.Date;

public class EmpAllVO {
	private int empno;
	private String ename;
	private int deptno;
	private String job;
	private String hiredate; 
	
	public EmpAllVO() {
		
	}
	
	public EmpAllVO(int empno, String ename, int deptno, String job, String hiredate) {
		this.empno = empno;
		this.ename = ename;
		this.deptno = deptno;
		this.job = job;
		this.hiredate = hiredate;
	}

	/**
	 * @return the empno
	 */
	public int getEmpno() {
		return empno;
	}

	/**
	 * @param empno the empno to set
	 */
	public void setEmpno(int empno) {
		this.empno = empno;
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
	public String getHiredate() {
		return hiredate;
	}

	/**
	 * @param hiredate the hiredate to set
	 */
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}


	

	
}
