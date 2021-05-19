package day0223;

import java.awt.Color;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


@SuppressWarnings("serial")
//1. ������ ������Ʈ ���
public class UseManualLayout extends JFrame {
	//2. �����ڿ��� �Ϲ�������Ʈ ����
	public UseManualLayout() {
		super("������ġ");
		
		JLabel jlblTitle = new JLabel("����");
		
		Vector<String> vec = new Vector<String>();
		vec.add("��ϼ���-�ѵ� ��");
		vec.add("���׵��-�ѵ� ��");
		vec.add("ź-�ѵ� �ڿ�");
		vec.add("�̽��ͱ��-�ѵ��� �����忷");
		vec.add("��õ-�ѵ� ��");
		
		JComboBox<String> jcb = new JComboBox<String>(vec); //���� ���� �޺��ڽ���ü ����.
		
		JButton jbtn = new JButton("�Է�");
		
		//3. ��ġ������ ���� : BorderLayout => null
		setLayout(null);
		
		//4.��ġ, ũ�� ����
//		jlblTitle.setLocation(10, 30);
//		jlblTitle.setSize(30,30);
		jlblTitle.setBounds(10,30,30,30);
		
		
//		jcb.setSize(200,30);
//		jcb.setLocation(40, 30);
		jcb.setBounds(40,30,200,30);
		
		
//		jbtn.setSize(60,30);
//		jbtn.setLocation(245, 30);// �������� Ÿ��Ʋ�� �Ʒ� �»���� ������ǥ
		jbtn.setBounds(245,30,60,30);
		
		//5.��ġ
		add(jlblTitle);
		add(jcb);
		add(jbtn);
		
		//6. ������ ũ�⼳��
		setSize(450,400);
		setLocation(150,100);// Window Component => monitor�� �»�� ������ǥ
		
		//7. ����ȭ
		setVisible(true);
		
		//8.�����̺�Ʈ ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}//UseManualLayout
	
	
	
	

	public static void main(String[] args) {
		new UseManualLayout();
	}

}
