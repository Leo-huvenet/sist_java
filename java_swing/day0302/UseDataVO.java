package day0302;

/**
 *	생성된 DataVO 객체를 복제하여 사용하는 클래스
 * @author user
 */
public class UseDataVO {

	public static void main(String[] args) {
		
		//복제할 클래스를 객체화
		DataVO dVO = new DataVO("박기범",20);
		//객체를 복제(객체를 복제하는 method는 해당 객체안에서만 호출할 수 있다
		// clone()의 접근 지정자가 protected
		DataVO dVO2 = dVO.cloneObj(); //복제된 객체를 얻는다.
		
		System.out.println("원본 객체 주소 : "+dVO);
		System.out.println("복제된 객체 주소 : "+dVO2);
 	}

}
