package day0408;

/**
 *	Singleton Pattern으로 만들어진 클래스를 사용
 * @author user
 */
public class UseSingleton {

	
	
	
	public static void main(String[] args) {
//		Singleton s = new Singleton(); //직접 객체화 할 수 없다.
		
		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		
		System.out.println(s+" / "+ s1);
	}

}
