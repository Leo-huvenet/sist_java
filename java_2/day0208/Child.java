package day0208;
/**
 *	Parent �� �ڽ� Ŭ����
 * @author SIST
 */
public class Child extends Parent{
	public Child() {
		//super(200);
		this(100);
		System.out.println("�ڽı⺻������");
	}
	
	public Child(int i) {
		//this();
		System.out.println("�ڽ����ڻ�����"+ i);
	}
	
}
