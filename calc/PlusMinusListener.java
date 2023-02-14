package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlusMinusListener implements ActionListener {

	CalcStorage storage;
	CalculatorFace face;
	
	PlusMinusListener(CalculatorFace face, CalcStorage storage){
		this.storage = storage;
		this.face = face;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String x = storage.getText();
		if(Double.parseDouble(storage.getText()) > 0) {
			storage.resetText();
			storage.setText("-");
			storage.setText(x);
			face.writeToScreen(String.valueOf(storage.getText()));
		}
		else {
			storage.resetText();
			storage.setText(String.valueOf(Math.abs(Double.parseDouble(x))));;
			face.writeToScreen(String.valueOf(storage.getText()));
		}
	}

}
