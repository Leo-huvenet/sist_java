package day0303;

/**
 * 흡연에 대한 예외처리 클래스
 *  CompileException : 개발자가 코드를 작성할 때 반드시 예외처리(try~catch)를 해야하는 예외
 * @author user
 */
@SuppressWarnings("serial")
public class TobaccoException extends Exception{
	
	
	/**
	 *	기본경고문구를 사용하는 생성자 
	 */
	public TobaccoException() {
		super("폐암의 원인 흡연! 그래도 피우시겠습니까?");
	}
	
	/**
	 * 경고문구를 사용자가 설정하는 생성자
	 * @param msg
	 */
	public TobaccoException(String msg) {
		super( msg );
	}
}
