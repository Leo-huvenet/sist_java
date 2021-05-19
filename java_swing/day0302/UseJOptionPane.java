package day0302;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class UseJOptionPane extends JFrame implements ActionListener {
	private JButton jbtnInput, jbtnMessage, jbtnConfirm;
	public UseJOptionPane() {
		super("JOptionPane ���");
		
		jbtnInput = new JButton("�Է� ���̾�α�");
		jbtnMessage = new JButton("�޽��� ���̾�α�"); 
		jbtnConfirm = new JButton("���� ���̾�α�"); 
		
		JPanel panel = new JPanel();
		panel.add(jbtnInput);
		panel.add(jbtnMessage);
		panel.add(jbtnConfirm);
		
		add(panel);
		
		jbtnConfirm.addActionListener(this);
		jbtnInput.addActionListener(this);
		jbtnMessage.addActionListener(this);
		
		setBounds(100, 100, 500, 250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseJOptionPane
	
	public void useInput() {
		String name = JOptionPane.showInputDialog(this,"�̸� �Է����ּ���\n��)ȫ�浿");
		
		setTitle("JOptionPane ��� - �Է��̸� : "+name);
	
	}//useInput - actionPerformed���� ó���ϸ� �ڵ����� �������� ������ �޼ҵ�� ó��
	
	public void useMessage() {
//		JOptionPane.showMessageDialog(this,"������ ȭ���� �Դϴ�.");
		//showMessageDialog�� ��ȯ���� void�̴�(��â�� ���� ��) 
		//���������� �������� ����(JOptionPaen�� Constant ���)
		//ERROR_MESSAGE, INFOMATION_MESSAGE, PLAIN_MESSAGE, QUESTION_MESSAGE
//		JOptionPane.showMessageDialog(this, "�����޽��� ����", "����",JOptionPane.ERROR_MESSAGE);
//		JOptionPane.showMessageDialog(this, "�����޽��� ����", "����",JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(this, "���� �޽��� ����", "����",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(this, "�������� ���� �޽��� ����", "�Ϲ�",JOptionPane.PLAIN_MESSAGE);
		
	}//useInput - actionPerformed���� ó���ϸ� �ڵ����� �������� ������ �޼ҵ�� ó��
	
	public void useConfirm() {
//		int flag = JOptionPane.showConfirmDialog(this, "��� ���� �Ͻðڽ��ϱ�?");//��,�ƴϿ�,��� ����
//		int flag = JOptionPane.showConfirmDialog
//				(this, "������ �߻��Ͽ����ϴ�.\n��� ���� �Ͻðڽ��ϱ�?","����",JOptionPane.ERROR_MESSAGE);//��,�ƴϿ� ����
//		int flag = JOptionPane.showConfirmDialog
//				(this, "������ �߻��Ͽ����ϴ�.\n��� ���� �Ͻðڽ��ϱ�?","����",JOptionPane.PLAIN_MESSAGE);//�� ����
		int flag = JOptionPane.showConfirmDialog
				(this, "������ �߻��Ͽ����ϴ�.\n��� ���� �Ͻðڽ��ϱ�?","����",JOptionPane.INFORMATION_MESSAGE);//��,�ƴϿ�,��� ����
		
		switch(flag) {
		case JOptionPane.OK_OPTION : System.out.println("\"��\"�� ���� ��� ó��");break;
		case JOptionPane.NO_OPTION : System.out.println("\"�ƴϿ�\"�� ���� ��� ó��");break;
		case JOptionPane.CANCEL_OPTION : System.out.println("\"���\"�� ���� ��� ó��");break;
		//0, 1, 2�� case ������ �ִ°ͺ��� �������� ���ؼ� ����� �̿��ؼ� ó���Ͽ���.
		
		}
	}//useInput - actionPerformed���� ó���ϸ� �ڵ����� �������� ������ �޼ҵ�� ó��
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == jbtnInput) {
			useInput();
		}
		
		if(ae.getSource() == jbtnMessage) {
			useMessage();
		}
		
		if(ae.getSource() == jbtnConfirm) {
			useConfirm();
		}
		
	}//actionPerformed

	

	public static void main(String[] args) {
			new UseJOptionPane();
	}	
}
