package day0122;

/**
 *	��ġ�ϴ� ������ ���� �� ����ϴ� switch~case��<br>
 *	����)<br>
 *		switch(������){<br>
 *			case ��� : ���๮�� ;<br>
 *			case ��� : ���๮�� ;<br>
 *			case ��� : ���๮�� ;<br>
 *						.<br>
 *			default : ���๮��<br>
 *		}
 * @author SIST
 */
public class TsetSwitchCase {
	public static void main(String[] args) {
//		int i =20;//byte,short,int,char (long�� ����� �� ����)
//		switch(i) { //������ ������ ������ ��� �� �� �ִ�.
//		case 0 : System.out.println("ZERO");
//		case 1 : System.out.println("ONE");
//		case 2 : System.out.println("TWO");
//		default : System.out.println("��ġ�ϴ� ��� ����");
//		}//end switch
		
		// case�� ����� �ԷµǴ� ���������� ���������� ����� �� �ִ�.
		// byte i = 0; �� case 127 : ~ case -128 : ���� �ȴ�

//		int i = 20;
//		switch(i) {//������ ������ ������ ����� �� �ִ�.
//		case 48 : System.out.println("ZERO");
//		case 'B' : System.out.println("ONE");
//		case 'C' : System.out.println("TWO");
//		default : System.out.println("��ġ�ϴ� ��� ����");
//		}//end switch
		
		///////////////////////// char /////////////////////////
//		char i = '0'; //char�� �ԷµǴ� ���ڿ� �����ϴ� Unicode���� ����
//		switch(i) {
//		case 48 : System.out.println("ZERO");
//		case 'B' : System.out.println("ONE");
//		case 'C' : System.out.println("TWO");
//		default : System.out.println("��ġ�ϴ� ��� ����");		
//		}//end switch
		
		///////////////////////// char /////////////////////////
		String i = "HTML"; //String�� JavaSE 7(JDK1.7)���� ����
		switch(i) {
		case "Java" : System.out.println("�Ϻ��� OOP���");
		case "Oracle" : System.out.println("��뷮 �����ͺ��̽�");
		case "HTML" : System.out.println("��ũ�� ���");
		default : System.out.println("��ġ�ϴ� ��� ����");		
		}//end switch
		
	}//main

}//class
