package day0303;

import java.util.List;

/**
 * Date�� ������ ������¸� ������ �������� ����ϴ� Ŭ����(����)
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
	
	@Override
	public String toString() {
		return super.toString()+"DataVO [name=" + name + ", age=" + age + "]";
	}
}
