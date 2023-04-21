package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperatorListener implements ActionListener{

	CalculatorFace face;
	Strategy operator;
	CalcStorage storage;
	
	public OperatorListener(CalculatorFace face, Strategy operator, CalcStorage storage) {
		this.face = face;
		this.operator = operator;
		this.storage = storage;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		storage.perform();
		storage.setVal(Double.valueOf(storage.getScreen()));
		face.writeToScreen(storage.getScreen());
		storage.setScreen("");
		storage.setOp(operator);
	}
}
