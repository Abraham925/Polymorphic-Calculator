package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * PlusMinusListener called when the plusminus button is pressed
 * @author abrahamaustin
 *
 */
public class PlusMinusListener implements ActionListener{
	CalculatorFace face;
	CalcStorage storage;
	
	public PlusMinusListener(CalculatorFace face, CalcStorage storage) {
		this.face = face;
		this.storage = storage;
	}
	/**
	 * calls the state for PlusMinus
	 */
	public void actionPerformed(ActionEvent e) {
		storage.inputPlusMinus(storage.getScreen(), face);

	}
}