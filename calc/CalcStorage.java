package calc;

/**
 * CalcStorage
 * 
 * Acts as a storage for the numbers and operator values
 *
 * @author Abraham Austin
 * CS 245, Wheaton College
 * Feb 13, 2023
*/

public class CalcStorage {
	private String currentDisplay = "";
	private Double val = null;
	private Strategy op = null;
	
	public String getScreen() {
		return currentDisplay;
	}
	public void setScreen(String currentDisplay) {
		this.currentDisplay = currentDisplay;
	}
	public void addToScreen(String value) {
		currentDisplay += value;
	}
	public void setVal(Double val) {
		this.val = val;
	}
	public void setOp(Strategy op) {
		this.op = op;
	}
	public void clear() {
		currentDisplay = "";
		val = null;
		op = null;
	}
	public void perform() {
		if( val != null && !currentDisplay.isEmpty() && op != null) {
			double currentValue = Double.parseDouble(currentDisplay);
			val = op.operate(val,  currentValue);
			currentDisplay = String.valueOf(val);
			op = null;
		}
	}
}
