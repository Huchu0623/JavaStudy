package base;

import java.awt.event.WindowEvent;

public class WinClosingLitener extends ListenerClass{

	@Override
	public void windowClosing(WindowEvent e) {
	System.out.println("종료버튼은 실행되지 않음");
		
	}

}

