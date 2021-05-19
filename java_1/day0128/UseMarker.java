package day0128;

/**
 * 마카펜 클래스를 객체로 생성하여 사용하는 클래스
 * @author SIST
 */
public class UseMarker {

	public static void main(String[] args) {
		//1. 객체화 : Marker class를 생성하여 black이라는 객체로 할당.
		Marker black = new Marker();
//		black.setBody(1);
//		black.setCap(1);
//		black.setColor("검은색");
		System.out.println(black);
		//변수의 접근지정자가 public일때에는 클래스 외부에서 자유롭게 값을 변경할 수 있다.
		//값에 대한 입력제한을 설정하기 어렵다 - public을 설정하지 않는다.
		//therefore...get,get method 이용
		System.out.println("마카펜에 설정된 값, 뚜껑 : "+black.getCap()+" , 몸체 : "+
		black.getBody()+", 색 : "+black.getColor());
		
		//2. 생성된 객체 사용x
		black.setColor("노란색"); //3색 이외에는 검정색으로 나오게 설정
		
		System.out.println(black.write("안녕하세요?"));//검은색 마카펜 사용
		
		System.out.println("------------------------------------------------");
		//빨간색마카펜생성
		Marker red = new Marker("빨간색",1,12); //빨간색, 뚜껑1, 몸체12 마카펜 생성
		System.out.println(red.getCap()+" / "+red.getBody());
		System.out.println(red.write("Hello"));
		
		
		
	}//main

}
