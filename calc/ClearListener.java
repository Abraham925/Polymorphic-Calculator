package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearListener implements ActionListener{
	CalculatorFace face;
	CalcStorage storage;
	
	public ClearListener(CalculatorFace face, CalcStorage storage) {
		this.face = face;
		this.storage = storage;
	}
	
	public void actionPerformed(ActionEvent e) {
		storage.clear();
		face.writeToScreen("");

	}
}