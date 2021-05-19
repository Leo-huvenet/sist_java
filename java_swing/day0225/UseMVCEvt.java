package day0225;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * �̸��� JTextField�� �Է��ϰ� ��ư�� Ŭ��(ActionEvent)�ϸ�, �Էµ� �̸��� JList�� �߰��ǰ�,
 * JList�� item�� Ŭ�� ����(ListSelectionEvent)�ϸ� �ش� item�� ���� JTextField�� �����Ǵ� ��
 * @author user
 */
@SuppressWarnings("serial")
//1.������ ������Ʈ�� ���, �߻��̺�Ʈ�� ó���� �� �ִ� Listener�� ����
public class UseMVCEvt extends JFrame implements ActionListener, ListSelectionListener{
	//2. �̺�Ʈ�� �߻����� �� ����� ������Ʈ�� ����.
	private JTextField jtfName;
	private JList<String> jlName; //MVC Pattern�� �����Ͽ� ���۵� ������Ʈ
	
	private DefaultListModel<String> dlmName; //Model ��ü(��) 
	
	public UseMVCEvt() {
		super("Container Component ���");
		//������Ʈ ���� : : (������Ʈ���� + �ϴ� ��) 
		JLabel jlblName = new JLabel("�̸�");
		jtfName = new JTextField(12);
		JButton jbtnInput = new JButton("�Է�");

		dlmName = new DefaultListModel<String>();//Model��ü ����
		jlName = new JList<String>(dlmName); //Model��ü�� ����Ͽ� View��ü ���� 
		
		JScrollPane jspName = new JScrollPane(jlName); //JList�� J.S.P�� �Ҵ�
		jspName.setBorder(new TitledBorder("�Է� �̸�"));
		
		//4. ��ġ������ ����
		//�������� ������Ʈ�� �ѹ��� ��ġ�ϱ����� Container Component => JPanel
		JPanel jpNorth = new JPanel();
		jpNorth.add(jlblName);
		jpNorth.add(jtfName);
		jpNorth.add(jbtnInput);
		
		//��ũ�ѹٰ� �ʿ��� ��ü�� ��ũ�ѹٸ� ��ġ�ϱ����� Container Component => JScrollPane
		
		//5. ��ġ
		
		add("North",jpNorth);
		
		add("Center",jspName);
		
		//��ư���� �߻��� �̺�Ʈ�� ó���� �� �ֵ���, �̺�Ʈ�� ���
		jbtnInput.addActionListener(this);//��ưŬ��
		jtfName.addActionListener(this);//�ؽ�Ʈ�ʵ� ����
		jlName.addListSelectionListener(this);//����Ʈ�� ������ ����
		
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
		
		//JList�� �߰�(View�� �ƴ� Model ��ü�� ����Ͽ� ���� �߰�)
		dlmName.addElement(name);
		
		//JTextField�� ���� �ʱ�ȭ�Ѵ�.
		jtfName.setText(""); //�׼��� �߻��ϸ� �ؽ�Ʈ�ʱ�ȭ : empty
		//JTextField
		jtfName.requestFocus();
	}//actionPerformed
	
//	boolean flag;
	@Override
	public void valueChanged(ListSelectionEvent lse) {
		//�ѹ��� ����ǵ��� ��������.
//		if(flag) {
		if(jlName.getValueIsAdjusting()) {
			//JTextField�� ���õ� ���� ����
			jtfName.setText(dlmName.getElementAt(jlName.getSelectedIndex()));
//			System.out.println("������ �ε��� : "+jlName.getSelectedIndex());
//			//���õ� �ε����� ���� View�� Model�� ��
//			System.out.println("������ �ε����� �� : "+dlmName.getElementAt(jlName.getSelectedIndex()));
//			System.out.println(jlName.getSelectedValue());
		}
//		flag = !flag;
	}//valueChanged
	
	
	
	public static void main(String[] args){
		new UseMVCEvt();
	}

}
