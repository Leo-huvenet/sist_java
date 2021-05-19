package day0128;

/**
 *	마카펜을 대상으로 작성된 클래스<br>
 *	명사적인 특징 : 색, 몸체, 뚜껑<br>
 *	동사적인 특징 : 쓴다<br>
 *	의 특징을 추상화하여 작성한 클래스<br>
 *	사용법)<br>
 *		1.객체화
 *		Maker 객체명 = new Maker();<br>
 *		2. 사용<br>
 *		객체명.write("화이트보드에작성할 메시지");<br>
 * @author SIST
 */
public class Marker {
		
		private String color; // null
		private int cap; // 0
		private int body; // 0
		
		/**
		 * 마카펜 클래스의 기본생성자<br>
		 * 뚜껑 1개, 몸체 1개, 검은색인 마카펜을 생성할 때 사용
		 */
		public Marker() {
			this("검은색",1,1);
//			color="검은색";
//			cap=1;
//			body=1;
		}//생성자
		
		/**
		 * 	입력하는 값으로 마카펜객체를 생성하는 Overload된 생성자<br>
		 *	색은 검은색, 파란색, 빨간색만 설정할 수 있고 해당색이 아니면 검은색으로 설정된다<br>
		 *	뚜껑과 몸체는 최대 10개까지 설정할 수 있으며 10개가 초과되면 1개로 설정된다.
		 * @param color 설정할 색
		 * @param cap 뚜껑의 갯수
		 * @param body 몸체의 갯수
		 */
		public Marker(String color, int cap, int body) {
			if(color.equals("검은색") || color.equals("빨간색") || color.equals("파란색")) {
				this.color=color;
			}else {
				this.color="검은색";
			}
			
		if(cap>10) {
			cap=1;
		}
		this.cap=cap;
		
		if(body>10) {
			body=1;
		}
		this.body=body;
		}//Marker생성자(매개변수)
		
		/**
		 * 생성된 마카펜 객체의 색을 설정하는 일(넣는 일) <br>
		 * 설정가능한 색 목록 : 검은색, 빨간색, 파란색 3종류만 설정 가능 <br>
		 * 다른색이 입력되면 검은색으로 설정합니다.
		 * @param color 설정할 색
		 */
		public void setColor(String color ) {
			
			if(color.equals("검은색") || color.equals("빨간색") || color.equals("파란색")) {
				this.color=color;
			}else {
				color = "검은색";
			}
		}//setColor
		
		/**
		 * 생성된 마카펜 객체의 색을 얻는 일
		 * @return 생성된 마카펜 객체에 설정된 색
		 */
		public String getColor() {
			return color;
		}//getColor
		
		/**
		 * 생성된 마카펜 객체의 뚜껑 갯수를 설정하는 일
		 * @param cap 생성된 마카펜객체에 설정된 뚜껑의 갯수
		 */
		public void setCap(int cap) {
			this.cap=cap;
		}//setCap
		
		/**
		 * 생성된 마카펜 객체의 설정된 뚜껑의 갯수를 얻는 일
		 * @return 설정된 뚜껑의 갯수
		 */
		public int getCap() {
			return cap;
		}//getCap
		
		/**
		 * 생성된 마카펜 객체의 몸체갯수를 설정하는 일
		 * @param body 설정한 몸체의 갯수
		 */
		public void setBody(int body) {
			this.body=body;
		}//setBody
		
		/**
		 * 생성된 마카펜 객체의 몸체 갯수를 반환하는 일
		 * @return 몸체의 갯수
		 */
		public int getBody() {
			return body;
		}//getBody
		
		/**
		 * 생성된 마카펜 객체를 사용하여 칠판에 입력된 메시지를 쓰는 일
		 * @param msg 칠판에 쓸 메시지
		 * @return 칠판에 쓴 결과
		 */
		public String write(String msg) {
			return "칠판에 " +color+"인 마카펜으로 \"" + msg + "\" 를 쓴다.";
			
		}
		
}
