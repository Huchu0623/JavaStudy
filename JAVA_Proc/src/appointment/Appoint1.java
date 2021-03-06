package appointment;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Appoint1 {

	public static void main(String[] args) {

		Frame f = new Frame("진료예약 확인");	
		
		f.setBounds(200, 200, 500, 600);
		f.setLayout(null);
		
		Font font = new Font("맑은고딕",Font.BOLD,30);
		Font font2 = new Font("맑은고딕",Font.BOLD,25);
		Font btnFont = new Font("맑은고딕",Font.BOLD,30);
		
		JLabel a1 = new JLabel();
		a1.setText("진료예약 확인");
		
		a1.setBounds(200,20,200,100);
		a1.setLocation(150,10);
		
		a1.setFont(font);
		
		
		
	
		

		JLabel a2 = new JLabel();
		a2.setText("보호자명");
		a2.setBounds(200,200,400,200);
		a2.setLocation(20,50);
		a2.setFont(font2);
		
		JTextField tf1 = new JTextField(20);
		tf1.setBounds(200,100,150,30);
		tf1.setLocation(140, 135);
		
		JLabel a3 = new JLabel();
		a3.setText("보호자 연락처");
		a3.setBounds(500,600,200,100);
		a3.setLocation(20,200);
		a3.setFont(font2);
		
		JTextField tf2 = new JTextField(20);
		tf2.setBounds(200,100,150,30);
		tf2.setLocation(200, 235);
		
		
		
		Button btn1 = new Button("메인화면");
		Button btn2 = new Button("확인");
		btn1.setSize(200, 50);
		btn1.setLocation(10,540);
		btn2.setSize(200, 50);
		btn2.setLocation(290,540);
		
		btn1.setFont(btnFont);
		btn2.setFont(btnFont);
		
		
		
		f.add(a1);
		f.add(a2);
		f.add(a3);
		
		f.add(tf1);
		f.add(tf2);
		
		f.add(btn1);
		f.add(btn2);
		
		
		
		
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
					System.exit(0);
				}	
		});
	}

}
