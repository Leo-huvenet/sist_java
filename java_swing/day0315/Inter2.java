package day0315;

/**
 *	functionalInerface annotation을 정의하면 abstract method를 하나만 정의할 수 있다.
 * @author user
 */
@FunctionalInterface
public interface Inter2 {
		//반환형 없고, 매개변수 있는 형
		public abstract void test(String name); //abstract method
		
}//interface
