package day0224;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseColor extends JFrame{
	
	public UseColor() {
		super("�� ����");
		
		JTextField jtf = new JTextField(20);//�������̾ƿ��� �°� ũ�Ⱑ ���� ������ ũ�⼳�����ص��ȴ�.
		JTextArea jta = new JTextArea();
		
		//jtf, jta�� �۲��� �ü�ü, ���ϰ�, 25�� ����.
		//�ü��� �ü�ü�� ����
		//~ü�� ������ ��� ������ ���̰� ����. 
		Font font = new Font("�ü�ü", Font.BOLD, 25);
		jtf.setFont(font);
		jta.setFont(font);
		
		//������
		jtf.setBackground(Color.yellow);
		jta.setBackground(Color.gray);
		//����
		jta.setBackground(new Color(0xB2CCFF)); //16������ ��ǥ��.
		jta.setForeground(new Color(0x102A5D));
		//���� �빮�� �ҹ��� �������� ���.
		
		JPanel jp = new JPanel();
		jp.setBorder(new TitledBorder("�Է�"));
		
		JLabel jl = new JLabel("��ȭ��ȣ");//������ �����Ǿ��־� �ٴڻ��� �״�� ������ �ȴ�.
		jl.setBorder(new TitledBorder("�޴���"));
		jta.setBorder(new TitledBorder("010�� �Է�"));
		jtf.setBorder(new TitledBorder("�޴�������Ʈ"));
		jl.setForeground(Color.RED);
		
		
//		jl.setBackground(Color.yellow); //������� ����ȴ�.
	
		
		//���� �����ϰ�
		jl.setOpaque(true);
		//�ٴڻ��� �����Ѵ�.
		jl.setBackground(Color.yellow);
		
		jp.add(jl);
		jp.add(jtf);
		
		
		add("North",jp);
		add("North",jtf);
		
		
		//������ ũ�⼳�� w 600 h 500
		setBounds(500, 500, 600, 500);
		
		//����ȭ
		setVisible(true);
		
		//����ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		
		
		
	}//UseColor
	
	
	
	
	
	
	
	public static void main(String[] args) {
			new UseColor();
	}

}
