package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * called when an Operator is pressed
 * @author abrahamaustin
 *
 */
public class OperatorListener implements ActionListener{

	CalculatorFace face;
	Strategy operator;
	CalcStorage storage;
	
	public OperatorListener(CalculatorFace face, Strategy operator, CalcStorage storage) {
		this.face = face;
		this.operator = operator;
		this.storage = storage;
	}
	/**
	 * calls the functions and sets the value of the numbers before that
	 */
	public void actionPerformed(ActionEvent e) {
		storage.perform();
		storage.setVal(Double.valueOf(storage.getScreen()));
		face.writeToScreen(storage.getScreen());
		storage.setScreen("");
		storage.setOp(operator);
	}
}
