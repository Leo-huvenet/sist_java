package day0408;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


/**
 * ����. 
	JOptionPane.InputDialog�� ����Ͽ� �������� �Է¹޾�  
	������,�𵨸�,�ɼ�,����,�Է����� JOptionPane.MessageDialog�� 
	JTextArea�� ����Ͽ� ����ϼ���.

	��, ����� �Է����� ������������ �������� �� 1~10��° ���ڵ常 ����մϴ�.
	�ɼ��� ù��°, ������ ������ּ���.
 * @author user
 *
 */
public class HomeWork0403 {
	
	
	
	
	public List<WorkVO> selectAllCar() throws SQLException{
		List<WorkVO> list = new ArrayList<WorkVO>();
		String inputData = JOptionPane.showInputDialog("�������� �Է����ּ���.");
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pass = "tiger";
		
		con = DriverManager.getConnection(url,id,pass);	
		
		stmt = con.createStatement();
		
		String selectCar 
			="select maker, model, car_option, price, hiredate "
		   + "from(select cc.maker, cmk.model, car_option, price, hiredate, row_number() over(order by hiredate desc)r_num "
		   		  + "from car_country cc, car_maker cmk, car_model cmd "
		   		  + "where country ='"+inputData+"'"
		   		  + ")"
		   + " where r_num between 1 and 10";
		
		rs = stmt.executeQuery(selectCar);
		
		String maker, model, car_option;
		int price;
		Date hiredate;
		
		WorkVO wVO = null;
		
		while(rs.next()) {
			maker = rs.getString("maker");
			model = rs.getString("model");
			car_option = rs.getString("car_option");
			price = rs.getInt("price");
			hiredate = rs.getDate("hiredate");
			
			wVO = new WorkVO(maker,model,car_option,price,hiredate);
			list.add(wVO);
							 }
		}finally {
			if(rs != null) {rs.close();}
			if(stmt != null) {stmt.close();}
			if(con != null) {con.close();}
		}
		return list;
	}
	
	public void searchAllCar() {

		try {
			List<WorkVO> list = selectAllCar();
			
			
			if(list.isEmpty()) {
				JOptionPane.showMessageDialog(null, "������ �����ϴ�.");
			}
			
			StringBuilder sb = new StringBuilder();
			WorkVO wVO = null;
			for(int i = 0; i < list.size(); i++) {
				wVO = list.get(i);
				sb.append(wVO.getMaker()).append(" / ").append(wVO.getModel()).append(" / ")
				.append(wVO.getCar_option()).append(" / ").append(wVO.getPrice()).append(" / ").append(wVO.getHiredate()).append("\n");	
			}
			
			JTextArea jta = new JTextArea(sb.toString());
			JScrollPane jsp = new JScrollPane(jta);
			jsp.setPreferredSize(new Dimension(500, 500));
			JOptionPane.showMessageDialog(null,jsp);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		HomeWork0403 hw = new HomeWork0403();
		hw.searchAllCar();
		
	}

}
