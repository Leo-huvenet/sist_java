package day0304;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Work02 extends JFrame implements ActionListener{

	JButton jbtnClick;
	JTextArea jtaContents;
	
	public Work02() {
		jbtnClick = new JButton("클릭");
		jtaContents = new JTextArea(30,30);
		
		JPanel jp = new JPanel();
		JPanel jp1 = new JPanel();
		jp.add(jbtnClick);
		jp1.add(jtaContents);
		add("North",jp);
		add("Center",jp1);
		
		jbtnClick.addActionListener(this);
		
		setBounds(300, 300, 550, 650);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}//Work02

	@Override
	public void actionPerformed(ActionEvent ae) {
	
		if(ae.getSource() == jbtnClick) {
			FileDialog fd = new FileDialog(this, "파일열기", FileDialog.LOAD);
			fd.setVisible(true);
			
			String fileName = fd.getFile();
			boolean ew = fileName.endsWith("txt");
			
			if(ew == true) {
				jtaContents.setText(fileName);
			}
		}
	}
	public static void main(String[] args) {
		new Work02();
	}
}
