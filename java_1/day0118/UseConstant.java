package day0118;
/**
다른 클래스에 존재하는 상수를 사용.
*/

class  UseConstant{
	public static void main(String[] args) {
		/**System.out.println(MAX_SCORE); <- error
		외부 클래스에서 상수를 사용할 때에는 클래스명.상수명 의형식으로만 사용가능**/

		System.out.println(Constant.MAX_SCORE+"점 입니다.");
	}//main
}//class
