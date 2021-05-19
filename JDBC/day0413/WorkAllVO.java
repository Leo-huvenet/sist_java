package day0413;

public class WorkAllVO {
	private int num;
	private String name;
	private int age;
	private String addr;
	
	public WorkAllVO() {

	}

	public WorkAllVO(int num, String name, int age, String addr) {
		this.num = num;
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	public WorkAllVO( String name, int age, String addr ,int num) {
		this.num = num;
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	/**
	 * @return the deptno
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param deptno the deptno to set
	 */
	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the addr
	 */
	public String getAddr() {
		return addr;
	}

	/**
	 * @param addr the addr to set
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}
}
