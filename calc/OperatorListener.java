package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * operatorListener
 * 
 * class to add actions to the operators
 * also does calculations in this class
 *
 * @author Abraham Austin
 * CS 245, Wheaton College
 * Feb 13, 2023
*/

public class OperatorListener implements ActionListener {

	CalculatorFace face;
	char x;
	CalcStorage storage;
	double g;
	
	public OperatorListener(CalculatorFace face, char x, CalcStorage storage) {
		this.face = face;
		this.x = x;
		this.storage = storage;
		g = 0.0;
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if(x=='.') {
			if(storage.getText().indexOf('.') == -1) {
				storage.setText(".");
			}
			face.writeToScreen(String.valueOf(storage.getText()));
		}
		
		else if(x=='*') {
			if(storage.isPrev()) {
				storage.setText(storage.getPrev());
				storage.resetPrev();
			}
			g = Double.parseDouble(storage.getText());
			if(storage.valueUsed()) {
				switch(storage.getOperator()) {
					case('+'): g = storage.getOperatorValue() + g; break;
					case('-'): g = storage.getOperatorValue() - g; break;
					case('*'): g = storage.getOperatorValue() * g; break;
					case('/'): 
						if(g!=0) {
							g = storage.getOperatorValue() / g;
						}break;
				}
			}
			storage.setOperator('*');
			storage.setOperatorValue(g);
			storage.resetText();
			face.writeToScreen(String.valueOf(storage.getOperatorValue()));
			
		}
		else if(x=='+') {
			if(storage.isPrev()) {
				storage.setText(storage.getPrev());
				storage.resetPrev();
			}
			g = Double.parseDouble(storage.getText());
			if(storage.valueUsed()) {
				switch(storage.getOperator()) {
					case('+'): g = storage.getOperatorValue() + g; break;
					case('-'): g = storage.getOperatorValue() - g; break;
					case('*'): g = storage.getOperatorValue() * g; break;
					case('/'): 
						if(g!=0) {
							g = storage.getOperatorValue() / g;
						}break;
				}
			}
			storage.setOperator('+');
			storage.setOperatorValue(g);
			storage.resetText();
			face.writeToScreen(String.valueOf(storage.getOperatorValue()));
		}

		else if(x=='/') {
			if(storage.isPrev()) {
				storage.setText(storage.getPrev());
				storage.resetPrev();
			}
			g = Double.parseDouble(storage.getText());
			if(storage.valueUsed()) {
				switch(storage.getOperator()) {
					case('+'): g = storage.getOperatorValue() + g; break;
					case('-'): g = storage.getOperatorValue() - g; break;
					case('*'): g = storage.getOperatorValue() * g; break;
					case('/'): 
						if(g!=0) {
							g = storage.getOperatorValue() / g;
						}break;
				}
			}
			storage.setOperator('/');
			storage.setOperatorValue(g);
			storage.resetText();
			face.writeToScreen(String.valueOf(storage.getOperatorValue()));
		}

		else if(x =='-'){
			if(storage.isPrev()) {
				storage.setText(storage.getPrev());
				storage.resetPrev();
			}
			g = Double.parseDouble(storage.getText());
			if(storage.valueUsed()) {
				switch(storage.getOperator()) {
					case('+'): g = storage.getOperatorValue() + g; break;
					case('-'): g = storage.getOperatorValue() - g; break;
					case('*'): g = storage.getOperatorValue() * g; break;
					case('/'): 
						if(g!=0) {
							g = storage.getOperatorValue() / g;
						}break;
				}
			}
			storage.setOperator('-');
			storage.setOperatorValue(g);
			storage.resetText();
			face.writeToScreen(String.valueOf(storage.getOperatorValue()));
		}
		else if(x == 'C') {
			storage.resetText();
			face.writeToScreen("");
			storage.setOperatorValue(0.0);
			storage.setOperator(' ');
			storage.valueReset();
			
		}
		else {
		
			if(storage.valueUsed() && storage.getOperator() != ' ' && storage.getText() != "") {
				double answer = 0.0;
				String currentText = storage.getText();
				Double currentDouble = Double.parseDouble(currentText);
				switch(storage.getOperator()) {
					case'+':
						answer = storage.getOperatorValue()+currentDouble;
						break;
					case'-':
						answer = storage.getOperatorValue()-currentDouble;
						break;
					case'*':	
						answer = storage.getOperatorValue()*currentDouble;
						break;
					case'/':
						if(currentDouble != 0)
							answer = (storage.getOperatorValue())/currentDouble;
						break;
				}

				face.writeToScreen(String.valueOf(answer));
				storage.resetText();
				storage.valueReset();
				storage.setPrev(String.valueOf(answer));

			}
			else {
				face.writeToScreen(storage.getText());
			}
		}

		

	}

}
