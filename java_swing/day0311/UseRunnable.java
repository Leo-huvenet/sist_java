package day0311;

/**
 *	Runnable을 구현하여 Thread 사용
 * @author user
 */
//1. Runnable 구현
public class UseRunnable implements Runnable{
	
	//2. run() Override 
	@Override
	public void run() {
		//Thread로 동작할 코드(동시에 동작해야할 코드)
		for(int i=0; i<1000; i++) {
			System.out.println("run i======"+i);
		}
	}//run
	
	public void work() {
		//Thread로 동작할 코드(동시에 동작해야할 코드)
		for(int i=0; i<1000; i++) {
			System.out.println("work i="+i);
		}
	}//run
	
	
	
	public static void main(String[] args) {
		//3. 클래스를 객체화
		UseRunnable ur = new UseRunnable();
		//4. Thread클래스와 객체화 has a 관계 설정
		Thread thread = new Thread(ur);
		//5. start() 호출
		thread.start();
		System.out.println("---------------");
		ur.work();
	}

}
