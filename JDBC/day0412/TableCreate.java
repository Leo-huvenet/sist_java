package day0412;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import kr.co.sist.dao.DbConnection;

@SuppressWarnings("serial")
public class TableCreate extends JFrame implements ActionListener {
   
   private JTextField jtfTableName;
   private JTextField jtfColName;
   private JTextField jtfSize;
   private JButton jbtnTableName;
   
   private JCheckBox jcbPmKey;
   private JCheckBox jcbNN;
   
   private JButton jbtnSetCol;
   private JButton jbtnCreate;
   private JButton jbtnReset;
   
   private DefaultComboBoxModel<String> dcbmDataType;
   private JComboBox<String> jcbDataType;
   private JTextArea jta;
   
   private StringBuilder createQuery;
   
   public TableCreate() {
      super("테이블 생성");
      
      createQuery = new StringBuilder();
      
      dcbmDataType=new DefaultComboBoxModel<String>();
      
      dcbmDataType.addElement("number");
      dcbmDataType.addElement("char");
      dcbmDataType.addElement("varchar2");
      dcbmDataType.addElement("date");
      dcbmDataType.addElement("long");
      dcbmDataType.addElement("clob");
      dcbmDataType.addElement("blob");

      JLabel jlTableName=new JLabel("테이블명");
      jtfTableName=new JTextField();
      jbtnTableName=new JButton("설정");

      JLabel jlColName=new JLabel("컬럼명");
      jtfColName=new JTextField();
      JLabel jlDataType=new JLabel("데이터형");
      jcbDataType=new JComboBox<String>(dcbmDataType);
      JLabel jlSize=new JLabel("크기");
      jtfSize=new JTextField();
      jcbPmKey=new JCheckBox();
      JLabel jlPmKey=new JLabel("Primary key");
      jcbNN=new JCheckBox();
      JLabel jlNN=new JLabel("Not Null");
      jbtnSetCol=new JButton("설정");
      jbtnReset=new JButton("초기화");

      jta=new JTextArea();
      
      
      JScrollPane jsp=new JScrollPane(jta);
      jsp.setBorder(new TitledBorder("생성코드"));
      
      jbtnCreate=new JButton("생성");
      
      
      setLayout(null);
      
      add(jlTableName);
      add(jtfTableName);
      add(jbtnTableName);

      add(jlColName);
      add(jtfColName);
      add(jlDataType);
      add(jcbDataType);
      
      add(jlSize);
      add(jtfSize);

      add(jcbPmKey);
      add(jlPmKey);
      add(jcbNN);
      add(jlNN);
      
      add(jbtnSetCol);
      add(jta);
      add(jbtnCreate);
      add(jbtnReset);
      
      jlTableName.setBounds(30, 30, 60, 40);
      jtfTableName.setBounds(100, 30, 150, 40);
      jbtnTableName.setBounds(270, 30, 80, 40);
      
      jlColName.setBounds(30, 90, 60, 40);
      jtfColName.setBounds(100, 90, 150, 40);
      jlDataType.setBounds(270, 90, 60, 40);
      jcbDataType.setBounds(340, 90, 120, 40);
      
      jlSize.setBounds(480, 90, 40, 40);
      jtfSize.setBounds(520, 90, 80, 40);
      
      jcbPmKey.setBounds(170, 150,30,40);
      jlPmKey.setBounds(200, 150, 90, 40);
      jcbNN.setBounds(290, 150,30,40);
      jlNN.setBounds(320, 150, 90, 40);
      
      jbtnSetCol.setBounds(410, 150, 80, 40);
      
      jta.setBounds(20, 220, 640, 300);
      jbtnCreate.setBounds(560, 540, 80, 40);
      jbtnReset.setBounds(460, 540, 80, 40);
      
      
      jbtnTableName.addActionListener(this);
      jbtnSetCol.addActionListener(this);
      jbtnReset.addActionListener(this);
      jbtnCreate.addActionListener(this);
      
      setBounds(100,100,700,650);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   private void setTableName(String tName) {
      if( createQuery.toString().contains("create")) {
         JOptionPane.showMessageDialog(this, "create쿼리가 이미 생성되어있습니다. 삭제 후 다시 만드세요");
         return;
      }//end if
      createQuery.append("create table ").append(tName).append("(\n)");
      jta.setText(createQuery.toString());
   }//setTableName
   
   private int columnCnt;
   private void setColumn(String columnName, String dataType, String columnSize, boolean pk, boolean nn) {
      
   StringBuilder column = new StringBuilder();
  
   
   //컬럼을 추가할 떄 처음이 아니면 ,를 넣는다.
   if(columnCnt != 0 ) {
	   column.append(",");
	   column.append("\n");
   }
   columnCnt++;
   
   
   column.append(columnName).append(" ").append(dataType);
   
   if("char".equals(dataType) || "varchar2".equals(dataType) || "number".equals(dataType) && !"".equals(columnSize)) {
      column.append("(").append(columnSize).append(")");
   }//end if
   
   if( pk ) {
      column.append("constraint pk_").append( createQuery.substring(createQuery.indexOf("table")+6,
            createQuery.indexOf("("))).append(" primary key");
   }//end if
   
   if( !pk && nn ) {
      column.append(" not null ");
   }//end if
  
   createQuery.insert(createQuery.lastIndexOf(")"), column.toString() );   
   jta.setText(createQuery.toString());
   
      jtfColName.setText("");
      jtfSize.setText("");
      jcbDataType.setSelectedIndex(0);
      jcbPmKey.setSelected(false);
      jcbNN.setSelected(false);
   }//setColumn
   
   @Override
   public void actionPerformed(ActionEvent ae) {
      
      if(ae.getSource() == jbtnTableName) {
         String tableName = jtfTableName.getText().replaceAll(" ","");
         if("".equals(jtfTableName.getText().trim())) {
            JOptionPane.showMessageDialog(this, "테이블명 필수");
            return;
         }//end if
         setTableName(tableName);
      }//end if
      
      if(ae.getSource() == jbtnReset) {
         switch (JOptionPane.showConfirmDialog(this, "DDL 쿼리문을 삭제 하시겠습니까?")) {
         case JOptionPane.OK_OPTION: 
        	columnCnt = 0;
            jta.setText("");
            createQuery.delete(0, createQuery.length());
         }//end switch
      }//end if
      
      if( ae.getSource() == jbtnSetCol ) {
         
         if( !createQuery.toString().contains("create table") ) {
            JOptionPane.showMessageDialog(this, "테이블명을 설정하신 후 컬럼을 추가할 수 있습니다.");
            jtfTableName.requestFocus();
            return;
         }//end if
         
         //컬럼명
         if("".equals(jtfColName.getText().trim())) {
            JOptionPane.showMessageDialog(this, "컬럼명 필수");
            jtfColName.requestFocus();
            return;
         }//end if
         //컬럼 크기
         String dataType = (String)jcbDataType.getSelectedItem();
         if( dataType.equals("char")|| dataType.equals("varchar2") ) {
         if("".equals(jtfSize.getText().trim())) {
            JOptionPane.showMessageDialog(this, "컬럼크기 필수");
            jtfSize.requestFocus();
            return;
         }//end if
      }//end if
         
         //primary key
         if(jcbPmKey.isSelected()) {
            if(createQuery.toString().contains("primary key")) {
               JOptionPane.showMessageDialog(this, "테이블에 Primary key가 이미 존재함");
               return;
            }//end if
         }//end if

         //N.N
         if( jcbNN.isSelected() && jcbPmKey.isSelected()) {
               jcbNN.setSelected(false); //primary key인 상태에서는 N.N(Not Null)을 해제한다
         }//end if
      
         setColumn(jtfColName.getText().replaceAll(" ", ""), dataType, jtfSize.getText().replaceAll(" ", ""),
               jcbPmKey.isSelected(), jcbNN.isSelected());
      }//end if
      
      if(ae.getSource() == jbtnCreate) {
    	 if("".equals(createQuery.toString()) ) { 
    		 JOptionPane.showMessageDialog(this, "쿼리문을 먼저 생성해주세요.");
    		 return;
    	 }
    	 try {
			createTable(createQuery.toString());
			JOptionPane.showMessageDialog(this, "테이블이 생성되었습니다.");
			createQuery.delete(0, createQuery.length());
			columnCnt = 0;
			jta.setText("");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(this, "테이블이 존재합니다.");
			e.printStackTrace();
		}
      }
      
   }//actionPerformed
   
   
   public void createTable(String code) throws SQLException {
      DbConnection dc=DbConnection.getInstance();
      //1. 드라이버로딩
      Connection con=null;
      PreparedStatement pstmt=null;
      
      try {
      //2. 커넥션얻기
         con=dc.getConnection();
      //3. 쿼리문 생성객체 얻기
         String sql=code;
         pstmt=con.prepareStatement(sql);
      //4. 바인드변수에 값설정
      //5. 쿼리수행 후 결과 얻기
         pstmt.execute();
         
         columnCnt = 0;
      }finally {
      //6. 연결 끊기
         dc.close(null, pstmt, con);
      }         
   }

   public static void main(String[] args) {
      new TableCreate();
   }//main
}//class