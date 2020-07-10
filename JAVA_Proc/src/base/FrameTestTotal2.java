package base;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FrameTestTotal2 {

	public static void main(String[] args) {

		//������ �����
		Frame f = new Frame();
		f.setBounds(800,100,250,400);
		f.setBackground(Color.YELLOW);
		
		//��Ʈ
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);
		
		//���ʴ� ; ������Ʈ�� �ϳ��� ���´�.
		Panel pNorth = new Panel();
		pNorth.setBackground(Color.GREEN);
		
		TextField tf = new TextField(10);
		Button btn = new Button("�Է�");
		btn.setEnabled(false);
		pNorth.add(tf);
		pNorth.add(btn);
		pNorth.setFont(font);
		
		//�߾�
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setFont(font);
		ta.setEnabled(false);
		
		//�г�
		Panel pSouth = new Panel();
		pSouth.setFont(font);
		pSouth.setBackground(Color.MAGENTA);
		
		Button btnSave = new Button("����");
		Button btnClose = new Button("�ݱ�");
		
		pSouth.add(btnSave);
		pSouth.add(btnClose);
		
		f.add(pNorth, BorderLayout.NORTH);
		f.add(ta, BorderLayout.CENTER);
		f.add(pSouth, BorderLayout.SOUTH);
		
		f.setVisible(true);
		f.setResizable(false);
		
		//TextField�� ���� �� ��츸 �Է¹�ư Ȱ��ȭ
		tf.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				if(tf.getText().equals("")) {
					btn.setEnabled(false);
				}else {
					btn.setEnabled(true);
				}
				
			}
		});
		
		//�߾ӿ� Text���� ����(ENTER)
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				//TextField�� �Է��� ���� TextArea�� ���� �߰�(ENTER)
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					ta.append(tf.getText()+"\n");
					
					tf.setText("");
					tf.requestFocus();
				}
				
			}
		});
		
		//�߾ӿ� Text���� ����(�Է¹�ư)
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText()+"\n");
				//�ؽ�Ʈ�ڽ� chrlghk
				tf.setText("");
				//��Ŀ�� �̿�
				tf.requestFocus();
				
				
			}
		});
		
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = ta.getText();
				
				try {
				//fileDialog : save�� load�� �� �ʿ��� ��ȭ����	
				FileDialog fd = new FileDialog(f, "����", FileDialog.SAVE);
				fd.setVisible(true);
				String path = fd.getDirectory() + fd.getFile();//���� ���
				if(!message.equals("")) {
				//path��ο� �ؽ�Ʈ ����
				FileWriter fw = new FileWriter(path);
				BufferedWriter bw = new BufferedWriter(fw);
				
				bw.write(message);
				
				if(fd.getFile()!= null) {
					JOptionPane.showMessageDialog(f, path+"\n��ο� ����Ǿ����ϴ�.");
				}
					bw.close(); //�ݵ�� �ݱ�
				}
				
				else {
					JOptionPane.showMessageDialog(f, "������ ������ �����ϴ�.");
				
				}
					
				
				}catch (IOException e1) {
					e1.printStackTrace();
					
				}
				
			}
		});
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "���α׷��� �����մϴ�.");
				System.exit(0);
			}
		});
		
	}

}
