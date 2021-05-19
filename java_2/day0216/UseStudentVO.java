package day0216;

/**
 *	사용자정의 데이터형으로 만든 클래스를 사용
 * @author SIST
 */
public class UseStudentVO {

//	private int regiNum;//학번
//	private String name;//이름
//	private int age;//나이
//	private double height;//키
	public static void main(String[] args) {
		//1번 1, 이름 : 이하늘, 나이 : 20살, 키 : 185.8 (모든 데이터를 알고 있는 상황 => 매개변수 있는 생성자)
		StudentVO lhn = new StudentVO(1,"이하늘",20,185.8);
		//번호 : 2, 이름 : 박기범 ( 모든 데이터를 알지 못하는 상황 => 기본 생성자) - setter method 사용
		StudentVO pkb = new StudentVO();
		pkb.setName("박기범");
		
		System.out.println(lhn.toString());
		System.out.println(pkb);
		
		//여러학생의 정보를 저장하고 처리. 사용자정의 데이터형으로 배열을 생성
		//1,이하늘,20,185.8  2,박기범,25,170.3  3,강인섭,26,178,7
		
		//1.선언 데이터형[] 배열명 = null;
		StudentVO[] stuArr = null;
		//1.생성 
		stuArr = new StudentVO[3];
		//1.값할당 
		stuArr[0] = lhn;
		stuArr[1] = pkb;
		//stuArr[1]의 주소와 pkb의 주소는 같다.
		//stuArr[1]을 사용하여 나이 25설정
		stuArr[1].setAge(25);
		//pkb을 사용하여 키 170.3 설정
		pkb.setHeight(170.3);
		
		stuArr[2] = new StudentVO(3,"강인섭",26,178.8);
		
		//1.값사용(일괄처리) 
		for(int i =0 ; i<stuArr.length; i++){
			System.out.printf("번호 : %d, 이름 : %s, 나이 : %d, 키 : %.1f\n",stuArr[i].getRegiNum(),stuArr[i].getName(),stuArr[i].getAge(),stuArr[i].getHeight());
		}
		
	}
		
}


