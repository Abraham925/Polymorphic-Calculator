package calc;

import java.awt.event.ActionEvent;

public class ClearListener {
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