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
		storage.perform();
		storage.setVal(Double.valueOf(storage.getScreen()));
		storage.setScreen(storage.getScreen());

	}
}