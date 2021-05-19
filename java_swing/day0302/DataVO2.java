package day0302;

import java.util.List;

/**
 * Date�� ������ ������¸� ������ �������� ����ϴ� Ŭ����(����)
 * @author user
 */
public class DataVO2 implements Cloneable {
	
	private String name;
	private int age;

	public DataVO2() {
	
	}

	public DataVO2(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return super.toString()+"DataVO [name=" + name + ", age=" + age + "]";
	}
}
