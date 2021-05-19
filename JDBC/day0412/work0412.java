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
		
		JLabel JlNum = new JLabel("번호");
		JLabel JlName = new JLabel("이름");
		JLabel JlAge = new JLabel("나이");
		JLabel JlAddr = new JLabel("주소");
		
		JfNum = new JTextField();
		JfName = new JTextField();
		JfAge = new JTextField();
		JfAddr = new JTextField();
		
		JtAdd = new JButton("추가");
		JtDel = new JButton("삭제");
		JtUpdt = new JButton("변경");
		JtExit = new JButton("닫기");
		
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
		JlNum.setFont(new Font("굴림", Font.BOLD, 30 ));
		
		JlName.setBounds(30,80,100,60);
		JlName.setFont(new Font("굴림", Font.BOLD, 30 ));
		
		JlAge.setBounds(30,130,100,60);
		JlAge.setFont(new Font("굴림", Font.BOLD, 30 ));
		
		JlAddr.setBounds(30,180,100,60);
		JlAddr.setFont(new Font("굴림", Font.BOLD, 30 ));
		
		JfNum.setBounds(110,40,160,40);
		JfName.setBounds(110,90,160,40);
		JfAge.setBounds(110,140,160,40);
		JfAddr.setBounds(110,190,160,40);
	
		JtAdd.setBounds(160,300,120,40);
		JtAdd.setFont(new Font("굴림", Font.BOLD, 30 ));
		JtDel.setBounds(290,300,120,40);
		JtDel.setFont(new Font("굴림", Font.BOLD, 30 ));
		JtUpdt.setBounds(420,300,120,40);
		JtUpdt.setFont(new Font("굴림", Font.BOLD, 30 ));
		JtExit.setBounds(550,300,120,40);
		JtExit.setFont(new Font("굴림", Font.BOLD, 30 ));
		
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
		
	}//생성자
	
	public List<work0412VO> selectAllCpDept()throws SQLException{
		List<work0412VO> list = new ArrayList<work0412VO>();
		
		DbConnection dc = DbConnection.getInstance();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//1. 드라이버로딩
		try {
		//2. 커넥션얻기
			con =dc.getConnection();
		//3. 쿼리문생성객체 얻기
			String selectCpDept = "select num,name,age,addr from work12";
			pstmt = con.prepareStatement(selectCpDept);
		//4. 바인드변수에 값 할당
		//5. 쿼리문 수행 후 결과 얻기
			rs = pstmt.executeQuery();
			//ResetSet은 cursor의 제어권을 받고, DBMS의 데이터형과 Java 데이터 형이 다르므로 데이터 형을 변환하는 일
			
			work0412VO wVO = null;
			
			while(rs.next()) {
				//조회된 컬럼값을 VO에 할당
				wVO = new work0412VO(rs.getInt("num"), rs.getString("name"),rs.getInt("age"), rs.getString("addr"));
				//생성된 VO(레코드 값을 가지고 있음)를 List에 추가
				list.add(wVO);
			}
			
		}finally {
		//6. 연결 끊기
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
