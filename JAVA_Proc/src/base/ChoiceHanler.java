package base;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceHanler implements ItemListener {

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		String str = (String)e.getItem();
		System.out.printf("Áö¿ª : ", str);
		
	}
	
	

}
