package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * EqualsListener this is called when the button is pressed
 * @author abrahamaustin
 *
 */
public class EqualsListener implements ActionListener{
	CalculatorFace face;
	CalcStorage storage;
	
	public EqualsListener(CalculatorFace face, CalcStorage storage) {
		this.face = face;
		this.storage = storage;
	}
	/**
	 * calls functions to perform the desired result
	 */
	public void actionPerformed(ActionEvent e) {
		storage.perform();
		storage.setVal(Double.valueOf(storage.getScreen()));
		face.writeToScreen(storage.getScreen());
		
	}
}