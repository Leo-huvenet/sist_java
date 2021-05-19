package day0305;

import java.io.Serializable;

/**
 *	JVM외부로 직렬화되어 나가는 클래스.
 * @author user
 */
public class MyData implements Serializable{
	/**
	 * 아이디는 2021-03-06에 변경
	 */
	private static final long serialVersionUID = -6743636827831497164L;
	
	private String name;
	private double height;
	private double weight;
	
	public MyData() {
	}

	public MyData(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}
}


