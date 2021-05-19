package day0129;

/**
 *	사람객체를 생성하고 사용하는 클래스
 * @author SIST
 */
public class UsePerson {

	public static void main(String[] args) {
		//객체화
		Person hyunwoo = new Person();
		//객체가 가져야할 값 설정 : setter method
//		hyunwoo.setEye(2); //생성자가 정의되므로 setter method를 호출할 필요가 없다.
//		hyunwoo.setNose(1);
//		hyunwoo.setMouth(1);
		hyunwoo.setName("강현우");
		//객체가 가진 값을 얻기 : getter method
		System.out.printf("생성된 사람 객체의 눈 %d개 코 %d 입 %d 이름 %s\n",
			hyunwoo.getEye(), hyunwoo.getNose(), hyunwoo.getMouth(), hyunwoo.getName());
			
		
		
		//생성된 객체의 사용
		System.out.println(hyunwoo.eat("뜨끈한 국밥", 7000));
		
		System.out.println("----------------------------------------");
		//객체 생성 - 값설정 - 객체가 제공하는 일
		Person jinban = new Person(3,1,1);
		jinban.setName("천진반");
		System.out.printf("이름 %s 눈 %d 코 %d 입 %d\n",
				jinban.getName(), jinban.getEye(), jinban.getNose(), jinban.getMouth());
				
		System.out.println(jinban.eat());
		System.out.println(jinban.eat("선두",1));
	}

}
