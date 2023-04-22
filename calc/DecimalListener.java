package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * DecimalListener called when decimal is pressed
 * @author abrahamaustin
 *
 */
public class DecimalListener implements ActionListener{
	CalculatorFace face;
	CalcStorage storage;
	
	public DecimalListener(CalculatorFace face, CalcStorage storage) {
		this.face = face;
		this.storage = storage;
	}
	/**
	 * calls the state functions for decimals
	 */
	public void actionPerformed(ActionEvent e) {
		storage.inputDecimal(face);

	}
}