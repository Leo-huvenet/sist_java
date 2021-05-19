package day0209;

/**
 *	Person 클래스를 상속받아 사용하는 자식클래스
 * @author SIST
 */
public class UsePerson {

	public static void main(String[] args) {
		//자식클래스가 생성되면, 부모클래스부터 생성된다.
		System.out.println("--------------------------HongGilDong-------------------------------");
		HongGilDong hgd = new HongGilDong();
		//자식클래스에 존재하지 않는 자원을 자식클래스의 객체명으로 사용할 수 있다 - 코드의 재사용 
		System.out.println(hgd.getEye()+"/"+hgd.getMouth()+"/"+hgd.getNose()+"/"+hgd.getName());
		hgd.setName("홍길동");
		System.out.println(hgd.getEye()+"/"+hgd.getMouth()+"/"+hgd.getNose()+"/"+hgd.getName());
		
		System.out.println(hgd.eat()); //코드의 재사용
		System.out.println(hgd.eat("뜨끈한 국밥",3)); //Override
		// 자식이 가진 자신만의 특징 ( 클락에는 없고 홍길동에만 가진 특징)
		System.out.println(hgd.fight(5));//이기는 경우 // 6->7
		System.out.println(hgd.fight(6));//이기는 경우 // 7->8
		System.out.println(hgd.fight(9));//지는 경우 // 8 -> 7
		System.out.println(hgd.fight(7));//비기는 경우 // 7로 유지 
		
		//홍길동의 현재 레벨을 출력(getter 메소드를 사용)
		System.out.println(hgd.getName()+"의 현재 레벨 "+ hgd.getLevel());
		
		System.out.println("---------------------------Clark------------------------------------");
		Clark superman = new Clark();
		System.out.println(superman.getEye()+"/"+superman.getMouth()+"/"+superman.getNose()+"/"+superman.getName()); //코드의 재사용
		superman.setName("클락 켄트"); //코드의 재사용
		System.out.println(superman.getEye()+"/"+superman.getMouth()+"/"+superman.getNose()+"/"+superman.getName()); //코드의 재사용
		System.out.println(superman.eat()); //Override
		System.out.println(superman.eat("스테이크", 20));//Override
		
		System.out.println(superman.power("짱돌")); //힘폭팔
		System.out.println(superman.power("다이아몬드")); //ㄳ
		System.out.println(superman.power("크립토나이트")); //힘빠짐
		
		//instance variable의 접근 지정자가 public 이기때문에 getter method를 사용하지 않고 
		//직접 접근할 수 있다.
		System.out.println(superman.getName()+"의 현재 힘은 "+ superman.power);
		
		System.out.println("---------------------------My------------------------------------");
		HomeWork my = new HomeWork();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("---------------------------언어------------------------------------");
		String[] hongLang=hgd.language();
		String[] clarkLang=superman.language();
		String[] myLang=my.language();		
		
		System.out.println(hgd.getName()+"이 구사할 수 있는 언어는");
		for(int i=0; i <hongLang.length; i++) {
			System.out.println(hongLang[i]);
		}
		
		System.out.println(superman.getName()+"이 구사할 수 있는 언어는");
		for(String lang : clarkLang) {
			System.out.println(lang);
		}
		
		System.out.println(superman.getName()+"이 구사할 수 있는 언어는");
		for(String lang : myLang) {
			System.out.println(lang);
		}	
		
		
		
		
		
		
		
		
		
		
	}//main

}//class
