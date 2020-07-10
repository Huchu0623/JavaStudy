package base;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class MyBorderLayout {
	
	Frame f = new Frame();//�г� �ʱ�ȭ
	Button jb1 = new Button("��");
	Button jb2 = new Button("��");
	Button jb3 = new Button("�߾�");
	Button jb4 = new Button("��");
	Button jb5 = new Button("��");
	Button jb6 = new Button("��ư6");
	
	public MyBorderLayout() {
		//Frame�� BorderLayout���� ����
		f.setLayout(new BorderLayout());
		
		//�����ӿ� ��ư �߰�
		//BorderLayout�� ��ư �߰��ÿ� North, West, Center, East, South�� �ټ���ġ ��
		//��� ��ġ��ų �������� �ݵ�� ������־�� �Ѵ�. 
		f.add(jb1, BorderLayout.NORTH);//"North"��� ����ص� �Ǳ���
		f.add(jb1, BorderLayout.WEST);
		f.add(jb1, BorderLayout.CENTER);
		f.add(jb1, BorderLayout.EAST);
		f.add(jb1 ,BorderLayout.SOUTH);
		//f.add(jd6, "Center");
		f.setSize(400, 300); //�������� ũ�� ����x����
		f.setVisible(true); //â�� �����ٶ� treu, ���涧 false
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			
				System.exit(0);
			}
		});
			
		
	}
	
	public static void main(String[] args) {
		new MyBorderLayout();
	}
}
