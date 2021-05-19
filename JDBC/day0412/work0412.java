package day0412;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


import kr.co.sist.dao.DbConnection;

@SuppressWarnings("serial")
public class work0412 extends JFrame implements ActionListener{
	
	JButton JtAdd ;
	JButton JtDel ;
	JButton JtUpdt ;
	JButton JtExit ;
	
	JTextField JfNum ;
	JTextField JfName; 
	JTextField JfAge;
	JTextField JfAddr;
	
	public work0412() {
		super("CURD");
		
		JLabel JlNum = new JLabel("��ȣ");
		JLabel JlName = new JLabel("�̸�");
		JLabel JlAge = new JLabel("����");
		JLabel JlAddr = new JLabel("�ּ�");
		
		JfNum = new JTextField();
		JfName = new JTextField();
		JfAge = new JTextField();
		JfAddr = new JTextField();
		
		JtAdd = new JButton("�߰�");
		JtDel = new JButton("����");
		JtUpdt = new JButton("����");
		JtExit = new JButton("�ݱ�");
		
		DefaultListModel<String> dlmSelect = new DefaultListModel<String>();
		JList<String> jlSelect = new JList<String>(dlmSelect);
		JScrollPane jspSelect = new JScrollPane( jlSelect);

		setBounds(200,200,700,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		add(jspSelect);
		
		add(JlNum);
		add(JlName);
		add(JlAge);
		add(JlAddr);
		
		add(JfNum);
		add(JfName);
		add(JfAge);
		add(JfAddr);
		
		add(JtAdd);
		add(JtDel);
		add(JtUpdt);
		add(JtExit);
		
		JlNum.setBounds(30,30,100,60);
		JlNum.setFont(new Font("����", Font.BOLD, 30 ));
		
		JlName.setBounds(30,80,100,60);
		JlName.setFont(new Font("����", Font.BOLD, 30 ));
		
		JlAge.setBounds(30,130,100,60);
		JlAge.setFont(new Font("����", Font.BOLD, 30 ));
		
		JlAddr.setBounds(30,180,100,60);
		JlAddr.setFont(new Font("����", Font.BOLD, 30 ));
		
		JfNum.setBounds(110,40,160,40);
		JfName.setBounds(110,90,160,40);
		JfAge.setBounds(110,140,160,40);
		JfAddr.setBounds(110,190,160,40);
	
		JtAdd.setBounds(160,300,120,40);
		JtAdd.setFont(new Font("����", Font.BOLD, 30 ));
		JtDel.setBounds(290,300,120,40);
		JtDel.setFont(new Font("����", Font.BOLD, 30 ));
		JtUpdt.setBounds(420,300,120,40);
		JtUpdt.setFont(new Font("����", Font.BOLD, 30 ));
		JtExit.setBounds(550,300,120,40);
		JtExit.setFont(new Font("����", Font.BOLD, 30 ));
		
		jspSelect.setBounds(300,40,350,188);
		
		JtAdd.addActionListener(this);
		
		JfNum.setEditable(false);
		
		List<work0412VO> list;
		
		try {
			 list = selectAllCpDept();
			 StringBuilder output = new StringBuilder();
			 
			 for(work0412VO wVO : list) {
					output
					.append(wVO.getNum()).append(",")
					.append(wVO.getName()).append(",")
					.append(wVO.getAge()).append(",")
					.append(wVO.getAddr()).append("\n");
					dlmSelect.addElement(output.toString());
					
					output.setLength(0);
				}
			
			 System.out.println(output);
			
		} catch (SQLException e) {
			 e.printStackTrace();
		}
		
	}//������
	
	public List<work0412VO> selectAllCpDept()throws SQLException{
		List<work0412VO> list = new ArrayList<work0412VO>();
		
		DbConnection dc = DbConnection.getInstance();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//1. ����̹��ε�
		try {
		//2. Ŀ�ؼǾ��
			con =dc.getConnection();
		//3. ������������ü ���
			String selectCpDept = "select num,name,age,addr from work12";
			pstmt = con.prepareStatement(selectCpDept);
		//4. ���ε庯���� �� �Ҵ�
		//5. ������ ���� �� ��� ���
			rs = pstmt.executeQuery();
			//ResetSet�� cursor�� ������� �ް�, DBMS�� ���������� Java ������ ���� �ٸ��Ƿ� ������ ���� ��ȯ�ϴ� ��
			
			work0412VO wVO = null;
			
			while(rs.next()) {
				//��ȸ�� �÷����� VO�� �Ҵ�
				wVO = new work0412VO(rs.getInt("num"), rs.getString("name"),rs.getInt("age"), rs.getString("addr"));
				//������ VO(���ڵ� ���� ������ ����)�� List�� �߰�
				list.add(wVO);
			}
			
		}finally {
		//6. ���� ����
			dc.close(rs, pstmt, con);
		}
		return list;
	}
	
public void insertWork(String name, int age, String addr)throws SQLException{
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		DbConnection dc = DbConnection.getInstance();
	
		try {
			con = dc.getConnection();
			String insertCpDept = "insert into work12 values(work0412.nextval,?,?,?)";
			pstmt = con.prepareStatement(insertCpDept);

			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setString(3, addr);
			
			pstmt.executeUpdate();
		}finally {
			dc.close(null, pstmt, con);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource() == JtAdd) {
			String name = JfName.getText();
			int age = Integer.parseInt(JfAge.getText());
			String address = JfAddr.getText();
			
			try {
				insertWork(name, age, address);
				 JfName.setText(" ");
				 JfAge.setText(" ");
				 JfAddr.setText(" ");
				 
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new work0412();
	}
}
