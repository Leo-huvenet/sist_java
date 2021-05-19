package day0413;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import javax.swing.JScrollPane;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class RunCrudDAO extends JFrame {
	
	private JTextField jtfNum;
	private JTextField jtfName;
	private JTextField jtfAge;
	private JTextField jtfAddr;
	
	private JList<String>jl;
	private DefaultListModel<String>dflm;
	
	private JButton jbtnInsert;
	private JButton jbtnDelete;
	private JButton jbtnUpdate;
	private JButton jbtnClose;
	
	public RunCrudDAO() {
		super("CRUD");
		JLabel jlbNo = new JLabel("번호");
		JLabel jlbName = new JLabel("이름");
		JLabel jlbAge = new JLabel("나이");
		JLabel jlbAddr = new JLabel("주소");
		
		jtfNum = new JTextField("자동으로 1씩 증가");
		jtfNum.setEnabled(false);//입력제한
		jtfName = new JTextField();
		jtfAge = new JTextField();
		jtfAddr = new JTextField();
		
		dflm= new DefaultListModel<String>();
		jl = new JList<String>(dflm);
		JScrollPane jsp = new JScrollPane(jl);

		jbtnInsert = new JButton("추가");
		jbtnDelete = new JButton("삭제");
		jbtnUpdate = new JButton("변경");
		jbtnClose = new JButton("닫기");
		
		add(jlbNo);
		add(jlbName);
		add(jlbAge);
		add(jlbAddr);
		
		add(jtfNum);
		add(jtfName);
		add(jtfAge);
		add(jtfAddr);
		
		add(jsp);
		
		add(jbtnInsert);
		add(jbtnDelete);
		add(jbtnUpdate);
		add(jbtnClose);
		
		setLayout(null);
		
		jlbNo.setBounds(80, 70, 50, 25);
		jlbName.setBounds(80, 115, 50, 25);
		jlbAge.setBounds(80, 160, 50, 25);
		jlbAddr.setBounds(80, 200, 50, 25);
		
		jtfNum.setBounds(110, 70, 150, 25);
		jtfName.setBounds(110, 115, 150, 25);
		jtfAge.setBounds(110, 160, 150, 25);
		jtfAddr.setBounds(110, 200, 150, 25);
		
		jsp.setBounds(300, 70, 300, 157);
		
		jbtnInsert.setBounds(130, 300, 100, 25);
		jbtnDelete.setBounds(250, 300, 100, 25);
		jbtnUpdate.setBounds(370, 300, 100, 25);
		jbtnClose.setBounds(490, 300, 100, 25);
		
		//이벤트 처리클래스와 has a 관계
		Work0412Event we = new Work0412Event(this);
		
		jbtnInsert.addActionListener(we);
		jbtnDelete.addActionListener(we);
		jbtnUpdate.addActionListener(we);
		jbtnClose.addActionListener(we);
		jl.addMouseListener(we);
		
		addWindowListener(we);
		
		setBounds(100,100,700,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		we.setJListWork();
	}//crudTable
	
	
	
	
	/**
	 * @return the jtfNum
	 */
	public JTextField getJtfNum() {
		return jtfNum;
	}




	/**
	 * @return the jtfName
	 */
	public JTextField getJtfName() {
		return jtfName;
	}




	/**
	 * @return the jtfAge
	 */
	public JTextField getJtfAge() {
		return jtfAge;
	}




	/**
	 * @return the jtfAddr
	 */
	public JTextField getJtfAddr() {
		return jtfAddr;
	}




	/**
	 * @return the jl
	 */
	public JList<String> getJl() {
		return jl;
	}




	/**
	 * @return the dflm
	 */
	public DefaultListModel<String> getDflm() {
		return dflm;
	}




	/**
	 * @return the jbtnInsert
	 */
	public JButton getJbtnInsert() {
		return jbtnInsert;
	}




	/**
	 * @return the jbtnDelete
	 */
	public JButton getJbtnDelete() {
		return jbtnDelete;
	}




	/**
	 * @return the jbtnUpdate
	 */
	public JButton getJbtnUpdate() {
		return jbtnUpdate;
	}




	/**
	 * @return the jbtnClose
	 */
	public JButton getJbtnClose() {
		return jbtnClose;
	}




	public static void main(String[] args) {
		new RunCrudDAO();
	}//main

}//class
