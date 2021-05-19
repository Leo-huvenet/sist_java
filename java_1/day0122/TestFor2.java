package day0122;

/**
 *	다중 for문<br>
 *	문법)<br>
 *	for(초기값; 조건식; 증.감소식){<br>
 *		for(초기값; 조건식; 증.감소식)<br>
 *				반복수행문장<br>
 *		}<br>
 *}<br>
 * @author SIST
 */
public class TestFor2 {

	public static void main(String[] args) {
		for(int i =0; i <5; i++) {
			
			for(int j =0; j <6; j++) {
				System.out.println("i = "+i+", j = "+j);
				
			}//end for
			
		}//end for
	
	}//main

}//class
