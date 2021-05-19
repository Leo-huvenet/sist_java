package day0219;

/** 
 * day0222 StudentVO 직접풀어본숙제
 * @author user
 *
 */
public class HomeWork {
	
	private String Name;
	private int age;
	private String add;
	private char gender;
	private int javaNum;
	
	public HomeWork() {
		
	}
	
	
	public HomeWork(String name, int age, String add, char gender, int javaNum) {
		this.Name = name;
		this.age = age;
		this.add = add;
		this.gender = gender;
		this.javaNum = javaNum;
	}
	

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAdd() {
		return add;
	}


	public void setAdd(String add) {
		this.add = add;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public int getJavaNum() {
		return javaNum;
	}


	public void setJavaNum(int javaNum) {
		this.javaNum = javaNum;
	}

	@Override
	public String toString() {
		return "HomeWork [Name=" + Name + ", age=" + age + ", add=" + add + ", gender=" + gender + ", javaNum="
				+ javaNum + "]";
	}


	public static void main(String[] args) {
	
	HomeWork is = new HomeWork("강인섭",25,"서울시 강남구 역삼동",'남',97);	
	HomeWork bs = new HomeWork("곽범수",27,"서울시 강남구 논현동",'남',81);	
	HomeWork yw = new HomeWork("권예원",26,"서울시 동작구 상도동",'여',90);	
	HomeWork dy = new HomeWork("김덕영",30,"경기도 수원시 영통구",'남',82);	
	HomeWork jw = new HomeWork("석지원",25,"인천광역시 부평구 부평동",'여',88);	
	
	System.out.println(is.toString());
	System.out.println(bs.toString());
	System.out.println(yw.toString());
	System.out.println(dy.toString());
	System.out.println(jw.toString());
	
	
	
	}

}
