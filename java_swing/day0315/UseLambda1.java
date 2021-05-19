package day0315;

import java.util.Random;

public class UseLambda1 {

	public static void main(String[] args) {
		Random r = new Random();
		Thread t = new Thread( ()->{
			System.out.print("loading"); 
			try {
			for(int i=0; i<15; i++) {
				System.out.print(" . ");
				Thread.sleep(100*r.nextInt(10));
				}	
			} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("finish");
			} );
			t.start();
	}

}
