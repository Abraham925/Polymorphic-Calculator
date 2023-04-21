package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DecimalListener implements ActionListener{
	CalculatorFace face;
	CalcStorage storage;
	
	public DecimalListener(CalculatorFace face, CalcStorage storage) {
		this.face = face;
		this.storage = storage;
	}
	
	public void actionPerformed(ActionEvent e) {
		storage.addToScreen(".");
		face.writeToScreen(storage.getScreen());

	}
}