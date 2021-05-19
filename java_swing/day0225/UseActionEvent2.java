package day0225;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * �̸��� �Է��ϰ� ��ư�� Ŭ���ϸ�, �Էµ� �̸��� TextArea�� �߰��Ǵ� ��.
 * @author user
 */
@SuppressWarnings("serial")
//1.������ ������Ʈ�� ���, �߻��̺�Ʈ�� ó���� �� �ִ� Listener�� ����
public class UseActionEvent2 extends JFrame implements ActionListener{
	//2. �̺�Ʈ�� �߻����� �� ����� ������Ʈ�� ����.
	private JTextField jtfName;
	private JTextArea jtaOutput;
	
	
	public UseActionEvent2() {
		super("Container Component ���");
		//������Ʈ ���� : : (������Ʈ���� + �ϴ� ��) 
		JLabel jlblName = new JLabel("�̸�");
		jtfName = new JTextField(12);
		JButton jbtnInput = new JButton("�Է�");
		jtaOutput = new JTextArea();
		
		//4. ��ġ������ ����
		//�������� ������Ʈ�� �ѹ��� ��ġ�ϱ����� Container Component => JPanel
		JPanel jpNorth = new JPanel();
		jpNorth.add(jlblName);
		jpNorth.add(jtfName);
		jpNorth.add(jbtnInput);
		
		//��ũ�ѹٰ� �ʿ��� ��ü�� ��ũ�ѹٸ� ��ġ�ϱ����� Container Component => JScrollPane
		JScrollPane jspCenter = new JScrollPane(jtaOutput);
		
		//5. ��ġ
		
		add("North",jpNorth);
		
		add("Center",jspCenter);
		
		//��ư���� �߻��� �̺�Ʈ�� ó���� �� �ֵ���, �̺�Ʈ�� ���
		jbtnInput.addActionListener(this);//��ưŬ��
		jtfName.addActionListener(this);//�ؽ�Ʈ�ʵ� ����
		
		//6. ũ�⼳��
		setSize(500,400);
//		setLocation(100,200); //x 100 y 200 ��ŭ 
		
		//7. ����ȭ
		setVisible(true);
		
		//8. ������ ����ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//UseContainerComponent
	
	//2. �̺�Ʈó���� �� �� �ִ� method Override
	@Override
	public void actionPerformed(ActionEvent ae) {
		//JTextField�� �Է� ���� �����ͼ�
		String name = jtfName.getText();
		//JTextArea�� �߰��Ѵ�.
		jtaOutput.append(name+"\n");//T.A�� �����ϴ� �� �ڿ� ����
//		jtaOutput.setText(name+"\n");//T.A�� �����ϴ� ���� �ʱ�ȭ�� �� �Է°��� ���
		
		
		//JTextField�� ���� �ʱ�ȭ�Ѵ�.
		jtfName.setText(""); //�׼��� �߻��ϸ� �ؽ�Ʈ�ʱ�ȭ : empty
		//JTextField
		jtfName.requestFocus();
	}//actionPerformed

	
	
	
	public static void main(String[] args){
		new UseActionEvent2();
	}
}
