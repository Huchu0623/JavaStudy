package base;

import java.awt.Color;
import java.awt.event.WindowAdapter;
//�����ӿ��� x��ư�� �̺�Ʈ�� ���
import java.awt.event.WindowEvent;

public class FrameTest5 {

	public static void main(String[] args) {
		MyFrame fr = new MyFrame();
		
		fr.setBackground(Color.YELLOW);
		fr.setTitle("�ټ���° ����� ������");
		
		//�����ڴ� WindowListener�� �����ϰ� �ִ� MyEventListenerŬ�����̴�.
		
		//��ü����(WindowListener ��ü)
		//fr.addWindowListener(new MyEventListener());
		
		//�κ� ��ü����
		//fr.addWindowListener(new WinClosingLitener());
		
		//�͸��� Ŭ����(���� �ϳ�)
		fr.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
			}
			
		}); 
		
		
			
		
	}

}
