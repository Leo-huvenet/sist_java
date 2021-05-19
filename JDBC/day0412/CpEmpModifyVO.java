package day0412;

public class CpEmpModifyVO {
	private int empno;
	private String job;
	private int deptno;
	
	public CpEmpModifyVO() {
	
	}

	public CpEmpModifyVO(int empno, String job, int deptno) {
		super();
		this.empno = empno;
		this.job = job;
		this.deptno = deptno;
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
	
	
	
}
