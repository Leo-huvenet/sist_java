package day0311;

/**
 *	Thread를 상속으로 사용
 * @author user
 */
//1. Thread 상속 
public class UseThread extends Thread{
	//2. run method Override
	@Override
	public void run() {
		//thread로 동작해야할 코드.
		for(int i =0 ; i <1000 ; i++) {
			System.out.println("run method ===="+i);
		}
	}
		
		public void work() {
			//thread로 동작해야할 코드.
			for(int i =0 ; i <1000 ; i++) {
				System.out.println("work method =="+i);
			}
	}
	
	public static void main(String[] args) {
		//3. 클래스생성 : (Thread가 생성되고, UseThread가 생성된다)
		UseThread ut = new UseThread();
//		long st = System.currentTimeMillis();
		//4. start() 호출 = >  run
		ut.run();
		System.out.println("----------------");
		ut.work();
		//Thread를 사용하면 프로그램이 종료되는 시간을 알 수 없다.
//		long st = System.currentTimeMillis();
//		System.out.println("수행시간"+ (et-st)+"ms");
	}

}
