package day0226;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class MainWindow extends JFrame implements ActionListener {

	public MainWindow() {
		super("���̾�α׿���");
		
		JButton jbtn = new JButton("���̾�α׿���");
		
		JPanel panel = new JPanel();
		panel.add(jbtn);
		
		jbtn.addActionListener(this);
		
		add("Center", panel);
		
		setBounds(100, 100, 500, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}//UseDialog
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		//JDialog�� ��ӹ��� Ŭ������ ��üȭ
		new SubWindow(this);
		
	}//actionPerformed

	public static void main(String[] args) {
		new MainWindow();
	}//main

}
