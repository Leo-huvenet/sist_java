package day0223;

import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class HomeWork extends JFrame {
		public HomeWork() {
			super("HomeWork");
			
			JLabel jlName = new JLabel("�̸�");
			JLabel jlAge = new JLabel("����");
			JLabel jlAdress = new JLabel("�ּ�");
			JLabel jlEmail = new JLabel("�̸���");
			JLabel jlAt = new JLabel("@");
			
			JButton jbInput = new JButton("�Է�");
			JButton jbUpdate = new JButton("����");
			JButton jbDelete = new JButton("����");
			JButton jbEnd = new JButton("����");
			
			JTextField jtfName = new JTextField(12);
			JTextField jtfAge = new JTextField(12);
			JTextField jtfAdress = new JTextField(12);
			JTextField jtfEmail = new JTextField(12);
			
			JTextArea jtaMain = new JTextArea();
			
			Vector<String> vtEmail = new Vector<String>();
			
			vtEmail.add("daum.net");
			vtEmail.add("naver.com");
			vtEmail.add("google.com");
			vtEmail.add("nate.com");
			vtEmail.add("hotmail.com");
			
			JComboBox<String> jcbx = new JComboBox<String>(vtEmail);
			
			//����
			setLayout(null);
			
			//������Ʈ ũ��
			jlName.setBounds(20, 25, 50, 30);
			jlAge.setBounds(20, 60, 50, 30);
			jlAdress.setBounds(20, 95, 50, 30);
			jlEmail.setBounds(20,130, 50, 30);
			jlAt.setBounds(155,130, 20, 30);
			
			jtfName.setBounds(80, 25, 200, 30);
			jtfAge.setBounds(80, 60, 200, 30);
			jtfAdress.setBounds(80, 95, 200, 30);
			jtfEmail.setBounds(80, 130, 70, 30);
			
			jcbx.setBounds(175, 130,  104, 30);
			
			jtaMain.setBounds(290, 25, 180, 135);
			
			jbInput.setBounds(100, 170, 60, 30);
			jbUpdate.setBounds(175, 170, 60, 30);
			jbDelete.setBounds(250, 170, 60, 30);
			jbEnd.setBounds(325, 170, 60, 30);
			
			
			
			
			//������ ũ��
			setBounds(300, 300, 500, 250);
			
			//��ġ
			add(jlName);
			add(jlAge);
			add(jlAdress);
			add(jlEmail);
			add(jlAt);
			
			add(jtfName);
			add(jtfAge);
			add(jtfAdress);
			add(jtfEmail);

			add(jcbx);
			
			add(jtaMain);
			
			add(jbInput);
			add(jbUpdate);
			add(jbDelete);
			add(jbEnd);
			
			//����ȭ
			setVisible(true);
			
			//����
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	

	public static void main(String[] args) {
		new HomeWork();
	}

}
