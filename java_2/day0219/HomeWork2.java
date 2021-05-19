package day0219;

import java.util.ArrayList;
import java.util.List;

/**
 *	day0222 ProcessStudent
 * @author user
 */
public class HomeWork2  {
	
	HomeWork is = new HomeWork("강인섭",25,"서울시 강남구 역삼동",'남',97);	
	HomeWork bs = new HomeWork("곽범수",27,"서울시 강남구 논현동",'남',81);	
	HomeWork yw = new HomeWork("권예원",26,"서울시 동작구 상도동",'여',90);	
	HomeWork dy = new HomeWork("김덕영",30,"경기도 수원시 영통구",'남',82);	
	HomeWork jw = new HomeWork("석지원",25,"인천광역시 부평구 부평동",'여',88);	
	
	List<HomeWork> list = new ArrayList<HomeWork>();
	
	
		
		public List<HomeWork> getList(){
			
			list.add(is);
			list.add(bs);
			list.add(yw);
			list.add(dy);
			list.add(jw);
			
			System.out.println(list+" / "+list.size());
			
			String[] subjectArr = new String [ list.size() ];
			list.toArray(subjectArr);
			
			
			
			
		return list;
	}
		
		
	
	
//	public void printList(List<HomeWork> list) {
//		System.out.println("번호\t이름\t나이\t태어난 해\t주소\t자바점수");
//		System.out.println("------------------------------------------------------");
		
//		for(int i =0; i<subjectArr.length; i++) {
//			System.out.println(subjectArr[i]);
//		}
			
	
	
	
	
	
	public static void main(String[] args) {
		
		HomeWork2 hw2 = new HomeWork2();
		
		hw2.getList();
//		hw2.printList(hw2.getList());
		
		
		
		
		
	}

}
