package base;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Gwangju {

	public static void main(String[] args) {

		Frame f = new Frame("����");
		
		f.setLayout(null);
		f.setSize(500, 250);
		f.setLocation(400, 100);
		
		Choice location = new Choice();
		location.add("��������");
		location.add("����");
		location.add("���");
		location.add("��õ");
		location.add("����");
		location.add("�뱸");
		location.add("����");
		location.add("�λ�");
		//����� �����Ϸ��� �ڵ���ġ�� �����Ѵ�. ����ũ�Ⱑ �ݿ��ȴ�.
		//���̴� �ȿ� �ִ� ����� ������� �����ǹǷ� ũ�� �ǹ̰� ����.
		location.setSize(100, 0);
		location.setLocation(50, 100);
		location.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println(location.getSelectedItem());
				
			}
		});

		f.add(location);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
					System.exit(0);
				}	
		});
		
	
	}

}
