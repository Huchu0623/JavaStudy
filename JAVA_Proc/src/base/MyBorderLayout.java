package base;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class MyBorderLayout {
	
	Frame f = new Frame();//패널 초기화
	Button jb1 = new Button("북");
	Button jb2 = new Button("서");
	Button jb3 = new Button("중앙");
	Button jb4 = new Button("동");
	Button jb5 = new Button("남");
	Button jb6 = new Button("버튼6");
	
	public MyBorderLayout() {
		//Frame을 BorderLayout으로 세팅
		f.setLayout(new BorderLayout());
		
		//프레임에 버튼 추가
		//BorderLayout은 버튼 추가시에 North, West, Center, East, South의 다섯위치 중
		//어디에 배치시킬 것인지를 반드시 명시해주어야 한다. 
		f.add(jb1, BorderLayout.NORTH);//"North"라고 명시해도 되긴함
		f.add(jb1, BorderLayout.WEST);
		f.add(jb1, BorderLayout.CENTER);
		f.add(jb1, BorderLayout.EAST);
		f.add(jb1 ,BorderLayout.SOUTH);
		//f.add(jd6, "Center");
		f.setSize(400, 300); //윈도우의 크기 가로x세로
		f.setVisible(true); //창을 보여줄때 treu, 숨길때 false
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
