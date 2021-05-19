package day0302;

/**
 * Date를 가지고 현재상태를 저장할 목적으로 사용하는 클래스
 * @author user
 */
public class DataVO implements Cloneable {

	private String name;
	private int age;
	
	public DataVO() {
	}

	public DataVO(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	/**
	 * 객체복제
	 * @return
	 */
	public DataVO cloneObj() {
		 DataVO temp = null;
		 
		 try {
		 temp = (DataVO)this.clone();//CompileException발생 -> 개발자는 반드시 try~catch를 처리
		 }catch( CloneNotSupportedException cnse) {
			 	System.err.println("복제가 안됩니다 : "+ cnse);
		 }
		 
		 return temp;
	}//cloneObj

	
	
	@Override
	public String toString() {
		return super.toString()+"DataVO [name=" + name + ", age=" + age + "]";
	}
}
