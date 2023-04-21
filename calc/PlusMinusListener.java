package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlusMinusListener implements ActionListener{
	CalculatorFace face;
	CalcStorage storage;
	
	public PlusMinusListener(CalculatorFace face, CalcStorage storage) {
		this.face = face;
		this.storage = storage;
	}
	
	public void actionPerformed(ActionEvent e) {
		double currentValue = Double.parseDouble(storage.getScreen());
		currentValue = -currentValue;
		storage.setScreen(String.valueOf(currentValue));
		//face.writeToScreen(storage.getScreen());
	}
}