package base;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Gwangju {

	public static void main(String[] args) {

		Frame f = new Frame("질문");
		
		f.setLayout(null);
		f.setSize(500, 250);
		f.setLocation(400, 100);
		
		Choice location = new Choice();
		location.add("지역선택");
		location.add("서울");
		location.add("경기");
		location.add("인천");
		location.add("광주");
		location.add("대구");
		location.add("대전");
		location.add("부산");
		//사이즈를 설정하려면 자동배치를 꺼야한다. 현재크기가 반영된다.
		//높이는 안에 있는 요소의 사이즈로 결정되므로 크게 의미가 없다.
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
