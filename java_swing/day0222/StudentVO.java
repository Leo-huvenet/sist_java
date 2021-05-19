package day0222;

 /**
 * 학생의 이름, 나이, 주소, 성별, 자바점수를 저장할 목적으로 만드는 클래스.
 * VO(Value Object)
 * @author user
 */
public class StudentVO {

	private String name;
	private int age;
	private String address;
	private String gender;
	private int javaScore;
	
	public StudentVO() {
	}

	public StudentVO(String name, int age, String address, String gender, int javaScore) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.javaScore = javaScore;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public String getGender() {
		return gender;
	}

	public int getJavaScore() {
		return javaScore;
	}

	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", age=" + age + ", address=" + address + ", gender=" + gender
				+ ", javaScore=" + javaScore + "]";
	}
	
	
	
	
	
}//class
