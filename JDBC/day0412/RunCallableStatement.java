package day0412;

import java.sql.SQLException;
import java.util.List;

import static java.lang.Integer.parseInt; 
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 실행
 * @author user
 */
public class RunCallableStatement {

	public void addCpEmp() {
		String inputData = JOptionPane.showInputDialog("사원번호, 사원명, 부서번호, 직무를 입력하세요.");
		String[] data = inputData.split(",");
		
		UseCallableStatementDAO ucsDAO = UseCallableStatementDAO.getInstance();
		try {
			String msg = ucsDAO.insertCpEmp4(new CpEmp4VO(parseInt(data[0]), data[1], parseInt(data[2]), data[3]));
			JOptionPane.showMessageDialog(null, msg);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void modifyCpEmp() {
		
			String inputData = JOptionPane.showInputDialog("변경\n사원번호, 부서번호, 직무를 입력하세요.");
			String[] data = inputData.split(",");
			
			UseCallableStatementDAO ucsDAO = UseCallableStatementDAO.getInstance();
			try {
				String msg = ucsDAO.updateCpEmp4(new CpEmpModifyVO(parseInt(data[0]), data[1], parseInt(data[2])));
				JOptionPane.showMessageDialog(null, msg);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	
	public void removeCpEmp() {
		String inputData = JOptionPane.showInputDialog("삭제\n사원번호를 입력하세요.");
		
		
		UseCallableStatementDAO ucsDAO = UseCallableStatementDAO.getInstance();
		try {
			String msg = ucsDAO.deleteCpEmp(parseInt(inputData));
			JOptionPane.showMessageDialog(null, msg);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void searchZipcode() {
		
		String inputData = JOptionPane.showInputDialog("우편번호조회\n동을 입력하세요.");
				
				UseCallableStatementDAO ucsDAO = UseCallableStatementDAO.getInstance();
				try {
					List<ZipcodeVO> list = ucsDAO.selectZipcode(inputData);
					
					StringBuilder zipOutput = new StringBuilder();
					zipOutput.append(inputData).append("동 검색결과 \n")
					.append("------------------------------------------------------\n")
					.append("우편번호\t주소\n")
					.append("------------------------------------------------------\n");
					
					if(list.isEmpty()) {
						zipOutput.append("검색 결과가 존재하지 않습니다.\n동 이름을 확인하세요.");
					}
					for(ZipcodeVO zVO : list) {
						zipOutput.append(zVO.getZipcode()).append("\t")
						.append(zVO.getSido()).append(" ")
						.append(zVO.getGugun()).append(" ")
						.append(zVO.getDong()).append(" ")
						.append(zVO.getBunji()).append("\n");	
					}
					
					JTextArea jta = new JTextArea(zipOutput.toString(), 10, 60);
					JScrollPane jsp = new JScrollPane(jta);
					
					JOptionPane.showMessageDialog(null, jsp);
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	
	
	public static void main(String[] args) {
		RunCallableStatement rcs = new RunCallableStatement();
//		rcs.addCpEmp();
//		rcs.modifyCpEmp();
//		rcs.removeCpEmp();
		rcs.searchZipcode();
	}

}
