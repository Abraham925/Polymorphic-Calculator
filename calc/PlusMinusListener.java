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
		String currentScreen = storage.getScreen();
		currentScreen = currentScreen.replaceFirst("^-", "").replaceFirst("^", "-");
		
		storage.setScreen(currentScreen);
		face.writeToScreen(storage.getScreen());
	}
}