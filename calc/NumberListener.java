package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * numberListener
 * 
 * class to add actions to the numbers
 *
 * @author Abraham Austin
 * CS 245, Wheaton College
 * Feb 13, 2023
*/

public class NumberListener implements ActionListener {

	CalculatorFace face;
	int x;
	CalcStorage storage;
	
	public NumberListener(CalculatorFace face, int x, CalcStorage storage) {
		this.face = face;
		this.x = x;
		this.storage = storage;

	}
	
	public void actionPerformed(ActionEvent e) {
		face.writeToScreen(storage.getScreen() + String.valueOf(x));
		storage.addToScreen(String.valueOf(x));

	}

}
