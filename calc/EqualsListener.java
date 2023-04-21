package calc;

import java.awt.event.ActionEvent;

public class EqualsListener {
	CalculatorFace face;
	CalcStorage storage;
	
	public EqualsListener(CalculatorFace face, CalcStorage storage) {
		this.face = face;
		this.storage = storage;
	}
	
	public void actionPerformed(ActionEvent e) {
		storage.perform();
		storage.setVal(null);
		face.writeToScreen(storage.getScreen());
		
	}
}