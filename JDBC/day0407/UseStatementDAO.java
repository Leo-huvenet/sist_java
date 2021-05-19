package day0407;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JOptionPane;

/**
 *	DBMS업무처리를 하는 DAO클래스를 사용하는 클래스로 업무로직을 정의하는 일을
 *	주로하는 클래스
 *	클래스명은 주로 Service 또는 Process가 붙어서 만들어진다.
 * @author user
 */
public class UseStatementDAO {
	
	private StatementDAO sDAO;
	
	public UseStatementDAO() 
	{
		sDAO = new StatementDAO();
	}
	
	private void addCpEmp() {
		EmpVO eVO = new EmpVO(431,"조영래",10,"과장");
		
		try {
			sDAO.insertCpEmp4(eVO);//method가 예외를 발생시키지 않으면 정상실행
			JOptionPane.showMessageDialog(null, eVO.getEmpno()+"번 사원정보가 추가되었습니다.");
		} catch (SQLException se) {
			se.printStackTrace();
//			System.out.println(se.getErrorCode()+" / "+ se.getMessage()+" / "+se.getSQLState());
			String errMsg ="";
			if(se.getErrorCode() == 1) {
				errMsg = "사원번호가 이미 존재하는 부분";
			}
			if(se.getErrorCode() == 1438) {
				errMsg = "사원번호는 또는 부서번호가 초과된 부분. 사원번호 4자리, 부서번호 2자리";
			}
			if(se.getErrorCode() == 12899) {
				errMsg = "사원명 또는 직무가 초과된 부분. 사원명 한글 3자리 또는 영문 10자, 직무 한글3자 영문 9자";	
			}
			JOptionPane.showMessageDialog(null, errMsg);
		}
	}
	
	private void modifyCpEmp() {
		EmpVO eVO = new EmpVO(431, "조혜원", 30, "차장");
		try {
			int cnt = sDAO.updateCpEmp4(eVO);
			String msg = eVO.getEmpno()+"번 사원은 존재하지 않습니다.";
			if(cnt == 1) {
				msg = eVO.getEmpno()+"번 사원정보가 변경되었습니다.";
			}
			
			JOptionPane.showMessageDialog(null, msg);
			
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "서비스가 원할하지 못함");
		}
	}
	
	private void removeCpEmp() {
		int empno = 431; 
		
		try {
			int cnt = sDAO.deleteCpEmp4(empno);
			StringBuilder resultMsg = new StringBuilder();
			resultMsg.append(empno);
			if(cnt == 1) {
				resultMsg.append("번 사원정보가 삭제되었습니다.");
			}else {
				resultMsg.append("번 사원은 존재하지 않습니다.");				
			}
			JOptionPane.showMessageDialog(null, resultMsg);
		} catch (SQLException e) {
			e.printStackTrace();
			//쿼리문 잘못된경우. DB와 연동이 안되는 경우.
			JOptionPane.showMessageDialog(null, "서비스가 원활하지 못합니다.");
		}
	}
	
	private void searchAllCpEmp() {
		//조회된 결과가 하나의 List에 모두 저장되어있으므로 List를 받아서 사용한다.
		try {
		List<EmpAllVO> list =	sDAO.selectAllCpEmp4(); //반환 값이 리스트
		
		if(list.isEmpty()) {
			System.out.println("사원정보가 존재하지 않습니다.");
		}
		
		EmpAllVO eaVO = null;
		for(int i = 0; i < list.size(); i++) {
			eaVO = list.get(i);
			System.out.println(eaVO.getEmpno()+" / "+ eaVO.getEname()+" / "+
			eaVO.getDeptno()+" / "+eaVO.getJob()+" / "+eaVO.getHiredate());
		}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void searchOneCpEmp() {
		
		int empno = 1234;
		
		EmpOneVO eoVO = null;
	
			try {
				eoVO = sDAO.selectOneCpEmp4(empno);
			if(eoVO == null) {//사원번호로 조회된 레코드가 없음
				System.out.println(empno + "번 사원은 존재하지 않습니다.");
			}else {//사원번호로 조회된 레코드 있음
				SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yy EEEE");
				
				System.out.println(eoVO.getEname()+" / "+ eoVO.getDeptno()+" / "+eoVO.getJob()
				+" / "+sdf.format(eoVO.getHiredate()));
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	}

	public static void main(String[] args) {
		UseStatementDAO usDAO = new UseStatementDAO();
//		usDAO.addCpEmp();
//		usDAO.modifyCpEmp();
//		usDAO.removeCpEmp();
		usDAO.searchAllCpEmp();
//		usDAO.searchOneCpEmp();
	}

}
